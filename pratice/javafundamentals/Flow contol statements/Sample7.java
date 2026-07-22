public class Sample7 {
    public static void main(String[] args) {
        // If you want to take input from command line, use args[0]
        // Example: java Sample7 a
        char ch;
        if (args.length > 0) {
            ch = args[0].charAt(0);
        } else {
            ch = '#'; // default test value
        }

        if (Character.isLetter(ch)) {
            if (Character.isLowerCase(ch)) {
                System.out.println(ch + "->" + Character.toUpperCase(ch));
            } else {
                System.out.println(ch + "->" + Character.toLowerCase(ch));
            }
        } else {
            System.out.println("Not an alphabet");
        }
    }
}

