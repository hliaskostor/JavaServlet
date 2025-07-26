package com.Ergasia1;

public class Students extends Users{
    int examino;
    int age;
    String email;
    String bornDate;
    int AMKA;
    int registrationNumber;
    int passwordNumber;
    String ADT;
    String Course;
    int grade;
    public String toString() {
        return getClass().getSimpleName() + "[Username=" + username +"][Name="+name+"][Surname="+surname+"][Department" +department+"]"+
               "[Examino="+examino+"][Age="+age+"][Email="+email+"][BornDate="+bornDate+"][AMKA="+AMKA+"]" +
                "[registrationNumber=" +""+registrationNumber+"]" + "[Password="+passwordNumber+"][ADT="+ADT+"]";
    }
    public Students( String username, String name, String surname, String department,int examino, int age, String email,
                     String bornDate, int AMKA, int registrationNumber, int  passwordNumber, String ADT)
    {
        super(username,name,surname,department);
        this.examino = examino;
        this.age = age;
        this.email = email;
        this.bornDate = bornDate;
        this.AMKA = AMKA;
        this.registrationNumber = registrationNumber;
        this.passwordNumber = passwordNumber;
        this.ADT = ADT;
    }
    public Students() {
        this.examino = examino;
        this.age = age;
        this.email = email;
        this.bornDate = bornDate;
        this.AMKA = AMKA;
        this.registrationNumber = registrationNumber;
        this.passwordNumber = passwordNumber;
        this.ADT = ADT;
    }
    public int getExamino() {
        return examino;
    }
    public void setExamino(int examino) {
        this.examino = examino;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBornDate() {
        return bornDate;
    }
    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }
    public int getAMKA() {
        return AMKA;
    }
    public void setAMKA(int AMKA) {
        this.AMKA = AMKA;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = this.registrationNumber;
    }
    public int getPasswordNumber() {
        return passwordNumber;
    }
    public void setPasswordNumber(int PasswordNumber) {
        this.passwordNumber = PasswordNumber;
    }
    public String getADT() {
        return ADT;
    }
    public void setADT(String ADT) {
        this.ADT = ADT;
    }
    public String getCourse() {
        return Course;
    }
    public void setCourse(String course) {
        Course = course;
    }
    }

