package writting_hw_week2_disha_patel;

import java.util.Scanner;

public class Programme7_TempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        // Object creation
        Programme7_TempConversion t = new Programme7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
        //Closing the scanner object
        scanner.close();
    }

    // Temperature conversion method
    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + "fahrenheit is equal to " + c + " degree celsius");
    }
}