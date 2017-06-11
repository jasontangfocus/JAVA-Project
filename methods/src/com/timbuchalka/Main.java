package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        int finalScore;
        finalScore = calculateScore(false, 1000, 5, 19);
        System.out.println(finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = 2000;
        if (gameOver) {
            finalScore += (score + levelCompleted * bonus);
        } else {
            finalScore = -1;
        }
        return finalScore;
    }

}
