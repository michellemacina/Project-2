import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // TODO: Implement ternary operator
        System.out.println((num % 2 == 0) ? num + " is even" : num + " is odd");
    }
}
