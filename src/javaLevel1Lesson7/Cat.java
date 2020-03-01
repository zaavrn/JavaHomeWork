package javaLevel1Lesson7;

public class Cat {
    protected String name;
    protected int appetite;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }

    public void eat (Plate plate){
        plate.decreaseFood(appetite);

    }

    public boolean hungryNotEnough(Plate plate){
        if (appetite>plate.food){
            System.out.println("Коты не наелись. Добавьте в тарелку еды");
            return true;
        }

        return false;
    }

}
