package com.bilgeadam.inheritance.staticdemo;

public class App {

    public static void main(String[] args) {
        final Employee employee1 = new Employee();
        System.out.println(employee1);
        employee1.name = "Mustafa";
        employee1.department = "IT";
        employee1.year = 3;
        employee1.year = 4;
        employee1.printEmployeeInfo();

        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employee6 = new Employee();
        Employee employee7 = new Employee();
        System.out.println(employee7.no);
        Employee employee8 = null;
        employee8 = Employee.searchEmployee(1);
        if(employee8 != null){
            System.out.println("Çalışan bulundu.");
        }else {
            System.out.println("Çalışan bulunamadı.");
        }

        // Integer number = null;





    }
}

