class Sample2 {
    public static void main(String[] args) {
        // Check if exactly one argument is passed
        if (args.length != 1) {
            System.out.println("Please provide exactly one command line argument.");
            return;
        }

        // Print the welcome message
        System.out.println("Welcome " + args[0]);
    }
}
