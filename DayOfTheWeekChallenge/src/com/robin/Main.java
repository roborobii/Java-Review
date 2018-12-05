package com.robin;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(5);
        printNumberInWord(5);
        System.out.println(isLeapYear(36));
        System.out.println(isLeapYear(100));
        System.out.println(isLeapYear(400));
        System.out.println(isLeapYear(-1));
        System.out.println(isLeapYear(600));
    }
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        // a year is a leap year if it's divisible by 4 but not 100
        // a year is also a leap year if it is divisible by 400
        if (year < 1 || year > 9999) return false;
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        // jan 1, march 3, may 5, july 7, august 8, oct 10, december 12 have 31 days
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) return 29; // leapyear 29
                else return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
    }
}
