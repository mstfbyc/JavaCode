package com.bilgeadam.examplealgorithm;

public class SelectionSort {

    public static int[] sortBySelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static void main(String args[]){

        int[] unorderedList = {12, 40, 8, 33, 52, 3, 10, 83};
        int[] orderedList = sortBySelectionSort(unorderedList);

        for(int i : orderedList) {
            System.out.println(i);
        }
    }
}
