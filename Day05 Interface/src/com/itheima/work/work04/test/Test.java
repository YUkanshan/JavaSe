package com.itheima.work.work04.test;

import com.itheima.work.work04.domain.Person;

public class Test {
    public static void main(String[] args) {
        Person p = getInstance();
        p.eat();
    }

    private static Person getInstance() {
        // 请补齐代码，使得编译通过，并在控制台输出(吃饭)
        Person p =new Person();
        return p;
    }

}