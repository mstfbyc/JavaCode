package com.bilgeadam.interfaces.fistexample;

public class Director implements IPerson {
    private int no;
    private String name;
    private int year;
    private String department;
    protected String departmentManaged;
    private static final int BASE_SALARY = 1000;
    private static final int BONUS = 50000;

    public void manage() {
        System.out.println("Director manages whole company.");
    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY + BONUS;
    }

    @Override
    public void printInfo() {
        System.out.println("\nDirector Info");
        System.out.println("No: " + no);
        System.out.println("Name:" + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
        System.out.println("Managing Department: " + departmentManaged);
    }
}
