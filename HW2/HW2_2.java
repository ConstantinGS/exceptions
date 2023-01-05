package HW2;

public class HW2_2 {
    public static void main(String[] args) {

        int[] intArray = { 2, 4, 5, 6, 7, 4, 5, 6 };

        example1(intArray);
        example2(intArray);
    }

    public static void example1(int[] intArray) {
        if (intArray.length >= 9) {
            int d = 0;
            if (d != 0) {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Деление на ноль ");
            }
        } else {
            System.out.println("Выход за пределы массива ");
        }
    }

    public static void example2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
