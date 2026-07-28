// RemoveFirstLast.java
public class RemoveFirstLast {
    public static void main(String[] args) {
        String str1 = "Suman";
        String str2 = "Hi";

        System.out.println("Input: " + str1 + " → Output: " + removeFirstLast(str1));
        System.out.println("Input: " + str2 + " → Output: " + removeFirstLast(str2));
    }

    // Method to remove first and last character
    public static String removeFirstLast(String s) {
        if (s.length() <= 2) {
            return ""; // If string length is 2 or less, result is empty
        }
        return s.substring(1, s.length() - 1);
    }
}

