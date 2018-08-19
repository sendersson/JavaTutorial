package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        // playTime = 25-35, Summer = 25-45
        if(summer && (temperature >= 25) && (temperature <=45)){
            return true;
        }

        if(!summer && (temperature >= 25) && (temperature <= 35)){
            return true;
        }

        return false;
    }

}
