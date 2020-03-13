package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// Файлы
        //абсолютный путь к файлу
        File f = new File("C:\\Programs\\1.txt");
        if (f.exists()) {
            System.out.println("Файл существует");
        }else {
            System.out.println("Файл не существует");
        }
        //относительный путь к файлу
        File ff = new File("1.txt");
        if (!ff.exists()) {
            try {
                ff.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(ff.length());
        //проверяем файл на доступность записи
        //выставлен ли атрибут "толбко чтение"
        System.out.println(ff.canWrite());
        //моментально удаляет файл после вызова
        //ff.delete();
        //удаляет файл после завершения программы
        //ff.deleteOnExit();

        //работа с папкой
        File dir = new File ("C:\\bukashka\\creativepainter");

        String []file = dir.list();
        for (int i =0; i < file.length;i++) {
            System.out.println(file[i]);
        }

        File dir2 = new File ("D:\\Test\\Heloo");
        if (!dir2.exists()) {
            //mkdir - создает только последнюю папку пути
            //dir2.mkdir();
            //mkdirs - создает все папки по указанному пути
            dir2.mkdirs();
        }

        //чтение текстового файла

        try {
            FileReader fr = new FileReader(ff);
            int c = fr.read();
            while (c != -1) {
                System.out.print((char)c);
                c = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //запись в файл

        try {
            FileWriter fw = new FileWriter("2.txt");
            fw.write("Hellooo\nWorld\n аааа");
            fw.close();//обязательно нужно закрывать файлы
        } catch (IOException e) {
            e.printStackTrace();
        }

        //преобразование строки в число

        try {
            FileReader fr2 = new FileReader("input.txt");
            int c = fr2.read();
            String number = "";
            while (c != -1) {
                if ((char)c == ' '){
                   int v =  Integer.parseInt(number);
                    System.out.println(v * v);
                    number = "";
                } else {
                    number += (char) c;
                }
                c = fr2.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}