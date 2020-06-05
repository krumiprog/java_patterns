package com.learn;

public class Singleton {
    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    private Singleton() {

    }

    public void getDescription() {
        System.out.println("I'm a singleton");
    }
}
