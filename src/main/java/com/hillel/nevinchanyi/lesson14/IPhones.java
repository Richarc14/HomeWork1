package com.hillel.nevinchanyi.lesson14;

public class IPhones implements Smartphone, IOS {
    @Override
    public void sms() {
        System.out.println("��� � ������");
    }

    @Override
    public void call() {
        System.out.println("������ � ������");
    }

    @Override
    public void internet() {
        System.out.println("�������� �� ������");
    }
    @Override
    public void getOS() {
        System.out.println("��� IOS");
    }
}
