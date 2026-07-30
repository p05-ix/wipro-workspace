// PersonRegistration.java

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class PersonRegistration {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Please provide name and age as command line arguments.");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            validateAge(age);

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration successful!");

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Age must be an integer.");
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    // Validation method
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age >= 60) {
            throw new InvalidAgeException("Age must be between 18 and 59.");
        }
    }
}

