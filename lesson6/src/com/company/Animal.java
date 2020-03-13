package com.company;

// В java  не возможно создать экземпляр объекта
//абстрактного класса.
public abstract class Animal {
    //консруктор
    public String color;
    public int age;
   /* public Animal() {
        color = "black";
        age = 9;
        System.out.println("Animal was created");
      }
        */

    public Animal (String color,int age) {
        //this - указатель(ссылка) на текущий экземпляр объекта
        this.color = color;
        this.age = age;


    }

    public abstract void say(String word);

}
