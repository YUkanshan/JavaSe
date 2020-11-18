package com.itheima.myInterface01.domain;

public class Student implements English,Japanese{
    @Override
    public void speakEnglish(){
        System.out.println("学生学会了说英语");
    }
    @Override
    public void speakJapanese(){
        System.out.println("学生又学会了说家乡话");
    }
}
