package com.itheima.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        char[] ch = {'3','2','4','5','1',};
        Arrays.sort(ch);
       int index= Arrays.binarySearch(ch,'3');
        System.out.println(index);
        System.out.println(Arrays.toString(ch));
    }
}
