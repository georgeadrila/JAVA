package Day_Four;
import java.util.Scanner;

public class FahrenheitToCelsiusTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting temperature in Fahrenheit: ");
        double startTemp = input.nextDouble();
        System.out.print("Enter the ending temperature in Fahrenheit: ");
        double endTemp = input.nextDouble();
        System.out.print("Enter the temperature increment: ");
        double increment = input.nextDouble();

        System.out.println("Fahrenheit\tCelsius");
        System.out.println("==========\t=======");

        for (double fahrenheit = startTemp; fahrenheit <= endTemp; fahrenheit += increment) {
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.printf("%7.2f\t%7.2f\n", fahrenheit, celsius);
        }

        input.close();
    }
}
