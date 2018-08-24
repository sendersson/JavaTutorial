package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<String> nameArray = new ArrayList<String>();
    private ArrayList<String> numberArray = new ArrayList<String>();

    public void printInstructions() {
        System.out.println("1. List options");
        System.out.println("2. Add contact");
        System.out.println("3. List contacts");
        System.out.println("4. Update contact");
        System.out.println("5. Remove contact");
        System.out.println("6. Search contact");
        System.out.println("7. Quit");
    }

    public void addContact(String name, String number){
        if(nameArray.contains(name)){
            System.out.println("Already have " +name +" in contacts");
        } else {
            System.out.println("Adding name: " + name + " phonenumber: " + number);
            nameArray.add(name);
            numberArray.add(number);
        }
    }

    public void listContacts(){
        for (int i =0; i < nameArray.size(); i++){
            System.out.println("Name: " +nameArray.get(i) +" Phonenumber: " +numberArray.get(i));
        }
    }

    public void updateContact(String name, String newName, String newNumber) {
        if (findContact(name) == -1) {
            System.out.println("Could'nt find " + name + " in contacts");
        } else {
            numberArray.set(findContact(name), newNumber);
            nameArray.set(findContact(name),newName);
        }
    }

    public void removeContact(String name){
        if (findContact(name) == -1) {
            System.out.println("Could'nt find " + name + " in contacts");
        } else {
            numberArray.remove(findContact(name));
            nameArray.remove(findContact(name));
        }

    }

    public int findContact(String name){

        if(nameArray.contains(name)) {
            return nameArray.indexOf(name);
        } else {
            return -1;
        }
    }

    public void searchContact(String name){
        if(nameArray.contains(name)){
            System.out.println(name +" found in Contacts");
        }
    }

}
