package com.company;

public class Dog {

    private int size;
    private boolean isGoodBoy;
    private String bread;

    Dog(int size, boolean isGoodBoy, String bread) {
        this.size = size;
        this.isGoodBoy = isGoodBoy;
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isGoodBoy() {
        return isGoodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        isGoodBoy = goodBoy;
    }

    void bark(){
        System.out.println("Barkobark!");
    }

    void prutt(){
        System.out.println("Fiiiis");

    }

}
