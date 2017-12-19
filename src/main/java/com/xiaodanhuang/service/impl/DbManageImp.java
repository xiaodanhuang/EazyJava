package com.xiaodanhuang.service.impl;
import com.xiaodanhuang.dao.ManageDao;
import com.xiaodanhuang.entity.Teacher;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Student;
import com.xiaodanhuang.service.DbManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbManageImp implements DbManage {
    @Autowired
    private ManageDao manageDao;
    //管理员课程增加
    public int manageCourseAdd(
            int id,
            String courseName,
            String category,
            int teacherNum,
            String courseTeacher,
            String courseTime

    ){
        return manageDao.manageCourseAdd(
                id,
                courseName,
                category,
                teacherNum,
                courseTeacher,
                courseTime);
    }
    //管理员课程删除
    public  int   manageCourseDelete(int id){

                return manageDao.manageCourseDelete(id);
    }
    //管理员课程更改
    public int manageCourseUpdate(
            int id,
            String courseName,
            String category,
            int teacherNum,
            String courseTeacher,
            String courseTime
    ){
        return manageDao.manageCourseUpdate(
                id,
                courseName,
                category,
                teacherNum,
                courseTeacher,
                courseTime);
    }
    //管理员显示课程列表
    public List<Course> manageByCourse(){

        return manageDao.manageByCourse();
    }
    //管理员教师资源增加
    public int manageTeacherAdd(
            int id,
            String username,
            String time

    ){
        return manageDao.manageTeacherAdd(id,username,time);
    }
    //管理员教师资源删除
    public  int   manageTeacherDelete(int id){
        return manageDao.manageTeacherDelete(id);
    }
    //管理员教师资源修改
    public int manageTeacherUpdate(
            int id,
            String username,
            String time

    ){
        return manageDao.manageTeacherUpdate(id,username,time);
    }
    //管理员教师资源显示
    public List<Teacher> manageTeacher(){

        return manageDao.manageTeacher();
    }
    //管理员学生资源添加
    public int manageStudentAdd(
            int id,
            String username,
            String schoolTime

    ){
        return manageDao.manageStudentAdd(id,username,schoolTime);
    }
    //管理员学生资源删除
    public  int   manageStudentDelete(int id){
        return manageDao.manageStudentDelete(id);
    }
    //管理员学生资源修改
    public int manageStudentUpdate(
            int id,
            String username,
            String schoolTime

    ){
        return manageDao.manageStudentUpdate(id,username,schoolTime);
    }
    //管理员学生资源显示
    public List<Student> manageStudent(){

        return manageDao.manageStudent();
    }


}
