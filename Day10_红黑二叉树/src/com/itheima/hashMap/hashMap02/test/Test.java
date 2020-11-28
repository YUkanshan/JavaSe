package com.itheima.hashMap.hashMap02.test;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String,String >hashMap=new HashMap();
        hashMap.put("迪丽热巴","马尔扎哈");
        hashMap.put("迪丽热巴","马尔扎哈");
        hashMap.put("卡特琳娜","古力娜扎");
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            String value = hashMap.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
