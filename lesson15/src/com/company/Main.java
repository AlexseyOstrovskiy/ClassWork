package com.company;

public class Main {

    public static void main(String[] args) {

        // многопоточность

        //засекаем время перед началом цикла
        long t = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            double d = Math.atan(13) * Math.cos(79) + Math.exp(23 - i) +
                    Math.sqrt(i);
        }
        System.out.println(System.currentTimeMillis() - t);

        ////создаем новый поток

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50000000; i++) {
                    double d = Math.atan(13) * Math.cos(79) + Math.exp(23 - i) +
                            Math.sqrt(i);
                }
            }
        }
        );
        MyThread t2 = new MyThread();
        long tt = System.currentTimeMillis();
        t1.start();
        t2.start();

        try {
            t1.join();//основной поток ожидает завершения остальных потоков
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - tt);

    //синхронизация потоков

    MyClass m = new MyClass();
    MyClass mm = new MyClass();
    Thread tt1 = new Thread(new Runnable() {
        @Override
        public void run() {
            Thread ct = Thread.currentThread();
            synchronized (ct) {
                try {
                    ct.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 100000; i++) {
                    m.calc(1);
                    m.calc2(1, "A");
                }
            }
        }
    });

    Thread tt2 = new Thread (new Runnable() {
        @Override
        public void run() {
            Thread ct = Thread.currentThread(); //возвращает объект текущего потока
            System.out.println(ct.getName());
            try {
                Thread.sleep(200);//останавливает работу потока на заданное время
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n" + ct.getName() + "wake up\n");
            for (int i = 0; i < 100000; i++) {
                if (i == 1000){
                    synchronized (tt1) {
                        System.out.println("\n"+ tt1.getState());
                        tt1.notifyAll();
                    }
                }
                m.calc(-1);
                m.calc2(-1,"B");
            }
        }
    });
    tt1.start();
    tt2.start();
        try {
            tt1.join();
            tt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m.value);
        System.out.println(m.value2);

        // 18/02/2020

        Thread ct = Thread.currentThread(); //возвращает объект текущего потока
        System.out.println(ct.getName());
        try {
            Thread.sleep(100);//останавливает работу потока на заданное время
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //wait(); - приостанавливает работу потока до наступления события о пробуждении
        /*try {
           // ct.wait();- не вызывать в основном потоке
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  notify,notifyAll - создают для потока событие, что бы то продолжил работу
        //ct.notify();*/

        System.out.println(ct.getState());// возвращает текущее состояние потока

        ct.interrupt();//прерывает выполнение потока
        Thread.yield();//завершает квант работы текущего потока и переключается на следующий поток
        ct.setPriority(Thread.MAX_PRIORITY);//устанавливает приоритет потока




    }

}
