import java.util.Scanner;

public class passval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a password:");
            String password = scanner.nextLine();

            if (password.length() >= 8 && containsUppercase(password) && containsLowercase(password) && containsDigit(password)){
                isValid =true;
                System.out.println("Password is valid");
            } else {
                System.out.println("Invalid password.");
                
            }
        }
    scanner.close();
    }



public static boolean containsUppercase(String password) {
    for (int i=0; i< password.length(); i++) {
        if (Character.isUpperCase(password.charAt(i))) {
            return true;
        }
    }
    return false;
}

public static boolean containsLowercase(String password) {
    for (int i=0; i<password.length(); i++) {
        if (Character.isLowerCase(password.charAt(i))) {
            return true;
        }
    }
    return false;
}

public static boolean containsDigit(String password) {
    for (int i=0; i<password.length(); i++) {
        if (Character.isDigit(password.charAt(i))) {
            return true;
        }
    }
    return false;
}
}
