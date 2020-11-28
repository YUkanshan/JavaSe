package com.itheima.test.test02;

import java.util.Collections;
import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>();
        Collections.addAll(hashSet,"itheima", "chinaunix", "itpub", "csdn", "51cto", "iteye");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
