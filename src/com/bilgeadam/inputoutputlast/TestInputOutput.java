package com.bilgeadam.inputoutputlast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TestInputOutput {
    private static ArrayList<Integer> content = new ArrayList<>();

    public static void readFile(){
        try(FileInputStream inputStream = new FileInputStream("asiye.mp3")){
            int read;
            while ((read = inputStream.read()) !=- 1){
                content.add(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyInput(String copyName){
        try(FileOutputStream outputStream = new FileOutputStream(copyName)){
            for (int value: content) {
                outputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile();
        long startTime = System.currentTimeMillis();
        copyInput("asiye4.mp3");
        copyInput("asiye3.mp3");
        long finishTime = System.currentTimeMillis();
        System.out.println("2 dosyanın kopyalanması şu kadar sürdü: " + ((finishTime-startTime)/1000)+" saniye");
    }

}
