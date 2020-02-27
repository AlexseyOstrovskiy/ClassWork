package com.company;

public class Main {

    public static void main(String[] args) {
	  /* Animal animal = new Animal("white",15);
        System.out.println(animal.color);
        System.out.println(animal.age);
        Animal animal2 = new Animal("red",13);
        System.out.println(animal2.age);
        System.out.println(animal2.color);*/
        Dog dog = new Dog();
        //обращение к статическим полям класса осуществляется через название класса
        Dog.footcount = 4;
        System.out.println(dog.footcount);

        System.out.println(dog.color);
        Dog dog2 = new Dog ("blue",6, "rexx");
        System.out.println(dog2.footcount);
        System.out.println(dog2.name);
        System.out.println(dog2.age);
        dog2.say("aw-aw");
        Dog.Cat cat = new Dog.Cat ();
        cat.name = "kotopes";
        dog.bark();
        Dog.bark();


    }
}
