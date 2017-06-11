package com.timbuchalka;

/**
 * Created by jiaxiangtang on 6/8/17.
 */
public class Car {

    //below are the state component, private means don't allow access outside of the Car class
    private int doors;
    private int wheels;
    private String model;
    private String color;
    private String engine;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("mazda")) {
            this.model = validModel;
        } else  {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
