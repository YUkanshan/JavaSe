package com.itheima.edu.info.manager.domain;

public class Student {
    private  String id;
    private  String name;
    private String age;
    private String brithday;
    //有参无参构造
    public Student(){

    }

    public Student(String id, String name, String age, String brithday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.brithday = brithday;
    }
//get set封装
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }
}
