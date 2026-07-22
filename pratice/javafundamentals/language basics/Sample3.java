class Sample3 {
    public static void main(String[] args) {
        // Ensure exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two integer arguments.");
            return;
        }

        try {
            // Convert arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Print the sum in the required format
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        } catch (NumberFormatException e) {
            System.out.println("Arguments must be integers.");
        }
    }
}

