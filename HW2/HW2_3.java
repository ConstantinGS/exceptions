package HW2;

public class HW2_3 {

    public static void main(String[] args) throws Exception {

        example1();
        example2();
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void example1() {
        int a = 90;
        int b = 3;
        if (b != 0) {
            System.out.println(a / b);
        }
        printSum(23, 234);
        int[] abc = { 1, 2 };
        if (abc.length >= 4) {
            abc[3] = 9;
        }
    }

    public static void example2() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

}
