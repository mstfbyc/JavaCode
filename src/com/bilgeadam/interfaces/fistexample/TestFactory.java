package com.bilgeadam.interfaces.fistexample;

public class TestFactory {
    public static void main(String[] args) {
        //IPerson person1 = new IPerson();
        IPerson person = new Employee(1,"Mustafa",5,"Imalat");
        System.out.println(person.calculateSalary());
    }
}
