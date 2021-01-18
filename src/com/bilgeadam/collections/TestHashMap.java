package com.bilgeadam.collections;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"Java");
        hashMap.put(30,"Python");
        hashMap.put(20,"PHP");
        hashMap.put(20,"PHP");
        hashMap.put(50,"PHP");
        hashMap.put(50,"JavaScript");
        System.out.println(hashMap.get(50));
        System.out.println(hashMap);
        for (Map.Entry<Integer,String> entry:hashMap.entrySet()
        ) {
            System.out.println("Anahtar: "+entry.getKey() + " ------> Değer: "+ entry.getValue());

        }
    }

}

