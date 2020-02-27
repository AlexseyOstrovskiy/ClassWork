package com.company;

public class Main {

    public static void main(String[] args) {
    //1
    int s = sum(44, 57, 124);
	System.out.println(s);
	//2
	float m = max(4, -7.6f, 14.5f);
	System.out.println(m);
	//3
	int [] a = {12,55,4,7,-5,-65,0,32};
	int r = sumMas(a);
	System.out.println(r);

	//4
    float t = sumOdd(4.4f,1.2f,-5.4f,99.8f,44.8f,-78.1f);
    System.out.println(t);

    //5
    a = bubbleSort(a);
    for (int i = 0; i < a.length;i++){
        System.out.println(a[i]);

    }
        }

    //1
    //объявление функции
    //void - функция не возвращает значение
    public static int sum(int a, int b, int c) {
        return a + b + c; // ключевое слово return завершает выполнение функции
    }

    //2
    public static float max (float x, float y, float z){
        if (x > y & x > z) {
            return x;
        }
        if ( y > x & y > z) {
            return z;
        }
        return z;
    }
    //3
    public static int sumMas (int [] arr){
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }

    //4
    //функция с переменным числом параметров
     public static float sumOdd (float ...a) {
        float e = 0.0f;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            e = e + a[i];
        }
        return e;
     }

    // сортировка методом пузырька
    //5
    public static int [] bubbleSort (int [] c) {
        for (int i = 0; i < c.length;i++) {
            for (int j = i + 1; i < c.length;j ++) {
                if (c[i] > c [j]) {
                    int tmp = c[i];
                    c[i] = c[j];
                    c[j] = tmp;
                }
            }
        }return c;
    }


}
