package com.company;

//наследование догом класса анимал
//свойство/методы родителя
//public - наследуется
//private - не наследуется
//protected - наследуется
public class dog extends Animal{
    public String breed;// порода

    public void bark () {
        System.out.println("Haw-Hav");
    }
    @Override
    void sleep (int h) {
        System.out.print("Dog sleep ");
        System.out.print(h);
        System.out.println(" hours");
    }

    //
    @Override
    void eat () {
        super.eat();//указатель на объект родителя
        System.out.println("dog is not hungry anymore");
        super.sleep();
    }
}
