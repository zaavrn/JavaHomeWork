package javaLevel1Lesson6;

import java.util.Random;

public class Сompetition {
    public static void main(String[] args) {
        Animal[] competitors = {
                new Cat(),
                new Dog(),
                new Cat(250, 3),
                new Dog(550, 2, 20),
                new Cat(300, 4),
                new Dog(600, 3, 30)
        };

        Random random = new Random();
        for (Animal competitor : competitors) {
            competitor.printInfo();
            System.out.println(competitor.run(random.nextInt(700)));
            System.out.println(competitor.jamp(random.nextInt(5)));
            System.out.println(competitor.swim(random.nextInt(40)));
            System.out.println();
        }
    }
}
