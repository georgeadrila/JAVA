package Decison_Making;

import java.util.Scanner;

public class simpleIF {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = 0;
            System.out.print("Enter any integer numbder: ");
            n = input.nextInt();
            if (n < 10) {
                System.out.println("Simple if statement ");
                System.out.println("The given number " + n + " is less than 10");
            }
            System.out.println("Outside if block");
        }
    }
}
