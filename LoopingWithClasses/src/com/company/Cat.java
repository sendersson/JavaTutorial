package com.company;

class Cat {

    private boolean summer;
    private int temperature;

    boolean isSummer() {
        return summer;
    }

    void setSummer(boolean summer) {
        this.summer = summer;
    }

    int getTemperature() {
        return temperature;
    }

    void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    boolean isCatPlaying(boolean summer, int temperature){

        // playTime = 25-35, Summer = 25-45
        if((summer && (temperature >= 25) && (temperature <=45))){
            return true;
        }

        return (!summer && (temperature >= 25) && (temperature <= 35));

    }
    boolean isCatPlaying(){

        // playTime = 25-35, Summer = 25-45
        if(summer && (temperature >= 25) && (temperature <=45)){
            return true;
        }

        return (!summer && (temperature >= 25) && (temperature <= 35));

    }

}
