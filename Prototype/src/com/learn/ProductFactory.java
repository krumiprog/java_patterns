package com.learn;

public class ProductFactory {

    Product product;

    public ProductFactory(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    Product copyProduct() {
        return (Product) product.copy();
    }
}
