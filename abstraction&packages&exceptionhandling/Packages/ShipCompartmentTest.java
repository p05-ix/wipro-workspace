package com.wipro.automobile.ship;

class Compartment {
    private int height;
    private int width;
    private int breadth;

    // Constructor
    public Compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Getters
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getBreadth() {
        return breadth;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Compartment Dimensions:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
    }
}

// Test class in the same file
public class ShipCompartmentTest {
    public static void main(String[] args) {
        Compartment c1 = new Compartment(10, 20, 30);
        c1.displayDetails();

        Compartment c2 = new Compartment(15, 25, 35);
        c2.displayDetails();
    }
}
