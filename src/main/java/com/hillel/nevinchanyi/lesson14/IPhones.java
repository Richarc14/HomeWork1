package com.hillel.nevinchanyi.lesson14;

public class IPhones implements Smartphone, IOS {
    @Override
    public void sms() {
        System.out.println("—мс с јйфона");
    }

    @Override
    public void call() {
        System.out.println("«вонок с јйфона");
    }

    @Override
    public void internet() {
        System.out.println("»нтернет на јйфоне");
    }
    @Override
    public void getOS() {
        System.out.println("Ёто IOS");
    }
}
