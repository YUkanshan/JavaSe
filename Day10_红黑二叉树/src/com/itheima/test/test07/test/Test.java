package com.itheima.test.test07.test;

import java.util.Random;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random r = new Random();
        while (treeSet.size()<6){
         int num = r.nextInt(33)+1;
            treeSet.add(num);
        }
        System.out.print("双色球号码为:");
        for (Integer integer : treeSet) {
            System.out.print(integer);
        }
       int num =  r.nextInt(16)+1;
        System.out.print(num);
    }
}
