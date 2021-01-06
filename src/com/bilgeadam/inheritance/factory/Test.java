package com.bilgeadam.inheritance.factory;

public class Test {
    public static void main(String[] args) {
        Director director = new Director(1,"Mustafa",5,"IT","IT",10_000);
        Manager manager = new Manager(1,"Ahmet",5,"IT","IT");
        Employee employee = new Employee(2,"Mehmet",5,"uretim");

/*      director.name = "Mustafa";
        director.no=1;
        director.bonus = 100_000;
        director.department = "IT";
        director.departmentManaged = "IT";
        director.year = 5;*/

        //director.raiseSalary(5000);

        director.printInfo();
        System.out.println(director.calculateSalary());
        System.out.println(manager.calculateSalary());
        System.out.println(employee.calculateSalary());

    }
}

