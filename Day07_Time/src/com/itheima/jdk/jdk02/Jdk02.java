package com.itheima.jdk.jdk02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Jdk02 {
    public static void main(String[] args) {
        LocalDate time = LocalDate.of(2020,11,23);
        DayOfWeek dayOfWeek = time.getDayOfWeek();
        int week = dayOfWeek.getValue();
        System.out.println(week);
    }
}
