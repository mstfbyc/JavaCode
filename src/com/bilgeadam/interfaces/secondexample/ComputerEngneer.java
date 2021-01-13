package com.bilgeadam.interfaces.secondexample;

public class ComputerEngneer implements IPerson, IEmployee{
    private boolean universtyGraduated;
    private boolean militaryStatus;
    @Override
    public void universtyGraduated(boolean universtyGraduated) {
        this.universtyGraduated = universtyGraduated;
    }

    @Override
    public void militaryStatus(boolean militaryStatus) {
        this.militaryStatus=militaryStatus;
    }

    @Override
    public void printInfo() {

    }

    @Override
    public double calculateSalary() {
        //TODO
        return 1000;
    }
}
