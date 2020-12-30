package com.bilgeadam.examplealgorithm;

public class Test {
    String selamInArabic = "\u0633\u0644\u0627\u0645";
    String selamInJapanese = "\u4eca\u65e5\u306f\u4e16\u754c";
    public static void main(String[] args) {
        byte b = 126;
        short s = 1000;
        char c = 65;
        int i = 2_147_483_647;
        long l;
        float f = 3.14f;
        double d;
        /*
         * c = b; // compile error: possible loss of precision c = s; // compile
         * error: possible loss of precision i = d; // compile error: possible
         * loss of precision
         */
        s = b;
        l = i;
        // Loss of precision
        f = i;
        System.out.println("i: " + i + " f: " + f);

        l = (long)i + 1;
        System.out.println("i: " + i + " l: " + l);
        System.out.println();
        // Loss of precision
        l = 987_654_321_123_456_789L;
        f = l;
        System.out.println("l: " + l + " f: " + f);

        d = l;
        System.out.println("l: " + l + " d: " + d);

        d = f;
        i = c;
        d = i;

    }
}
