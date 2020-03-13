package com.company;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 50000000;i < 100000000; i++) {
            double d = Math.atan(13)*Math.cos(79) + Math.exp(23 - i) +
                    Math.sqrt(i);
        }
    }
}
