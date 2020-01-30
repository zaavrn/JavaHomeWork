package javaLevel1Lesson2;

public class javaLevel1Lesson2Task5 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 13};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное число в массиве = " + min);
        System.out.println("Mаксимальное число в массиве = " + max);
    }
}



