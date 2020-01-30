package javaLevel1Lesson2;

public class javaLevel1Lesson2Task6 {
    public static void main(String[] args) {

        int[] array = {2, 3, 3, 5, 2, 1};
        sumMassive(array);
        System.out.println("В массиве есть равные части?: "+sumMassive(array));
    }

    private static boolean sumMassive(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            // System.out.println("сумма " + sum);
        }
        int check = 0;
        for (int i = 0; i < array.length; i++) {
            check += array[i];
            if (check == (sum - check)) {
                return true;

            }
        }
        return false;
    }

}
