package com.itheima.test.test04.test;

import com.itheima.test.test04.domain.Book;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Book> hashSet = new HashSet<>();
        Book HongLouMeng = new Book("HongLouMeng", "CaoXueQin", 40);
        Book ShuiHuZhuan = new Book("ShuiHuZhuan", "ShiNaiAn", 50);
        Book XiYouJi = new Book("XiYouJi", "LiuLaoShi", 35);
        Book JiaDe = new Book("XiYouJi", "LiuLaoShi", 35);
        Collections.addAll(hashSet,HongLouMeng,ShuiHuZhuan,XiYouJi);
        for (Book book : hashSet) {
            System.out.println(book);
        }
    }
}
