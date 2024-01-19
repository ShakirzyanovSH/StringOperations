import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Создать символьную строку");
            System.out.println("2. Создать двоичную строку");
            System.out.println("3. Сложить строки");
            System.out.println("4. Показать значение объекта");
            System.out.println("5. Удалить строку");
            System.out.println("6. Выход");
            System.out.print("Выберите опцию: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите идентификатор строки: ");
                    String id = scanner.next();
                    System.out.print("Введите содержимое строки: ");
                    String content = scanner.next();
                    SymbString symbString = Factory.createSymbString(id, content);
                    System.out.println("Создана символьная строка: " + symbString);
                    break;
                case 2:
                    System.out.print("Введите идентификатор двоичной строки: ");
                    String binId = scanner.next();
                    System.out.print("Введите двоичное содержимое строки: ");
                    String binContent = scanner.next();
                    if (Factory.isBinaryString(binContent)) {
                        BinString binString = Factory.createBinString(binId, binContent);
                        System.out.println("Создана двоичная строка: " + binString);
                    } else {
                        System.out.println("Ошибка: строка не является двоичной. Пожалуйста, используйте только 0 и 1.");
                    }
                    break;
                case 3:
                    System.out.print("Введите идентификатор первой строки: ");
                    String id1 = scanner.next();
                    System.out.print("Введите идентификатор второй строки: ");
                    String id2 = scanner.next();
                    System.out.println(Factory.addStrings(id1, id2));
                    break;
                case 4:
                	System.out.print("Введите идентификатор строки для показа её значения: ");
                    String idToShow = scanner.next();
                    System.out.println(Factory.showStringValue(idToShow));
                    break;
                case 5:
                	System.out.print("Введите идентификатор строки для удаления: ");
                    String idToRemove = scanner.next();
                    System.out.println(Factory.removeString(idToRemove));
                    break;
                case 6:
                    System.out.println("Выход из программы");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор");
                    break;   
            }
        }
    }
}
