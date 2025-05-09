import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part 1: Implicit and Explicit Type Conversion (Widening)
        int intvalue=42;
        double doublevalue=intvalue;
        System.out.println("integer value:");
        System.out.println("double value:");

        //Part 2:Explicit Type Conversion (Narrowing)
        doublevalue=19.99;
        intvalue= (int) doublevalue;
        System.out.println(doublevalue);
        System.out.println(intvalue);

        input.close();
    }
}

