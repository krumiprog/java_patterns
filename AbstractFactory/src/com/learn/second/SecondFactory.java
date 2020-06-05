package com.learn.second;

import com.learn.Factory;
import com.learn.Producer;
import com.learn.Tester;

public class SecondFactory implements Factory {
    @Override
    public Producer getProducer() {
        return new SecondProducer();
    }

    @Override
    public Tester getTester() {
        return new SecondTester();
    }
}
