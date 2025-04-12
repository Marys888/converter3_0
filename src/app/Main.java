package app;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Temperature measures converter App");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double temp = scanner.nextDouble();
        System.out.println("Temperature in Celsius: " + " " + convertToCelsius(temp));
        scanner.close();
    }
    private static double convertToCelsius(double temp) {
        return (temp - 32) * 5/9;

    }

}
