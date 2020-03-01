package javaLevel1Lesson7;

public class Plate {

    protected int food;

    Plate(){

    }

      public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food<=0){
            System.out.print("Не лучшая идея забрать или не накормить голодных котов! Коты Вас съели!");
        }
        this.food = food;
    }

    public void decreaseFood (int a){
        this.food-=a;

    }

    public void increaseFood (int b){

        setFood(b);
    }


    public void plateInfo(){

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
