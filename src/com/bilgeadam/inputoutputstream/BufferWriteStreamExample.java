package com.bilgeadam.inputoutputstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriteStreamExample {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt",true))){
            writer.write("Saltuk Buğra\n");
            writer.write("Ozan Türkmen Sağlam.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
