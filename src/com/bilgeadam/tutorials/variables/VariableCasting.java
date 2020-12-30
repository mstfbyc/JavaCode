package com.bilgeadam.tutorials.variables;

public class VariableCasting {
    static byte myByte = 100;
    static short myShort;
    static int myInt;
    static long myLong = 100_000_000_000_000L;

    public static void main(String[] args) {
        // Widening
        System.out.println("Widening examples");
        System.out.println("myByte = " + myByte);

        myShort = myByte;
        System.out.println("myShort = " + myShort);

        myInt = myShort;
        System.out.println("myInt = " + myInt);

        myLong = myInt;
        System.out.println("myLong = " + myLong);

        // Narrowing
        System.out.println("Narrowing examples");
        myLong = 100_000_000_000_000L;
        System.out.println("myLong = " + myLong);

        myInt = (int) myLong;
        System.out.println("myInt = " + myInt);

        myShort = (short) myInt;
        System.out.println("myShort = " + myShort);

        myByte = (byte) myShort;
        System.out.println("myByte = " + myByte);
    }
}
