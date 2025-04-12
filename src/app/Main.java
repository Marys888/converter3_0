package app;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Temperature measures converter App");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        double tempF = scanner.nextDouble();
        System.out.println("Temperature in Celsius: "  + convertToCelsius(tempF));

        System.out.println("Enter temperature in Celsius");
        double tempC = scanner.nextDouble();
        System.out.println("Temperature in Fahrenheit: "  + convertToFahrenheit(tempC));

        scanner.close();
    }
    private static double convertToCelsius(double tempF) {
        return (tempF - 32) * 5/9;

    }
    private static double convertToFahrenheit(double tempC) {
        return (tempC * 9/5) + 32;
    }

}
