package com.JohnT;

public class Main {

    public static void main(String[] args) {

        /*
        * Create a simple banking application
        * There should include a Bank Class
        * It should have an arrayList of Branches
        * Each branch should have an arrayList of customers
        * The Customer class should have an arrayList of Doubles (transactions)
        * Customer:
        *   Name, and the ArrayList of doubles
        * Branch:
        *   Need to be able to add a New customer and initial transaction amount
        *   Also needs to add additional transactions for that customer/branch
        * Bank:
        *   Add a new branch
        *   Add a customer to that branch with initial transaction
        *   Show a list of customers for a particular branch and optionally a list of their transactions
        * Demonstration autoboxing and unboxing in your code
        * Hint: Transaction
        * Add data validation
        * e.g. check if exists, or does not exist etc
        * Think about where you are adding the code to perform certain actions
        * */

        Bank bank = new Bank("Chase Bank");

        bank.addBranch("Beaumont2");
        bank.addCustomer("Beaumont2", "Greysen", 100.00);
        bank.addCustomer("Beaumont2", "Jeremy", 88.00);
        bank.addCustomer("Beaumont2", "SummerCake", 78.00);

        bank.addBranch("Houston1");
        bank.addCustomer("Houston1", "Bob", 150.54);

        bank.addCustomerTransaction("Beaumont2", "Greysen", 1000.90);
        bank.addCustomerTransaction("Beaumont2", "Greysen", 1000.90);
        bank.addCustomerTransaction("Beaumont2", "MIke", 1000.90);

        bank.listCustomers("Beaumont2", true);
        bank.listCustomers("Houston1", true);

        //Testing
        bank.addBranch("Dallas");
        if (!bank.addCustomer("Dallas", "Tang", 9999.99)) {
            System.out.println("Error Dallas branch does not exist");
        }

        if (!bank.addBranch("Beaumont2")) {
            System.out.println("Beaumont2 branch already exists");
        }

        if (!bank.addCustomerTransaction("Juney", "Juney2", 123123.23)) {
            System.out.println("Customer does not exist");
        }

        if (!bank.addCustomer("Beaumont2", "Greysen",12.21)) {
            System.out.println("Customer Greysen already existed");
        }

    }
}
