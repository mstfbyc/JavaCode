package com.bilgeadam.inputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("dosya.txt")) {
            int value;
            String stringValue ="";
            fileInputStream.skip(3);
            while ((value = fileInputStream.read()) != -1){
                stringValue += (char) value;
            }
            System.out.println(stringValue);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
