import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        int choice; // option of choice as an integer
        Scanner scanner = new Scanner(System.in); // scanner for user input
        do { // do while loop so that the code completes once at least and then asks the user
             // if they want it to repeat for another conversion
            System.out.print(" (0) Quit  or Convert (1) Temperature (2) Weight (3) Distance: ");
            choice = scanner.nextInt();

            if (choice == 1) { // if/then statement for temperature

                System.out.println("Convert (1) Farenheight to Celsius or (2) Celsius to Farenheight: ");
                int temperature = scanner.nextInt();

                if (temperature == 1) { // if/then statement inside the if/then for temperature option
                    System.out.println("What is the Temperature in Farenheight: ");
                    double input = scanner.nextDouble();
                    System.out.println("The Temperature in Celsius is: " + farenheightToCelsius(input));
                } else if (temperature == 2) {
                    System.out.println("What is the Temperature in Celsius: ");
                    double input = scanner.nextDouble();
                    System.out.println("The Temperature in Farenheight is: " + celsiusToFarenheight(input));
                } else {
                    System.out.println("Invalid Temperature");
                }

            } else if (choice == 2) { // if/then statement for weight

                System.out.println("Convert (1) Pounds to Kilograms or (2) Kilograms to Pounds: ");
                int weight = scanner.nextInt();

                if (weight == 1) { // if/then statement for the if/then for weight options
                    System.out.println("What is the weight in Pounds: ");
                    double input = scanner.nextDouble();
                    System.out.println("The weight in Kilograms is " + poundsToKilograms(input));
                } else if (weight == 2) {
                    System.out.print("What is the weight in Kilograms: ");
                    double input = scanner.nextDouble();
                    System.out.println("The weight in Pounds is " + kilogramsToPounds(input));
                } else {
                    System.out.println("Invalid Weight");
                }

            } else if (choice == 3) { // if/then statement for distance

                System.out.println("Convert (1) Miles to Kilometers or (2) Kilometers to Miles: ");
                int distance = scanner.nextInt();

                if (distance == 1) { // if then statement for the if/then for distance options
                    System.out.println("What is the distance in miles: ");
                    double input = scanner.nextDouble();
                    System.out.println("The distance in Kilometers is: " + milesToKilometers(input));
                } else if (distance == 2) {
                    System.out.println("What is the distance in Kilometers: ");
                    double input = scanner.nextDouble();
                    System.out.println("The distance in Miles is: " + kilometersToMiles(input));
                } else {
                    System.out.println("Invalid Distance");
                }

            } else if (choice == 0) { // the if/then option to quit

                System.out.println("End");

            } else { // the default statement for if they didn't enter a valid option
                System.out.println("Invalid");
            }

        } while (choice != 0); // the end of the do/while statement
        scanner.close();
    }

    // these are the methods for the conversions done inside the if/then statements
    // they set the method name and have each parameter set as a double value,
    // conects to the functions above that take the inputs
    public static double farenheightToCelsius(double farenheight) {
        return (farenheight - 32) * 5 / 9;
    }

    public static double celsiusToFarenheight(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.204;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * .62137;
    }

}
