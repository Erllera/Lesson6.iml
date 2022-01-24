package com.company;

public class Skeleton extends Boss {

    private int Counter;

    public int getCounter() {
        return Counter;
    }

    public void setCounter(int counter) {
        Counter = counter;
    }

    public Skeleton(int health, int damage, int counter) {
        super(health, damage);
        Counter = counter;
    }

    public String printInfo(){
        return super.printInfo() + "Number of arrows "+ Counter;
    }

}
