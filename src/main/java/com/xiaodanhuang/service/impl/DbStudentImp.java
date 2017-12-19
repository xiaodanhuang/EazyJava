package com.xiaodanhuang.service.impl;
import com.xiaodanhuang.dao.StuDao;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Guest;
import com.xiaodanhuang.entity.homework;
import com.xiaodanhuang.service.DbStudent;
import com.xiaodanhuang.entity.QueryComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DbStudentImp implements DbStudent{
    @Autowired
    private  StuDao stuDao;
    public List<Course> stuCourse(){
        return stuDao.stuCourse();
    }
    public List<Course> stuMyCourse( int stuId){return stuDao.stuMyCourse(stuId);}
    public List<Course> stuCourseByTime(){
        return stuDao.stuCourseByTime();
    }
    public List<Course> stuCourseByStu(){
        return stuDao.stuCourseByStu();
    }
    public List<QueryComment> stuCourseByComment(int courseId){

        return stuDao.stuCourseByComment(courseId);
    }
    public  int  stuCommentAdd( int id,
                               int courseId,
                               int hostId,
                               String comment,
                               String commentTime
    ){
        return stuDao.stuCommentAdd(id,courseId,hostId,comment,commentTime);
    }
   public  List <Guest>stuCourseByGuest(int commentId){

        return stuDao.stuCourseByGuest(commentId);
   }
   public int  stuGuestAdd(int commentId, int stuId, String comment){
       return stuDao. stuGuestAdd(commentId, stuId, comment);
   }
   public  List<homework> stuCourseQuery(int stuId, int courseId){
       return stuDao.stuCourseQuery(stuId,courseId);
   }
   public int  stuCourseAdd(int stuId, int courseId){

       return stuDao.stuCourseAdd(stuId,courseId);
   }
   public    List<homework> stuCourseWork(int stuId){

       return  stuDao.stuCourseWork(stuId);
   }
   public    List<Course>stuTeacherChat(int stuId){
       return  stuDao.stuTeacherChat(stuId);
   }
}
