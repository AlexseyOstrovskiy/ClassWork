package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// Сериализация
        //сохранение в файл
        User user = new User("vasa",15);
        user.height = 120.0f;
        try {
            FileOutputStream fos = new FileOutputStream("user.bin");//создаем объект для записи
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);//передаем объект user для записи в файл
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Десериализация
        //Чтение из файла

        try {
            FileInputStream fis = new FileInputStream("user.bin");//создаем объект из которого мы будем читать
            ObjectInputStream ois = new ObjectInputStream(fis);
            User u = (User)ois.readObject();
            ois.close();
            fis.close();
            System.out.println(u.name + " " + u.age);
            System.out.println(u.height);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //сериализация коллекции

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("misha",12));
        users.add(new User("gosha",19));
        users.add(new User("olya",25));
        try{
            FileOutputStream fos = new FileOutputStream("users.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            oos.close();
            fos.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
            //десериализация коллекции
        try {
            FileInputStream fis = new FileInputStream("users.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<User> people = (ArrayList<User>) ois.readObject();
            ois.close();
            fis.close();
            for (User p : people){
                System.out.println(p.name);
                System.out.println(p.age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
