// Employee.java
class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
        super(name); // Call Person constructor
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters and Setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // toString for easy printing
    public String toString() {
        return "Employee[name=" + getName() +
               ", annualSalary=" + annualSalary +
               ", startYear=" + startYear +
               ", nationalInsuranceNumber=" + nationalInsuranceNumber + "]";
    }
}
