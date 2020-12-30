package com.bilgeadam.examplealgorithm;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
        int[] sameArray = {1,2,3,4,5,6,7,8,9,10};
        int[] secondArray = ArraysUtils.randomArray(10);
/*        Arrays.stream(secondArray).forEach(System.out::println);
        Arrays.stream(firstArray).forEach(System.out::println);*/
        System.out.println(ArraysUtils.isArraysEquels(firstArray,secondArray));
        System.out.println(firstArray == sameArray);
        System.out.println(firstArray);
        System.out.println(sameArray);
        System.out.println(ArraysUtils.isArraysEquels(firstArray,sameArray));
        System.out.println(ArraysUtils.arraySearch(firstArray,10));
        byte b1 = 2;
        byte b2 = 3;
        byte b3 = (byte) (b1 + b2);
    }
}
