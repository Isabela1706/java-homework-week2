package javahomeworkweek2;

/**
 * Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
       //Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first number : ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average of the three numbers is: " + average);

        //Close the scanner
        scanner.close();

    }
}
