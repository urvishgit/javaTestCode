//Write a program for given number factorial
import java.util.Scanner;

public class FactorialNumber {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        long FactorialWithLoop = FactorialNumberWithLoop(number);
        System.out.println("Factorial Number with loop : " + FactorialWithLoop);

        long FactorialWithRecursion = FactorialNumberWithRecursion(number);
        System.out.println("Factorial Number with recursion : " + FactorialWithRecursion);

    }
    public static long FactorialNumberWithLoop(int number) {
        if(number <= 0) {
            System.out.println("Negative number not allow.");
            return -9999;
        }
        long factorialNumber = 1;
        for (int i = 2; i <= number; i++) {
            factorialNumber = factorialNumber * i;
        }
        return factorialNumber;
    }

    public static long FactorialNumberWithRecursion(int number) {
        if(number <= 0) {
            System.out.println("Negative number not allow.");
            return -9999;
        }
        if(number <= 2) {
            return number;
        }
        return number * FactorialNumberWithRecursion(number - 1);
    }
}
