package com.company;

import java.util.List;

public class Author {
    private String name;
    private  short age;
    List<Author> authors;

    Author(String name, short age){
        name = this.name;
        age = this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
