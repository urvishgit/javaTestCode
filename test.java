public class test {

    public static void main (String[] args) {

        reverseString("minesh");

        System.out.println("\nurvish Palindrome String:"+isPalindromeString("urvish"));
    }
    public static void reverseString(String input) {
        System.out.println("Original String:"+input);
        String reverseString = "";
        for(int i = input.length()-1; i >= 0 ; i-- ) {
            reverseString += input.charAt(i);
        }
        System.out.println("Reverse String:"+reverseString);
    }
    public static boolean isPalindromeString(String input) {
        int left = 0;
        int right = input.length()-1;
        while (left < right) {
            if(input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
