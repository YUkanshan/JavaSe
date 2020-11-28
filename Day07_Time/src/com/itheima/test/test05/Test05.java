package com.itheima.test.test05;

import java.util.Calendar;

public class Test05 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        //获取年份
       int year =  c.get(Calendar.YEAR);
        //获取月数
        int mouth =  c.get(Calendar.MONTH);
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("获取到的年数为:" + year);
        System.out.println("获取到的月份为:" + mouth);
        System.out.println("获取到的天数为:" + day);
    }
}
