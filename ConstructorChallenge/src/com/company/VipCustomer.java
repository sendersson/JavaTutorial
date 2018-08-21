package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("DefaultPerson", 10000.0, "default@person.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "default@person.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void printAll(){

        System.out.println(getName());
        System.out.println(getCreditLimit());
        System.out.println(getEmail());
        System.out.println();

    }
}
