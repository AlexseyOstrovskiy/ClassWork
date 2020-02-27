package com.company;

public class Main {

    public static void main(String[] args) {
	// создаем объект
        User user1 = new User();
        user1.setName("vasa");
        user1.setAge(8);
        //методы класса Object
        User user2 = new User();
        user2.setName("vasa2");
        user2.setAge(-5);
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        //ВАЖНО!!!x.equals(y) == y.equals(x)


        //обязательно длолжно соблюдаться правило,
        //если х.equals(y)== true
        //то x.hashCode() == y.hashCode == true
        //но это не тождественно правилу
        //x.hashCode == y.hashCode == true, то и
        //если х.equals(y) должен возвращать true
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        //информация об объекте
        System.out.println(user1.getClass());

        //выводит строку String
        System.out.println(user1.toString());


        //пример работы фабричного класса
        new UserFactory()
                .signIn("some@mail.ru")
                .sendMessage("hello")
                .deactivate()
                .sendMessage("How are you")
                .activate()
                .signOut();
    }
}
