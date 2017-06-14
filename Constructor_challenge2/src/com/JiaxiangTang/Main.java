package com.JiaxiangTang;

public class Main {

    public static void main(String[] args) {
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
        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer("Bob", "Bob@emial.com");
        System.out.println(vip2.getName());

        VipCustomer vip3 = new VipCustomer("Tim", 10000, "Tim@email.com");
        System.out.println(vip3.getName());


    }
}
