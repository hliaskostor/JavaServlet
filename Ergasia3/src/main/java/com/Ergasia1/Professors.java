package com.Ergasia1;

public class Professors extends Users {
    String addressOffice;
    int numberOffice;
    int phoneOffice;
    int hoursOffice;
    int grade;
    String Course;
    int registrationNumber;
    public String toString() {
        return getClass().getSimpleName() + "[Username= "+ username +"][Name="+name+"][Surname="+surname+"]" +
                "[Department=" +department+"][addressOffice="+addressOffice+"][NumberOffice="+numberOffice+"]" +
                "[phone="+phoneOffice+"][hours="+hoursOffice+"]";
    }
    public Professors(String username, String name, String surname, String department, String
        addressOffice,int numberOffice, int phoneOffice, int hoursOffice){
            super(username, name, surname, department);

            this.addressOffice = addressOffice;
            this.numberOffice = numberOffice;
            this.phoneOffice = phoneOffice;
            this.hoursOffice = hoursOffice;
        }
    public Professors() {
            this.addressOffice = addressOffice;
            this.numberOffice = numberOffice;
            this.phoneOffice = phoneOffice;
            this.hoursOffice = hoursOffice;
        }
        public String getAddressOffice () {
            return addressOffice;
        }
        public void setAddressOffice (String addressOffice){
            this.addressOffice = addressOffice;
        }
        public int getNumberOffice () {
            return numberOffice;
        }
        public void setNumberOffice ( int numberOffice){
            this.numberOffice = numberOffice;
        }
        public int getPhoneOffice () {
            return phoneOffice;
        }
        public void setPhoneOffice ( int phoneOffice){
            this.phoneOffice = phoneOffice;
        }
        public int getHoursOffice () {
            return hoursOffice;
        }
        public void setHoursOffice ( int hoursOffice){
            this.hoursOffice = hoursOffice;
        }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getCourse() {
        return Course;
    }
    public void setCourse(String course) {
        Course = course;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}




