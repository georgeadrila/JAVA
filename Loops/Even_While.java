import java.util.Scanner;

public class Even_While {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = input.nextInt();
            while (number < 10) {
                if (number % 2 == 0) {
                    System.out.println("Number: " + number);

                    number++;
                }
            }
        }
    }
}