package javaLevel1Lesson1;

public class javaLevel1Lesson1Task1 {
    public static void main(String[] args) {

        byte by = 1;
        short sh = 20;
        int in = 300;
        long lo = 4000L;
        float fl = 1.111f;
        double dou = 100.999;
        char ch = 'f';
        boolean bo = true;
        System.out.println ("Task_2 "+"byte=" + by + " short=" + sh + " int=" + in + " long=" + lo + " float=" + fl + " double=" + dou + " char=" + ch + " boolean=" + bo);// task2
        System.out.println("Task_3 "+calculate( 1.1f, 1.2f,1.3f,1.4f));// task3
        System.out.println("Task_4  "+task4(5,5));// task4
        task5(-2);// task5
        task51(-2);
        System.out.println("Task_6 "+task6(-3));//task6
        task7("Alexey");//task7
        task8(800);// task8
        task81(1200);// task8
        task82(1400);// task8

    }
    public static float calculate (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    public static boolean task4(int x, int y){
        if (x+y<=10 && x+y>=20);
        return true;
    }

    public static void task5 (int z){
        if (z<0){
            System.out.println("Task_5 Число " +z+" Отрицательное");
        }else{
            System.out.println("Task_5 Число "+z+" Положительное");
        }
    }

    public static void task51 (int m) {
        String result = (m >= 0) ? " Положительное" : " Отрицательное";
        System.out.println("Task_51 Число " + m + result);
    }

    public static boolean task6(int h) {
        if (h < 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void task7(String name) {

        System.out.println("Task_7 Привет "+name);
    }
    public static void task8 (int year){
        String result = ((year%400==0)||(year%4==0 && year%100!=0)) ? " высокосный" : " не высокосный";
        System.out.println("Task_8 Год " + year + result);
    }
    public static void  task81 (int year) {
        boolean result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
        String result1 = String.valueOf(result);
        switch (result1) {
            case "true":
                System.out.println("Task_81 Год " + year + " высокосный");
                break;

        }
    }
    public static void task82 (int year) {
        if (year%400==0){
            System.out.println("Task_82 Год "+year+" высокосный");
        } else if (year%4==0 && year%100!=0){
            System.out.println("Task_82 Год "+year+" высокосный");
        }else{
            System.out.println("Task_82 Год "+year+" не высокосный");
        }
    }


}

