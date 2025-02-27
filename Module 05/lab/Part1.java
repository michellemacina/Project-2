package lab;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // enter temperature
        System.out.print("Enter Temperature: ");
        int temperature = input.nextInt();

        // convert to either celsius or farenheigt
        System.out.print("Choose conversion: 1 Celcius to Fareneit, 2 Fareneit to Celcius: ");
        int choice = input.nextInt();
        double convertedTemp;

        // covert based on option
        if (choice == 1) {
            convertedTemp = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "°C is " + convertedTemp + "°F");
        } else if (choice == 2) {
            convertedTemp = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "°F is " + convertedTemp + "°C");
        }
    }

    // formulas
    public static double celsiusToFahrenheit(double celsius) {
        double fahreneit = (9.0 / 5) * celsius + 32;
        return fahreneit;

    }
    

    // formulas
    public static double fahrenheitToCelsius(double fahreneit) {
       
        double celsius = (5.0 / 9) * fahreneit - 32;
        return celsius;

    }

}

