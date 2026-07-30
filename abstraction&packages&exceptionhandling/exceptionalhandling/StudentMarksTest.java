// StudentMarksTest.java
import java.util.Scanner;

// Custom exception for negative values
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Custom exception for out-of-range values
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarksTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input student 1
            System.out.println("Enter name of Student 1:");
            String student1 = sc.nextLine();
            System.out.println("Enter marks of 3 subjects for " + student1 + ":");
            int[] marks1 = new int[3];
            for (int i = 0; i < 3; i++) {
                marks1[i] = Integer.parseInt(sc.nextLine());
                validateMarks(marks1[i]);
            }

            // Input student 2
            System.out.println("Enter name of Student 2:");
            String student2 = sc.nextLine();
            System.out.println("Enter marks of 3 subjects for " + student2 + ":");
            int[] marks2 = new int[3];
            for (int i = 0; i < 3; i++) {
                marks2[i] = Integer.parseInt(sc.nextLine());
                validateMarks(marks2[i]);
            }

            // Calculate averages
            double avg1 = (marks1[0] + marks1[1] + marks1[2]) / 3.0;
            double avg2 = (marks2[0] + marks2[1] + marks2[2]) / 3.0;

            System.out.println(student1 + " average marks = " + avg1);
            System.out.println(student2 + " average marks = " + avg2);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integer values for marks.");
        } catch (NegativeValueException e) {
            System.out.println("NegativeValueException: " + e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println("OutOfRangeException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Validation method
    public static void validateMarks(int marks) throws NegativeValueException, OutOfRangeException {
        if (marks < 0) {
            throw new NegativeValueException("Marks cannot be negative.");
        }
        if (marks > 100) {
            throw new OutOfRangeException("Marks must be between 0 and 100.");
        }
    }
}

