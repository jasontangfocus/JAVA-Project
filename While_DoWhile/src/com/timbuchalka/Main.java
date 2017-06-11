package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        /*System.out.println(String.valueOf(isEven(11)));*/

        int number = 5;
        int finishNumber = 20;
        int totalNumber = 0;
        int count = 0;
        while(number <= finishNumber) {

            if(isEven(number)) {
                System.out.println(number + " is an even number");
                totalNumber += number;
                count++;
            }

            if (count == 5) {
                System.out.println();
                System.out.printf("Counted " + count + " even numbers, and the total number is " + totalNumber);
                break;
            }

            number++;
        }
    }

    //test if a number is an even number
    private static boolean isEven(int num) {
        //corner case
        if (num < 0) {
            System.out.println("error, please enter a number greater than 0");
            return false;
        }

        //normal case
        return num % 2 == 0;
    }

}
