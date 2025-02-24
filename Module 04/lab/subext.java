import java.util.Scanner;

public class subext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name:");
        String fullName = scanner.nextLine();

        int spaceIndex = fullName.indexOf(" ");

        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);

        System.out.println("First name:" + firstName);

        System.out.println("Last name:" + lastName);

        scanner.close();
    }

}
//wrong-not the example showed in class retry 