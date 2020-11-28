package com.itheima.hashSet.hashSet01.test;

import com.itheima.hashSet.hashSet01.domain.Student;

import java.util.Collections;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        Student wuyanzu = new Student("wuyanzu", 20);
        Student WuXiaoYu = new Student("wuyanzu", 20);
        Student pengyuy = new Student("pengyuyan", 30);
        Student liudehua = new Student("liudehua", 40);
        Collections.addAll(hashSet, wuyanzu, pengyuy, liudehua, WuXiaoYu);
        for (Student student : hashSet) {
            System.out.println(student);
        }

    }
}

