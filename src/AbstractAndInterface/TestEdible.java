package AbstractAndInterface;

public class TestEdible {
    public static void main(String[] args) {

        System.out.println(new Integer(5).compareTo(4));
        if(2!=3.0){

        }

        String s ="taha";
        System.out.println(s.compareTo("ahmad"));

        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());

            if (objects[i] instanceof Animal) {
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
}



abstract class Animal implements  Comparable {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /** Return animal sound */
    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}



class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

abstract class Fruit implements Edible {
    // Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}