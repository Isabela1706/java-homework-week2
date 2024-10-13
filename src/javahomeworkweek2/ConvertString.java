package javahomeworkweek2;

/**
 * a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */

import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {

        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        String lowerCaseString = inputString.toLowerCase();

        System.out.println("Lowercase string: " + lowerCaseString);

        //Close the scanner
        scanner.close();

    }
}
