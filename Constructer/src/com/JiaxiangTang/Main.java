package com.JiaxiangTang;

public class Main {

    public static void main(String[] args) {
        //Create a new class for a bank account
        //Create fields for the account number, balance, customer name, email and phone number
        //
        //create getters and setters for each field
        //create two additions methods
        //1.    To allow the customer to deposit funds (this should increment the balance field)
        //2.    To allow the customer to withdraw funds, this should deduct from the balance field
        //but not allow the withdraw to complete if there are insufficient funds
        //you will want to create various code in the Main Class (the one created by INtellij to
        //confirm your code is working
        //Add some System.out.println in the two methods above as well

        BankAccount bATJX = new BankAccount();
        bATJX.setAccountNumber(10000);
        bATJX.setCustomerName("tangjiaxiang");
        bATJX.setEmail("t.jiaxiang@gmail.com");
        bATJX.setPhoneNumber("4090546883");
        bATJX.deposit(2000d);


        System.out.println(bATJX.getAccountNumber("tangjiaxiang"));
        System.out.println(bATJX.getCustomerName(10000));
        bATJX.getBalance(10000);
        bATJX.deposit(2000);
        bATJX.getBalance(10000);
        bATJX.withdraw(380);
        bATJX.getBalance(10000);
        bATJX.withdraw(4000);



    }
}
