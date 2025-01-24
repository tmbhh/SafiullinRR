import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.moneyRUB = 0.0;
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyUSD = 0.0;
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyEUR = 0.0;
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.moneyRUB == 0.0) {
            System.out.println("RUB = " + user.moneyRUB);
        }
        if (user.moneyUSD == 0.0) {
            System.out.println("USD = " + user.moneyUSD);
        }
        if (user.moneyEUR == 0.0) {
            System.out.println("EUR = " + user.moneyEUR);
        }

    }
}

class PersonAccount {
    String name;
    double moneyRUB = 1;
    double moneyUSD = 1;
    double moneyEUR = 1;


    PersonAccount(String userName) {
        name = userName;
    }
}