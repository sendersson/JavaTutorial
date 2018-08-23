package com.company;

public class Main {

    public static void main(String[] args) {


        CreateBurger regularBurger = new CreateBurger(10,"Plain", "Juicy patty");

        regularBurger.addAdditions("chedDar");
        regularBurger.addAdditions("ketChup");
        regularBurger.addAdditions("mUstard");
        regularBurger.addAdditions("oNion");
        regularBurger.addAdditions("dreSSinG");
        regularBurger.addAdditions("LEttuce");
        regularBurger.addAdditions("onion");

        regularBurger.printTotal();



        HealthyBurger healthyBurger = new HealthyBurger(11, "Multigrain", "Boring fat free patty");

        healthyBurger.addAdditions("cheddar");
        healthyBurger.addAdditions("onion");
        healthyBurger.addAdditions("lettuce");
        healthyBurger.addAdditions("dressing");
        healthyBurger.addAdditions("ketchup");
        healthyBurger.addAdditions("cheddar");
        healthyBurger.addAdditions("cheddar");
        healthyBurger.addAdditions("pickles");
        healthyBurger.addAdditions("mustard");

        healthyBurger.printTotal();

        System.out.println("*********************");

        DeluxeBurger deluxeBurger = new DeluxeBurger(10, "Plain", "Juicy patty");

        deluxeBurger.addAdditions("cheddar");
        deluxeBurger.printTotal();

    }
}

