package com.itheima.test.test10;

import java.util.HashMap;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        HashMap<String,String >hashMap=new HashMap<>();
        hashMap.put("姓名","张三");
        hashMap.put("年龄","20");
        hashMap.put("性别","男");
        hashMap.put("地址","北京海定区");
        hashMap.put("专业","java");
      String DiZhi= find(hashMap);
        System.out.println("包含所有学员信息");
        System.out.print("地址信息为: "+hashMap.get(DiZhi)+" ");
        hashMap.put("地址","北京顺义区");
        String newDiZhi=find(hashMap);
        System.out.println("修改过的地址为:" + hashMap.get(newDiZhi));
        System.out.println("修改过后的信息为");
        Set<String>key=hashMap.keySet();
        for (String s : key) {
            System.out.println(s + "---" + hashMap.get(s));
        }
    }
    public static String find(HashMap<String ,String >hashMap){
        String DiZhi=null;
        Set<String > key =  hashMap.keySet();
        for (String s : key) {
            if (s.equals("地址")){
               DiZhi = s;
            }
        }
        return DiZhi;
    }
}
