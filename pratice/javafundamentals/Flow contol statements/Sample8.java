public class Sample8 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a color code");
            return;
        }

        char code = Character.toUpperCase(args[0].charAt(0));

        String color = switch (code) {
            case 'R' -> "Red";
            case 'B' -> "Blue";
            case 'G' -> "Green";
            case 'O' -> "Orange";
            case 'Y' -> "Yellow";
            case 'W' -> "White";
            default -> "Invalid Code";
        };

        System.out.println(color);
    }
}



