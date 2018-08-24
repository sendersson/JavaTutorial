package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MobilePhone contacts = new MobilePhone();
        contacts.printInstructions();
        boolean flag = false;

        while (!flag){
            System.out.println("Enter choice:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    contacts.printInstructions();
                    break;
                case 2:
                    contacts.addContact(getUserInputName(), getUserInputNumber());
                    break;
                case 3:
                    contacts.listContacts();
                    break;
                case 4:
                    System.out.println("Old name, followed by new name and new number:\r");
                    contacts.updateContact(getUserInputName(), getUserInputName(), getUserInputNumber());
                    break;
                case 5:
                    contacts.removeContact(getUserInputName());
                    break;
                case 6:
                    contacts.searchContact(getUserInputName());
                    break;
                default:
                    flag = true;
            }
        }

    }
    static String getUserInputName(){
        System.out.println("Enter name: ");
        scanner.nextLine();
        String userInput = scanner.nextLine();
        return userInput;
    }

    static String getUserInputNumber(){
        System.out.println("Enter number: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

}







// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.