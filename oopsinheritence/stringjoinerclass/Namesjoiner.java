// NamesJoiner.java
import java.util.ArrayList;
import java.util.StringJoiner;

public class Namesjoiner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Sita");
        names.add("Arjun");
        names.add("Meena");

        // Create StringJoiner with comma separator and { } brackets
        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println("Joined Names: " + sj.toString());
    }
}
