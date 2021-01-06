package com.bilgeadam.inheritance.factory;

public class Manager extends Employee{
    protected String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 3000;

    /*    public Manager(){
            System.out.println("Manager Çalıştı.");
        }*/
    //Super() ornek
    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
        System.out.println("Manager is working.");
    }

    @Override
    public double calculateSalary() {
        return MANAGEMENT_PAYMENT * year;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}