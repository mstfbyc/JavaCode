package com.bilgeadam.exception;

import java.util.Scanner;

public class ThrowKey {

    public static void enterControl(int age) throws AgeException {
        if(age <18){
            throw new AgeException("18 Yaşından küçükler giremez");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int age = scanner.nextInt();

        try {
            enterControl(age);
            System.out.println("Mekana Hoş Geldiniz.");
        } catch (AgeException e) {
            e.printStackTrace();
        }

    }
}

