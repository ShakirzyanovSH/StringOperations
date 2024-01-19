public class SymbString {
	protected String id;
  protected String content;

    public SymbString(String id, String content) {
        this.id = id;
        this.content = content;
    }
    
    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        return "ID: " + id + ", Содержимое: " + content;
    }

    public static SymbString add(SymbString s1, SymbString s2) {
        return new SymbString(s1.id + "+" + s2.id, s1.content + s2.content);
    }
}

