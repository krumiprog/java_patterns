package com.learn;

public class Main {

    public static void main(String[] args) {
        Singleton.getInstance().getDescription();

        System.out.println(Singleton.getInstance().toString());
        System.out.println(Singleton.getInstance().toString());
    }
}
