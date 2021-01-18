package com.bilgeadam.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("PHP");

        set2.add("Go");
        set2.add("CSS");
        set2.add("Java");

       /* Set<String> disparity =new HashSet<>(set2);
        System.out.println(disparity.removeAll(set1));

        System.out.println(disparity);*/
        Set<String> intersection = new HashSet<>(set2);
        System.out.println(intersection.retainAll(set1));
        System.out.println(intersection);



    }
}
