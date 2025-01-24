package zadanie1;

public class CleanInput {

    public String fixString(String str) {
        String trimmedStr = str.trim();
        if (trimmedStr.isEmpty()) {
            return "Вы ничего не ввели!";
        } else {
            return trimmedStr;
        }
    }
    public static void main(String[] args) {
        CleanInput cleanInput = new CleanInput();
        System.out.println(cleanInput.fixString("   "));
        System.out.println(cleanInput.fixString("   Hello, World!   "));
        System.out.println(cleanInput.fixString(""));
        System.out.println(cleanInput.fixString("   Java   "));
    }
}

