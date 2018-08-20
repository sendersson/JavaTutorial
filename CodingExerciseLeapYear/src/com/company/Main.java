package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(1800));

        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));

    }

    public static boolean isLeapYear(int year){

        if(year <1 || year > 9999 ){
            return false;
        }
        else if( (year % 4 == 0) && (year % 100 != 0) ||(year % 400 == 0) ){
            return true;
            }
        else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year){

        if((month <= 0) || (month > 12) || (year <=0) || (year >9999)){
            return -1;
        }
        if(month == 1){
            return 31;
        }
        if((month == 2) && isLeapYear(year) ){
            return 29;
        }
        if(month == 2){
            return 28;
        }
        if(month == 3){
            return 31;
        }
        if(month == 4){
            return 30;
        }
        if(month == 5){
            return 31;
        }
        if(month == 6){
            return 30;
        }
        if(month == 7){
            return 31;
        }
        if(month == 8){
            return 31;
        }
        if(month == 9){
            return 30;
        }
        if(month == 10){
            return 31;
        }
        if(month == 11){
            return 30;
        }
        return 31;

    }

}
