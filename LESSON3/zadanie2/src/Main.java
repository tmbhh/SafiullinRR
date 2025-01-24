import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<String>();
        zoo.add("шиншилла");
        zoo.add("крокодил");
        zoo.add("лев");
        zoo.add("медведь");
        zoo.add("слон");

        System.out.println("Сегодня в зоопарке можно увидеть кормления " + zoo.size() + " животных.");
        System.out.println("Это будут:");

        for (int i = 0; i < zoo.size(); i++ ){
            System.out.println(zoo.get(i));
        }

        System.out.println("Расписание кормлений:");
        ArrayList<String> times = new ArrayList<String>();
        times.add("9:00");
        times.add("10:00");
        times.add("11:00");
        times.add("12:00");
        times.add("13:00");

        zoo.clear();
        zoo.add("крокодил");
        zoo.add("слон");
        zoo.add("шиншилла");
        zoo.add("лев");
        zoo.add("медведь");

        for (int i = 0; i < times.size(); i++) {
            System.out.println("В " + times.get(i) + " - " + zoo.get(i));
        }
        }
        }

