package javahomeworkweek2;

/**
 * Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 */

import java.util.Scanner;

public class DecimalNumber {
    public static void main(String[] args) {

        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the Decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);

        System.out.println("Binary Number is: " + binaryNumber);

        //Close the scanner
        scanner.close();


    }
}
