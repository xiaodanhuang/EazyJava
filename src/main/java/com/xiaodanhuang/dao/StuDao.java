package com.xiaodanhuang.dao;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.QueryComment;
import com.xiaodanhuang.entity.Guest;
import com.xiaodanhuang.entity.homework;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface StuDao {
    List<Course> stuCourse();
    List<Course> stuMyCourse(@Param("stuId") int stuId);
    List<Course> stuCourseByTime();
    List<Course> stuCourseByStu();
    List<QueryComment> stuCourseByComment(@Param("courseId")int courseId);
    int stuCommentAdd(@Param("id") int id,
                      @Param("courseId") int courseId,
                      @Param("hostId") int hostId,
                      @Param("comment") String comment,
                      @Param("commentTime") String commentTime
                      );
    List <Guest>stuCourseByGuest(@Param("commentId")int commentId);
    int stuGuestAdd(
            @Param("commentId") int commentId,
            @Param("stuId") int stuId,
            @Param("comment") String comment
    );
    List<homework> stuCourseQuery(
            @Param("stuId") int stuId,
            @Param("courseId") int courseId
    );
    int stuCourseAdd(
            @Param("stuId") int stuId,
            @Param("courseId") int courseId
    );
   List<homework> stuCourseWork(
        @Param("stuId") int stuId
    );
    List<Course>stuTeacherChat(
            @Param("stuId") int stuId
    );


}
