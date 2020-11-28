package com.itheima.hashMap.hashMap04.test;

import com.itheima.hashMap.hashMap04.domain.Student;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Student,Integer >hashMap=new HashMap<>();
        Student wuyanzu = new Student("wuyanzu",23);
        Student pengyuyan = new Student("pengyuyan",34);
        Student JiaDe = new Student("pengyuyan",34);
        hashMap.put(wuyanzu,23);
        hashMap.put(pengyuyan,23);
        hashMap.put(JiaDe,34);
        hashMap.forEach((Student student,Integer value)-> System.out.println(student+" "+value)

        );
    }
}
