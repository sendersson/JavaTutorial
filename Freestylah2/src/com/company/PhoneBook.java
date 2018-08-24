package com.company;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    void printList(){
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getNumber());
        }
    }
    void addContact(String name, String number){
        contacts.add(new Contact(name, number));
    }
}
