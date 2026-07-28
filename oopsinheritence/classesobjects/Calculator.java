class Calculator {

    // Static method for integer power
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double power
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        // Test integer power
        int intResult = Calculator.powerInt(2, 3); // 2^3 = 8
        System.out.println("powerInt(2, 3) = " + intResult);

        // Test double power
        double doubleResult = Calculator.powerDouble(2.5, 2); // 2.5^2 = 6.25
        System.out.println("powerDouble(2.5, 2) = " + doubleResult);
    }
}

