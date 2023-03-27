package Day_Five;

import java.util.Scanner;

public class Conditional_operaotrs {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            int large;
                System.out.print("Enter first number: ");
                int n1 = sn.nextInt();

                System.out.print("Enter second number: ");
                int n2 = sn.nextInt();

                large = (n1 > n2 ? n1 : n2);
                System.out.println("The largest of " + n1 + " and " + n2 + " is " + large);
        }
    }
}
