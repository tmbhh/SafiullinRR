package zadanie4;

public class Main {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String str = "казак";
        System.out.println(p.isPalindromeWord(str));
    }
}
class Palindrome {
    public boolean isPalindromeWord(String str) {
        String lower = str.toLowerCase();
        StringBuilder sb = new StringBuilder(lower);
        sb.reverse();
        return lower.equals(sb.toString());
    }
}

