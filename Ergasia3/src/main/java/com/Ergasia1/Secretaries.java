package com.Ergasia1;

public class Secretaries extends Users{
    String recordProfessor;
    String recordStudent;
    String Course;
    int Grades;
    String members;
    int phoneNumber;
    int workingHours;
    String workingDays;
int registrationNumber;
    public String toString() {
        return getClass().getSimpleName() + "[Username= "+ username +"][Name="+name+"][Surname="+surname+"][Department=" +department+"]" +
                "[Members="+members+"][phone="+phoneNumber+"][hours="+workingHours+"][Days="+workingDays+"]";
    }

    public Secretaries(int Grades , String recordProfessor, String recordStudent, String Course, String username, String name, String surname, String department, int usersCounter, String members,
                       int phoneNumber, int workingHours, String workingDays,int registrationNumber) {
        super(username, name, surname, department);
        this.Grades=Grades;
        this.recordProfessor=recordProfessor;
        this.recordStudent=recordStudent;
        this.Course=Course;
        this.members = members;
        this.phoneNumber = phoneNumber;
        this.workingHours = workingHours;
        this.workingDays = workingDays;
        this.registrationNumber=registrationNumber;
    }
    public Secretaries(){
        this.recordProfessor=recordProfessor;
        this.recordStudent=recordStudent;
        this.Course=Course;
        this.members = members;
        this.phoneNumber = phoneNumber;
        this.workingHours = workingHours;
        this.workingDays = workingDays;
    }
    public int getGrades() {
        return Grades;
    }
    public void  setGrades(int grades) {
        this.Grades = Grades;
    }
    public String getRecordProfessor() {
        return recordProfessor;
    }
    public void setRecordProfessor(String recordProfessor) {
        this.recordProfessor = recordProfessor;
    }
    public String getRecordStudent() {
        return recordStudent;
    }
    public void setRecordStudent(String recordStudent) {
        this.recordStudent = recordStudent;
    }
    public String getCourse() {
        return Course;
    }
    public void setCourse(String Course) {
        this.Course = Course;
    }
    public String getMembers() {
        return members;
    }
    public void setMembers(String members) {
        this.members = members;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public String getWorkingDays() {
        return workingDays;
    }
    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
