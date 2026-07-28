// InterleaveStrings.java
class InterleaveStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("Input: " + a + ", " + b + " → Output: " + interleave(a, b));

        // Another test
        System.out.println("Input: " + "abc" + ", " + "XYZ123" + " → Output: " + interleave("abc", "XYZ123"));
    }

    // Method to interleave characters of two strings
    public static String interleave(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLen; i++) {
            if (i < a.length()) {
                sb.append(a.charAt(i));
            }
            if (i < b.length()) {
                sb.append(b.charAt(i));
            }
        }

        return sb.toString();
    }
}

