package com.bilgeadam.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        calculateTime("ArrayList",arrayList);
        calculateTime("LinkedList",linkedList);

    }

    public static void calculateTime(String type, List<Integer> list){
        long startTime;
        Long finishTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(0,i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println( type + " ekleme süresi: " +(finishTime-startTime)+ "ms");
    }
}

