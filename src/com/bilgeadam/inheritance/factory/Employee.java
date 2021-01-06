package com.bilgeadam.inheritance.factory;

public  class Employee {
    private  String nomExtents;
    protected  int no;
    protected String name;
    protected  int year;
    protected  String department;
    public static final int BASE_SALARY = 500;

/*    public Employee() {
        System.out.println("Employee çalıştı.");
    }*/

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
        System.out.println("Employee is working.");
    }
    public void work(){
        System.out.println("Employee is working");
    }

    public double calculateSalary(){
        return year * BASE_SALARY;
    }

    public void printInfo(){
        System.out.println("no: "+no +"\tname: "+name+"\tYear:"+year+ "\tDepartment: "+department);
    }
}
