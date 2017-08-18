package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        int switchValue = 5;
	    switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually it is a :" + switchValue);
                break;

            default:
                System.out.printf("Value is not 1 or 2 or 3 or 4 or 5");
        }

        char charValue = 'f';

	    switch(charValue) {
            case 'a':
                System.out.println("The value is a");
                break;
            case 'b':
                System.out.println("The value is b");
            case 'c':
                System.out.println("The value is c");
                break;
            case 'd':case 'e':
                System.out.println("The value is d");
                break;
            default:
                System.out.println("The value is not a or b or c or d");
                System.out.println("The actual value is " + charValue);
                break;

        }

    }
}
