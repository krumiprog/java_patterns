package com.learn;

public class Prodaction {
    private final Producer producer;
    private final Tester tester;

    public Prodaction(Factory factory) {
        producer = factory.getProducer();
        tester = factory.getTester();
    }

    public void startProduction() {
        producer.getProduct();
        tester.testProduct();
    }
}
