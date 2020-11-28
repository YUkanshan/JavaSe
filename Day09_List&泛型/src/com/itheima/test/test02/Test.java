package com.itheima.test.test02;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<String>set = new LinkedHashSet<>();
        set.add("Java");
        set.add("C");
        set.add("Pyhton");
        set.add("Visual Basic.NET");
       set.add("JavaScript");
        for (String s:set){
            System.out.println(s);
        }
    }
}
