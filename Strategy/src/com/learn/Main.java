package com.learn;

public class Main {

    public static void main(String[] args) {
        Activist activist = new Activist();

        activist.setAction(new FirstAction());
        activist.executeAction();

        activist.setAction(new SecondAction());
        activist.executeAction();
    }
}
