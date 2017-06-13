package com.JiaxiangTang;

/**
 * Created by tjiax on 6/12/2017.
 */
public class VipCustomer {
     /*
        create a new class VipCustomer
        it should have 3 field name, credit limit , and email address.
        create 3 constructors
        1st constructor empty should call the constructor with 3 parameters with default values.
        2st constructor should pass on the 2 values it receive and add a default value for the 3rd
        3st constrcutor should save all fields
        create getters only for this using code generation of intellij on setters wont be needed
        test and confirm it works
         */
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Joash", 10000, "Joash@gmail.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 10000, emailAddress);
    }

}
