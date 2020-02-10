package javaLevel1Lesson7;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static int FOOD_USER;
    private static int QUANTITY_CAT;
    private static Scanner scanner = new Scanner(System.in);
    private static Random appetiteRandomize = new Random();



    public static void main(String[] args) {
        Cat [] arrayCat = new Cat[starGame()];
        Plate plate=new Plate();

        increaseFoodUser(plate);

        for(int i=0; i<QUANTITY_CAT;i++ ){
            arrayCat[i]= createCat(i);
            System.out.println(arrayCat[i]);
            if (arrayCat[i].hungryNotEnough(plate)) {
                increaseFoodUser(plate);
            }

            arrayCat[i].eat(plate);
            plate.plateInfo();



        }

    }

    private static Cat createCat(int i) {
        return new Cat("Кот"+(i+1),appetiteRandomize.nextInt(20) );
    }

    private static void increaseFoodUser(Plate plate) {
        System.out.print("Накормите котов! Сколько еды Вы положили в тарелку? Введите кол-во: ");
        FOOD_USER = scanner.nextInt();

        plate.increaseFood(FOOD_USER);

    }

    private static int starGame() {
        System.out.print("Внимание! На Вас надвигается стая голодных КОТОВ!!! Посчитайте котов. Введите кол-во: ");
        QUANTITY_CAT = scanner.nextInt();
        return QUANTITY_CAT;

    }


}
