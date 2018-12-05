package com.robin;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        // string // not really a primitive data type but so commonly used that it is the 9th data type
        /// strings are sequences of chars
        String myString = "This is a string"; // double quote for string, single for char
        myString = myString + ", and this is more...";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numString = "250.55";
        numString = numString + "49.99";
        System.out.println(numString);

        String lastString = "";
        int myInt = 50;
        lastString = lastString + myInt; // added the int to String
        // because we're using a String on the left hand side and there's an int on the right hand side,
        // allowed syntax because java looks at contents of int and turns it into String implicitly
        boolean b = true;
        System.out.println(lastString + b);
        // String is not a primitive data type
    }
}
