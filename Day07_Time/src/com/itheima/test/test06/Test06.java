package com.itheima.test.test06;

import java.util.Calendar;

public class Test06 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2018,1,1);
        c.add(Calendar.DAY_OF_MONTH,100);
        System.out.println("100天后的时间为:" + c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH)+1) + "月" + c.get(Calendar.DAY_OF_MONTH) + "号");
    }
}
