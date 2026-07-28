// Orange.java
class Orange extends Fruit {
    Orange(String size) {
        super("Orange", "Tangy", size);
    }

    @Override
    public void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste + " (Citrusy and refreshing)");
    }
}
