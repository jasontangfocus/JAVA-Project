package com.JiaxiangTang;

/**
 * Created by tjiax on 6/14/2017.
 */
public class PC {
    private Case theCase;
    private Monitor montitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor montitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.montitor = montitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMontitor() {
        return montitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
