package com.robin;

public class Main {

    public static void main(String[] args) {
        // keywords: int, true, false, null ...
        // expressions: variables, values, and operators; not keyword
        //  [oneMileTokm = 1 * 1.609344]
        double oneMileTokm = 1 * 1.609344; // combination of data type and expression here is a valid java statement
        int highScore = 50;
        // this is a statement
        if (highScore == 50) {
            System.out.println("This is an expression");
            // highScore == 50 is an expression and also highScore = 50
            // this statement inside the bracket is an expression; this is actually calling a method
        }
        /*
        score=100
        score>99
        "You got the high score!"
        score=0
         */
    }
}
