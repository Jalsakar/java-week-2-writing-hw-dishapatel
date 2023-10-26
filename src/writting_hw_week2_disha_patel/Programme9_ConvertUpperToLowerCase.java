package writting_hw_week2_disha_patel;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String upperCase = scanner.nextLine();
        Programme9_ConvertUpperToLowerCase t = new Programme9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(upperCase);
        // Closing the scanner object
        scanner.close();
    }

    public void convertUpperCaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}