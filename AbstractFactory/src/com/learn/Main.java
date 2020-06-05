package com.learn;

import com.learn.first.FirstFactory;
import com.learn.second.SecondFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = getFactory(Type.FIRST);
        Prodaction prodaction = new Prodaction(factory);
        prodaction.startProduction();
    }

    private static Factory getFactory(Type type) {
        switch(type) {
            case FIRST:
                return new FirstFactory();
            case SECOND:
                return new SecondFactory();
            default:
                throw  new RuntimeException("There is no such factory");
        }
    }
}
