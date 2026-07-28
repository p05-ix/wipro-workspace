// TestFruit.java
public class Testfruit {
    public static void main(String[] args) {
        Fruit f = new Fruit("Generic Fruit", "Neutral", "Medium");
        f.eat();

        Apple a = new Apple("Small");
        a.eat();

        Orange o = new Orange("Large");
        o.eat();
    }
}
