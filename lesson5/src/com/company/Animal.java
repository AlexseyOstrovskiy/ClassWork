package com.company;

import javax.swing.*;

public class Animal {
    //свойство объекта
    public float weight;//открытый
    public String color;
    private float height;//доступно внутри класса
    protected int age;//
    //методы объекта
    void eat () {
        System.out.println("Animal eat");
    }
    // перегрузка метода sleep
    void sleep () {
        System.out.println("Animal sleep");
    }
    void sleep (int h) {
        System.out.print("animal sleep ");
        System.out.print(h);
        System.out.println(" hours");
    }
    void sleep (int h,int m) {
        System.out.print("animal sleep ");
        System.out.print(h);
        System.out.print(" hours and ");
        System.out.print(m);
        System.out.println( " minutes");
    }
}
