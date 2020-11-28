package com.itheima.mybinarysearch;
//通过二分法查找数
public class MyBinarySearchDemo {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66};
        int number=55;
        int index = binarySearchForIndex(arr,number);
        System.out.println(index);
    }
    public static int binarySearchForIndex(int[] arr,int number){
        int min = 0;
        int max = arr.length-1;
        //循环查找min<=max;
        while (min<=max){
            //找出中间位置mid
            int mid=(min+max)>>1;
            //mid指向的元素>number
            if(arr[mid]>number){
                //中间数大于查找数,说明查找数在左边
                max = mid-1;
            }else if (arr[mid]<number){
                //中间数小于查找数,说明查找数在右边
                min = mid+1;
            }else {
                return mid;//最后一种情况,也就是中间数等于查找数
            }
        }
        return -1;
    }
}
