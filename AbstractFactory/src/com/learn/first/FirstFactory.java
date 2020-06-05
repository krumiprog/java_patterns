package com.learn.first;

import com.learn.Factory;
import com.learn.Producer;
import com.learn.Tester;

public class FirstFactory implements Factory {
    @Override
    public Producer getProducer() {
        return new FirstProducer();
    }

    @Override
    public Tester getTester() {
        return new FirstTester();
    }
}
