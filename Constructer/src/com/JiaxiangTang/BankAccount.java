package com.JiaxiangTang;

/**
 * Created by tjiax on 6/10/2017.
 */
public class BankAccount {
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

    private int accountNumber;
    private double balance = 0d;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        //System.out.println("empty constructor called");
        //the default constrctor can be used to call the second constructor by using keyword "this()", but it must in the first line
        this(000000, "default Name", "myemail@xxx", "000000000");
    }

    public BankAccount(int accountNumber, String customerName, String email, String phoneNumber) {
        //within a constructor code, we should not call other methods
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(String customerName) {
        int an = 0;
        if (customerName.toLowerCase() == this.customerName.toLowerCase()) {
            an = this.accountNumber;
        } else {
            System.out.println("Customer Name not found!");
        }
        return an;
    }

    public String getCustomerName(int accountNumber) {
        String cn = "Null";
        if (accountNumber == this.accountNumber) {
            cn = this.customerName;
        } else {
            System.out.println("Account Number not found!");
        }
        return cn;
    }

    public String getEmail(String accountName) {
        String em = "null";
        if (accountName.toLowerCase() == this.customerName.toLowerCase()) {
            em = this.email;
        }
        return em;
    }

    public String getPhoneNumber(String accountName) {
        String pn = "0";
        if (accountName.toLowerCase() == this.customerName.toLowerCase()) {
            pn = this.phoneNumber;
        }
        return pn;
    }

    public double getBalance(int accountNumber) {
        if (accountNumber == this.accountNumber) {
            System.out.println("Your Balance current is:" + this.balance);
        }
        return 0;
    }

    public double deposit(double cashIn) {
        if (cashIn > 0) {
            this.balance += cashIn;
        } else {
            System.out.println("Negative deposit not allowwed");
        }
        return this.balance;
    }

    public double withdraw(double cashOut) {
        if (this.balance >= cashOut && cashOut > 0) {
            this.balance -= cashOut;
        } else {
            System.out.println("Insufficient funds");
        }
        return this.balance;
    }

}
