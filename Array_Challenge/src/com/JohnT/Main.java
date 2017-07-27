package com.JohnT;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    //用法是scanner.nextInt()

    public static void main(String[] args) {

        //Create a program using arrays that sorts a list of integers in descending order.
        //Descending order is highest value to lowest
        //In other words, if the array had the values in it 106, 26, 81, 15 your program should ultimately have an array with 106, 81, 26, 15, 5 in it.
        //Set up the program so that the numbers to sort are read in from the keyboard
        //Implement the following methods - getIngeters printArray, and sortIntegers.
        //getIntegers returns an array of entered integers from keyboard
        //printArray prints out the contents of the array
        //and sortIntegers should sort the array and return a new array containing the sorted numbers
        //you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array.

        System.out.println("Please Decide how many numbers you want to enter, and enter the total numbers you want to enter:");
        int number = scanner.nextInt();
        int[] myIntArray = getIntegers(number);
        printArray(sortArray(myIntArray));
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Please Enter " + number + " numbers");
        int[] arr = new int[number];
        for (int i = 0;i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] sortArray(int[] array) {
        int[] sortedarray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < sortedarray.length; i++) {
            for (int j = i + 1; j < sortedarray.length; j++) {
                if (sortedarray[i] < sortedarray[j]) {
                    int temp = sortedarray[j];
                    sortedarray[j] = sortedarray[i];
                    sortedarray[i] = temp;
                }
            }
        }
        return sortedarray;
    }
}
