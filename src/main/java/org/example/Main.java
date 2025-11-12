package org.example;

public class Main {
    public static void main(String[] args) {
        Context context  =  new Context();
        context.setStrategy(new StrateguImpl1());
        context.effectuerOperation();
        context.setStrategy(new StrateguImpl2());
        context.effectuerOperation();
        context.setStrategy(new StrateguImpl3());
        context.effectuerOperation();

    }
}