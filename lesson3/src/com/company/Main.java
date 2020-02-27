package com.company;

public class Main {

    public static void main(String[] args) {
        // массивы
        int []arr = new int [5];
        arr[0] = 10;
        arr[4] = 20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //двумерные массивы
        int [][]arr2 = new int[3][4];
        arr2 [0][1] = 12;
        arr2 [2][3] = 33;
        System.out.println(arr2[0][1]);
        System.out.println(arr2[2][3]);
        // Определение длинны масива
        System.out.println(arr.length);
        System.out.println(arr2.length);
        // Статическая инициализация массивов
        int[] arr3 = {2,5,7,9,3,88};
        System.out.println(arr3[2]);
        int [][] arr4 = {{1,2,7},{3,4,8},{5,6,9}};
        System.out.println(arr4[2][2]);

        //циклы
        int i = 0;
        while (i < 5) {
            System.out.println("хелоу");
            i +=1;
        }
        // цикл с постпроверкой условия
        do {
            System.out.println("хай");
        }while (i < 5);

        //любой блок может быть пустым
        for (int a = 0;a < 7;a++) {
            System.out.println(a);
        }
        // оператор break
        for (int a = 0; ;a++) {
            System.out.println("хой");
            if (a == 7) {
                break;// завершает выполнение цикла
            }
        }
        //оператор continue
        for (int d = 0;d < 10; d++){
            if (d % 2 != 0) {
                continue;// перерывается текущая итерация цикла
            }
            System.out.println(d);
        }

        //обход элементов массива
        for (int r = 0;r < arr.length; r++) {
            System.out.println(arr[r]);
        }
        // операторы ++ и --
        int w = 7;
        w++;//w = w + 1
        System.out.println(w);
        int v = w++;
        int b = w;
        System.out.println(v);
        System.out.println(b);
        //таблица умножения
        for (int q = 1;q <= 9;q++ ) {
            for (int z = 1;z <= 9; z++) {
                System.out.print(q);
                System.out.print("*");
                System.out.print(z);
                System.out.print("=");
                System.out.println(q * z);
            }
            System.out.println();
        }
    }

}
