package com.bilgeadam.bankatm;

public class App {

    public static void main(String[] args) {
        Customer mustafa = new Customer();
        mustafa.setName("Mustafa");
        mustafa.setSurName("Boyacı");
        mustafa.setAccountNumber("123456");
        mustafa.setBalance(100_000_000.00);
        mustafa.setPassword(" ");
        mustafa.setTckn("12345676456");
        Atm bank = new Atm();
        bank.runnerAtm();

    }
}

