// Apple.java
class Apple extends Fruit {
    Apple(String size) {
        super("Apple", "Sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste + " (Crisp and juicy)");
    }
}

