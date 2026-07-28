// ShortLongShort.java
class ShortLongShort {
    public static void main(String[] args) {
        String a = "hi";
        String b = "hello";

        System.out.println("Input: " + a + ", " + b + " → Output: " + makeShortLongShort(a, b));

        // Another test
        System.out.println("Input: " + "abc" + ", " + "xy" + " → Output: " + makeShortLongShort("abc", "xy"));
    }

    // Method to return short+long+short
    public static String makeShortLongShort(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}
