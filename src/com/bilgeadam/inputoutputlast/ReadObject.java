package com.bilgeadam.inputoutputlast;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.bin"))){
/*            Student student1 = (Student) inputStream.readObject();
            Student student2 = (Student) inputStream.readObject();
            System.out.println("*************************************************");
            System.out.println(student1);
            System.out.println("*************************************************");
            System.out.println(student2);*/
            List<Student> studentList = (ArrayList<Student>) inputStream.readObject();
            System.out.println(Student.getCountStudent());
            for (Student s:studentList) {
                System.out.println(s);

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
