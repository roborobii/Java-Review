package com.robin;

public class Main {

    public static void main(String[] args) {
        // float is single precision and double is double precision
        int myInt = 5 / 3; // 4 bytes
        float myFloat = 5f / 3f; // 4 bytes
        double myDouble = 5d / 3d; // 8 bytes

        float myFloat1 = (float) 5.4;
        float myFloat2 = 5.4f;

        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);

        // lb to kg
        int lb = 500;
        double lb2kg = 0.45359237;
        System.out.println(lb*lb2kg);

//        double pi = 3.141_592_7d;

    }
}
