package Arrays;

import java.util.Scanner;

public class JavaArrays2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int intArray[] = new int[10];
            int i;

            System.out.println("Enter 10 integers: ");
            for (i = 0; i < 10; i++) {
                intArray[i] = input.nextInt();
            }

            System.out.println("The contents are: ");
            for (i = 0; i < 10; i++) {
                System.out.println(intArray[i]);
            }
        }
    }
}
