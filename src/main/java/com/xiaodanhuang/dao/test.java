package com.xiaodanhuang.dao;
import java.util.List;
import java.io.File;

import com.xiaodanhuang.entity.Guest;
import com.xiaodanhuang.entity.courseware;
import com.xiaodanhuang.entity.homework;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.xiaodanhuang.entity.Chapter;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.QueryComment;

public class test extends Basetest{
    @Autowired
    private ManageDao manageDao;
     @Autowired
    private StuDao stuDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private TeacherDao teacherDao;

    @Test
    public void testmanagerTea() throws Exception {
        List<Course> home=stuDao.stuTeacherChat(14084102);
        System.out.println(home);
    }
    @Test
    public void testTea() throws Exception {
        Object teacher=stuDao.stuGuestAdd(1,14084105,"jajaja");
        List <Guest> guest=stuDao.stuCourseByGuest(1);
        System.out.println(teacher);
     }
     @Test
    public void textQuery()throws Exception {
         int commentAdd = stuDao.stuCommentAdd(3, 1201, 14084102, "bjj", "asdd");
         List<QueryComment> Comments = stuDao.stuCourseByComment(1201);
         for (QueryComment Comment : Comments) {
             List<Guest> guest = stuDao.stuCourseByGuest(Comment.getId());
             Comment.setGuestlist(guest);
         }
     }



}
