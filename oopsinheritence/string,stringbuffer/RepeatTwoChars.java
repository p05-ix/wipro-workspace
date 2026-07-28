// RepeatTwoChars.java
class RepeatTwoChars {
    public static void main(String[] args) {
        String str = "Wipro";  // You can change this input
        String result = repeatTwoChars(str);
        System.out.println("Result: " + result);
    }

    // Method to generate n copies of first 2 chars
    public static String repeatTwoChars(String s) {
        if (s.length() < 2) {
            return s; // If string has less than 2 chars, just return it
        }

        String firstTwo = s.substring(0, 2);
        int n = s.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(firstTwo);
        }

        return sb.toString();
    }
}

