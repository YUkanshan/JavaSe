package com.itheima.test.test08.test;

import javafx.scene.chart.Chart;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> hashSet = new TreeSet<>(
                (Integer o2, Integer o1) -> {
                    int result = o2 - o1;
                    result = result == 0 ? 1 : result;
                    return result;
                }
        );
        String st = "90 -7 0 18 2 0 2 2 45 4";
        String[] arr = st.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            hashSet.add(num);
        }
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }
    }
}
