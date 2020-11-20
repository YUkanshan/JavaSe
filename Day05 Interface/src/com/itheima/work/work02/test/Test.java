package com.itheima.work.work02.test;

import com.itheima.work.work02.domain.Person;
import com.itheima.work.work02.domain.SuperPerson;
public class Test {
    public static void main(String[] args) {
        Person per = new SuperPerson();
        per.eat();
        per.work();
        SuperPerson sup = (SuperPerson)per;
        sup.save();
    }
}
