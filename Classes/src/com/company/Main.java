package com.company;

public class Main {

    public static void main(String[] args) {
/*
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");

        BankAccount williamsKonto = new BankAccount(12345, 10000, "William Skoglycke", "william@skoglycke.se", "0735020818");
        System.out.println("Williams konto har pengarna: " +williamsKonto.getBalance());

        BankAccount defaultKonto = new BankAccount();
        System.out.println("Default kontots email: " +defaultKonto.getEmail());

        BankAccount onlyStrings = new BankAccount("Willepille", "pille@wille.se", "0732838233");
        onlyStrings.printAll();

        BankAccount bA = new BankAccount();
        bA.setAccountNumber(12345678);
        bA.setBalance(10000);
        bA.setCustomerName("William");
        bA.setEmail("william@skoglycke.se");
        bA.setPhoneNumber("0735020818");

        bA.depositFunds(100);
        bA.withdrawFunds(5000);
        bA.withdrawFunds(5000);
        bA.withdrawFunds(100);

        System.out.println(bA.getBalance());
*/

        BankAccount defaultAccount = new BankAccount();
        defaultAccount.printAll();
        System.out.println();

        BankAccount threeFieldsFilled = new BankAccount("Three Fieldsson", "three@field.se", "02030450");
        threeFieldsFilled.printAll();
        System.out.println();

        BankAccount allFilled = new BankAccount(54321,10000,"William Skoglycke", "william@skoglycke.se", "0735020818");
        allFilled.printAll();

    }
}
