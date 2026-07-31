// EmployeeCloneDemo.java

class Employee implements Cloneable {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    // Override clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Display method
    public void display() {
        System.out.println("Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]");
    }
}

public class EmployeeCloneDemo {
    public static void main(String[] args) {
        try {
            // Original employee
            Employee emp1 = new Employee(101, "Ravi", 50000);
            System.out.println("Original Employee before cloning:");
            emp1.display();

            // Clone employee
            Employee emp2 = (Employee) emp1.clone();
            System.out.println("Cloned Employee:");
            emp2.display();

            // Modify original employee
            emp1.setName("Ravi Kumar");
            emp1.setSalary(60000);

            System.out.println("\nAfter modifying original employee:");
            System.out.println("Original Employee:");
            emp1.display();
            System.out.println("Cloned Employee:");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e);
        }
    }
}

