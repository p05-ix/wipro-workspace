// OptionalExample3.java
import java.util.Optional;

// Custom exception class
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

// Employee class (simple placeholder)
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

public class OptionalExample3 {
    public static void main(String[] args) {
        Employee emp1 = null;             // null case
        Employee emp2 = new Employee("Ravi"); // valid case

        try {
            checkEmployee(emp1);
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            checkEmployee(emp2);
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // Method to check employee using Optional
    public static void checkEmployee(Employee emp) throws InvalidEmployeeException {
        Optional<Employee> optEmp = Optional.ofNullable(emp);

        // Throw exception if null, else print employee name
        Employee validEmp = optEmp.orElseThrow(
            () -> new InvalidEmployeeException("Employee object is invalid (null)")
        );

        System.out.println("Valid Employee: " + validEmp.name);
    }
}

