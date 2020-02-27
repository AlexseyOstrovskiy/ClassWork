package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Исключения
        /*int a = 10;
        a = a / 0; //возникает ошибка(исключение)
        System.out.println(a);*/
        int index = 7;
        int arr[] = new int[3];
        try {
            arr[index] = 17;
            System.out.println("меня не видно");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Что-то не так!");//Программа не вылетит
        }
        System.out.println("Я работаю!");//после блока try может идти несколько catch-ей!

        //обработка и генерация пользовательских исключений
        try {
            //вызывает исключение
            throw new MyException();
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.timestamp);
        }
        // Порядок catch имеет значение
        //и класс exception throwable всегда находиттся ниже
        //чем пользовательские исключения.
        //Если среди catch присутствует класс exception или throwable, то этот cathc
        // сработает в том случае, если не сработал
        // ни один из пользовательских исключений.
        try {
            test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        //Игра в угадай число
        Game game = new Game();
        game.start();
    }
    public static void test () throws MyException {
        getMoney(-100);
    }
    public static void getMoney(int money) throws MyException{
        if (money <= 0 || money > 1000) {
            throw  new MyException();
            }
        System.out.println("деньги сняты");
    }

}

