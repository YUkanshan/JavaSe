package com.itheima.treeSet.test;

import com.itheima.treeSet.domain.Student;

import java.util.Collections;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student>treeSet = new TreeSet<>();
        Student wuyanzu = new Student("wuyanzu",90,80,80);
        Student pengyuy =new Student("pengyuyan",100,70,90);
        Student liudehua = new Student("liudehua",99,78,80);
        Student madehua = new Student("liudehua",99,78,80);
        Collections.addAll(treeSet,wuyanzu,pengyuy,liudehua,madehua);
        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
