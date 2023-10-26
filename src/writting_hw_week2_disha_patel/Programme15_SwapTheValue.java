package writting_hw_week2_disha_patel;
/**
 * Write a Java program to swap two variables.
 */
import java.util.Scanner;

public class Programme15_SwapTheValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value : ");
        int second = scanner.nextInt();
        Programme15_SwapTheValue t = new Programme15_SwapTheValue();
        t.swapTheValue(first, second);
        //Closing the scanner object
        scanner.close();
    }

    // Swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : ");
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : ");
    }
}