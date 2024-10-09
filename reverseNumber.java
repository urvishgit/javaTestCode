//Write a program for given number to reverse
import java.util.Scanner;

public class reverseNumber {

    private static int reverse(int number) {
        System.out.println("Before Reverse Number "+number);
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int reverseNumber = reverse(number);
        System.out.println("After Reverse Number "+reverseNumber);
    }
}