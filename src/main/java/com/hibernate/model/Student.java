package com.hibernate.model;

public class Student {
    private int id;
    private String firstName;

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }
}
