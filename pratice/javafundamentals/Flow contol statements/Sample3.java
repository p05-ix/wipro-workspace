public class Sample3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Print all values separated by commas
            for (int i = 0; i < args.length; i++) {
                if (i == args.length - 1) {
                    System.out.print(args[i]); // last value without comma
                } else {
                    System.out.print(args[i] + ",");
                }
            }
        }
    }
}

