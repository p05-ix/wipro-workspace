public class Sample1 {
    public static void main(String[] args) {
        // Part A: Check if number is Positive, Negative, or Zero
        int num = -5; // you can change this value to test
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }

        // Part B: Check if two numbers have the same last digit
        int a = 27, b = 57; // you can change values to test
        if (a % 10 == b % 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


