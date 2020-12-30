package com.bilgeadam.exception;

import java.io.IOException;

public class AgeException extends IOException {

    public AgeException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu bir Invalid Age hatasıdır");
    }
}
