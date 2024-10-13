package javahomeworkweek2;

/**
 * A program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class ConvertUL {
    public static void main(String[] args) {

        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a string in uppercase
        System.out.println("Enter a string in uppercase: ");
        String upperCaseString = scanner.nextLine();

        //Convert the string to lowercase
        String lowerCaseString = upperCaseString.toLowerCase();

        //Display the result
        System.out.println("The string in lowercase is: " + lowerCaseString);

        //Close the scanner
        scanner.close();

    }
}
