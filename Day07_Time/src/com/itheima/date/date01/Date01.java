package com.itheima.date.date01;

import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        Date date = new Date();
        Long time = date.getTime();
        time -= (24 * 60 * 60 * 365 * 10000L);
        Date newDate = new Date(time);
        System.out.println(newDate);
    }
}
