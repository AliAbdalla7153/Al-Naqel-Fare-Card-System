package com.programmingII;

public class Course {
    private  String courseName;
    private  String[] students;
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName=courseName;

    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(String[] students){
       this.students=students;
       numberOfStudents=students.length;



    }

    public void dropStudent(String student){


    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}
