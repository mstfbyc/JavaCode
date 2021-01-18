package com.bilgeadam.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentQuestion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümleyi giriniz: ");
        String sentence = scanner.nextLine();
        Map<Character,Integer> frequency = new TreeMap<>();

        for (int i = 0; i <sentence.length(); i++) {
            char c = sentence.charAt(i);
            if(frequency.containsKey(c)){
                frequency.replace(c, frequency.get(c)+1);
            }else{
                frequency.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry: frequency.entrySet()){
            System.out.println("Karakter: "+ entry.getKey() + " " + entry.getValue()+" kadar geçiyor.Java");
        }
    }
}

