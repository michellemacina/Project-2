import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = input.nextBoolean();

        // TODO: Implement the logical condition using && operator
        if (isCitizen && age > 18) {
            System.out.println("you are eligible to vote!");
        } else {
            System.out.println("you are not eligible to vote.");
        }
    }
}