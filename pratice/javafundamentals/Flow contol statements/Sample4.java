public class Sample4 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide Gender and Age as arguments");
            return;
        }

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest = 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest = 9.2%");
            } else {
                System.out.println("Invalid age range");
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest = 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest = 10.5%");
            } else {
                System.out.println("Invalid age range");
            }
        } else {
            System.out.println("Invalid gender input");
        }
    }
}

