package javaLevel1Lesson6;

public class Dog extends Animal {
    public  static  final int MAX_DOG_RUN =500;
    public  static  final int MAX_DOG_JAMP = 1;
    public  static  final int MAX_DOG_SWIM = 10;

    public Dog (int maxRun, int maxJamp, int maxSwim){

        super(maxRun, maxJamp, maxSwim);
    }

    public Dog (){

        super(MAX_DOG_RUN, MAX_DOG_JAMP, MAX_DOG_SWIM);

    }

    @Override
    public boolean run(int distance) {

        if (this.maxRun >= distance) {
            System.out.printf("Собака пробежала дистанцию %d. Max = %d%n", distance, maxRun);
            return true;
        }

        System.out.printf("Собака не смогла пробежать дистанцию %d. Max = %d%n", distance, maxRun);
        return false;
    }

    @Override
    public boolean jamp(int height) {

        if (this.maxJamp >= height) {
            System.out.printf("Собака перепрыгнула препятствие %d. Max = %d%n", height, maxJamp);
            return true;
        }

        System.out.printf("Собака не смогла перепрыгнуть препятствие %d. Max = %d%n", height, maxJamp);
        return false;
    }

    @Override
    public boolean swim(int distance) {

        if (this.maxSwim >= distance) {
            System.out.printf("Собака проплыла дистанцию %d. Max = %d%n", distance, maxSwim);
            return true;
        }
        System.out.printf("Собака не смогла переплыть дистанцию %d. Max = %d%n", distance, maxSwim);
        return false;
    }

}
