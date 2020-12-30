package com.bilgeadam.examplesobjectreferans;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("https://www.bilgeadam.com.tr");
        String s2 = new String("https://www.oracle.com");

        System.out.println("s1:"+s1+"\t"+"s2:"+s2);
        String tmp =s1;
        s1 = s2;
        s2 = tmp;
        System.out.println("s1:"+s1+"\t"+"s2:"+s2);

        String s3 = s2.concat("XYZ");
    }
}
