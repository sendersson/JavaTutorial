package com.company;

import java.util.ArrayList;

public class Customers {

    private String customerName;
    private ArrayList<Double> transactionArrayList;

    public Customers(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactionArrayList = new ArrayList<Double>();
        addTransaction(initialAmount);

    }

    public void addTransaction(double amount){
        this.transactionArrayList.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactionArrayList() {
        return transactionArrayList;
    }

    public void printTransactions(){
        for (int i=0;i<transactionArrayList.size(); i++){
            System.out.println(transactionArrayList.get(i));
        }
    }
}
