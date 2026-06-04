package com.programmingII;

public class Programming {
    private int ID;
    private String courseName;
    private Instructor instructor;

    public Programming(int ID, String courseName, Instructor instructor) {
        this.ID = ID;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getID() {
        return ID;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }


}
