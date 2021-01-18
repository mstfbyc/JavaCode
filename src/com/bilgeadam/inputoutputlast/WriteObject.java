package com.bilgeadam.inputoutputlast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.bin"))) {
            Student student1 = new Student("Mustafa BOYACI",1234,"Computer Engneer","Java");
            Student student2 = new Student("Mehmet HAKYEMEZ",1452,"Computer Engneer","C++");
            Student student3 = new Student("Ahmet YILMAZ",1548,"Computer Engneer","Go");
            Student.setCountStudent(100);
/*            outputStream.writeObject(student1);
            outputStream.writeObject(student2);
            outputStream.writeObject(student3);*/
            List<Student> studentList = new ArrayList<>(Arrays.asList(student1,student2,student3));
            outputStream.writeObject(studentList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
