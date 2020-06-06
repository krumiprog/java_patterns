package com.learn;

public class SecondBuilder extends Builder {
    @Override
    public void setName() {
        product.setName("Second product");
    }

    @Override
    public void setPrice() {
        product.setPrice(2000);
    }
}
