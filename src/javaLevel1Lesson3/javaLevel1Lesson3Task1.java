package javaLevel1Lesson3;

import java.util.Scanner;

public class javaLevel1Lesson3Task1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Игра \"Угадай Число\". У Вас есть три попытки!");
        int c=1;// заход в цикл
        while (c !=0){
            double b = getRandom(0, 9); // получение случайного числа через метод
            //System.out.println(b);
            for (int i = 1; i <= 3; i++) { // цикл считающий попытки
                int a = getNumber("Отгадайте число в пределах от 0 до 9. Введите число:", 0, 9);
                if (b == a) {
                    System.out.println("Вы угадали число. Спасибо за игру");
                    break;

                } else if (b > a) {
                    System.out.println("Загаданное число больше");
                } else if (b < a) {
                    System.out.println("Загаданное число меньше");
                }
            }
            c = getNumber("Повторить игру еще раз ДА введите-\"1\", НЕТ ввидите-\"0\"", 0, 1);
        }

    }
    public static double getRandom ( double min, double max){
        double b = (int) (Math.random() * ((max - min) + 1)) + min;
        return b;
    }
    public static int getNumber (String message,int min, int max){
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
}


