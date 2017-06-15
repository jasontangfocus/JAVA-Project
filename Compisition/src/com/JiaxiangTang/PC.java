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

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //fancy graphic
        montitor.drawPixelAt(1200, 50, "yellow");
    }


/*

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMontitor() {
        return montitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
*/
}
