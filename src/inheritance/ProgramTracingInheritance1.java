package inheritance;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class ProgramTracingInheritance1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog = new Dog();

        animal1.makeSound();
        dog.makeSound();
    }
}

