package ListArrayList.JohnT;

import java.util.Scanner;

public class Main {

    /*private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];*/

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        /*System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        for (int e : arr) {
            System.out.println(e + " ");
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
        */

        boolean quit = false;
        int choice = 0;

        printInstruction();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }



    }
}
