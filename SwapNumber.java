//Write a program for Swap Number without using third variable
public class SwapNumber {

    private static void swap(Integer x, Integer y) {
        System.out.println("Before Swap Number "+x +" & "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swap Number "+x +" & "+y);
    }

    public static void main(String[] args) {
        System.out.println("Calling Swap function.");
        swap(2,-3);
    }
}