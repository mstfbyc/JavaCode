package com.bilgeadam.exception;

public class App {
    public static void main(String[] args) {
       /* String s = null;
        System.out.println(s.length());*/
        // int a = 12/0;
       /* int[] arr ={1,2,3,4,5,6};
        System.out.println(arr[6]);
*/
        try{

            int[] arr ={1,2,3,4,5,6};
            System.out.println(arr[6]);
            int a = 12/0;
        }
        catch (ArithmeticException ex){
            System.out.println("Bir sayı 0 bölünemez.");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Dizi boyutunu aştınız.");
        }finally {
            System.out.println("Ne olursa olsun çalışır.");
        }
        System.out.println("Burası da çalışır.");
    }
}

