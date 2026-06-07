package com.programmingII;

public class Student {


    String name;
    int studentId;
    String major;
    Student(String name, int studentId,String major){
        this.name=name;
        this.studentId=studentId;
        this.major=major;

    }
Student(){

};

    public static void main(String[] args) {

        Student s1= new Student("taha",101,"java");
        Student s2= new Student("xyz",102,"maths");
        Student s3= new Student("xyzaa",102,"programming");
        Student s4= new Student();
        System.out.println(s1.getName());
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s4.studentId);

    }
    public String getName() {
        return name;
    }

    public int getId() {
        return studentId;
    }

}
