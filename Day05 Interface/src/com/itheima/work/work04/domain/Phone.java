package com.itheima.work.work04.domain;

public class Phone {
    private String brand;
    private int price;
    private final int size=6;

    //构造方法
    public Phone() {

    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    //get set
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    //定义方法
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void playGame() {
        System.out.println("打游戏");
    }
}
