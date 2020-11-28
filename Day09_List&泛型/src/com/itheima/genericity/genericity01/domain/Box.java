package com.itheima.genericity.genericity01.domain;

public class Box<E> {
    private E name;
    private E age;
    public Box(){

    }

    public Box(E name, E age) {
        this.name = name;
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }
}
