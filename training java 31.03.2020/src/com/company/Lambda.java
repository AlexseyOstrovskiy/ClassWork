package com.company;

public class Lambda {
    public interface doSomething{
        void doWork(String name);
    }


    public void setOnWorkListener(doSomething Listener){
        Listener.doWork("programming");

    }
}
