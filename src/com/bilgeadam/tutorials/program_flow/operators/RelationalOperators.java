package com.bilgeadam.tutorials.program_flow.operators;

public class RelationalOperators {

    private static void isEqual(int x, int y){
        System.out.println("RelationalOperators.isEqual");
        System.out.println(x + " == " + y + " is " + (x == y));
    }

    private static void isNotEqual(char x, char y){
        System.out.println("RelationalOperators.isNotEqual");
        System.out.println(x + " != " + y + " is " + (x != y));
    }

    private static void isGreaterThan(char x, char y){
        System.out.println("RelationalOperators.isGreaterThan");
        System.out.println((int) x + " > " + (int) y + " is " + (x > y));
    }

    private static void isGreaterOrEqual(int x, int y){
        System.out.println("RelationalOperators.isGreaterOrEqual");
        System.out.println(x + " >= " + y + " is " + (x >= y));
    }

    private static void isLessThan(char x, char y){
        System.out.println("RelationalOperators.isLessThan");
        System.out.println((int) x + " < " + (int) y + " is " + (x < y));
    }

    private static void isLessOrEqual(Double x, Double y){
        System.out.println("RelationalOperators.isLessOrEqual");
        System.out.println(x + " <= " + y + " is " + (x <= y));
    }

    public static void main(String[] args) {
        isEqual(3, 3);
        isNotEqual('a', 'b');
        isGreaterThan('A', 'a'); // Compares according to ASCII code
        isGreaterOrEqual(2 , 2);
        isLessThan(' ', '*');
        isLessOrEqual(45D, 34D);
        isLessOrEqual(Double.NaN, 34D);
        isLessOrEqual(Double.POSITIVE_INFINITY, 34D);
        // isLessOrEqual(null, 34D); // This causes null pointer exception
    }
}
