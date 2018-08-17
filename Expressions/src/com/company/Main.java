package com.company;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("SeNDeR",1500);
        displayHighScorePosition("n00b1", 900);
        displayHighScorePosition("n00b2", 400);
        displayHighScorePosition("n00b3", 50);
        displayHighScorePosition("test1000",1000);
        displayHighScorePosition("test500",500);
        displayHighScorePosition("test100",100);

    }

    public static void displayHighScorePosition(String playerName, int score){

        System.out.println(playerName +" scored " +score +" and placed: " +calculateHighScorePosition(score) +" in the highscore ladder");

    }

    public static int calculateHighScorePosition(int score){

        int position = 4;
        if(score >=1000) {
            position = 1;
        }
        else if(score >=500){
            position = 2;
        }
        else if(score >=100){
            position = 3;
        }
        return position;

    }

}
