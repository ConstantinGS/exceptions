package HW2;

import java.util.*;

public class HW2_1 {

    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    // (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить
    // к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {

        scannerFloat2();

    }

    public static void scannerFloat1() {
        System.out.println("Введите число типа float:");
        Scanner scanner = new Scanner(System.in);
        try {
            float number = Float.parseFloat(scanner.nextLine());
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат данных.");
            scannerFloat1();
        }

    }

    public static void scannerFloat2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число типа float:");

        while (!scanner.hasNextFloat()) {
            System.out.println("Неверный формат данных. Введите число типа float:");
            scanner = new Scanner(System.in);
        }
        float number = Float.parseFloat(scanner.nextLine());
        System.out.println(number);

    }
}
