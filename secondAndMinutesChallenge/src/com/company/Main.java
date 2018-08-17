package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(0,1));
        System.out.println(getDurationString(70000));

    }

    public static String getDurationString(int minutes,int seconds){

        if(minutes < 0 || seconds >=60 || seconds <0){return "Invalid value";}

        int hours = minutes/60;
        int remainingMinutes = minutes % 60;

        if(hours < 10 && remainingMinutes < 10){
            return ("0"+hours +"h 0" +remainingMinutes +"m " +seconds +"s");
        }
        else if(hours < 10){
            return ("0"+hours +"h " +remainingMinutes +"m " +seconds +"s");
        }
        else if(remainingMinutes < 10){
            return (hours +"h 0" +remainingMinutes +"m " +seconds +"s");
        }

        return (+hours +"h " +remainingMinutes +"m " +seconds +"s");

    }

    public static String getDurationString(int seconds){

        if(seconds <0){
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return (hours +"h " +remainingMinutes +"m " +remainingSeconds +"s");

    }
}
