package com.itheima.test.test06;

import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串");
        String st=sc.next();
       LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            set.add(ch);
        }
        for (Character character : set) {
            System.out.print(character);
        }

    }
}
