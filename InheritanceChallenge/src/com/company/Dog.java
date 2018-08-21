package com.company;

public class Dog {

    private String race;
    private String gender;
    private boolean isFluffy;

    public Dog(String race, String gender, boolean isFluffy) {
        this.race = race;
        this.gender = gender;
        this.isFluffy = isFluffy;
    }

    public void eating(){
        System.out.println("Nom Nom Nom!!!");
    }

    public void bark(){
        System.out.println("Woof!");
    }

    public void move(){
        System.out.println("Moved 2 cm (Amazing!)");
    }

}
