package zadanie2;

public class TextEditor {
    private boolean isCapsLock = false;
    public void capsLock() {
        isCapsLock = !isCapsLock;
    }
    public void print(String str) {
        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.print("Hello, World!");
        editor.capsLock();
        editor.print("Hello, World!");
        editor.capsLock();
        editor.print("Hello, World!");
    }
}
