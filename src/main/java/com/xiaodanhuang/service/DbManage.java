package com.xiaodanhuang.service;
import com.xiaodanhuang.entity.Teacher;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Student;
import java.util.List;


public interface DbManage {
    //管理员课程增加
    int manageCourseAdd(
            int id,
            String courseName,
            String category,
            int teacherNum,
            String courseTeacher,
            String courseTime

    );
    //管理员课程删除
    int manageCourseDelete(int id);
    //管理员课程更改
    int manageCourseUpdate(
            int id,
            String courseName,
            String category,
            int teacherNum,
            String courseTeacher,
            String courseTime
    );
    //管理员显示课程列表
    List<Course>  manageByCourse();
    //管理员教师资源增加
    int manageTeacherAdd(
            int id,
            String username,
            String time

    );
    //管理员教师资源删除
    int manageTeacherDelete(int id);
    //管理员教师资源更改
    int manageTeacherUpdate(
            int id,
            String username,
            String time

    );
    //管理员教师资源显示
    List<Teacher> manageTeacher();
    //管理员学生资源增加
    int manageStudentAdd(
            int id,
            String username,
            String schoolTime

    );
    //管理员学生资源删除
    int manageStudentDelete(int id);
    //管理员学生资源更改
    int manageStudentUpdate(
            int id,
            String username,
            String schoolTime

    );
    //管理员学生资源显示
    List<Student> manageStudent();

}
