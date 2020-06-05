package com.learn.first;

import com.learn.Producer;

public class FirstProducer implements Producer {
    @Override
    public void getProduct() {
        System.out.println("First producer produced");
    }
}
