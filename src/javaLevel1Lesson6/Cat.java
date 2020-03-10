package javaLevel1Lesson6;

public class Cat extends Animal {
    public  static  final int MAX_CAT_RUN =200;
    public  static  final int MAX_CAT_JAMP = 2;
    public  static  final int MAX_CAT_SWIM = 0;


    public Cat (int maxRan, int maxJamp){
        super (maxRan, maxJamp, MAX_CAT_SWIM);
    }

    public Cat (){
        super(MAX_CAT_RUN, MAX_CAT_JAMP, MAX_CAT_SWIM);
    }


    @Override
    public boolean run(int distance) {
        if (this.maxRun >= distance) {
            System.out.printf("Кот пробежал дистанцию %d. Max = %d%n", distance, maxRun);
            return true;
        }

        System.out.printf("Кот не смог пробежать дистанцию %d. Max = %d%n", distance, maxRun);
        return false;
    }

    @Override
    public boolean jamp(int height) {
        if (this.maxJamp >= height) {
            System.out.printf("Кот перепрыгнул препятствие %d. Max = %d%n", height, maxJamp);
            return true;
        }

        System.out.printf("Кот не смог перепрыгнуть препятствие %d. Max = %d%n", height, maxJamp);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Коты не плавают!");
        return false;

    }
}
