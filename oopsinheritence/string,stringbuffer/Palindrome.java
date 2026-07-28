// PalindromeCheck.java
public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";  // You can change this input
        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }

    // Method to check palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

