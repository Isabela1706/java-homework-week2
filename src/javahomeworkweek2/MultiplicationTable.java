package javahomeworkweek2;
/**
 * Multiplication table up to 10.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        //Print the multiplication table up to 10
        System.out.println("Multiplication table for " + number + ":");
        for (int i =1; i <=10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        //Close the scanner
        scanner.close();
    }
}
