package com.bilgeadam.tutorials.program_flow.decision_making;

public class IfDecisions {

    private static void isBiggerThan100(int x) {
        System.out.println("Input is " + x);
        if (x > 100) 
            System.out.println(x + " is bigger than 100");
    }

    private static void findDegreeOf10(short x){
        System.out.println("Input is " + x);

        if (x < 10){
            System.out.println(x + " is less than 10");
        } else if (x < 100) {
            System.out.println(x + " is less than 100");
        } else if (x < 1000){
            System.out.println(x + " is less than 1000");
        } else
            System.out.println("x = " + x);

        if (x > 0)
            System.out.println(x + " is positive");
    }

    private static void isLetterValid(Character c){
        System.out.println("Input is " + c);

        if (c != null) {
            System.out.println(c + " is not null");

            if (c >= 'a' && c <= 'z')
                System.out.println(c + " is in small letters.");
            else if (c >= 'A' && c <= 'Z')
                System.out.println(c + " is in capital letters.");
            else
                System.out.println(c + " in not a letter.");
        } else
            System.out.println("Improper input");
    }

    private static void printSpecificLetter(char c){
        switch (c){
            case 'a':
                System.out.println("c1 = " + c);
                //break;
            case 'b':
                System.out.println("c2 = " + c);
                break;
            case 'c':
                System.out.println("c3 = " + c);
                break;
            case 'd':
            case 'e':
            case 'f':
            case 'g':
                System.out.println("This is common work");
                break;
            default:
                System.out.println("Unexpected input");
                break;
        }
        /*
        if (c == 'a') {
            System.out.println("c1 = " + c);
            System.out.println("c2 = " + c);
        } else if (c == 'b')
            System.out.println("c2 = " + c);
        else if (c == 'c')
            System.out.println("c3 = " + c);
        else
            System.out.println("Unexpected input");
         */
    }

    private static void isNumberNegative(int x){
        // First solution
        /*
        if (x < 0)
            System.out.println("Number: " + x + " is negative");
        else
            System.out.println("Number: " + x + " is positive");
        */

        // Second solution
        /*
        String output;
        if (x < 0)
            output = "Negative";
        else
            output = "Positive";
        System.out.println("Number: " + x + " is " + output);
        */

        // Third solution
        System.out.println("Number: " + x + " is " + ((x < 0) ? "Negative" : "Positive"));
    }

    public static void main(String[] args) {
        isBiggerThan100(50);
        isBiggerThan100(150);

        findDegreeOf10((short)-45);
        findDegreeOf10((short)45);
        findDegreeOf10((short)450);
        findDegreeOf10((short)4500);

        isLetterValid(null);
        isLetterValid(' ');
        isLetterValid('+');
        isLetterValid('g');
        isLetterValid('K');

        printSpecificLetter('-');
        printSpecificLetter('h');
        printSpecificLetter('b');
        printSpecificLetter('a');
        printSpecificLetter('d');
        printSpecificLetter('f');

        isNumberNegative(-5);
        isNumberNegative(0);
        isNumberNegative(5);
    }
}
