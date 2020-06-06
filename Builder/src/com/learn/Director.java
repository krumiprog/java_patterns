package com.learn;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void makeProduct() {
        builder.createProduct();
        builder.setName();
        builder.setPrice();
    }
}
