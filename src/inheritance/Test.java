package inheritance;

import java.util.ArrayList;

public class Test {

    public Test(int number) {
        this.number = number;
    }

    private int number;

    public static void main(String[] args) {

   /*     Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1=e2;
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));

        String s1 ="naina";
        String s2 = new String("naina1");

        System.out.println(s1.equals(s2));*/

    /*    ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list.contains(5));;
        System.out.println(list.isEmpty());;

        for (Integer s:list) {
            System.out.println(s);

        }*/

    Test t1= new Test(5);
    Test t2=t1;
    t2.number=10;
        System.out.println(t1.number);

        System.out.println("Welcome".replace('e','A'));
        System.out.println("Welcome".replaceFirst("e","AB"));
        System.out.println("Welcome".replace("e","AB"));
        System.out.println("Welcome".replaceFirst("el","AB"));




    }
}
