//Write a program for given string and number is palindrome or not
public class PalindromeChecker {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters do not match
            }
            left++;
            right--;
        }

        return true; // All characters match
    }

    public static void main(String[] args) {
        String[] testStrings = {"121","A man, a plan, a canal, Panama", "racecar", "hello", "Was it a car or a cat I saw?"};

        for (String testString : testStrings) {
            System.out.println("\"" + testString + "\" is " + (isPalindrome(testString) ? "" : "not ") + "a palindrome");
        }
    }
}