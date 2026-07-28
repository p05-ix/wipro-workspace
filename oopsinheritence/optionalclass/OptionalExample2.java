// OptionalExample2.java
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        String address1 = null;
        String address2 = "Hyderabad";

        System.out.println("Address1 → " + getAddress(address1));
        System.out.println("Address2 → " + getAddress(address2));
    }

    // Method to safely handle null using Optional
    public static String getAddress(String address) {
        return Optional.ofNullable(address).orElse("India");
    }
}
