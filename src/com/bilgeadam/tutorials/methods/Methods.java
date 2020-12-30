package com.bilgeadam.tutorials.methods;

public class Methods {

    static Short diff, sum;

    public static void myVoidMethod(){
        System.out.println("com.bilgeadam.tutorials.methods.Methods.myVoidMethod");
    }

    public static void myMethodWithParameters(Character firstLetter, int counter){
        System.out.println("Parameter firstLetter = " + firstLetter);
        System.out.println("Parameter counter = " + counter);
    }

    public static void addTwoParameters(int first, int second){
        System.out.println("com.bilgeadam.tutorials.methods.Methods.addTwoParameters");
        // Local variable
        int z;
        z = first + second;
        System.out.println("z = " + z);
    }

    public static int subtractTwoParameters(int x, int y){
        // Local variable
        int result;
        result = x - y;
        System.out.println("com.bilgeadam.tutorials.methods.Methods.subtractTwoParameters");
        System.out.println("result = " + result);
        return result;
    }

    public static void calculateSumAndDiffOfTwoParameters(short first, short second){
        sum = (short) (first + second);
        diff = (short) (first - second);
    }

    public static void main(String[] args) {
        myVoidMethod();

        Character myChar = 'A';
        int myCounter = 5;

        myMethodWithParameters(myChar, myCounter);

        addTwoParameters(2, 3);

        int subtractResult;
        subtractResult = subtractTwoParameters(10000, 4500); // subtractResult = 5500;
        System.out.println("subtractResult = " + subtractResult);

        System.out.println("Before calculation sum = " + sum + " diff = " + diff);
        calculateSumAndDiffOfTwoParameters((short) 10_000, (short) 345);
        System.out.println("After calculation sum = " + sum + " diff = " + diff);
    }
}
