package com.bilgeadam.tutorials.arrays;

public class ArrayExamples {
    // Array examples
    // Definition
    static Character[] myCharacters;
    static Character oneChar = 'J';

    static byte[] myBytes;
    static Byte oneByte = 50;

    public static void main(String[] args) {
        // Initialization
        myCharacters = new Character[6];

        // Instantiation
        myCharacters[0] = oneChar;
        myCharacters[1] = 'A';
        myCharacters[2] = 'V';
        myCharacters[3] = 'A';
        myCharacters[4] = ' ';
        myCharacters[5] = '!';

        System.out.println("myCharacters = " + myCharacters[0] + myCharacters[1] + myCharacters[2] + myCharacters[3] + myCharacters[4] + myCharacters[5]);
        System.out.println("myCharacters length = " + myCharacters.length);

        // Initialization
        myBytes = new byte[10_000_000];
        System.out.println("myBytes length = " + myBytes.length);

        // Instantiation
        myBytes[0] = oneByte;
        System.out.println("myBytes[0] = " + myBytes[0]);
        myBytes[5000] = 123;
        System.out.println("myBytes[5000] = " + myBytes[5000]);

        System.out.println("myBytes[9999] = " + myBytes[9999]);
    }
}
