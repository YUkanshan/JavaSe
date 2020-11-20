package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    //创建TeacherDao对象
    private TeacherDao dao = new TeacherDao();

    public boolean isExist(String id) {
        //从dao层拿到全部数据,使用findAllTeacher()方法
        Teacher[] allTeacher = dao.findAllTeacher();
        //拿到全部数据后进行判断
        boolean exist = false;
        for (int i = 0; i < allTeacher.length; i++) {
            //为了避免空指针异常应该对数组元素是否为null进行校验
            if (allTeacher[i] != null && id.equals(allTeacher[i].getId())) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    //添加老师方法
    public boolean addTeacher(Teacher teacher) {
        //将老师对象传输到dao层
        boolean result = dao.addTeacher(teacher);
        return result;
    }

    //老师查询方法
    public Teacher[] findAllTeacher() {
        Teacher[] allTeacher = dao.findAllTeacher();
        //标记为思想,判断数组内元素是否全部为null
        boolean flag = false;
        //遍历返回的数组判断数组内元素是否为null
        for (int i = 0; i < allTeacher.length; i++) {
            if (allTeacher[i] != null) {
                flag = true;
                break;
            }
        }
        //根据标记返回不同的结果
        if (flag) {
            //数组内有不为null的元素,返回数组地址
            return allTeacher;
        } else {
            //数组内元素全部为null,返回null
            return null;
        }
    }

    public void deleteTeacherById(String id) {
        dao.deleteTeacherById(id);
    }

    public void updateTeacher(String updateId, Teacher teacher) {
        //传递数据给dao层
        dao.updateStudent(updateId, teacher);
    }
}
