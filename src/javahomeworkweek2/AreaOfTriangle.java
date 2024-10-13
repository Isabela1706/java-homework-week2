package javahomeworkweek2;

/**
 * calculate the area of a triangle.
 */

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the base of the triangle
        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        //Prompt the user to enter the height of the triangle
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        //Calculate the area of the triangle using the formula: Area = 1/2 * base * height
        double area = 0.5 * base * height;

        //Display the result
        System.out.println("The area of the triangle is: " + area);

        //Close the scanner
        scanner.close();

    }
}
