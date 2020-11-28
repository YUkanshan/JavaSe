package com.itheima.test.test13.test;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String st = "wo ai heima wo ai java wo yao hao hao xue xi java";
        String[] stu = st.split(" ");
        HashMap<String,Integer>hashMap = new HashMap<>();
        for (String s : stu) {
            hashMap.put(s,hashMap.containsKey(s)?hashMap.get(s)+1:1);
        }
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.print(s+"("+hashMap.get(s)+")");
        }

    }
}
