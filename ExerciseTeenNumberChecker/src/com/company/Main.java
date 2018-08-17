package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

    }

    public static boolean hasTeen(int age1,int age2,int age3){

        if(age1>12 && age1<20){
            return true;
        }
        else if(age2>12 && age2<20){
            return true;
        }
        else if(age3>12 && age3<20){
            return true;
        }
        else{
            return false;
        }

    }

}
