// EmployeeSerializationDemo.java
import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setDepartment(String department) { this.department = department; }
    public void setDesignation(String designation) { this.designation = designation; }
    public void setSalary(double salary) { this.salary = salary; }

    // Display method
    public void display() {
        System.out.println("Employee [Name=" + name +
                           ", DOB=" + dateOfBirth +
                           ", Department=" + department +
                           ", Designation=" + designation +
                           ", Salary=" + salary + "]");
    }
}

public class EmployeeSerializationDemo {
    public static void main(String[] args) {
        String filename = "data.ser";

        // Create Employee object
        Employee emp = new Employee("Ravi", new Date(96, 4, 15), "IT", "Developer", 55000);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized to " + filename);
        } catch (IOException e) {
            System.out.println("IOException during serialization: " + e.getMessage());
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Employee object deserialized:");
            deserializedEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception during deserialization: " + e.getMessage());
        }
    }
}

