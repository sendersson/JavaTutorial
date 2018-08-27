package com.company;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;


    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dail(int phoneNumber) {
        if (isOn) {
            System.out.println("Ringer: " + phoneNumber +" on mobile phone");
        } else {
            System.out.println("Phone is switched off.");
        }
    }

    @Override
    public void answer() {
        System.out.println("Answering on mobile phone");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Polyphonic signal playing");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }

}
