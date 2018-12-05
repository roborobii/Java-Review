package com.robin;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        } else if (score < 5000) {
            System.out.println("Your score less than 5000");
        } else {
            System.out.println("Your score greater than 5000");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score was " + finalScore);
        } // can't access finalScore (variable created inside the codeblock) outside this if statement

        int secondScore = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (secondScore == 10_000) {
            System.out.println("Your score was 10,000");
        } else if (secondScore < 10_000) {
            System.out.println("Your score less than 10,000");
        } else {
            System.out.println("Your score greater than 10,000");
        }
        if (gameOver) {
            int finalScore = secondScore + (levelCompleted * bonus);
            System.out.println("final score was " + finalScore);
        } // can't access finalScore (variable created inside the codeblock) outside this if statement

    }
}
