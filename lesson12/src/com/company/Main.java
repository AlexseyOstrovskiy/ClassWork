package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// дженерики
        User<String, String> u = new User<>();
        User<Date, Object> u2 = new User<>();
        u.id = "SOME ID";
        System.out.println(u.id.toLowerCase());
        u2.id = new Date();
        System.out.println(u2.id.getTime());
        //
        Car<User, String> car = new Car<>();

        //коллекции
        //ArrayList (все элементы располагаются друг за другом,
        //порядок элементов не меняется, возможен случайный доступ к элементам)

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");// добавляет элемент всегда в конец списка
        list.add("world");
        list.add(1,"Java");// добавляет элемент в выбранный индекс
        for (int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }
        list.remove("hello");
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.remove(Integer.valueOf(20));// или Integer i = 20;
        System.out.println(list2);


    }
}
