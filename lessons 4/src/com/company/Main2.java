package com.company;

public class Main2 {

    public static void main(String[] args) {
	// write your code here
        // бинарные операции
        //& - бинарное и
        System.out.println(5 & 7);
        // | - бинарное или
        System.out.println(5 | 7);
        // >> - бинарный сдвиг вправо
        System.out.println(7 >> 2);
        // << - бинарный сдвиг влево
        System.out.println(5 << 3);
        // Пример
        // 4 первых бита - скорость (13)
        // 5-7 бит - напряжение (4)
        // 8-11 бит - сила тока (9)
        //1001 100 1101 = 1229
        int data = 1229;
        int speed = data << 27;
        speed >>= 27;
        System.out.println( speed );
        //2 способ
        int maskSpeed = 15;
        speed = data & maskSpeed;
        System.out.println(speed);
        // напряжение
        int maskVoltage = 112;
        int voltage = data & maskVoltage;
        voltage >>= 4;
        System.out.println(voltage);
        // сила тока
        int ST = data >> 7;
        System.out.println(ST);

    }
}
