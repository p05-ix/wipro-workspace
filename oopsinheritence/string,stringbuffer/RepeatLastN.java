// RepeatLastN.java
public class RepeatLastN {
    public static void main(String[] args) {
        String str1 = "Wipro";
        int n1 = 3;

        String str2 = "HelloWorld";
        int n2 = 5;

        System.out.println("Input: " + str1 + ", " + n1 + " → Output: " + repeatLastN(str1, n1));
        System.out.println("Input: " + str2 + ", " + n2 + " → Output: " + repeatLastN(str2, n2));
    }

    // Method to repeat last n characters n times
    public static String repeatLastN(String s, int n) {
        if (n < 0 || n > s.length()) {
            return ""; // invalid case
        }

        String lastN = s.substring(s.length() - n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(lastN);
        }

        return sb.toString();
    }
}
