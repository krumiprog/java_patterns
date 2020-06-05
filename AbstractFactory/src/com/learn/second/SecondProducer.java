package com.learn.second;

import com.learn.Producer;

public class SecondProducer implements Producer {
    @Override
    public void getProduct() {
        System.out.println("Second producer produced");
    }
}
