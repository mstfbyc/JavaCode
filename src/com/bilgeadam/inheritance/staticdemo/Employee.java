package com.bilgeadam.inheritance.staticdemo;

public class Employee {
    public static int sayac;
    protected final int no;
    protected String name;
    protected  int year;
    protected  String department;

    public Employee() {
        this.no = ++sayac;
    }

    public static Employee searchEmployee(int no){
        if(no ==1){
            return new Employee();
        }else{
            return null;
        }
    }

    public  void printEmployeeInfo(){
        System.out.println("no: "+no +"\tname: "+name+"\tYear:"+year+ "\tDepartment: "+department);
    }
}

