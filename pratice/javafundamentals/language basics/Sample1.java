class Sample1 {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two command line arguments.");
            return;
        }

        // Concatenate with "Technologies" in between
        System.out.println(args[0] + " Technologies " + args[1]);
    }
}
