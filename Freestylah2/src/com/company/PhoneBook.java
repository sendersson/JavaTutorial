package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private Scanner s = new Scanner(System.in);

    void startPhoneBook() {

        boolean flag = true;
        printInstructions();

        while (flag) {
            System.out.println("Enter choice: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    System.out.println("Name followed by number and adress: ");
                    addContact(getUserInput(), getUserInput(), getUserInput());
                    break;
                case 3:
                    removeContact(getUserInput());
                    break;
                case 4:
                    String name = getUserInput();
                    if (contacts.contains(name)) {
                        System.out.println(name + " found in contacts");
                    } else {
                        System.out.println(name + " not found in contacts");
                    }
                    break;
                case 5:
                    printList();
                    break;
                case 6:
                    System.out.println("Enter name: ");
                    updateContact(getUserInput());
                    break;
                default:
                    flag = false;
                    break;
            }

        }
    }


    String getUserInput(){
        String input = s.nextLine();
        return input;
    }

    private void printInstructions(){
        System.out.println("1. Print instructions");
        System.out.println("2. Add contact");
        System.out.println("3. Remove contact");
        System.out.println("4. Search contact");
        System.out.println("5. List all contacts");
        System.out.println("6. Update contact");
        System.out.println("7. Quit");
    }

    private void printList(){
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getNumber() + " " +contact.getAdress());
        }
    }
    private boolean addContact(String name, String number, String adress){
        if(findContact(name) == -1){
            contacts.add(new Contact(name, number, adress));
            return true;
        }
        return false;
    }

    private boolean removeContact(String name){
        int index = findContact(name);
        if (index >=0) {
            this.contacts.remove(index);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(String contactName) {
        for(int i=0; i<this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private boolean updateContact(String name){

            int index = findContact(name);
            if (index >= 0){
                System.out.println("New number followed by new adress: ");
                Contact contact = this.contacts.get(index);
                contact.setNumber(getUserInput());
                contact.setAdress(getUserInput());
                return true;
            }
        return false;
    }

}
