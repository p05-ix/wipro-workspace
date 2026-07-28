// Fruit.java
class Fruit {
    String name;
    String taste;
    String size;

    // Constructor
    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe fruit
    public void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}
