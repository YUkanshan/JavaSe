package com.itheima.jdk.jdk01;

import java.time.LocalDateTime;

public class Jdk01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("展现当前时间:" + now);
        LocalDateTime newTime = LocalDateTime.of(2020,11,23,15,32);
        System.out.println("展现我定义的时间"+newTime);
    }
}
