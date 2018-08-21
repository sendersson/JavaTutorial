package com.company;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(1234567, 0, "Default", "default@default.se", "Default phone");

    }
    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber){
        this(12345,0, customerName,email,phoneNumber);
    }

    public void printAll(){
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
        System.out.println(getCustomerName());
        System.out.println(getEmail());
        System.out.println(getPhoneNumber());
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName.toLowerCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdrawFunds(int amountWithdrawed){

        if(amountWithdrawed <= this.balance){
            System.out.println("Withdrawing " +amountWithdrawed +" from account: " +this.accountNumber);
            this.balance -= amountWithdrawed;
            System.out.println("Your remaining balance is: " +this.balance);
        } else{
            System.out.println("Not enough funds");
        }
    }

    public void depositFunds(int amountDeposited){
        System.out.println("Balance before deposit: " +this.balance);
        this.balance += amountDeposited;
        System.out.println("Balance after deposit: " +this.balance);

    }




}
