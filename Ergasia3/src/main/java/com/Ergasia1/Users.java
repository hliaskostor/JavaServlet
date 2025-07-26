package com.Ergasia1;

public class Users {
    String username;
    String name;
    String surname;
    String department;
    int usersCounter = 0;

    public String toString() {
        return getClass().getSimpleName() + "[Username= "+ username +"][Name="+name+"][Surname="+surname+"][Department=" +department+"]";
    }
    public Users(String username, String name, String surname, String department) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.usersCounter = usersCounter;
    }

    public Users() {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.usersCounter = usersCounter;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getUsersCounter() {
        return usersCounter;
    }

    public void setUsersCounter(int usersCounter) {
        this.usersCounter = usersCounter;
    }




    //Ξ”Ξ·ΞΌΞΉΞΏΟ…Ο�Ξ³Ξ―Ξ± getters ΞΊΞ±ΞΉ setters //


    //------------------------------//


}