package inheritance;

public class B extends A {

    String universityName;
    public B(){
        super();
        System.out.println("this is class B constructor");
    }

    public void classBmethod(){
        System.out.println("class b method");
    }

    @Override
    public void classAmethod() {
        System.out.println("i eat veg");
    }
}
