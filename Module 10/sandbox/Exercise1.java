package sandbox;

// this is exercise 1 and 2 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
        //scanner for entered values
        Scanner input = new Scanner(System.in);
        //try/catch 
        try {
            System.out.println("Enter Numerator");
            int numerator = input.nextInt();
            System.out.println("Enter Denominator");
            int denominator = input.nextInt();
           int result = numerator/denominator;
           System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by Zero not allowed");
        } catch (InputMismatchException e){
            System.out.println("Invalid Input. Please enter valid integer only");
        } finally{
            System.out.println(" Program Complete");
            input.close();
        }
    }

}

