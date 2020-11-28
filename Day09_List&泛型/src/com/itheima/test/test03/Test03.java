package com.itheima.test.test03;

import java.util.TreeSet;

public class Test03 {
    public static void main(String[] args) {
        TreeSet<String>stringTreeSet=new TreeSet<>();
        stringTreeSet.add("itheima");
        stringTreeSet.add("chinaunix");
        stringTreeSet.add("itpub");
        stringTreeSet.add("csdn");
        stringTreeSet.add("51cto");
        stringTreeSet.add("iteye");
        for (String s:stringTreeSet){
            System.out.println(s);
        }
    }
}
