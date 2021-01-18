package com.bilgeadam.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestCharacterCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Cümlenizi Giriniz: ");
        String sentence = input.nextLine();
        //Harf Key oldu Value sayısı
        Map<Character,Integer> frequency = new TreeMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if(frequency.containsKey(c)){
                frequency.replace(c, frequency.get(c)+1);
            }else{
                frequency.put(c,1);
            }

        }
        for (Map.Entry<Character,Integer> entry:frequency.entrySet()) {
            System.out.println("Karakter: "+ entry.getKey()+ "\t" + entry.getValue() + " kadar geçiyor... ");

        }
    }
}
