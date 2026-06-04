package Package3;

public class MyTest {
    public static void main(String[] args) {
        StringTest stringTest=new StringTest();
        stringTest.name="taha";
        System.out.println("Welcome".replace('e', 'A'));
        System.out.println("Welcome".replaceFirst("e", "AB"));
        System.out.println("Welcome".replace("e", "AB"));
        System.out.println("Welcome".replace("el", "AB"));
    }
}
