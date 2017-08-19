package com.JohnT;

import sun.misc.resources.Messages_pt_BR;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {

        /*
        * This is a program implements a simple mobile phone with the following capabilities
        * 1. store contact names
        * 2. modify contact names
        * 3. remove contact names
        * 4. query contact names
        * ----------------------------
        * Add a menu of options that are available
        * Options:
        *   - Quit
        *   - Print list of contacts
        *   - add new contact
        *   - update existing contact
        *   - remove contact
        *   - search/find contact
        *-----------------------------
        * When adding or updating be sure to check if the contact already exists (use name)
        * Be sure not to expose the inner workings of the ArrayList to Mobile Phone
        * Mobile phone should do everything with Contact objects only
        * */

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter actions: (");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting Down...");
                    quit = true;
                    break;

                case 1:
                    printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new Contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact added: " + name + ", phone " + phone);
        } else {
            System.out.println("cannot add, " + name + ", phone " + phone);
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumebr = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumebr);

        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter the contact name you want to remove: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("The name you entered not found");
            return;
        }

         if (mobilePhone.removeContact(existingContact)) {
             System.out.println("Successfully deleted");
         } else {
             System.out.println("Error deleting contact");
         }
    }

    private static void queryContact() {
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " Phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void startPhone() {
        System.out.println("Starting the Phone......");
    }

    private static void printActions() {
        System.out.println("\nAvailable options:\nPress");
        System.out.println("0 - to shut down\n" +
                           "1 - to print contacts\n" +
                           "2 - to add new contact\n" +
                           "3 - to update existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - to query if an existing contact exists\n" +
                           "6 - to print a list of available actions."
        );
        System.out.println("Choose your actions: ");
    }
}
