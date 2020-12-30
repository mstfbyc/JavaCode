package com.bilgeadam.exception;

public class MultiplayException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Ikı sayı da çok büyük. Lütfen küçük sayı giriniz.");
    }
}
