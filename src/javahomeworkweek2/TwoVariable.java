package javahomeworkweek2;

/**
 * Java program to swap two variables.
 */

import java.util.Scanner;

public class TwoVariable {
    public static void main(String[] args) {
        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Before swapping: First number = " + firstNumber + ", Second number = " + secondNumber);

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping: First number = " + firstNumber + ", Second number = " + secondNumber);

        //Close the scanner
        scanner.close();

    }



}
