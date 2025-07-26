package com.Ergasia1;
public class Grades {
    String courseName;
    int courseCode;
    String examinationDate;
    int grade;
    int atTheSecretary;
    int tasks;
    public Grades(String courseName, int courseCode, String examinationDate, int grade, int atTheSecretary, int tasks) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.examinationDate = examinationDate;
        this.grade = grade;
        this.atTheSecretary = atTheSecretary;
        this.tasks = tasks;
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

    public String getExaminationDate() {
        return examinationDate;
    }

    public void setExaminationDate(String examinationDate) {
        this.examinationDate = examinationDate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAtTheSecretary() {
        return atTheSecretary;
    }

    public void setAtTheSecretary(int atTheSecretary) {
        this.atTheSecretary = atTheSecretary;
    }

    public int getTasks() {
        return tasks;
    }

    public void setTasks(int tasks) {
        this.tasks = tasks;
    }


}
