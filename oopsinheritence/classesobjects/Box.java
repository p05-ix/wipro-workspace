class Box {
    double width;
    double height;
    double depth;

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create object of Box class
        Box b1 = new Box(5, 10, 3);

        // Test functionality
        System.out.println("Volume of Box = " + b1.volume());
    }
}
