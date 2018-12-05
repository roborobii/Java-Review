package com.robin;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 2;
        int bonus = 7900;
        int finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Calculated score is: " + finalScore);

        score = 1023;
        levelCompleted = 312;
        bonus = 3123;
        finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Calculated score is: " + finalScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Robin", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Robin", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Robin", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Robin", highScorePosition);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 4000;
            return finalScore;
        }
        return -1; // indicate error (value not found in search algorithms)
    }
}
