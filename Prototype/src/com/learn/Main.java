package com.learn;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Product origin");
        System.out.println(product);

        ProductFactory productFactory = new ProductFactory(product);

        Product copiedProduct = productFactory.copyProduct();
        System.out.println(copiedProduct);
    }
}
