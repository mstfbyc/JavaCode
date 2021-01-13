package com.bilgeadam.interfaces.fistexample;

public class Employee implements IPerson{
    private int no;
    private String name;
    private int year;
    private String department;
    private static final int BASE_SALARY = 500;

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    @Override
    public void printInfo() {
        System.out.println("\nNo: " + no);
        System.out.println("Name:" + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
    }


    public void work() {
        System.out.println("Employee is working!");
    }
}
