package com.JiaxiangTang;

/**
 * Created by tjiax on 6/13/2017.
 */
public class Vehicle {
    //Challenge
    //Start with a base class of a Vehicle, then create a Car Class that inherits from this base class
    //Finally, create another class, a specific type of Car that inherits from the Car class
    //You should be able to hand steering, changing gears, and moving (Speed in other words)
    //You will want to decide where to put the approriate state and behaviours (fields and methods)
    //AS mentioned above, changing gears, increasing/decreasing speed should be included
    //For you specific type of vehicle you will want to add something specific fot that type of car

    private int wheels;
    private int doors;


    public Vehicle(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }

    public void steer() {
        System.out.println("Vehicle.steer() called");
    }

    public void move(int speed) {
        System.out.println("Vehicle starts moving at speed of" + speed);
    }


}
