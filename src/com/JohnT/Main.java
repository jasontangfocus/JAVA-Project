package com.JohnT;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerat()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubish extends Car {
    public Mitsubish(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubish -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubish -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubish -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {

        //we are going to go back to the car analogy
        //create a base class called car
        //It should have a few fields that would be appropriate for a generic car class
        //engine, cylinders, wheels, etc.
        //constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true.
        //Cylinders and names would be passed parameters.

        //Create appropriate getters


        //Create appropriate getters

        //create some methods like startEngine, accelerate, and brake

        //show a message for each in the base class
        //now create 3 sub classes for your favourite vehicles
        //override the appropriate methods to demonstrate polymorphism in use
        //put all classes in the one java file(this one)

        Car car = new Car(8, "base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubish mitsubish = new Mitsubish(6, "OutLander");
        System.out.println(mitsubish.startEngine());
        System.out.println(mitsubish.accelerate());
        System.out.println(mitsubish.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden FalconH");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }
}
