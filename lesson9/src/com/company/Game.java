package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int number;
    private int nCount;

    public Game () {
        //генерация случайных чисел
        //double r = Math.random();// r [0;1]
        // r * (max - min) + min; ф-ла перевода в другие диапазоны

        //2 способ
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1;
    }
    public void start () {
            Scanner sc = new Scanner(System.in);
            int user;
            while (true) {
                System.out.println("Попробуйте угадать число");

                try {
                    user = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Введите коректное число");
                    sc = new Scanner(System.in);
                    continue;
                }

                this.nCount++;
                if (this.number == user) {
                    System.out.println("Поздравляем");
                    System.out.println("Вы угадали число");
                    System.out.println(this.nCount);
                    System.out.println("попыток");
                    break;
                }
                if (this.number > user) {
                    System.out.println("Загаданное число больше");
                }
                if (this.number < user) {
                    System.out.println("Загаданное число меньше");
                }
            }

    }
}
