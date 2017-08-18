package com.timbuchalka;

import java.util.Scanner;

public class Main {

    //scanner object allow user to input values in the command window
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myInteger = getIntegers(5);
        for (int i = 0; i < myInteger.length; i++) {
            System.out.println("Elements " + i + ", typed value was " + myInteger[i]);
        }
        System.out.println("the average is " + getAverage(myInteger));
    }

    public static int[] getIntegers(int number) {
        System.out.println("enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double)sum/(double)array.length;
    }


}
