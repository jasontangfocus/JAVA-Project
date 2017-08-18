package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        //width of INT = 32 (4bytes)
        int myIntValue = 5 / 3;
        //width of float = 32 (4bytes)
        float myFloatValue = 5f / 3f;    //single precision number
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Convert a given number of pounds to kilgrams
        //1.    create a variable to store the number of pounds
        //2.    calculate the number of Kilograms for the number above and store in a variable
        //3.    Print out the resulth
        //
        //Notes:    1 pound is equal to 0.45359237 kilograms

        double myPoundValue = 10d;
        double myKilogramValue = myPoundValue * 0.45359237d;
        System.out.println(myKilogramValue);
    }
}
