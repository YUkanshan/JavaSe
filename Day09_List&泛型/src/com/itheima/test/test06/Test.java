package com.itheima.test.test06;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        String str = "90 -7 0 18 2 0 2 2 45 4";
        String[] strings = str.split(" ");
        TreeSet<Integer> treeSet = new TreeSet<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        int result = o2 - 01;
                        return result == 0 ? 1 : result;
                    }
                }
        );
        for (int i = 0; i < strings.length; i++) {
        treeSet.add(Integer.parseInt( strings[i]));
        }
        for (Integer i:treeSet){
            System.out.print(i+" ");
        }
    }
}
