package com.hillel.nevinchanyi.lesson14;

public class Androids implements Smartphone, Linux {
    @Override
    public void sms() {
        System.out.println("��� � ��������");
    }

    @Override
    public void call() {
        System.out.println("������ � ��������");
    }

    @Override
    public void internet() {
        System.out.println("�������� �� ��������");
    }

    @Override
    public void getOS() {
        System.out.println("��� ������");
    }
}
