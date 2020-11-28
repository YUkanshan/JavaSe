package com.itheima.work.work06;

public class Test {
    public static void main(String[] args) {
        String st = "23,24,25";
        String[] sts = st.split(",");
        int sum = 0;
        for (int i = 0; i < sts.length; i++) {
            sum += Integer.parseInt(sts[i]);
        }
        //求平均数
        int ave = sum/(sts.length);
        System.out.println("平均数为:" + ave);
    }
}
