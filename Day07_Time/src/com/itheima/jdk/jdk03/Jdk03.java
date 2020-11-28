package com.itheima.jdk.jdk03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Jdk03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要查询的年份");
        int year = sc.nextInt();
        LocalDateTime localDateTime = LocalDateTime.of(year, 3, 1, 0, 0);
        //将键盘输入的字符串形式解析为LocaDateTime形式
        LocalDateTime newLocalDateTime = localDateTime.plusDays(-1);
        int daysNum = newLocalDateTime.getDayOfMonth();
        System.out.println(daysNum);
    }
}
