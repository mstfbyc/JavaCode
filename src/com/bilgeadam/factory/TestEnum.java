package com.bilgeadam.factory;

import com.bilgeadam.enums.TodoStatusEnums;

public class TestEnum {
    public static void main(String[] args) {
        Work work1 = new Work(TodoStatusEnums.NEW,1);
        work1.setStatus(TodoStatusEnums.findCode(4));
        System.out.println(work1);
    }
}

