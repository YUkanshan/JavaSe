package com.itheima.polymorpic.polymorpic02.test;

import com.itheima.polymorpic.polymorpic02.domain.Animal;
import com.itheima.polymorpic.polymorpic02.domain.Dog;

public class Test {
    public static void main(String[] args) {
        show(new Dog());
    }
    public static void show(Animal an){
        an.eat();
        if(an instanceof Dog){
            Dog dog = (Dog)an;
        }
    }
}
