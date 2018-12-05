package com.robin;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; // constant (variable that cannot change the value of once assigned)
    // keyword final makes it constant, convention is uppercase

    public static void main(String[] args) {
        // method overloading is feature that allows us to have more
        // than one method with the same name, as long as diff parameters

        // ability to create mult. methods of the same name with diff implementations

        // calls to an overloaded method will run a specific implementation of that method
        // overloaded methods give programmers the flexibility to call similar methods with diff types of data
        int newScore = calculateScore("Robin", 100);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(12));
        System.out.println(calcFeetAndInchesToCentimeters(6,0));

        System.out.println(getDurationString(300,50));
        System.out.println(getDurationString(300));

        System.out.println(area(5.0));
        System.out.println(area(5.0,5.0));

        printYearsAndDays(525600);

        printEqual(-1,1,0);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player nor score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) return -1;
        double feet2cm = 30.48;
        double inches2cm = 2.54;
        return (feet * feet2cm + inches * inches2cm);
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0 || inches > 12) return -1;
        double inches2cm = 2.54;
        return (inches * inches2cm);
    }

//    public static String getDurationString(int minutes, int seconds) {
//        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";
//        int hours = 0;
//        while (minutes > 59) {
//            hours++;
//            minutes-=60;
//        }
//        return hours + "h " + minutes + "m " + seconds + "s";
//    }

//    public static String getDurationString(int seconds) {
//        if (seconds < 0) return "Invalid value";
//        int hours = 0;
//        int minutes = 0;
//        while (seconds > 59) {
//            minutes++;
//            seconds-=60;
//        }
//        while (minutes > 59) {
//            hours++;
//            minutes-=60;
//        }
//        return hours + "h " + minutes + "m " + seconds + "s";
//    }
    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return INVALID_VALUE_MESSAGE;

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
    public static String getDurationString(long seconds) {
        if (seconds < 0) return INVALID_VALUE_MESSAGE;

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static double area(double radius) {
        if (radius < 0) return -1.0;
        else return (3.14159 * radius * radius);
    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x*y;
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            long days = minutes / 1440; // 1 day = 1 minute * 60 * 24
            long years = days / 365; // 1 year = 1 minute * 60 * 24 * 365
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) System.out.println("Invalid Value");
        else if (a == b && b == c) System.out.println("All numbers are equal");
        else if (a != b && b != c && c != a) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }
}
