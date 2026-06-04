package AbstractAndInterface;

public class ConcreteClass1 extends Abstract1 {

    @Override
    void sayHello() {
        System.out.println("i am method of concerete class");
    }

    public static void main(String[] args) {
        ConcreteClass1 c = new ConcreteClass1();
        }
    }

