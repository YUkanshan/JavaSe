package com.itheima.test.test02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        String st = "2008-08-08";
        SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
        Date date = pattern.parse(st);
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
