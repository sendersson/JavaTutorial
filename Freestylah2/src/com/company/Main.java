package com.company;

public class Main {

    public static void main(String[] args) {
	PhoneBook phoneBook = new PhoneBook();

	phoneBook.addContact("William", "0735020818");
	phoneBook.addContact("Christine", "0737773833");
	phoneBook.addContact("Liselotte", "0709909907");
	phoneBook.addContact("Mikael", "0709909907");

	phoneBook.printList();
    }
}
