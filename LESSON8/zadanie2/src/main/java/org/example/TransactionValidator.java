package org.example;

public class TransactionValidator {
    public static final double min_amount = 1;
    public static final double max_amount = 5000;

    public static boolean isValidAmount(double amount) {
        if (amount < min_amount) {
            System.out.println("Минимальная сумма перевода: " + min_amount + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > max_amount) {
            System.out.println("Максимальная сумма перевода: " + max_amount + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}
