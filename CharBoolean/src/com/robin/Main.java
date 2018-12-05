package com.robin;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '2';
        char unicode = '\u0460'; // https://unicode-table.com/en/
        System.out.println(unicode);

        boolean myBoolean = false; // true
        boolean isMale = true;

        char unicode2 = '\u00AE'; // registered symbol
        System.out.println(unicode2);
    }
}
