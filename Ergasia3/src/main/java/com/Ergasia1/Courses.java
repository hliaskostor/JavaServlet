package com.Ergasia1;

public class Courses {
    String courseName;
    int courseCode;
    int examino;
    int hoursOftheWeek;
    String MandatoryOrSelection;
    int ECTS;
    String TeacherName;

    public Courses(String courseName, int courseCode, int examino, int hoursOftheWeek,
                   String mandatoryOrSelection, int ECTS, String teacherName) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.examino = examino;
        this.hoursOftheWeek = hoursOftheWeek;
        MandatoryOrSelection = mandatoryOrSelection;
        this.ECTS = ECTS;
        TeacherName = teacherName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    public int getExamino() {
        return examino;
    }
    public void setExamino(int examino) {
        this.examino = examino;
    }
    public int getHoursOftheWeek() {
        return hoursOftheWeek;
    }
    public void setHoursOftheWeek(int hoursOftheWeek) {
        this.hoursOftheWeek = hoursOftheWeek;
    }
    public String getMandatoryOrSelection() {
        return MandatoryOrSelection;
    }
    public void setMandatoryOrSelection(String mandatoryOrSelection) {
        MandatoryOrSelection = mandatoryOrSelection;
    }
    public int getECTS() {
        return ECTS;
    }
    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }
    public String getTeacherName() {
        return TeacherName;
    }
    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }
}
