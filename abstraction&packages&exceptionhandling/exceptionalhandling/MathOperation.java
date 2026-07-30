// MathOperation.java

public class MathOperation {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                System.out.println("Please provide 5 integers as command line arguments.");
                return;
            }

            int[] numbers = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]); // may throw NumberFormatException
                sum += numbers[i];
            }

            double average = sum / 5.0; // may throw ArithmeticException if divisor is 0 (not here, but safe to catch)

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integer values.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

