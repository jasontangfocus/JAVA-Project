package com.JiaxiangTang;

/**
 * Created by tjiax on 6/14/2017.
 */
public class Car extends Vehicle {
    //Challenge
    //Start with a base class of a Vehicle, then create a Car Class that inherits from this base class
    //Finally, create another class, a specific type of Car that inherits from the Car class
    //You should be able to hand steering, changing gears, and moving (Speed in other words)
    //You will want to decide where to put the approriate state and behaviours (fields and methods)
    //AS mentioned above, changing gears, increasing/decreasing speed should be included
    //For you specific type of vehicle you will want to add something specific fot that type of car

    private String manufacture;
    private int gears;
    private int currentGear = 0;
    private int currentSpeed = 0;

    public void setGears(int gears) {
        this.gears = gears;
    }

    public Car(int doors, String manufacture) {
        super(4, doors);
        this.manufacture = manufacture;
    }

    private void changeGear(int changeGear) {
        this.currentGear += changeGear;
        if (this.currentGear < 1) {
            this.currentGear = 1;
        }
        System.out.println(" Now changing gears to " + this.currentGear);
    }

    @Override
    public void move(int speed) {
        changeGear(1);
        System.out.printf("Car moving at speed of " + speed);
    }

    public int accelerate(int speed) {
        while (this.currentGear < gears) {
            speed++;
            move(speed);
        }
        System.out.println(" Now reached max gears, and moving at speed of " + speed);
        return this.currentSpeed += speed;
    }

    public void decreasingSpeed(int shiftDown, int speedTo) {
        if (shiftDown > 0) {
            System.out.println("Error, Dreasing Speed, please enter value < 0");
        } else {
            while (this.currentSpeed > speedTo) {
                changeGear(shiftDown);
                this.currentSpeed--;
                System.out.println(" Now dreased speed and moving at speed of " + this.currentSpeed);
            }
        }
    }

    public void steer(int turnLeft, int turnRight) {
        if (turnLeft == 1 && turnRight == 0) {
            System.out.println("car is turning to the left");
        }
        if (turnRight == 1 && turnLeft == 0) {
            System.out.println("car is turning to the right");
        } else {
            System.out.println("car is going straight");
        }
    }
}
