package com.xiaodanhuang.controller;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Guest;
import com.xiaodanhuang.entity.QueryComment;
import com.xiaodanhuang.entity.homework;
import com.xiaodanhuang.service.DbStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
public class StuController {
    @Autowired
    DbStudent dbStudent;
    @RequestMapping("api/stuByCourse")
    @ResponseBody
    public List<Course> stuByCourse() {
        List<Course> courseList = dbStudent.stuCourse();
        return courseList;
    }
    @RequestMapping("api/stuMyCourse")
    @ResponseBody
    public List<Course> stuMyCourse(int stuId) {
        List<Course> courseList = dbStudent.stuMyCourse(stuId);
        return courseList;
    }
    @RequestMapping("api/stuCourseByTime")
    @ResponseBody
    public List<Course> stuCourseByTime() {
        List<Course> courseList = dbStudent.stuCourseByTime();
        return courseList;
    }
    @RequestMapping("api/stuCourseByStu")
    @ResponseBody
    public List<Course> stuCourseByStu() {
        List<Course> courseList = dbStudent.stuCourseByStu();
        return courseList;
    }
    //搜索课程的评论
    @RequestMapping("api/stuCourseByComment")
    @ResponseBody
    public  List<QueryComment>  stuCourseByComment(int courseId) {
        List<QueryComment> Comment=dbStudent.stuCourseByComment(courseId);
        for(QueryComment comment : Comment){
            List <Guest> guest= dbStudent.stuCourseByGuest(comment.getId());
            comment.setGuestlist(guest);
        }
        return Comment;
    }
    @RequestMapping("api/stuCommentAdd")
    @ResponseBody
    public  List<QueryComment>  stuCommentAdd(int id, int courseId, int hostId, String comment, String commentTime){
        int commentAdd=dbStudent.stuCommentAdd(id,courseId,hostId,comment,commentTime);
        List<QueryComment> Comments=dbStudent.stuCourseByComment(courseId);
        for(QueryComment Comment : Comments){
            List <Guest> guest= dbStudent.stuCourseByGuest(Comment.getId());
            Comment.setGuestlist(guest);
    }
        return Comments;
    }
 //增加回复
    @RequestMapping("api/stuGuestAdd")
    @ResponseBody
    public   List <Guest> stuGuestAdd(int commentId, int stuId, String comment){
        int commentAdd=dbStudent.stuGuestAdd(commentId, stuId, comment);
        List <Guest> guest=dbStudent.stuCourseByGuest(commentId);
        return  guest;
    }
    @RequestMapping("api/stuCourseAdd")
    @ResponseBody
    public   int  CourseAdd(int stuId, int courseId){
        int commentAdd=dbStudent.stuCourseAdd(stuId,courseId);
        return  commentAdd;
    }
    @RequestMapping("api/stuCourseWork")
    @ResponseBody
    public   List<homework>  stuCourseWork(int stuId){
        List<homework> homework=dbStudent.stuCourseWork( stuId);
        return  homework;
    }
    @RequestMapping("api/stuCourseQuery")
    @ResponseBody
    public   List<homework> stuCourseQuery(int stuId, int courseId){
        List<homework> homework=dbStudent.stuCourseQuery(stuId,courseId);
        return  homework;
    }
    @RequestMapping("api/stuTeacherChat")
    @ResponseBody
    public List<Course> stuTeaChat(int stuId){
        List<Course>teacherList=dbStudent.stuTeacherChat(stuId);
        return teacherList;
    }


}
