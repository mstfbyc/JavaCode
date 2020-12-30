package com.bilgeadam.exception;

public class ExceptionPropagation {
    public static void functionOne() throws AgeException {
        functionTwo();
    }
    public static void functionTwo() throws AgeException {
        functionthree();
    }
    public static void functionthree() throws AgeException {
        try {
            int a = 12/0;
        }catch (ArithmeticException e){
            throw new AgeException("Sayı 0 bölünemez");
        }

        functionFour();
    }
    public static void functionFour(){
        functionFive();

    }
    public static void functionFive(){
        System.out.println("Buraya gelmeyecek");
    }

    public static void main(String[] args) throws AgeException {

        try {
            functionOne();
        } catch (AgeException e) {
            System.out.println("Sistem hata ile karşılaştı");
        }finally {
            System.out.println("Yapılan değişiklikler geri alınıyor");
            throw new AgeException("Havale yapılamadı");
        }
    }
}

