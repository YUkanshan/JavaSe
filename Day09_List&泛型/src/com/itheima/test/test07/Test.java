package com.itheima.test.test07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // 1. 创建集合对象
        // [ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap ]
        Collection<String> c = new ArrayList<>();
        // 2. 添加元素到集合中
        Collections.addAll(c, "ArrayList", "LinkedList", "HashSet", "TreeSet", "HashMap", "TreeMap");

        // 3. 打印并显示集合元素
        for (String st : c) {
            System.out.println(st);
        }
    }
}
