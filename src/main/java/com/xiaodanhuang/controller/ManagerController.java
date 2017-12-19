package com.xiaodanhuang.controller;
import com.xiaodanhuang.entity.Teacher;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Student;
import com.xiaodanhuang.service.DbManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ManagerController {
    @Autowired
    DbManage dbManage;

    @RequestMapping("api/manageByCourse")
    @ResponseBody
    public List<Course> manageByCourse() {
        List<Course> courseList = dbManage.manageByCourse();
        return courseList;
    }

    @RequestMapping("api/manageByTeacher")
    @ResponseBody
    public List<Teacher> manageTeacher() {
        List<Teacher> teacherList = dbManage.manageTeacher();
        return teacherList;
    }

    @RequestMapping("api/manageByStudent")
    @ResponseBody
    public List<Student> manageByStudent() {
        List<Student> studentList = dbManage.manageStudent();
        return studentList;
    }

    @RequestMapping("api/manageCourseDelete")
    @ResponseBody
    public  List<Course> manage(int id){
        int courseNum=dbManage.manageCourseDelete(id);
        List<Course> courseList = dbManage.manageByCourse();
        return courseList;

    }

    @RequestMapping("api/manageTeacherDelete")
    @ResponseBody
    public List<Teacher> manageTeacherDel(int id){
       int teacherNum=dbManage.manageTeacherDelete(id);
        List<Teacher> teacherList = dbManage.manageTeacher();
        return teacherList;

    }

    @RequestMapping("api/manageStudentDelete")
    @ResponseBody
    public List<Student> manageStudentDel(int id){
        int stuNum=dbManage.manageStudentDelete(id);
        List<Student> studentList = dbManage.manageStudent();
        return  studentList;

    }
    @RequestMapping("api/manageCourseUpdate")
    @ResponseBody
    public List<Course> manageCourseUpdate(int id, String courseName,String category, int teacherNum, String courseTeacher, String courseTime)
    {
        int courseNum=dbManage.manageCourseUpdate(id,courseName,category,teacherNum,courseTeacher,courseTime);
        List<Course> courseList = dbManage.manageByCourse();
        return  courseList;
    }
    @RequestMapping("api/manageTeacherUpdate")
    @ResponseBody
    public List<Teacher> manageTeacherUpdate(int id, String username, String time)
    {
        int courseNum=dbManage.manageTeacherUpdate(id,username,time);
        List<Teacher> teacherList = dbManage.manageTeacher();
        return teacherList;

    }
    @RequestMapping("api/manageStudentUpdate")
    @ResponseBody
    public List<Student> manageStudentUpdate(int id, String username, String time)
    {
        int courseNum=dbManage.manageStudentUpdate(id,username,time);
        List<Student> studentList = dbManage.manageStudent();
        return  studentList;

    }
    @RequestMapping("api/manageCourseAdd")
    @ResponseBody
    public List<Course> manageCoursAdd(int id, String courseName,String category, int teacherNum, String courseTeacher, String courseTime)
    {
        int courseNum=dbManage.manageCourseAdd(id,courseName,category,teacherNum,courseTeacher,courseTime);
        List<Course> courseList = dbManage.manageByCourse();
        return  courseList;
    }
    @RequestMapping("api/manageTeacherAdd")
    @ResponseBody
    public List<Teacher> manageTeacherAdd(int id, String username, String time)
    {
        int courseNum=dbManage.manageTeacherAdd(id,username,time);
        List<Teacher> teacherList = dbManage.manageTeacher();
        return teacherList;

    }
    @RequestMapping("api/manageStudentAdd")
    @ResponseBody
    public List<Student> manageStudentAdd(int id, String username, String schoolTime)
    {
        int courseNum=dbManage.manageStudentAdd(id,username,schoolTime);
        List<Student> studentList = dbManage.manageStudent();
        return  studentList;

    }
}