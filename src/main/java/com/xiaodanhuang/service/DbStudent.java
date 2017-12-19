package com.xiaodanhuang.service;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Guest;
import com.xiaodanhuang.entity.QueryComment;
import com.xiaodanhuang.entity.homework;

import java.util.List;

public interface DbStudent {
    List<Course> stuCourse();
    List<Course> stuMyCourse( int stuId);
    List<Course> stuCourseByTime();
    List<Course> stuCourseByStu();
    List<QueryComment> stuCourseByComment(int courseId);
     int stuCommentAdd( int id,
                      int courseId,
                       int hostId,
                      String comment,
                      String commentTime
    );
    List <Guest>stuCourseByGuest(int commentId);
    int stuGuestAdd(int commentId, int stuId, String comment);
    List<homework> stuCourseQuery(int stuId, int courseId);
    int stuCourseAdd(int stuId, int courseId);
    List<homework> stuCourseWork(int stuId);
    List<Course>stuTeacherChat(int stuId);
}
