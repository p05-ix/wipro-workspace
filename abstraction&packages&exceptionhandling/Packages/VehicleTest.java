// VehicleTest.java

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

// TwoWheeler: Hero
class Hero extends Vehicle {
    private String modelName;
    private String regNumber;
    private String ownerName;
    private int speed;

    public Hero(String modelName, String regNumber, String ownerName, int speed) {
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

    public int getSpeed() { return speed; }

    public void radio() {
        System.out.println("Radio is ON in Hero bike.");
    }
}

// TwoWheeler: Honda
class Honda extends Vehicle {
    private String modelName;
    private String regNumber;
    private String ownerName;
    private int speed;

    public Honda(String modelName, String regNumber, String ownerName, int speed) {
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

    public int getSpeed() { return speed; }

    public void cdplayer() {
        System.out.println("CD Player is ON in Honda car.");
    }
}

// FourWheeler: Logan
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

// FourWheeler: Ford
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
public class VehicleTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "AP09AB1234", "Ravi", 80);
        Honda honda = new Honda("Honda City", "AP09CD5678", "Sita", 120);
        Logan logan = new Logan("Logan Sedan", "AP09EF9012", "Arjun", 100);
        Ford ford = new Ford("Ford EcoSport", "AP09GH3456", "Meena", 110);

        System.out.println("Hero Bike: " + hero.getModelName() + ", " + hero.getRegistrationNumber() + ", Owner: " + hero.getOwnerName() + ", Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("Honda Car: " + honda.getModelName() + ", " + honda.getRegistrationNumber() + ", Owner: " + honda.getOwnerName() + ", Speed: " + honda.getSpeed());
        honda.cdplayer();

        System.out.println("Logan Car: " + logan.getModelName() + ", " + logan.getRegistrationNumber() + ", Owner: " + logan.getOwnerName() + ", Speed: " + logan.speed());
        logan.gps();

        System.out.println("Ford Car: " + ford.getModelName() + ", " + ford.getRegistrationNumber() + ", Owner: " + ford.getOwnerName() + ", Speed: " + ford.speed());
        ford.tempControl();
    }
}
