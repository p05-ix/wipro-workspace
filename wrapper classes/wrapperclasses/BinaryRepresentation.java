// BinaryRepresentation.java
import java.util.Scanner;

class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter an integer between 1 and 255:");
            int num = sc.nextInt();

            if (num < 1 || num > 255) {
                System.out.println("Error: Number must be between 1 and 255.");
                return;
            }

            // Convert to binary string
            String binary = Integer.toBinaryString(num);

            // Pad with leading zeros to make it 8 digits
            String paddedBinary = String.format("%8s", binary).replace(' ', '0');

            System.out.println("Binary representation (8 digits): " + paddedBinary);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}