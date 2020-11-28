package com.itheima.set.set01;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("aaa");
        stringSet.add("bbb");
        stringSet.add("bbb");
        stringSet.add("ccc");
        System.out.println(stringSet.toArray());
        Iterator<String >iterator = stringSet.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            System.out.println(s);
        }
    }
}
