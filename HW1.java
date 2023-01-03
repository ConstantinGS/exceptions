public class HW1 {

    public static void main(String[] args) throws Exception {

        Integer[] array1 = { 2, 4, 5, 6 };
        Integer[] array2 = { 1, 1, 1, 0 };

        Integer[] newArray = divArrays(array1, array2);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }

    public static Integer[] sumArrays1(Integer[] array1, Integer[] array2) {
        Integer[] sumArray = new Integer[array1.length];

        if (array1.length != array2.length) {
            throw new RuntimeException("Разные длины массивов");
        }

        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] - array2[i];

        }
        return sumArray;
    }

    public static Integer[] sumArrays2(Integer[] array1, Integer[] array2) throws Exception {
        Integer[] sumArray = new Integer[array1.length];

        try {
            for (int i = 0; i < array1.length; i++) {
                sumArray[i] = array1[i] - array2[i];
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (array1.length != array2.length) {
            throw new Exception("У массивов разная длина");
        }
        return sumArray;
    }

    public static Integer[] sumArrays3(Integer[] array1, Integer[] array2) {
        Integer[] sumArray = new Integer[array1.length];

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                sumArray[i] = array1[i] - array2[i];
            }
            return sumArray;
        }
        System.out.println("Массивы имеют разную длину");
        return null;
    }

    public static Integer[] divArrays(Integer[] array1, Integer[] array2) throws Exception {
        Integer[] sumArray = new Integer[array1.length];

        try {
            for (int i = 0; i < array1.length; i++) {
                sumArray[i] = array1[i] / array2[i];
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        if (array1.length != array2.length) {
            throw new IndexOutOfBoundsException("У массивов разная длина");
        }
        return sumArray;
    }

}