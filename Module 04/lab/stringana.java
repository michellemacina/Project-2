import java.util.Scanner;

public class stringana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String input = scanner.nextLine();

        System.out.println(input.length());
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length() - 1));
        System.out.println(input.toUpperCase());

        scanner.close();
    }

}
