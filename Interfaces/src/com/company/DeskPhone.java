package com.company;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("Ringer: " +phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Svarar");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}

