package com.itheima.mystatic.domain;

public class Student {
    private static String school ="清华带学";
    private String name;
    private String id;
    private String age;
public Student(){

}
    public Student(String name, String id, String age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void show(){
        System.out.println(school);
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.age);
    }
}
