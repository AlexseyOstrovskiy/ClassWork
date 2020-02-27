package com.company;

public class User {
    //свойства usera
    private String name;
    private int age;

    //геттер & сеттер
    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getAge () {
        return this.age;
    }
    public void setAge (int age) {
        if (age < 0 || age > 120) {
            System.out.println("Недопустимое значение");
        } else {
            this.age = age;
        }
    }



























        //переопределяем метод equals
    @Override
    public boolean equals(Object obj) {
        //явно преобразуем obj к типу  User
        //если явно преобразовать не возможно, то
        //в результате преобразования мы получим значение
        //null
        User user = (User)obj;

        return  this.age == user.age &&
                this.name.equals(user.name);
    }

    @Override
    public int hashCode() {
        if (this.age > 18) {
            return 1;
        }
        return 2;
    }
    @Override
    public String toString() {
        return this.name;
    }

}
