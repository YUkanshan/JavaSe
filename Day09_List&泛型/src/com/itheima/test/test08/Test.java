package com.itheima.test.test08;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // 1. 创建集合对象
        // [ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap ]
        ArrayList<String> c = new ArrayList<>();
        // 2. 添加元素到集合中
        Collections.addAll(c, "hehe", "haha", "heihei", "gege", "gaga");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
           String s =  iterator.next();
            System.out.println(s);
        }
    }
}