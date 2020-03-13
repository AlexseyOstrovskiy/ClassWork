package com.company;

public class Dog  extends Animal {
    public String name;
    //статические свойства распологаются в памяти
    //в единственном экземпляре
    public  static int footcount;


    public Dog () {

        super("green", 4);
        this.name = "rex";
        Cat cat = new Cat();
    }
    public Dog (String color,int age,String name) {
        super(color, age);
        this.name = name;

    }
    // определение родительского абстрактного метода say
    public void say(String word)//sound
    {
        System.out.println("haw-haw "+ word);
    }

    //внутренний класс (inner-класс)
    public static class Cat {
        public String name;
        Cat () {

            this.name = "kot";
            name = "cabaka";

        }
    }

    private class Mouse {
        Mouse() {
            name = "mbILII";
        }
    }
    //в статических методах нельзя использовать ссылку на экземпляр объекта
    //this.name = "asda" - ошибка
    public static void bark () {
        System.out.println("bark");
        sleep();
    }
        public static  void sleep () {
        System.out.println("z-z-z-z-z");
        }

}
