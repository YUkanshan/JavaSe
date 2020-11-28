package com.itheima.test.test9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String,String>hashMap=new HashMap<>();
        hashMap.put("Kevin","python");
        hashMap.put("Tom","java");
        hashMap.put("Lucy","php");
        hashMap.put("Lucy","php");
        hashMap.put("Lily","c++");
        //第一种遍历
      Set<String>allKey= hashMap.keySet();
        for (String key : allKey) {
            String value = hashMap.get(key);
            System.out.println(key+"---"+value);
        }
        //第二种遍历
        Set<Map.Entry<String ,String >>allKeyandValue=hashMap.entrySet();
        for (Map.Entry<String, String> entry : allKeyandValue) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
        //第三种遍历
        hashMap.forEach((key,value)->{ System.out.println(key + "---" + value); });

    }
}
