package com.bilgeadam.tutorials.variables;

public class Variables {

    // Primitive types examples
    static boolean myBoolean;   // Default is false.

    static char myChar;         // Default is empty.

    static byte myByte;         // Default is 0. [-128 .. 127]

    static short myShort;       // Default is 0. [-32768 .. 32767]

    static int myInt;           // Default is 0. 32 Bit.

    static long myLong;         // Default is 0. 64 bit. Ends with 'L'

    static float myFloat;       // Default is 0.0 32 Bit. Ends with 'F'

    static double myDouble;     // Default is 0.0 64 Bit. (Optional) ends with 'D'

    // Non-primitive Type (Default always is 'null')
    static Boolean myBooleanObj;

    static Character myCharObj;

    static Byte myByteObj;

    static Short myShortObj;

    static Integer myIntObj;

    static Long myLongObj;

    static Float myFloatObj;

    static Double myDoubleObj;

    public static void main(String[] args) {
        // Assign a value to my variable.
        System.out.println("Pre assignment myBoolean = " + myBoolean);
        myBoolean = Boolean.TRUE; // ... = true
        System.out.println("After assignment myBoolean = " + myBoolean);

        System.out.println("Pre assignment myBooleanObj = " + myBooleanObj);
        myBooleanObj = true;
        System.out.println("After assignment myBooleanObj = " + myBooleanObj);

        System.out.println("Pre assignment myChar = " + myChar);
        myChar = '5';
        System.out.println("After assignment myChar = " + myChar);
        myChar = 'A';
        System.out.println("After assignment myChar = " + myChar);

        System.out.println("Pre assignment myCharObj = " + myCharObj);
        myCharObj = 'Z';
        System.out.println("After assignment myCharObj = " + myCharObj);

        System.out.println("Pre assignment myByte = " + myByte);
        myByte = -120;
        System.out.println("After assignment myByte = " + myByte);
        myByte = Byte.MAX_VALUE;
        System.out.println("After assignment myByte = " + myByte);
        myByte = Byte.MIN_VALUE;
        System.out.println("After assignment myByte = " + myByte);

        System.out.println("Pre assignment myByteObj = " + myByteObj);
        myByteObj = 120;
        System.out.println("After assignment myByteObj = " + myByteObj);

        System.out.println("Pre assignment myShort = " + myShort);
        myShort = -120;
        System.out.println("After assignment myShort = " + myShort);
        myShort = Short.MAX_VALUE;
        System.out.println("After assignment myShort = " + myShort);
        myShort = Short.MIN_VALUE;
        System.out.println("After assignment myShort = " + myShort);

        System.out.println("Pre assignment myShortObj = " + myShortObj);
        myShortObj = 32_756;
        System.out.println("After assignment myShortObj = " + myShortObj);

        System.out.println("Pre assignment myInt = " + myInt);
        myInt = 10_000_000; // Same as 10000000
        System.out.println("After assignment myInt = " + myInt);
        myInt = Integer.MAX_VALUE;
        System.out.println("After assignment myInt = " + myInt);
        myInt = Integer.MIN_VALUE;
        System.out.println("After assignment myInt = " + myInt);

        System.out.println("Pre assignment myIntObj = " + myIntObj);
        myIntObj = 126_345_908;
        System.out.println("After assignment myIntObj = " + myIntObj);

        System.out.println("Pre assignment myLong = " + myLong);
        myLong = -100_000_000_000_000_000L;
        System.out.println("After assignment myLong = " + myLong);
        myLong = Long.MAX_VALUE;
        System.out.println("After assignment myLong = " + myLong);
        myLong = Long.MIN_VALUE;
        System.out.println("After assignment myLong = " + myLong);

        System.out.println("Pre assignment myLongObj = " + myLongObj);
        myLongObj = Long.MAX_VALUE;
        System.out.println("After assignment myLongObj = " + myLongObj);

        System.out.println("Pre assignment myFloat = " + myFloat);
        myFloat = -12345.456345F;
        System.out.println("After assignment myFloat = " + myFloat);
        myFloat = Float.MIN_NORMAL;
        System.out.println("After assignment myFloat = " + myFloat);
        myFloat = Float.MIN_EXPONENT;
        System.out.println("After assignment myFloat = " + myFloat);

        System.out.println("Pre assignment myFloatObj = " + myFloatObj);
        myFloatObj = Float.NEGATIVE_INFINITY;
        System.out.println("After assignment myFloatObj = " + myFloatObj);

        System.out.println("Pre assignment myDouble = " + myDouble);
        myDouble = -34_321_245.23400D;
        System.out.println("After assignment myDouble = " + myDouble);
        myDouble = Double.MIN_NORMAL;
        System.out.println("After assignment myDouble = " + myDouble);
        myDouble = Double.MIN_EXPONENT;
        System.out.println("After assignment myDouble = " + myDouble);

        System.out.println("Pre assignment myDoubleObj = " + myDoubleObj);
        myDoubleObj = Double.NaN;
        System.out.println("After assignment myDoubleObj = " + myDoubleObj);
    }
}
