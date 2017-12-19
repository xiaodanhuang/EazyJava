package com.xiaodanhuang.entity;

public class Course {
    private int  id;
    private String courseName;
    private int courseStu;
    private int teacherNum;
    private String courseTeacher;
    private String courseTime;
    private String category;
    private String src;
    private String proclamation;
    public String getProclamation() {
        return proclamation;
    }

    public void setProclamation(String proclamation) {
        this.proclamation = proclamation;
    }

    public int getCourseStu() {
        return courseStu;
    }

    public void setCourseStu(int courseStu) {
        this.courseStu = courseStu;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(int teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }
}
