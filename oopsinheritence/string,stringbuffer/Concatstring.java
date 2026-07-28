// ConcatStrings.java
class ConcatString {
    public static void main(String[] args) {
        String str1 = "Sachin";
        String str2 = "Tendulkar";

        String result = concatStrings(str1, str2);
        System.out.println("Result: " + result);

        // Another test
        System.out.println("Result: " + concatStrings("Mark", "kate"));
    }

    // Method to concatenate with rules
    public static String concatStrings(String s1, String s2) {
        // Convert both to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // If last char of s1 == first char of s2, omit one
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        } else {
            return s1 + " " + s2; // add space between words
        }
    }
}
