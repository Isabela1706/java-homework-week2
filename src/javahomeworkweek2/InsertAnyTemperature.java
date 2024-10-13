package javahomeworkweek2;

/**
 * Insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius
 */

import java.util.Scanner;

public class InsertAnyTemperature {
    public static void main(String[] args) {
        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        //Convert Fahrenheit to Celsius using the formula c = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5/9;

        //Display the result
        System.out.println("The temperature in Celsius is: " + celsius);

        //Close the scanner
        scanner.close();


    }
}
