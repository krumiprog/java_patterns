package com.learn.firs;

import com.learn.Factory;
import com.learn.Product;

public class FirstFactory implements Factory {
    @Override
    public Product produceProduct() {
        return new FirstProduct();
    }
}
