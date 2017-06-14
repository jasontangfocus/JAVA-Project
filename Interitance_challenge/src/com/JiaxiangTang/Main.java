package com.JiaxiangTang;

public class Main {

    public static void main(String[] args) {
	    //Challenge
        //Start with a base class of a Vehicle, then create a Car Class that inherits from this base class
        //Finally, create another class, a specific type of Car that inherits from the Car class
        //You should be able to hand steering, changing gears, and moving (Speed in other words)
        //You will want to decide where to put the approriate state and behaviours (fields and methods)
        //AS mentioned above, changing gears, increasing/decreasing speed should be included
        //For you specific type of vehicle you will want to add something specific fot that type of car

        Vehicle vc = new Vehicle(4, 4);
        Car sportCar = new Car(2, "Mazda");

        sportCar.setGears(6);
        sportCar.move(1);
        sportCar.accelerate(10);
        sportCar.decreasingSpeed(-1, 5);
        sportCar.steer(1,0);
    }
}
