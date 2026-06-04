package Package3;

public class StringTest {
    protected  String name;
    public static void main(String[] args) {
        String string1 ="Abudhabi Univeristy";
        String string2 ="Abudhabi Univeristy";
        String string3= new String("Abudhabi Univeristy");
        System.out.println(string1==string2);
        System.out.println(string1==string3);
        System.out.println(string1.equals(string3));
    }
}
