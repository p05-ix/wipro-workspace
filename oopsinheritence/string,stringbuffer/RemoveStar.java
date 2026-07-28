// RemoveStarAndNeighbors.java
class RemoveStar {
    public static void main(String[] args) {
        String str1 = "ab*cd";
        String str2 = "a*bc*de";
        String str3 = "hello*world";

        System.out.println("Input: " + str1 + " → Output: " + removeStar(str1));
        System.out.println("Input: " + str2 + " → Output: " + removeStar(str2));
        System.out.println("Input: " + str3 + " → Output: " + removeStar(str3));
    }

    // Method to remove '*' and its left/right neighbors
    public static String removeStar(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                // Skip '*' and its neighbors
                continue;
            }
            // Skip left neighbor if next char is '*'
            if (i + 1 < s.length() && s.charAt(i + 1) == '*') {
                continue;
            }
            // Skip right neighbor if previous char was '*'
            if (i > 0 && s.charAt(i - 1) == '*') {
                continue;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
