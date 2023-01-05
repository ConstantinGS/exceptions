package HW2;

import java.util.*;

public class HW2_4 {

    public static void main(String[] args) {

        // example1();
        // example2();
        // example3();
    }

    public static void example1() {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("")) {
            System.out.println("Пустая строка");
        }
    }

    public static void example2() {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = 10 / scanner.nextLine().length();
            System.out.println(i);
        } catch (ArithmeticException ex) {
            System.out.println("Строка пуста!");
        }
    }

    public static void example3() {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().isEmpty()) {
            throw new RuntimeException("Вы ввели пустую строку");
        } else {
            System.out.println(scanner.nextLine());
        }
    }

}
