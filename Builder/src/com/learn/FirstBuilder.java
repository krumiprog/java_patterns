package com.learn;

public class FirstBuilder extends Builder {
    @Override
    public void setName() {
        product.setName("First product");
    }

    @Override
    public void setPrice() {
        product.setPrice(1000);
    }
}
