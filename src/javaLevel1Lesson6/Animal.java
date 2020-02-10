package javaLevel1Lesson6;

public abstract class Animal {

    protected int maxRun;
    protected int maxJamp;
    protected int maxSwim;

    public Animal(int maxRun,int maxJamp, int maxSwim){
        this.maxRun=maxRun;
        this.maxJamp=maxJamp;
        this.maxSwim=maxSwim;
    }

    public abstract boolean run (int distance);
    public abstract boolean jamp (int height);
    public abstract boolean swim (int distance);


    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxJamp() {
        return maxJamp;
    }

    public void setMaxJamp(int maxJamp) {
        this.maxJamp = maxJamp;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "maxRun=" + maxRun +
                ", maxJamp=" + maxJamp +
                ", maxSwim=" + maxSwim +
                '}';
    }
}

