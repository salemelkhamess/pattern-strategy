package org.example;

public class DefaultStrategy implements Strategy {
    @Override
    public void operationStrategy() {

        System.out.println("======================================");
        System.out.println("*********   Stratégie par defaut *************");
        System.out.println("::::::::::::::::::::::::::::::::::::::");
    }
}
