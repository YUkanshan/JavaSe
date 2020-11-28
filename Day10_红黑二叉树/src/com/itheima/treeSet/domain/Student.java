package com.itheima.treeSet.domain;

public class Student implements Comparable<Student> {
    private String name;
    private int Chinese;
    private int Math;
    private int English;

    public Student() {

    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getTotal() {
        return Chinese + English + Math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = o.getTotal() - this.getTotal();
        result = result == 0 ? o.Chinese - this.Chinese : result;
        result = result == 0 ? o.English - this.English : result;
        result=result==0?o.name.compareTo(this.name):result;
        return result;
    }
}
