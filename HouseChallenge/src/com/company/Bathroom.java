package com.company;

public class Bathroom {

    private int bathtub;
    private int soapBars;
    private int toilets;

    public Bathroom(int bathtub, int soapBars, int toilets) {
        this.bathtub = bathtub;
        this.soapBars = soapBars;
        this.toilets = toilets;
    }

    public int getBathtub() {
        return bathtub;
    }

    public int getSoapBars() {
        return soapBars;
    }

    public int getToilets() {
        return toilets;
    }

    void takeAShit(){
        System.out.println("Ohh the horror!");
    }
}
