package com.JohnT;

/**
 * Created by jiaxiangtang on 6/18/17.
 */
public class Printer {

    //create a class and demonstrate proper encapsulation techniques
    //the class will be called printer
    //It will simulate a real Computer Printer
    //It should have fields for the toner Level, number of pages printed, and
    //also whether its a duplex printer (capable of printing on both sides of the paper).
    //Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page (which should increase the number of pages printed
    //Decide on the scope, whether to use constructors, and anything else you think is needed.

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexble;

    public Printer(int tonerLevel, boolean duplexble) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplexble = duplexble;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pageToPrint = pages;
        if (this.duplexble) {
            pageToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pageToPrint;
        return pageToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexble() {
        return duplexble;
    }
}
