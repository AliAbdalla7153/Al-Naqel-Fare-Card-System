package labdoubt;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void  study(){
        System.out.println(name+" studying in grade "+grade);
    }
}
