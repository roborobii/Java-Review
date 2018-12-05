package com.robin;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 1; // good for testing the same value, but if diff values then use if/else statements
        // switch statement is good for testing the same variable
	    switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;  // break is used to close off the case statement, if not it will continue to other cases
                        // or will continue until it breaks off the switch statement
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5");
                break;
            default:
                System.out.println("Value is not 1 - 5");
                break; // doesn't need this here but add it anyway
        }

        // switch statement can be used with 4 primitive types: byte short char int

        char switchChar = 'A';
	    switch (switchChar) {
            case 'A':
                System.out.println("value is A");
                break;
            case 'B':
                System.out.println("value is B");
                break;
            case 'C':
                System.out.println("value is C");
                break;
            case 'D':
                System.out.println("value is D");
                break;
            case 'E':
                System.out.println("value is E");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
