package com.robin;

public class Main {

    public static void main(String[] args) {

        // int has width of 32
	    int myMinInt = -2_147_483_648;
	    int myMaxInt = 2_147_483_647;

	    // byte has width of 8
	    byte myByte = -128; // -128 to 127, more efficient than int if needa save memory
        byte myNewByte = (byte) (myByte/2);

        // short has width of 16
        short myShort = 32; // -32768 to 32767

        // long has width of 64
        long myLong = -9_223_372_036_854_775_808L;

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = (50000L + 10L) * (b+s+i);
    }
}