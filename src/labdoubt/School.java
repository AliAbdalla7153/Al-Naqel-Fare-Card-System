package labdoubt;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String Address;
    List<Teacher> teachers;
    List<Student> students;

    public School(String name, String address) {
        this.name = name;
        Address = address;
        this.teachers=new ArrayList<>();
        this.students=new ArrayList<>();
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);

    }

    public void addStudent(Student student){
        students.add(student);

    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }
}
