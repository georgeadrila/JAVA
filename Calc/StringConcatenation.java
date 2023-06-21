package Calc;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toUpperCase();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        String result = str1 + str2;
        System.out.println("Result: " + result);

        scanner.close();
    }
}