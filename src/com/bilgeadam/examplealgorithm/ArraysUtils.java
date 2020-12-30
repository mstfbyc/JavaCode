package com.bilgeadam.examplealgorithm;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtils {

    public static int[] randomArray(int length){
        int[] intArray = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int randomInt = r.nextInt();
            int sayi = randomInt % 100;
            intArray[i] = sayi;
        }
        return intArray;
    }
    public static int[] arrayCopy(int[] intArray){
        int[] newIntegerArray = Arrays.copyOf(intArray,5);
        return newIntegerArray;
    }

    public static void fillArray(int[] intArrar , int fillValue){
         Arrays.fill(intArrar,fillValue);
    }
    public static int[] arrayCopyOfRange(int[] intArray,int startIndex, int endIndex){
        int[] resultArray = Arrays.copyOfRange(intArray,startIndex,endIndex);
        return resultArray;
    }

    public static int arraySearch(int[] intArray, int searchValue){
        return Arrays.binarySearch(intArray,searchValue);
    }
    public static boolean isArraysEquels(int[] arrayFirst, int[] arraySecond){
        return Arrays.equals(arrayFirst,arraySecond);
    }
}
