package com.bilgeadam.collections;


import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Students> studentsArrayList = new ArrayList<>();
        stringArrayList.add("Java");
        stringArrayList.add("Pthon");
        stringArrayList.add("C++");
        //System.out.println(stringArrayList.size());
        stringArrayList.remove("C++");
        stringArrayList.addAll(Arrays.asList("C++","Ruby","C#",".NET"));
        //stringArrayList.removeAll(stringArrayList);
        System.out.println(stringArrayList.isEmpty());
        System.out.println(stringArrayList.size());
        stringArrayList.set(stringArrayList.size()-1,".CORE");
        stringArrayList.clear();
        System.out.println(stringArrayList.size());


        //System.out.println(stringArrayList.get(0));
        // stringArrayList.get(4);

        for (String s:stringArrayList) {
            System.out.println(s);

        }
    }
    public class Students{
        public String name;
        public String surname;

        public Students(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }
}


