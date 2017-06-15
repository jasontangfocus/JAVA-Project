package com.JiaxiangTang;

/**
 * Created by tjiax on 6/14/2017.
 */
public class Car extends  Vechicle{
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

