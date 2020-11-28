package com.itheima.mySystem.mySystem01;

public class test01 {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        int[] j = new int[5];
        System.arraycopy(i,0,j,0,5);
        for (int i1 = 0; i1 < j.length; i1++) {
            System.out.print(j[i1]);
        }
    }
}
