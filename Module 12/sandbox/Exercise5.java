package sandbox;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        int inputCount = 0;
        try (Scanner scanner = new Scanner(new File("emails.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                set1.add(line);
                inputCount++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Total email addresses: " + inputCount);
        System.out.println("Unique email addresses: " + set1.size());
        System.out.println("Duplicate email addresses: " + (inputCount - set1.size()));
    }
}