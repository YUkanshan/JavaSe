package com.itheima.test.test11.test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1930", "乌拉圭");
        hashMap.put("1934", "意大利");
        hashMap.put("1938", "意大利");
        hashMap.put("1950", "乌拉圭");
        hashMap.put("1954", "西德");
        hashMap.put("1958", "巴西");
        hashMap.put("1962", "巴西");
        hashMap.put("1966", "英格兰");
        hashMap.put("1970", "巴西");
        hashMap.put("1974", "西得");
        hashMap.put("1978", "阿根廷");
        hashMap.put("1982", "意大利");
        hashMap.put("1986", "阿根廷");
        hashMap.put("1990", "西得");
        hashMap.put("1994", "巴西");
        hashMap.put("1998", "法国");
        hashMap.put("2002", "巴西");
        hashMap.put("2006", "意大利");
        hashMap.put("2010", "西班牙");
        hashMap.put("2014", "德国");
        hashMap.put("2018", "法国");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        String year = sc.next();
        Set<String> key = hashMap.keySet();
       lo: if (hashMap.containsKey(year)) {
            for (String s : key) {
                if (s.equals(year)) {
                    System.out.println(year + "年获得冠军的国家是:" + hashMap.get(s));
                    break lo;
                }
            }
        } else {
            System.out.println("对不起" + year + "年没有举办世界杯");
           break lo;
        }
        System.out.println("请输入国家");
        String country = sc.next();


        if (hashMap.containsValue(country)) {
            System.out.println(country + "获得冠军的年份为");
            for (String s : key) {
                if (s.equals(country)) {
                    System.out.println(hashMap.get(s));
                }
            }
        } else {
            System.out.println("对不起" + country + "没有获得过冠军,甚至连你妈叙利亚都打不过");
        }
    }
}
