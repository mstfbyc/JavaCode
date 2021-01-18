package com.bilgeadam.inputoutputlast;


import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 3229738038047091183L;
    private static int countStudent = 0;


    private String name;
    private int id;
    private String department;
    //UnSeriliza
    private transient String lesson;


    public Student() {
    }

    public Student(String name, int id, String department, String lesson) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.lesson = lesson;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public static int getCountStudent() {
        return countStudent;
    }

    public static void setCountStudent(int countStudent) {
        Student.countStudent = countStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}

