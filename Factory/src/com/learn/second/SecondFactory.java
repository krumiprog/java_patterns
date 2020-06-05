package com.learn.second;

import com.learn.Factory;
import com.learn.Product;

public class SecondFactory implements Factory {
    @Override
    public Product produceProduct() {
        return new SecondProduct();
    }
}
