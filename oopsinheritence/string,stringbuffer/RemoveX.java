// RemoveX.java
class RemoveX {
    public static void main(String[] args) {
        String str1 = "xHix";
        String str2 = "America";
        String str3 = "xJava";

        System.out.println("Input: " + str1 + " → Output: " + removeX(str1));
        System.out.println("Input: " + str2 + " → Output: " + removeX(str2));
        System.out.println("Input: " + str3 + " → Output: " + removeX(str3));
    }

    // Method to remove 'x' at start or end
    public static String removeX(String s) {
        if (s.length() == 0) {
            return s; // empty string case
        }

        // Remove leading 'x'
        if (s.charAt(0) == 'x') {
            s = s.substring(1);
        }

        // Remove trailing 'x'
        if (s.length() > 0 && s.charAt(s.length() - 1) == 'x') {
            s = s.substring(0, s.length() - 1);
        }

        return s;
    }
}
