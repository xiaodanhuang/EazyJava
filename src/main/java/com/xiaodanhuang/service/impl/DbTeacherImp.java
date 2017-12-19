package com.xiaodanhuang.service.impl;
import com.xiaodanhuang.dao.TeacherDao;
import com.xiaodanhuang.entity.Chapter;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.courseware;
import com.xiaodanhuang.entity.homework;
import com.xiaodanhuang.service.DbTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DbTeacherImp implements DbTeacher{
    @Autowired
    private TeacherDao teacherDao;
    public List<Course> teacherByCourse(int teacherNum) {

        List<Course>  teacherList= teacherDao.teacherByCourse(teacherNum);

        return teacherList;
    }
    public List<Chapter> teacherByChapter(int courseId) {

        List<Chapter>  teacherList= teacherDao.teacherByChapter(courseId);

        return teacherList;
    }
    public int  teacherCourseUpdate(int id, String courseName, String category, String courseTime) {

        int teacherList = teacherDao.teacherCourseUpdate(id, courseName, category, courseTime);

        return teacherList;
    }
    public int  teacherProclamationUpdate(int id, String proclamation ) {

        int teacherList = teacherDao.teacherProclamationUpdate(id, proclamation);

        return teacherList;
    }
    public  Object  teacherByProclamation(int id ) {

        Object teacherList = teacherDao.teacherByProclamation(id);

        return teacherList;
    }
    public int  teacherChapterAdd(int id, int  courseId, String chapterName) {

        int  chapterList= teacherDao.teacherChapterAdd( id, courseId, chapterName);
        return chapterList;
    }
    public int  teacherChapterUpdate(int id,  String chapterName) {

        int  chapterList= teacherDao.teacherChapterUpdate( id, chapterName);
        return chapterList;
    }
    public int  teacherChapterDelete(int id) {

        int  chapterList= teacherDao.teacherChapterDelete( id);

        return chapterList;
    }
    public int teacherWareDelete(int id) {

        int  chapterList= teacherDao.teacherWareDelete( id);

        return chapterList;
    }
    public int  teacherFileAdd(int chapterId, String  src, String filename){

        int  chapterList= teacherDao.teacherFileAdd( chapterId,src,filename);

        return chapterList;
    }
    //章节教学文件显示
    public  List<courseware> teacherByCourseWare(int chapterId){

        List<courseware>  wareList= teacherDao.teacherByCourseWare( chapterId);

        return wareList;
    }
    //添加作业
    public  int teacherWorkAdd(
            int  courseId,
            String  src,
            String filename
    ){
        return teacherDao.teacherWorkAdd(courseId, src,filename);
    }
    public int teacherWorkDelete(
           int id
    ){
        return teacherDao.teacherWorkDelete(id);
    }
    public List<homework> teacherByWork(
            int teacherNum
    ){
        return teacherDao.teacherByWork(teacherNum);
    }

}