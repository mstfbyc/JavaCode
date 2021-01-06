package com.bilgeadam.bankatm;

import java.util.Scanner;

public class Atm {
    private Customer customer;

    public Atm() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getBalance(){
        return customer.getBalance();
    }

    public String drawingCash(double cash){
        String result;
        if(customer.getBalance() > cash){
            customer.setBalance((-1 * cash));
            result = "Hesabınızdan çekilen tutat: " + cash +" Hesabınızda kalan tutar: "+customer.getBalance();
        }else{
            result = "Yeterli Bakiyeniz mevcut değil. Mevcut bakıyeniz: "+customer.getBalance();
        }
        return result;
    }

    public String deposit(double cash){
        customer.setBalance(cash);
        return "Yeni hesap bakiyeniz: "+ customer.getBalance();
    }

    public String moneyTransfer(double cash, String iban){
        String result;
        if(customer.getBalance() > cash){
            customer.setBalance((-1 * cash));
            result = "Hesabınızdan "+iban+" nolu Iban " + cash +" tutarında para transfer edildi Hesabınızda kalan tutar: "+customer.getBalance();
        }else{
            result = "Yeterli Bakiyeniz mevcut değil. Mevcut bakıyeniz: "+customer.getBalance();
        }
        return result;
    }

    public String paymentBill(double cash, String billNumber){
        String result;
        if(customer.getBalance() > cash){
            customer.setBalance((-1 * cash));
            result = "Hesabınızdan "+billNumber+" nolu Fatura " + cash +" tutarında ödeme yapıldı. Hesabınızda kalan tutar: "+customer.getBalance();
        }else{
            result = "Yeterli Bakiyeniz mevcut değil. Mevcut bakıyeniz: "+customer.getBalance();
        }
        return result;
    }
    public void runnerAtm(){
        int operation = 0;
        Boolean accountEnter = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen tckn giriniz: ");
            String tckn = scanner.nextLine();
            System.out.println();
            System.out.print("Lütfen Şifrenizi giriniz: ");
            String password = scanner.nextLine();
            if(tckn.equalsIgnoreCase(customer.getTckn()) && password.equalsIgnoreCase(customer.getPassword())){
                accountEnter = true;
            }else{
                System.out.println("Hatalı giriş yaptınız...");
            }
            /**
             * Ödev Çıkış işlemi yapılana kadar kullanıcı istedi işlemi seçebilir.
             */


        }while (operation !=-1);
    }
}

