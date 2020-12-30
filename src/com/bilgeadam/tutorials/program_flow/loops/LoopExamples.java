package com.bilgeadam.tutorials.program_flow.loops;

public class LoopExamples {
    private static Integer[] myIntegers;

    private static void fillMyArray(){
        myIntegers = new Integer[5];

        myIntegers[0] = 3;
        myIntegers[1] = 5;
        myIntegers[2] = 8;
        myIntegers[3] = 10;
        myIntegers[4] = -2;
    }

    private static void printViaForLoop(){
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("My index i is " + i + " my array's related element is " + myIntegers[i]);
        }
    }

    private static void printViaWhileLoop(){
        int i = 0;

        while (i < myIntegers.length){
            System.out.println("My index i is " + i + " my array's related element is " + myIntegers[i]);
            i++;
        }
    }

    private static void printViaDoWhileLoop(){
        int i = 0;

        do {
            System.out.println("My index i is " + i + " my array's related element is " + myIntegers[i]);
            i++;
        } while (i < myIntegers.length);
    }

    private static void printViaForEachLoop(){
        /*
        Integer test = 0;
        for (int i = 0; i < myIntegers.length; i++) {
            //System.out.println("My index i is " + i + " my array's related element is " + myIntegers[i]);
            test = myIntegers[i];
            System.out.println("i is " + i + " and test = " + test);
        }
        */
        for (Integer test : myIntegers) {
            System.out.println("test = " + test);
        }
    }
    public static void main(String[] args) {
        fillMyArray();

        //printViaForLoop();
        //printViaWhileLoop();
        //printViaDoWhileLoop();
        printViaForEachLoop();
    }
}
