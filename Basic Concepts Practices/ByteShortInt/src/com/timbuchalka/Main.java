package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        //byte has a width of 8
        byte myMaxByteValue = 127;
        byte myMinByteValue = -128;

        byte myNewByteValue = (byte)(myMinByteValue/2);


        //short has a width of 16
        short myMaxShortValue = 32767;
        short myMinShortValue = -32768;

        //long has a width of 64
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        long myMinLongValue = -9_223_372_036_854_775_808L;

        System.out.println(myMaxLongValue);

    }
}
