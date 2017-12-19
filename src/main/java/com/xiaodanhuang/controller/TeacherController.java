package com.xiaodanhuang.controller;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Chapter;
import com.xiaodanhuang.entity.courseware;
import com.xiaodanhuang.entity.homework;
import com.xiaodanhuang.service.DbTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
public class TeacherController {
    @Autowired
    DbTeacher dbTeacher;
    @RequestMapping("api/teacherByCourse")
    @ResponseBody
    public List<Course> teacherByCourse(int teacherNum) {
        List<Course> courseList = dbTeacher.teacherByCourse(teacherNum);
        return courseList;
    }
    @RequestMapping("api/teacherByChapter")
    @ResponseBody
    public List<Chapter>cheacherByChapter(int courseId) {
        List<Chapter> courseList = dbTeacher.teacherByChapter(courseId);
        return courseList;
    }
    @RequestMapping("api/teacherChapterAdd")
    @ResponseBody
    public List<Chapter> teacherChapterAdd(int id, int  courseId, String chapterName){
        int chapterAdd=dbTeacher.teacherChapterAdd(id,courseId,chapterName);
        List<Chapter> courseList = dbTeacher.teacherByChapter(courseId);
        return courseList;
    }
    @RequestMapping("api/teacherChapterUpdate")
    @ResponseBody
    public List<Chapter> teacherChapterUpdate(int id, int  courseId, String chapterName){
        int chapterUpdate=dbTeacher.teacherChapterUpdate(id,chapterName);
        List<Chapter> courseList = dbTeacher.teacherByChapter(courseId);
        return courseList;
    }
    @RequestMapping("api/teacherChapterDelete")
    @ResponseBody
    public List<Chapter> teacherChapterDelete(int id, int  courseId){
        int teacherChapterDelete=dbTeacher.teacherChapterDelete(id);
        List<Chapter> courseList = dbTeacher.teacherByChapter(courseId);
        return courseList;
    }
    @RequestMapping("api/teacherProclamationUpdate")
    @ResponseBody
    public Object teacherProclamationUpdate(int id, String proclamation){
        int teacherChapterDelete=dbTeacher.teacherProclamationUpdate(id,proclamation);
        Object teacherProclamation=dbTeacher.teacherByProclamation(id);
        return teacherProclamation;
    }
    @RequestMapping("api/teacherByProclamation")
    @ResponseBody
    public Object teacherByProclamation(int id){
        Object teacherProclamation=dbTeacher.teacherByProclamation(id);
        return teacherProclamation;
    }
    @RequestMapping("api/teacherCourseWare")
    @ResponseBody
    public List<courseware> teacherByCourseWare(int chapterId){
        List<courseware>CourseWare=dbTeacher.teacherByCourseWare(chapterId);
        return CourseWare;
    }
    @RequestMapping("api/homeWorked")
    @ResponseBody
    public List<homework> queryHomeWorked(int teacherNum){
        List<homework>CourseWare=dbTeacher.teacherByWork(teacherNum);
        return CourseWare;
    }
}
