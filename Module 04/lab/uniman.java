import java.util.Scanner;

public class uniman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char input = scanner.next().charAt(0);
        int unicodeValue = (int) input;
        char nextChar = (char) (input + 1);
        System.out.println("Unicode value: " + unicodeValue);
        System.out.println("Next character in Unicode sequence: " + nextChar);
        scanner.close();
    }

}
