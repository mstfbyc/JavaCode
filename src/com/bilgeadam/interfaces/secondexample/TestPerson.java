package com.bilgeadam.interfaces.secondexample;

public class TestPerson {

    public static void main(String[] args) {
        IPerson person = new ComputerEngneer();
        IEmployee employee = new ComputerEngneer();
        person.militaryStatus(true);
        person.universtyGraduated(true);
        person.printInfo();
        //((ComputerEngneer)person).calculateSalary();
        employee.calculateSalary();
        //Gruplama
        //Zorumlu davranışları yerine getiriyor.
    }

}
