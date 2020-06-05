package com.learn.second;

import com.learn.Product;

public class SecondProduct implements Product {
    @Override
    public void getDescripton() {
        System.out.println("Second product");
    }
}
