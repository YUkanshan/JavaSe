package com.itheima.test.test01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        //第一种方法
        Date date = new Date();
        SimpleDateFormat pattern = new SimpleDateFormat("yyyy年MM月dd日");
        String time =pattern.format(date);
        System.out.println(time);
        //第二种方法
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter patternLocal = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String timeLocal = patternLocal.format(dateTime);
        System.out.println(timeLocal);
        //第三种方法
        Calendar ctime = Calendar.getInstance();
        System.out.println(ctime.get(Calendar.YEAR) + "年" + ctime.get(Calendar.MONTH) + "月" + ctime.get(Calendar.DAY_OF_MONTH) + "日");
    }
}
