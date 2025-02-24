import java.util.Scanner;

public class charclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        if (Character.isLetter(input)) {
            System.out.println(
                    "The Character is a " + (Character.isUpperCase(input) ? "Uppercase" : "Lowercase") + " letter.");
        } else if (Character.isDigit(input)) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The Character is a special symbol.");
        }
        scanner.close();
    }
}
