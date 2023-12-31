package writting_hw_week2_disha_patel;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence : ");
        String uppercase = scanner.nextLine();
        Programme19_ConvertStringToLowerCase t = new Programme19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        //Closing scanner object
        scanner.close();
    }

    // Convert String to the lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the String is = " + str.toLowerCase());
    }
}