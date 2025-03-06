package lab;

import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        // create a scanner for user input
        Scanner input = new Scanner(System.in);

        // create an array for 15 numbers
        int[] numArr = new int[15];

        // prompt for the input of numbers
        System.out.print("Enter " + numArr.length + " numbers: ");
        // store it into an array
        for (int i = 0; i < numArr.length; i++)
            numArr[i] = input.nextInt();

        // close scanner
        input.close();

        // finding the sum of all the numbers
        double total = 0;
        for (int i = 0; i < numArr.length; i++) {
            total += numArr[i];
        }
        // Finding the Max
        int max = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > max)
                max = numArr[i];
        }

        // finding the min
        int min = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] < min)
                min = numArr[i];
        }

        // find the average
        double average = total / numArr.length;

        // print the average
        System.out.println("Average: " + average);

        // print out the total
        System.out.println("Sum: " + total);

        // print the min
        System.out.println("Min: " + min);

        // print the max
        System.out.println("Max: " + max);

    }
}
