package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("elem1");// добавляет элементы в стек
        stack.add("elem2");
        stack.add("elem3");

        System.out.println(stack);

        System.out.println(stack.pop());//достает "верхний" элемент стека
        System.out.println("стек после вызова верхнего элемента(pop):");
        System.out.println(stack);

        stack.push("elem4");
        System.out.println(stack);

        System.out.println(stack.peek());// возвращает верхний элемент стека,без его удаления
        System.out.println(stack);

        System.out.print("Элемент \"elem2\" находится по номеру: ");
        System.out.println(stack.search("elem2"));
        stack.clear();// удаляем элементы из стека
        try {
            System.out.println(stack.pop());
        }
        catch (EmptyStackException e) {
            System.out.println("Ошибка! Стек пустой");
        }
        System.out.println(stack);
        System.out.println();
        //Queue - Очередь FIFO

        Queue<String> queue = new PriorityQueue<>(3);
        queue.add("q1");
        queue.add("q2");
        queue.add("q3");
        System.out.println(queue);

        System.out.println(queue.poll());//(remove)достает первый элемент из очереди и удаляет его
        System.out.println(queue);

        System.out.println(queue.peek());//достает первый элемент без удаления
        if (queue.offer("q4"))
            System.out.println("Элемент добавлен");
        else System.out.println("элемент не добавлен");
        System.out.println(queue);
        System.out.println();
        //
        UserComparator comparator = new UserComparator();
        Queue<User> users = new PriorityQueue<>(comparator);
        Random rand = new Random();
        for (int i=0;i < 10;i++){
            User u = new User();
            u.setMoney(rand.nextInt(1000));
            users.add(u);
        }
        while (true) {
            User u = users.poll();
            if (u == null) {
                break;
            }
                System.out.println(u);
         }

        System.out.println();
        System.out.println(fact1(5));

        System.out.println();
        System.out.println(fact2(6));



    }
    //применение рекурсии
    //нахождение факториала
    public static int fact1(int n) {
        int f  = 1;
        for (;n !=1 ;n--) {
            f *= n;
        }return f;
    }
    //применение рекурсии
    public static int fact2 (int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact2(n -1);
    }
}
