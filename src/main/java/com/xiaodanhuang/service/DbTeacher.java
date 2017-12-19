package com.xiaodanhuang.service;
import com.xiaodanhuang.entity.Chapter;
import com.xiaodanhuang.entity.Teacher;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Student;
import com.xiaodanhuang.entity.homework;
import com.xiaodanhuang.entity.courseware;
import java.util.List;

public  interface DbTeacher {
    List<Course>  teacherByCourse(int teacherNum);
    List<Chapter>  teacherByChapter(int courseId);
    int  teacherProclamationUpdate(
            int id,
            String proclamation
    );
    Object teacherByProclamation(int id);
    int teacherChapterAdd(
           int id,
           int  courseId,
           String chapterName
    );
    int teacherChapterUpdate(
           int id,
           String chapterName
    );
    int teacherChapterDelete(
           int id
    );
    int teacherWareDelete(
           int id
    );
    int teacherFileAdd(
            int chapterId,
            String  src,
            String filename
    );
    //章节教学文件显示
    List<courseware> teacherByCourseWare(int chapterId);
    //添加作业
    int teacherWorkAdd(
           int  courseId,
           String  src,
           String filename
    );
    int teacherWorkDelete(
            int id
    );
    List<homework> teacherByWork(
           int teacherNum
    );
}
