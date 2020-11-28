package com.itheima.test.test01;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String>hashSet = new HashSet<>();
        Collections.addAll(hashSet,"aaa","bbb","ccc","ddd");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
