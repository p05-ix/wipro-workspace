// TestInheritance.java
public class Testinheritance {
    public static void main(String[] args) {
        // Instance of Animal
        Animal a = new Animal();
        a.eat();
        a.sleep();

        // Instance of Bird
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}

