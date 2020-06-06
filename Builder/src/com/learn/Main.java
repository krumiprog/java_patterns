package com.learn;

public class Main {

    public static void main(String[] args) {
        Builder builder = new FirstBuilder();

        Director director = new Director();
        director.setBuilder(builder);
        director.makeProduct();

        Product product = builder.getProduct();
        System.out.println(product);
    }
}
