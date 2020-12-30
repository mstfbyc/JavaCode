package com.bilgeadam.tutorials.program_flow.operators;

public class ArithmeticOperators {

    private static void addition(float x, float y){
        System.out.println("ArithmeticOperators.addition");
        System.out.println(x + " + " + y + " = " + (x + y));
        //System.out.println(x + " + " + y + " = " + x + y);
    }

    private static void subtraction(float x, float y){
        System.out.println("ArithmeticOperators.subtraction");
        System.out.println(x+ " - " + y + " = " + (x - y));
    }

    private static void multiplication(float x, float y){
        System.out.println("ArithmeticOperators.multiplication");
        System.out.println(x + " * " + y + " = " + (x * y));
    }

    private static void division(float x, float y){
        System.out.println("ArithmeticOperators.division");
        System.out.println(x + " / " + y + " = " + (x / y));
    }

    private static void modulus(float x, float y){
        System.out.println("ArithmeticOperators.modulus");
        System.out.println(x + " mod " + y + " = " + (x % y));
    }

    private static void increment(float x){
        System.out.println("ArithmeticOperators.increment");
        System.out.println("Increment " + x + " by 1 is " + (x++));
        System.out.println("x = " + x);
        // System.out.println("Increment " + x + " by 1 is " + (++x));
        // x = x + 1; // ++x || x++
    }

    private static void decrement(float x){
        System.out.println("ArithmeticOperators.decrement");
        System.out.println("Decrement " + x + " by 1 is " + (--x));
    }

    public static void main(String[] args) {
        addition(3.134F, 5.4000001F);
        subtraction(123.67F, -50.4F);
        multiplication(-76.156F, -1589.01F);
        division(-54.987F, 0.000054F);
        modulus(10.34F, 3.0001F);
        increment(14.03F);
        decrement(-150F);
    }
}
