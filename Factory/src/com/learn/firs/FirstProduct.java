package com.learn.firs;

import com.learn.Product;

public class FirstProduct implements Product {
    @Override
    public void getDescripton() {
        System.out.println("First product");
    }
}
