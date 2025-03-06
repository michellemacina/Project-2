package lab;

import java.util.Scanner;

public class ArrayRotation {
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

        //print the 15 numbers before rotate 
        System.out.println("Numbers before the rotation: ");
        for (int num : numArr) {
            System.out.print(num + " ");
        }

        //create a blank array 
        int[] rotArr =new int[15];
        
        //Rotate the array by replacing the values by adding 3 (store values in)
        for (int i=0; i< numArr.length; i++){
            int j = (i + 3) % numArr.length;
            rotArr[j] = numArr[i];
        }
      

        //Print the new rotation 
        System.out.println("Numbers after the rotation: ");
        for (int num1 : rotArr) {
            System.out.print(num1 + " ");
        }
        System.out.println();



    }
}

