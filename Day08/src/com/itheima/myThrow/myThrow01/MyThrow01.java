package com.itheima.myThrow.myThrow01;

public class MyThrow01 {
    public static void main(String[] args) {
        int[] arr = null;
        try {
            printArr(arr);
        } catch (Exception e) {
            System.out.println("我是Exception异常,什么我都能收下");
        }
    }

    private static void printArr(int[] arr) throws NullPointerException {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
