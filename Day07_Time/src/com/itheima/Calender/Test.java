package com.itheima.Calender;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("默认时间为" + c);
        c.set(2020,11,23);
        System.out.println("年份为:" + (c.get(Calendar.YEAR)));
        System.out.println("月份为:" + (c.get(Calendar.MONTH)));
        System.out.println("日子为:" + c.get(Calendar.DAY_OF_MONTH));
    }
}
