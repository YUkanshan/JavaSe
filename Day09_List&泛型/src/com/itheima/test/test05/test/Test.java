package com.itheima.test.test05.test;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        //放入红球
        while (treeSet.size()!=6){
            String  s = String .valueOf((int)(Math.random()*33+1));
            treeSet.add(s);
        }
        for (String s:treeSet){
            System.out.println(s);
        }
        int num = (int) (Math.random() * 16 + 1);
    //放入一个蓝球
        System.out.println(num);
    }
}
