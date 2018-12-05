package com.robin;

public class Main {

    public static void main(String[] args) {
        int result = 1; // assign
        result = 1 + 2; // assign and addition
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);
        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        result++;
        result--;
        result+=2;
        result*=10;
        result-=10;
        result/=10;
        System.out.println(result);

        boolean isAlien = false; // assignment operator = (or += -= /= *=)
        if (isAlien == false) // comparison operator == != < > <= >=
            System.out.println("It's not an alien");

        int topScore = 100;
        if (topScore >= 100)
            System.out.println("Ya got the high score fam");

        // and/or/not (logical) operators
        if (topScore < 90 || topScore == 100)
            System.out.println("One of the tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar = true) // happens because isCar is set to true and it returns true
            System.out.println("This isn't supposed to happen");

        // ternary operator
        boolean wasCar = isCar ? true: false;
        if (isCar == true)
            wasCar = true;
        else
            wasCar = false;
        System.out.println("wasCar is " + wasCar);

        double val4 = ((20 + 80) * 25) % 40;
        if (val4 <= 20)
            System.out.println("Total was over the limit: " + val4);

        // operators: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        // precedence: http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
    }
}
