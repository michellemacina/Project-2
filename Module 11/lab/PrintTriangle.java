package lab;

import java.util.Scanner;

public class PrintTriangle {

    // method
    public static void printTriangle(int n) {

        // base case if n is 0
        if (n == 1) {
            System.out.println("*");
            return;
        }
        printStars(n);
        printTriangle(n - 1);//recursive 
        printStars(n);

    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner.nextInt();
        printTriangle(n);
    }

}

// whats the simpilest possible input? (base case), provide answer
// use examples
// relate harder to simplier
// find the pattern
// write the code by combining recursive to base
