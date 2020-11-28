package com.itheima.date.date02;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date02 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请按照该格式输入您的年龄,如:1998/05/28");
        String brith = sc.next();
        //创建一个格式转换器
        SimpleDateFormat brithday = new SimpleDateFormat("yyyy/MM/dd");
        //将键盘接受的生日用转换器返回成日期格式
        Date brithDate = brithday.parse(brith);
        //设置一个原点日期
        Date nowDate = new Date();
        //接受出生日期的Long数据类型值
      Long myBrith = brithDate.getTime();
      //接受原点的Long数据类型值
      Long now = nowDate.getTime();
      //进行处理运算
      Long years = (now - myBrith)/(3600*24*1000*365L);
        System.out.println(years);
    }
}