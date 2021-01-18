package com.bilgeadam.generics;

public class TestGeneric {
    public static void main(String[] args) {
        Character[] characters = {'J','A','V','A'};
        Integer[] integers = {1,2,3,4,5,6};
        String[] strings = {"Java","Python","C++","PHP"};
        Student[] students = {new Student("Ahmet"),new Student("Mehmet"),new Student("Mustafa")};

/*        System.out.println("*****************************");
        CharPrint.printArray(characters);
        System.out.println("*****************************");
        IntegerPrint.printArray(integers);
        System.out.println("*****************************");
        StringPrint.printArray(strings);
        System.out.println("*****************************");
        StudentPrint.printArray(students);*/
        GenericPrint<Character> characterGenericPrint = new GenericPrint<>();
        GenericPrint<Integer> integerGenericPrint = new GenericPrint<>();
        GenericPrint<String> stringGenericPrint = new GenericPrint<>();
        GenericPrint<Student> studentGenericPrint = new GenericPrint<>();

        stringGenericPrint.print(strings);
        System.out.println("*****************************");
        studentGenericPrint.print(students);
        System.out.println("*****************************");
        integerGenericPrint.print(integers);
        System.out.println("*****************************");
        characterGenericPrint.print(characters);
        System.out.println("*****************************");
        genericPrint(students);

    }
    public static void printObject(Integer[] array){
        for (Integer i:array) {
            System.out.println(i);

        }
    }
    public static void printObject(String[] array){
        for (String i:array) {
            System.out.println(i);

        }
    }

    public static <E extends Student> void genericPrint(E... array){
        for (E e:array) {
            System.out.println(e);

        }
    }

}
