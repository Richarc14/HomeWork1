package com.hillel.nevinchanyi.lesson14;

public class Androids implements Smartphone, Linux {
    @Override
    public void sms() {
        System.out.println("Смс с Андроида");
    }

    @Override
    public void call() {
        System.out.println("Звонок с Андроида");
    }

    @Override
    public void internet() {
        System.out.println("Интернет на Андроиде");
    }

    @Override
    public void getOS() {
        System.out.println("Это Линукс");
    }
}
