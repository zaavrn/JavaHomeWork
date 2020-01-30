package javaLevel1Lesson2;

import java.util.Arrays;

public class javaLevel1Lesson2Task7 {
    public static void main(String[] args) {
        int [] array = {15,30,45,60,75};
        int n=-2;
        shift(array,n);
        System.out.println(Arrays.toString(array));
    }

    public static void shift(int[]array,int n){
        int shift =n%array.length; // кол-во сдвигов

        if (n>0){ //сдвиг вправо при положительном числе на одну переменную.

            for (int j=shift;j>0;j--){// сдвиги согласно числу n
                int temp = array[0];
                array[0] = array[array.length - 1];
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[1] = temp;
            }

        }else if (n<0) {

            for (int j = shift; j < 0; j++) {// сдвиги согласно числу n

                int temp = array[array.length - 1];
                array[array.length - 1] = array[0];// сдвиг влево при отрицательном числе на одну переменную.
                for (int i = 0; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 2] = temp;

            }
        }



    }

}

