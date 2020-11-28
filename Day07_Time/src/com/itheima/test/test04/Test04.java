package com.itheima.test.test04;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      lo:  while (true) {
            System.out.println("请选择主题:11.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
            int result = sc.nextInt();
            switch (result) {
                case 1:
                    style1();
                    break;
                case 2:
                    style2();
                    break;
                case 3:
                    style3();
                    break;
                default:
                    System.out.println("很抱歉,操作有误,已为您切换回默认主题");
                    style1();
                    break lo;
            }
        }
    }
    //主题一
   public static void style1(){
        Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
       String string = sdf.format(date);
       System.out.println(string);
   }
   //主题2
   public static void style2(){
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       String string = sdf.format(date);
       System.out.println(string);
   }
   //主题3
   public static void style3(){
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
       String string = sdf.format(date);
       System.out.println(string);
   }
}
