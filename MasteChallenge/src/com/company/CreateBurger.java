package com.company;

public class CreateBurger {

    private boolean isDeluxeBurger;

    private double baseCost;
    private double additionCost;
    private int additions;
    private int maximumAdditions;
    private double totalCost;

    private boolean cheddar;
    private boolean onion;
    private boolean dressing;
    private boolean lettuce;
    private boolean ketchup;
    private boolean cucumber;
    private boolean mustard;
    private boolean pickles;
    private String bread;
    private String meat;


    public CreateBurger(int baseCost, String bread, String meat) {
        this.cheddar = false;
        this.onion = false;
        this.dressing = false;
        this.lettuce = false;
        this.ketchup = false;
        this.cucumber = false;
        this.bread = bread;
        this.meat = meat;
        this.baseCost = baseCost;
        this.additionCost = 1.2;
        this.totalCost = this.baseCost;
        this.additions = 0;
        this.maximumAdditions = 4;
        this.isDeluxeBurger = false;
    }

    public void setDeluxeBurger(boolean deluxeBurger) {
        isDeluxeBurger = deluxeBurger;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setMaximumAdditions(int maximumAdditions) {
        this.maximumAdditions = maximumAdditions;
    }

    public void printTotal(){
        space();
        System.out.println("Billing: ");
        if(cheddar){
            System.out.println("Cheddar. Cost: " +additionCost);
        }
        if(onion){
            System.out.println("Onion. Cost: " +additionCost);
        }
        if(dressing){
            System.out.println("Dressing. Cost:" +additionCost);
        }
        if(lettuce){
            System.out.println("Lettuce. Cost: " +additionCost);
        }
        if(ketchup){
            System.out.println("Ketchup. Cost: " +additionCost);
        }
        if(cucumber){
            System.out.println("Cucumber. Cost: " +additionCost);
        }
        if(mustard){
            System.out.println("Mustard. Cost: " +additionCost);
        }
        if(pickles){
            System.out.println("Pickles. Cost: " +additionCost);
        }

        System.out.println("Total amount: " +this.baseCost +" + " +this.additionCost +" * " +this.additions +" = " +totalCost);
        space();
    }

    public void addAdditions(String typeOfAddition){
        if (additions >= maximumAdditions || isDeluxeBurger){
            System.out.println("No more additions for you!");
        } else {
            switch (typeOfAddition.toLowerCase()){
                case "pickles":
                    if(!this.pickles) {
                        System.out.println("Added pickles.");
                        this.additions++;
                        this.totalCost += this.additionCost;
                        this.pickles = true;
                    } else {
                        System.out.println("You already added pickles");
                    } break;
                case "mustard":
                    if(!this.mustard) {
                        System.out.println("Added mustard.");
                        this.additions++;
                        this.totalCost += this.additionCost;
                        this.mustard = true;
                    } else {
                        System.out.println("You already added mustard");
                    } break;
                case "cheddar":
                    if(!this.cheddar) {
                        System.out.println("Added cheddar.");
                        this.additions++;
                        this.totalCost += this.additionCost;
                        this.cheddar = true;
                    } else {
                        System.out.println("You already added cheddar");
                    } break;
                case "onion":
                    if(!this.onion) {
                        System.out.println("Added onion.");
                        this.additions++;
                        this.totalCost += this.additionCost;
                        this.onion = true;
                    } else {
                        System.out.println("You already added onion");
                    } break;
                case "dressing":
                    if(!this.dressing) {
                        System.out.println("Added dressing.");
                        this.additions++;
                        this.totalCost += this.additionCost;
                        this.onion = true;
                    } else {
                        System.out.println("You already added dressing");
                    } break;
                case "lettuce":
                    if(!this.lettuce) {
                        System.out.println("Added lettuce.");
                        this.additions++;
                        this.totalCost += this.additionCost;
                        this.lettuce = true;
                    } else {
                        System.out.println("You already added lettuce");
                    } break;
                case "ketchup":
                    if(!this.ketchup) {
                        System.out.println("Added ketchup.");
                        this.additions++;
                        this.totalCost += this.additionCost;
                        this.ketchup = true;
                    } else {
                        System.out.println("You already added ketchup");
                    } break;
                case "cucumber":
                    if(!this.cucumber) {
                        System.out.println("Added cucumber.");
                        this.additions++;
                        this.totalCost += this.additionCost;
                        this.cucumber = true;
                    } else {
                        System.out.println("You already added cucumber");
                    } break;
                default:
                    System.out.println("Not a valid choice of addition (" +typeOfAddition.toLowerCase() +")");
            }
        }
    }

    public void space(){
        System.out.println("*********************");
    }
}
