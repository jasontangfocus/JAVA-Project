package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
/*
        System.out.println("10000.0 at interest rate of 2% is equal to " + calculateInterest(10000.0, 2.0));
*/

/*
        for (int i = 8; i >= 2; i --) {
            System.out.println("10000.0 at interest rate of " + i + "%, is equal to " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
        //String.format()把括号中的数按照一定的要求转换成需要的格式，"%.2f" %表示需要将这个数，保留至小数点后2位小数。public
        System.out.printf(String.valueOf(a));
        boolean a = isPrime(3);
*/

        int count = 0;
        for (int i = 1; i < 1000; i ++) {
            if (isPrime(i)) {
                count ++;
                System.out.println("The number " + i + " is a prime");
                if (count == 10) {
                    System.out.println("Exiting the for loop, as we already found" + count +" prime numbers which are smaller than 50");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate) / 100);

    }

    //Decide a number is prime a number or not
    public static boolean isPrime(int num) {
        //corner case
        if (num == 1) {
            return false;
        }

        //normal case
        for (int i = 2; i <= (long)Math.sqrt(num); i++) {  //(num / 2)这里我们使用i<根号num来进行判断小于num的质数，比判断num / 2更加有效率
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
