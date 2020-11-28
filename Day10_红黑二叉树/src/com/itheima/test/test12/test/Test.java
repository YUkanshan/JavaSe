package com.itheima.test.test12.test;

import com.itheima.test.test05.test.style01.domain.Student;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Student,String >hashMap = new HashMap<>();
        hashMap.put(new Student("小红", 20), "北京海淀");
        hashMap.put(new Student("小绿", 21), "北京昌平");
        hashMap.put(new Student("小蓝", 23), "北京顺义");
        hashMap.put(new Student("小黄", 22), "北京朝阳");
        hashMap.put(new Student("小白", 25), "北京大兴");
        Set<Student>mykey = hashMap.keySet();
        for (Student key : mykey) {
            System.out.println(key + "---" + hashMap.get(key));
        }

    }
}
