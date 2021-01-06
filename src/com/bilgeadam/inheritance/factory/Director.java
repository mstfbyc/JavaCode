package com.bilgeadam.inheritance.factory;

public class Director extends Manager{
    protected double bonus;

/*    public Director() {
        System.out.println("Director is Worked");
    }*/

    public Director(int no, String name, int year, String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);
        this.bonus = bonus;
        System.out.println("Director is Working");
    }

    @Override
    public void printInfo() {
        //super.printInfo();
        System.out.println("no: "+no +"\tname: "+name+"\tYear:"+year+ "\tDepartment: "+department + "\t Managed Department: "+ departmentManaged + "\t Bonus: "+ bonus);
    }

    public void raiseSalary(double newSalary){
        System.out.println("Maaşlara: "+newSalary+"TL zam yapıldı.");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

