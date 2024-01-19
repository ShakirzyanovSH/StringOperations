public class BinString extends SymbString {
	public BinString(String id, String binaryContent) {
        super(id, binaryContent);
    }
	
	public String toString() {
        return "ID: " + id + ", Двоичное содержимое: " + content;
    }

    public static BinString add(BinString s1, BinString s2) {
        int num1 = Integer.parseInt(s1.content, 2);
        int num2 = Integer.parseInt(s2.content, 2);
        String sum = Integer.toBinaryString(num1 + num2);
        return new BinString(s1.id + "+" + s2.id, sum);
    }
}

