package javahomeworkweek2;

/**
 * Java program to print the sum
 */

import java.util.Scanner;

public class PrintTheSum {
    int first = 125;
    int second = 24;


    public static void main(String[] args) {
        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int n1 = scanner.nextInt();

        System.out.println("Input the second number: ");
        int n2 = scanner.nextInt();

        int sum = n1 + n2;
        int minus  = n1 - n2;
        int multiply = n1 * n2;
        int divide = n1/n2;
        int mod = n1%n2;

        System.out.println("Sum 125 + 24: " + sum);
        System.out.println("Minus 125 - 24:"+ minus);
        System.out.println("Multiply 125 * 24: "+ multiply);
        System.out.println("Divide 125/24: " + divide);
        System.out.println("125 mod 24: "+ mod);

        //Close the scanner
        scanner.close();







    }




}
