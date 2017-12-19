package com.xiaodanhuang.dao;
import com.xiaodanhuang.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface  TeacherDao {
   List<Course> teacherByCourse(@Param("teacherNum") int  teacherNum);
   List<Chapter> teacherByChapter(@Param("courseId") int  courseId);
   int  teacherCourseUpdate(
           @Param("id")int id,
           @Param("courseName")String courseName,
           @Param("category")  String category,
           @Param("courseTime") String courseTime
   );
   int  teacherProclamationUpdate(
           @Param("id")int id,
           @Param("proclamation") String proclamation
   );
   Object  teacherByProclamation(
           @Param("id")int id
   );
   int teacherChapterAdd(
           @Param("id")int id,
           @Param("courseId")int  courseId,
           @Param("chapterName")String chapterName
   );
   int teacherChapterDelete(
           @Param("id")int id
   );
   int teacherWareDelete(
           @Param("id")int id
   );
   int teacherChapterUpdate(
           @Param("id")int id,
           @Param("chapterName")String chapterName
   );
   int teacherFileAdd(
          @Param("chapterId")   int chapterId,
          @Param("src") String  src,
          @Param("filename")  String filename

   );
   //章节教学文件显示
   List<courseware> teacherByCourseWare(
          @Param("chapterId")   int chapterId
   );
   //添加作业
   int teacherWorkAdd(
           @Param("courseId")int  courseId,
           @Param("src") String  src,
           @Param("filename")String filename
   );
   int teacherWorkDelete(
           @Param("id")int id
   );
   List<homework> teacherByWork(
           @Param("teacherNum")   int teacherNum
   );

}
