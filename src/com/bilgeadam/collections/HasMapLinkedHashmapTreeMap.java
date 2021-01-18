package com.bilgeadam.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HasMapLinkedHashmapTreeMap {

    public static void printMap(Map<Integer,String> map){
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");
        for (Map.Entry<Integer,String> entry: map.entrySet() ) {
            System.out.println("Key: " + entry.getKey() +" Value: "+entry.getValue());
        }

    }

    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<>();
        Map<Integer,String> linkedHashmap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        System.out.println("***************************************");
        printMap(hashmap);
        System.out.println("***************************************");
        printMap(linkedHashmap);
        System.out.println("***************************************");
        printMap(treeMap);
    }
}
