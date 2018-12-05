package com.robin;

public class Main {

    public static void main(String[] args) {
        int myVar = 50; // whole thing is a statement, [myVar = 50] is the expression
        myVar++;
        myVar--;
        System.out.println("this whole line (method call Sysout and expression string) is a statement");

        System.out.println("this is" +
                " another " +
                " still more ... "); // doesnt have to be one line to be a statement

        int anotherVar = 10;
        myVar--;
        anotherVar++;
        System.out.println(myVar + anotherVar); // multiple statements in one line
        // whitespaces dont matter
        // indentation for readability -> intellij -> refactor, reformat code

    }
}
