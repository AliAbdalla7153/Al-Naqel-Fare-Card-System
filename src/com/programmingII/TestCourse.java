package com.programmingII;

public class TestCourse {
    public static void main(String[] args) {
        Instructor javaInstructor=new Instructor("Taha");
        Instructor CppInstructor =new Instructor("Kent");
        Instructor pythonInstructor=new Instructor("pythonInst");
        Programming programming1=new Programming(101,"Java Programming",javaInstructor);
        Programming programming2=new Programming(102,"C++ Programming",CppInstructor);
        Programming programming3=new Programming(103,"Python",pythonInstructor);

        System.out.println(programming1.getID());
        System.out.println(programming1.getCourseName());
        System.out.println(programming1.getInstructor().instructorName);

        System.out.println(programming2.getID());
        System.out.println(programming2.getCourseName());
        System.out.println(programming2.getInstructor().instructorName);

        System.out.println(programming3.getID());
        System.out.println(programming3.getCourseName());
        System.out.println(programming3.getInstructor().instructorName);

    }
}
