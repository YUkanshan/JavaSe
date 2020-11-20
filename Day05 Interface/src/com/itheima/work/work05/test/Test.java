package com.itheima.work.work05.test;

import com.itheima.work.work05.domain.Animal;
import com.itheima.work.work05.domain.Dog;

public class Test {
    public static void main(String[] args) {
        // 请在此处调用method方法
        method(new Dog());

    }

    public static void method(Animal a) {
        a.eat();
        if (a instanceof Dog) {
            ((Dog) a).watchHome();
        }
    }
}
