package com.bilgeadam.interfaces.fistexample;

public class Manager implements IPerson{
    private int no;
    private String name;
    private int year;
    private String department;
    protected String departmentManaged;
    private static final int BASE_SALARY = 1000;
    private static final int MANAGEMENT_PAYMENT = 500;


    @Override
    public double calculateSalary() {
        return year * BASE_SALARY + MANAGEMENT_PAYMENT;
    }

    @Override
    public void printInfo() {
        System.out.println("\nManager Info");
        System.out.println("No: " + no);
        System.out.println("Name:" + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
        System.out.println("Managing Department: " + departmentManaged);

    }
}
