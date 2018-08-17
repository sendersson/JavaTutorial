package com.company;

public class Gooddog {

    private int size;
    private boolean petable;

    boolean getPetable(){return petable;}
    void setPetable(boolean b) {petable = b;}

    int getSize() {return size;}
    void setSize(int s) {size = s;}

    void pet() {

        if(petable){
            System.out.println("Jäääääj! Mys!");
        }
        else {
            System.out.println("Inte idag!");
        }

    }

    void bark() {

        if (size > 60) {
            System.out.println("Woof Woof!");
        }
        else if (size >30){
            System.out.println("Ruff Ruff!");
        }
        else {
            System.out.println("Yip Yip!");
        }
    }
}
