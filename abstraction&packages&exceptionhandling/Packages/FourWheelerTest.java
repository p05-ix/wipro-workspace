// FourWheelerTest.java

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

// Logan class
class Logan extends Vehicle {
    private String modelName;
    private String regNumber;
    private String ownerName;
    private int speed;

    public Logan(String modelName, String regNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.regNumber = regNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() { return modelName; }

    @Override
    public String getRegistrationNumber() { return regNumber; }

    @Override
    public String getOwnerName() { return ownerName; }

    public int speed() { return speed; }

    public void gps() {
        System.out.println("GPS is active in Logan car.");
    }
}

// Ford class
class Ford extends Vehicle {
    private String modelName;
    private String regNumber;
    private String ownerName;
    private int speed;

    public Ford(String modelName, String regNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.regNumber = regNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() { return modelName; }

    @Override
    public String getRegistrationNumber() { return regNumber; }

    @Override
    public String getOwnerName() { return ownerName; }

    public int speed() { return speed; }

    public void tempControl() {
        System.out.println("Temperature control is ON in Ford car.");
    }
}

// Test class
public class FourWheelerTest {
    public static void main(String[] args) {
        Logan logan = new Logan("Logan Sedan", "AP09EF9012", "Arjun", 100);
        Ford ford = new Ford("Ford EcoSport", "AP09GH3456", "Meena", 110);

        System.out.println("Logan Car: " + logan.getModelName() + ", " + logan.getRegistrationNumber() + ", Owner: " + logan.getOwnerName() + ", Speed: " + logan.speed());
        logan.gps();

        System.out.println("Ford Car: " + ford.getModelName() + ", " + ford.getRegistrationNumber() + ", Owner: " + ford.getOwnerName() + ", Speed: " + ford.speed());
        ford.tempControl();
    }
}
