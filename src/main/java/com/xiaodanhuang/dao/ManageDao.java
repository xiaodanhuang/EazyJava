package com.xiaodanhuang.dao;
import com.xiaodanhuang.entity.Teacher;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ManageDao {
    //管理员课程增加
    int manageCourseAdd(
            @Param("id")int id,
            @Param("courseName")String courseName,
            @Param("category")  String category,
            @Param("teacherNum") int  teacherNum,
            @Param("courseTeacher") String courseTeacher,
            @Param("courseTime") String courseTime
    );
    //管理员课程删除
    int manageCourseDelete(@Param("id")int id);
    //管理员课程更改
    int manageCourseUpdate(
            @Param("id")int id,
            @Param("courseName")String courseName,
            @Param("category")  String category,
            @Param("teacherNum") int  teacherNum,
            @Param("courseTeacher") String courseTeacher,
            @Param("courseTime") String courseTime
    );
    //管理员显示课程列表
    List<Course>  manageByCourse();
    //管理员教师资源增加
    int manageTeacherAdd(
            @Param("id")int id,
            @Param("username")String username,
            @Param("time") String time
    );
    //管理员教师资源删除
    int manageTeacherDelete(@Param("id")int id);
    //管理员教师资源更改
    int manageTeacherUpdate(
            @Param("id")int id,
            @Param("username")String username,
            @Param("time") String time

    );
    //管理员教师资源显示
    List<Teacher> manageTeacher();
    //管理员学生资源增加
    int manageStudentAdd(
            @Param("id")int id,
            @Param("username")String username,
            @Param("schoolTime") String schoolTime

    );
    //管理员学生资源删除
    int manageStudentDelete(@Param("id")int id);
    //管理员教师资源更改
    int manageStudentUpdate(
            @Param("id")int id,
            @Param("username")String username,
            @Param("schoolTime") String schoolTime

    );
    //管理员教师资源显示
    List<Student> manageStudent();

}
