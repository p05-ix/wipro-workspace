// FirstHalfString.java
public class FirstHalfString {
    public static void main(String[] args) {
        String str1 = "TomCat";   // even length
        String str2 = "Apron";    // odd length

        System.out.println("Input: " + str1 + " → Output: " + getFirstHalf(str1));
        System.out.println("Input: " + str2 + " → Output: " + getFirstHalf(str2));
    }

    // Method to return first half if even length, else null
    public static String getFirstHalf(String s) {
        if (s.length() % 2 == 0) {
            return s.substring(0, s.length() / 2);
        } else {
            return null;
        }
    }
}
