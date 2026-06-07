package Package3;

public class Example {
    private int number;
    public Example(int n) {
        number = n;
    }
    public static void main(String[] args) {
        Example example1 = new Example(10);
        Example example2 = example1;
        example2.number = 15;
        System.out.println(example1.number);
    }
}
