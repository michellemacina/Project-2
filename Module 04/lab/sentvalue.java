import java.util.Scanner;

public class sentvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int number;

        System.out.println("Enter Numbers:");
        number = scanner.nextInt();

        while (number != -1) {
            sum += number;
            number = scanner.nextInt();
          }
          System.out.println("The sum of the numbers is:" + sum);

          scanner.close();

    }
    
}
