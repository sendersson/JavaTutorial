package com.company;

import java.util.ArrayList;

public class Branch {

    private String branchname;
    private ArrayList<Customers> customersArrayList;

    public Branch(String branchname) {
        this.branchname = branchname;
        customersArrayList = new ArrayList<Customers>();
    }


    boolean addCustomer(String name, double initialAmount) {

        if (findCustomer(name) >= 0) {
            System.out.println("Customer already exists");
        } else {
            customersArrayList.add(new Customers(name, initialAmount));
            return true;
        }
        return false;
    }

    boolean addCustomerTransaction(String customerName, double transactionAmount) {
        int index = findCustomer(customerName);
        if (index >= 0) {
            customersArrayList.get(index).addTransaction(transactionAmount);
            return true;
        } else {
            System.out.println("Didnt find name: " +customerName);
            return false;
        }

    }

    boolean printCustomerTransaction(String customerName) {
        int index = findCustomer(customerName);
        if (index >= 0) {
            customersArrayList.get(index).printTransactions();
            return true;
        } else {
            System.out.println("Didnt find name: " +customerName);
            return false;
        }
    }

    public void printAllCustomers(){
        for (int i = 0; i < customersArrayList.size(); i++){
            System.out.println(customersArrayList.get(i).getCustomerName());
        }
    }

    private int findCustomer(String name) {
        for (int i = 0; i < customersArrayList.size(); i++) {
            if (customersArrayList.get(i).getCustomerName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getBranchname() {
        return branchname;
    }
}
