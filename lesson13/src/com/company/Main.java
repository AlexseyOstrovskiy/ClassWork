package com.company;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Set- коллекця этого типа хранит не дублирующийся уникальный элемент
        HashSet<String> set = new HashSet<>();
        set.add("string1");
        set.add("string2");
        set.add("string3");
        set.add("string4");
        System.out.println("Коллекция после добавления");
        System.out.println(set);
        set.add("string2");
        System.out.println("Коллекция после добавления повторного элемента");
        System.out.println(set);
        set.remove("string2");
        System.out.println("Коллекция после удаления элемента");
        System.out.println(set);
        System.out.println();

        //Map - коллекция этого типа хранит элементы по принципу ключ-значение
        HashMap<String, Integer> map = new HashMap<>();//1-тип ключа,2 - тип значения
        map.put("Ivanov", 10000);
        map.put("Ivanov2", 9000);
        map.put("Ivanov3", 300);
        map.put("Ivanov4", 9000);
        System.out.println("Коллекция после добавления");
        System.out.println(map);
        map.put("Ivanov3", 10);
        System.out.println("Коллекция после добавления одинакового ключа");
        System.out.println(map);
        int value = map.get("Ivanov4");
        System.out.println(value);
        Set<String> keys = map.keySet();// возвращает множество ключей
        System.out.println(keys);
        System.out.println(map.values());//возвращает список значений
        map.remove("Ivanov4");
        System.out.println("Коллекция после удаления ключа");
        System.out.println(map);
        System.out.println();

        //Date
        Date d = new Date();
        d.getTime();// возвращает вреся в миллисекундах от 1 января 1970г
        System.out.println(d.getTime());
        Date d2 = new Date(546132554);// задаем время самостоятельно
        if (d.after(d2)) {
            System.out.println("d > d2");
        }
        if (d.before(d2)) {
            System.out.println("d < d2");
        }
        // Форматирование даты
        SimpleDateFormat df = new SimpleDateFormat("G 'WOW' yyyy EEEE");
        System.out.println(df.format(d));

       /* SimpleDateFormat df2 = new SimpleDateFormat("d/M/3yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату:");
        String data = sc.nextLine();
        try {
            Date d3 = df2.parse(data);
            System.out.println(d3.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        //Calendar
        GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.MINUTE, 25);
        System.out.println(calendar);
        calendar.add(Calendar.DAY_OF_MONTH, 28);
        System.out.println(calendar);
        calendar.add(Calendar.HOUR, -23);
        System.out.println(calendar);
        calendar.roll(Calendar.MINUTE, 50);
        System.out.println(calendar);
        if (calendar.isLeapYear(calendar.get(Calendar.YEAR))) {
            System.out.println("год выисокосный");
        } else {
            System.out.println("год не високосный");
        }
    }
}