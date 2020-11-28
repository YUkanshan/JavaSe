package com.itheima.bigDecimal.bigDecimal02;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyBigDecimal {
    public static void main(String[] args) {
        BigDecimal bd01 = new BigDecimal("3,98");
        BigDecimal bd02 = new BigDecimal("6.74");
        System.out.println(bd01.divide(bd02, 4, RoundingMode.HALF_UP));
    }
}
