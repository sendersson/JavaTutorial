package com.company;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branchArrayList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchArrayList = new ArrayList<Branch>();
    }

    boolean addBranch(String branchName) {

        if (findBranch(branchName) >= 0) {
            System.out.println("Name of branch already exists.");
            return false;
        } else {
            branchArrayList.add(new Branch(branchName));
            return true;
        }

    }

    int findBranch(String name) {
        for (int i = 0; i < branchArrayList.size(); i++) {
            if (branchArrayList.get(i).getBranchname().equals(name)) {
                return i;
            }
        }
        return -1;
    }


    boolean addCustomer(String branchName, String customerName, double initialAmount) {
        int index = findBranch(branchName);
        if (index >= 0){
            Branch branch = branchArrayList.get(index);
            branch.addCustomer(customerName, initialAmount);
            return true;
        }
        return false;
    }

    boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount){
        int index = findBranch(branchName);
        if (index >= 0){
            Branch branch = branchArrayList.get(index);
            branch.addCustomerTransaction(customerName, transactionAmount);
            return true;
        }
        return false;
    }

    boolean printTransactions(String branchName, String customerName){
        int index = findBranch(branchName);
        if (index >= 0){
            Branch branch = branchArrayList.get(index);
            branch.printCustomerTransaction(customerName);
            return true;
        }
        return false;
    }

    boolean printCustomers(String branchName){
        int index = findBranch(branchName);
        if (index >= 0){
            Branch branch = branchArrayList.get(index);
            branch.printAllCustomers();
            return true;
        }
        return false;
    }

}
