package Assignments;
import java.util.Scanner;


public class dynamic_addition {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            int num1 = sn.nextInt();
            int num2 = sn.nextInt();
            System.out.println("The sum is: " + (num1 + num2));
        }
    }
}
