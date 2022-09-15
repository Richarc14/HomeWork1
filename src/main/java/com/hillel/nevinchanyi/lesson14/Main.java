package com.hillel.nevinchanyi.lesson14;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();

        android.sms();
        android.call();
        android.internet();
        android.getOS();

        IPhones iPhone = new IPhones();

        iPhone.sms();
        iPhone.call();
        iPhone.internet();
        iPhone.getOS();
    }
    }
