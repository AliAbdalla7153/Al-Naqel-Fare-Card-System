package Package3;

public class Course {
    public int id;
    public String courseName;
    public  Student[] students;
    public Boolean ststu;

    public Course(int id, String courseName, Student[] students) {

        this.id = id;
        this.courseName = courseName;
        this.students = students;
    }
}
