public class Question11 {
    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Base cases
        if (str.length() <= 1) {
            return true;
        }

        // Compare the first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursive call to check the remaining substring
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
