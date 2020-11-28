package com.itheima.test.test01;

public class Test {
    public static void main(String[] args) {
        try{
            String[] arr={"abc","bbc","ccc"};
            System.out.println(arr[10]);
            arr = null;
            System.out.println(arr[0]);
        }catch (NullPointerException nu){
            System.out.println("捕获空指针异常");
        }catch (ArrayIndexOutOfBoundsException ao){
            System.out.println("捕获数组索引越界异常");
        }
    }
}
