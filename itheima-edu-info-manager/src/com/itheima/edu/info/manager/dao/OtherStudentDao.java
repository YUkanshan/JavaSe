package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {
    //创建长度为5的学生数组
    private static ArrayList<Student>students=new ArrayList<Student>();

//运用静态代码块,先在数组前面塞两个学生对线
    static {
    Student stu1 =new Student("heima001","吴彦祖","23","1998");
    Student stu2 = new Student("heima002","彭于晏","24","1997");
        students.add(stu1);
        students.add(stu2);
    }

    //添加学生方法
    public boolean addStudent(Student stu) {
        students.add(stu);
        return true;
    }

    //删除学生方法
    public void deleteStudentById(String id) {
        //传输到dao的数据已经经过校验
        //获得id所在的索引
        int index = getIndexById(id);
        //删除索引处的元素
        students.remove(index);
    }

    //修改学生方法
    public void updateStudentById(String id, Student student) {
        //isExist方法已判断过学号问题,无需再次判断,数据可以传输到dao学号一定存在
        //找出id所对应的数组索引
        int index = getIndexById(id);
        //修改索引处学生对象
        students.set(index,student);
    }

    //返回所有学生数据方法
    public Student[] findAllStudent() {
        Student[] arr = new Student[students.size()];
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            arr[i]=stu;
        }
        return arr;
    }

    //获得指定学号所对应的学生所在的数组的索引的方法
    public int getIndexById(String id) {
        int index = -1;
        //遍历数组
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && id.equals((students.get(i)).getId())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
