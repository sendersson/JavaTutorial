package com.company;

public class Outlander extends Car{

    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate; // rate can be both negative and positive

        if(newVelocity == 0){
            stop();
            setCurrentGear(1);
        } else if((newVelocity > 0) && (newVelocity <=10)){
            setCurrentGear(1);
        } else if((newVelocity > 10) && (newVelocity <=20)){
            setCurrentGear(2);
        } else if((newVelocity > 20) && (newVelocity <=30)){
            setCurrentGear(3);
        } else if((newVelocity > 30) && (newVelocity <=40)){
            setCurrentGear(4);
        } else if((newVelocity > 40) && (newVelocity <=50)){
            setCurrentGear(5);
        } else {
            setCurrentGear(6);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }

}
