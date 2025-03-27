package lab;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Length of password
        System.out.print("password length");
        int length = scanner.nextInt();

        // final password
        String password = generatePassword(length);
        System.out.println("Generated password is " + password);

        scanner.close();
    }


    // public static char getRandomLowerCaseLetter() {
    // return getRandomCharacter('a', 'z');
    // }
    // public static char getRandomUpperCaseLetter() {
    // return getRandomCharacter('A', 'Z');
    // }

   static String generatePassword(int length) {

        String password = "";
        for (int i = 0; i < length; i++) {
            password += randomCharacter();
        }
        return password;

    }
    
    static char randomCharacter() {
        char ch;
        while (!Character.isLetterOrDigit(ch=(char)(Math.random()* 122)));
        return ch;
    }
}
