package com.itheima.collection.collection02;

import java.util.ArrayList;
import java.util.Arrays;

public class MyCollection02 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
