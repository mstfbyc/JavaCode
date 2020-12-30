package com.bilgeadam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {
        String operation = null;
        do {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("********************************************");
                String operations = "1. Toplama İşlemi\n"
                        +"2. Çıkarma İşlemi\n"
                        +"3. Çarpma İşlemi\n"
                        +"4. Bölme İşlemi\n"
                        + "Çıkıç için -1";
                System.out.println(operations);
                System.out.println("********************************************");
                System.out.println("İşlemi Seçiniz: ");
                operation = scanner.nextLine();
                int a;
                int b;

                switch (operation){
                    case "1":
                        System.out.print("Birinci sayı: ");
                        a = scanner.nextInt();
                        System.out.print("İkinci sayı: ");
                        b = scanner.nextInt();
                        System.out.println("Girilen Değerlerin Toplamı: " + (a + b));
                        break;
                    case "2":
                        System.out.print("Birinci sayı: ");
                        a = scanner.nextInt();
                        System.out.print("İkinci sayı: ");
                        b = scanner.nextInt();
                        System.out.println("Girilen Değerlerin Farkı: " + (a - b));
                        break;
                    case "3":
                        System.out.print("Birinci sayı: ");
                        a = scanner.nextInt();
                        System.out.print("İkinci sayı: ");
                        b = scanner.nextInt();
                        if(a >10000 && b > 10000 ){
                            throw new MultiplayException();
                        }
                        System.out.println("Girilen Değerlerin Çarpımı: " + (a * b));
                        break;
                    case "4":
                        System.out.print("Birinci sayı: ");
                        a = scanner.nextInt();
                        System.out.print("İkinci sayı: ");
                        b = scanner.nextInt();
                        System.out.println("Girilen Değerlerin Bolumu: " + (a / b));
                        break;
                    case "-1":
                        System.out.println("Proıgramdan Çıkılıyor....");
                        break;
                    default:
                        System.out.println("Geçersiz İşlem");
                }
            }catch (InputMismatchException e){
                System.out.println("Hatalı giriş girilen değer sayı olmalı");
            }catch (MultiplayException e){
                e.printStackTrace();
                System.out.println("Çarma işlemi için 10.000 den daha küçük sayı girmesiliz.");
            }
        }while (!operation.equals("-1"));
    }
}

