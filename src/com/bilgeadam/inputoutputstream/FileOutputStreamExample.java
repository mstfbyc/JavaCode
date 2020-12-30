package com.bilgeadam.inputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {
    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("dosya.txt",true);
            //byte[] arr  = {120,125,124,60,87,68,74};
            String s = "Mustafa BOYACI";
            fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("program başarı ile sonlandı.");
    }
}
