package com.itheima.work.work02.domain;

public class Person {
    private String name;
    private int age;
    /*
        请补充代码！
    */
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //重写toString方法

    @Override
    public String toString() {
        return  name + "..." + age ;
    }
}
