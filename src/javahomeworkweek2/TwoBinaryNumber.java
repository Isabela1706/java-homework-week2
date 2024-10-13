package javahomeworkweek2;

/**
 * Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */

import java.util.Scanner;

public class TwoBinaryNumber {
    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, reminder = 0;

        int[] sum = new int[20];

        //Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first binary number: ");
        String firstBinary = scanner.nextLine();

        System.out.println("Enter second binary number: ");
        String secondBinary = scanner.nextLine();

        int num1 = Integer.parseInt(firstBinary, 2);
        int num2 =  Integer.parseInt(secondBinary, 2);

        int Sum = num1 + num2;

        String binarySum = Integer.toBinaryString(Sum);




        System.out.println("Sum of two binary numbers: " + binarySum);

        //Close the scanner
        scanner.close();





    }
}
