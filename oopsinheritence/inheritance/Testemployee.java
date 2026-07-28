// TestEmployee.java
public class Testemployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", 50000.0, 2020, "NI12345");

        // Print details
        System.out.println(e1.toString());

        // Update salary and print again
        e1.setAnnualSalary(60000.0);
        System.out.println("Updated Salary: " + e1.getAnnualSalary());
    }
}
