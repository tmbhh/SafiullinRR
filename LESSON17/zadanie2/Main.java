package zadanie2;

public class Main {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder sb = new StringBuilder();
        for (String line: poem) {
            if(!line.isBlank() && !line.isEmpty()) {
                sb.append(line.trim()).append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main poemFixer = new Main();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}