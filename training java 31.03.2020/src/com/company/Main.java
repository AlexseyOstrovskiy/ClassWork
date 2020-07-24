package com.company;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args)  {
	Lambda l = new Lambda();

        l.setOnWorkListener(new Lambda.doSomething() {
            @Override
            public void doWork(String name) {
                System.out.println(name);
            }
        });

        // с использованием Лямбда - выражений
        l.setOnWorkListener((String s) -> {
            System.out.println(s);
        });
    }
}
