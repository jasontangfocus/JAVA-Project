package com.JiaxiangTang;

/**
 * Created by tjiax on 6/13/2017.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeths;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeths, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeths = teeths;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    public void movelegs(int speed) {
        System.out.println("Dog.moveleg() called moving at speed " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        movelegs(speed);
        super.move(speed + 1);
    }
}
