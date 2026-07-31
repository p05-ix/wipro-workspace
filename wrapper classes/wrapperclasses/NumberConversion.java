// NumberConversion.java

public class NumberConversion {
    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                System.out.println("Please provide an integer number as a command line argument.");
                return;
            }

            int num = Integer.parseInt(args[0]);

            System.out.println("Given Number : " + num);
            System.out.println("Binary equivalent : " + Integer.toBinaryString(num));
            System.out.println("Octal equivalent : " + Integer.toOctalString(num));
            System.out.println("Hexadecimal equivalent : " + Integer.toHexString(num).toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter a valid integer.");
        }
    }
}

