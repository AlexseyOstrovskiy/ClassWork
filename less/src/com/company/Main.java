package com.company;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg: args) {
            int d = Integer.parseInt(arg);sum += d;
        }
        System.out.print("Сумма чисел = ");
        System.out.println(sum);


        //системная переменная

       Map<String,String> envs =  System.getenv();//возвращает список сис переменных(переменная среды)в Map
        System.out.println("Path = " + envs.get("Path"));

        //
        System.out.println("TEMP = " + System.getenv("TEMP"));
    }
}

