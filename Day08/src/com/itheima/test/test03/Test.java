package com.itheima.test.test03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
           String st = it.next();
           if (st.equals("aaa")){
               it.remove();
           }
        }
        list.add(0,"aaa");
        System.out.println(list);
    }
}
