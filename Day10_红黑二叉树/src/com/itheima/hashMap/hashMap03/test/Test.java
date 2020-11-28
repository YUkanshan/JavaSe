package com.itheima.hashMap.hashMap03.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String ,String>hashMap = new HashMap<>();
        hashMap.put("迪丽热巴","马儿扎哈");
        hashMap.put("李小璐","PG1");
        hashMap.put("李瓶儿","韩春梅");
       Set<Map.Entry<String,String>> entries= hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
