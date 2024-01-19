import java.util.ArrayList;

public class Factory {
	private static ArrayList<SymbString> symbStrings = new ArrayList<>();
    private static ArrayList<BinString> binStrings = new ArrayList<>();
	
    public static SymbString createSymbString(String id, String content) {
        SymbString newString = new SymbString(id, content);
        symbStrings.add(newString);
        return newString;
    }

    public static BinString createBinString(String id, String binaryContent) {
        BinString newString = new BinString(id, binaryContent);
        symbStrings.add(newString);
        return newString;
    }
    
    public static String showStringValue(String id) {
        for (SymbString s : symbStrings) {
            if (s.getId().equals(id)) {
                return s.toString();
            }
        }
        for (BinString b : binStrings) {
            if (b.getId().equals(id)) {
                return b.toString();
            }
        }
        return "Объект с идентификатором " + id + " не найден.";
    }
    
    public static boolean isBinaryString(String str) {
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
    
    public static String removeString(String id) {
        for (int i = 0; i < symbStrings.size(); i++) {
            if (symbStrings.get(i).getId().equals(id)) {
                symbStrings.remove(i);
                return "Строка с идентификатором " + id + " удалена.";
            }
        }
        return "Строка с идентификатором " + id + " не найдена.";
    }
    
    public static String addStrings(String id1, String id2) {
        SymbString string1 = null, string2 = null;
        for (SymbString s : symbStrings) {
            if (s.getId().equals(id1)) string1 = s;
            if (s.getId().equals(id2)) string2 = s;
        }
        for (BinString b : binStrings) {
            if (b.getId().equals(id1)) string1 = b;
            if (b.getId().equals(id2)) string2 = b;
        }

        if (string1 != null && string2 != null) {
            if (string1 instanceof BinString && string2 instanceof BinString) {
                return BinString.add((BinString)string1, (BinString)string2).toString();
            } else {
                return SymbString.add(string1, string2).toString();
            }
        } else {
            return "Не удалось найти одну или обе указанные строки.";
        }
    }
}
