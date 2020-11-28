package com.itheima.set.set02.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("123");
        list.add("1234");
        list.add("12345");
        list.add("654123");
        list.add("45678123");
        list.add("1112222333444");
        list.add("555555");
        Iterator<String > iterator= list.iterator();
        while (iterator.hasNext()){
            String st = iterator.next();
            if (st.length()>10||st.length()<5){
                iterator.remove();
            }
        }
        for (String s:list){
            System.out.println(s);
        }
    }
}

