package com.learn;

import com.learn.firs.FirstFactory;
import com.learn.second.SecondFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = getFactory(Types.FIRST);
        Product product = factory.produceProduct();
        product.getDescripton();

        factory = getFactory(Types.SECOND);
        product = factory.produceProduct();
        product.getDescripton();
    }

    public static Factory getFactory(Types types) {
        switch (types) {
            case FIRST:
                return new FirstFactory();
            case SECOND:
                return new SecondFactory();
            default:
                throw new RuntimeException("There is no such factory");
        }
    }
}
