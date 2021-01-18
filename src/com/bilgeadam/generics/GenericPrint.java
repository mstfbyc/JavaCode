package com.bilgeadam.generics;

public class GenericPrint <E> {

    public  void print(E[] array){
        for (E e:array) {
            System.out.println(e);
        }
    }
}
