package javahomeworkweek2;

import java.util.Scanner;

public class RadiusValue {

    public static void main(String[] args){
        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the radius
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        //Define the value of PI
        final double PI = 3.14159;

        //Calculate the area of the circle using the formula A = PI * r * r
        double area = PI * radius * radius;

        //Display the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        //Close the scanner
        scanner.close();
    }
}
