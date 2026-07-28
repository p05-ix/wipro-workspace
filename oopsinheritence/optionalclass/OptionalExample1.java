// OptionalExample1.java
import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        String[] names = new String[5]; // all elements are null by default

        // Wrap names[0] in Optional
        Optional<String> optName = Optional.ofNullable(names[0]);

        // Safely handle null
        int length = optName.map(String::length).orElse(0);

        System.out.println("Length of names[0]: " + length);
    }
}


