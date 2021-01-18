package com.bilgeadam.collectionscontinue;

import java.text.Collator;
import java.util.*;

class Student{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class FromSmallToLarge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class FromLargeToSmall implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return - o1.getName().compareTo(o2.getName());
    }
}
public class TestSort {
    public static void main(String[] args) {
        Student student1 =new Student("Mustafa",1);
        Student student2 =new Student("Mehmet",2);
        Student student3 =new Student("Ahmet",3);
        Student student4 =new Student("Nihat",4);
        Student student5 =new Student("Burhan",5);
        Student student6 =new Student("Zeynep",6);
        Student student7 =new Student("Zuhal",7);
        List<Student> studentList;
        studentList = Arrays.asList(student1,student2,student3,student4,student5,student6,student7);

        //Collections.sort(studentList,new FromLargeToSmall());

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getId()<o2.getId()){
                    return -1;
                }else if(o1.getId() > o2.getId()){
                    return 1;
                }
                return 0;
            }
        });

        for (Student s:studentList
        ) {
            System.out.println(s);

        }
        Collator collator = Collator.getInstance(new Locale("tr","TR"));
    }
}

