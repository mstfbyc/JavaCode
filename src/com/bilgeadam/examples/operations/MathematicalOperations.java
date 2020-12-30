package com.bilgeadam.examples.operations;

public class MathematicalOperations {

    public static long addition(int leftOperand, int rightOperand){
        long sum;
        sum = (long) leftOperand + rightOperand;
        return sum;
    }

    public static long subtraction(int leftOperand, int rightOperand){
        long sum;
        sum = (long) leftOperand - rightOperand;
        return sum;
    }

    public static long multiplication(int leftOperand, int rightOperand){
        long sum;
        sum = (long) leftOperand * rightOperand;
        return sum;
    }

    public static float division(int leftOperand, int rightOperand){
        float sum;
        sum = (float) leftOperand /  rightOperand;
        return sum;
    }
}
