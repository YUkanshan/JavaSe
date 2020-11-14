package com.itheima.edu.info.manager.domain;

public class Teacher {

    private String name;
    private String age;
    private String id;
    private String brithday;

    public Teacher() {
    }



    public Teacher(String id, String name, String age, String brithday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.brithday = brithday;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }
}

