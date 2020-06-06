package com.learn;

public abstract class Builder {
    protected Product product;

    public void createProduct() {
        product = new Product();
    }

    public abstract void setName();
    public abstract void setPrice();

    public Product getProduct() {
        return product;
    }
}
