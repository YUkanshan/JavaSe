package com.itheima.collection.collection01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {
    public static void main(String[] args) {
        Collection<String>list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("1");
        Iterator<String > iterator = list.iterator();
       list.removeIf(String::isEmpty);
    }
}
