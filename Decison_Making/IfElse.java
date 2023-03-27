package Decison_Making;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter any intger number: ");
            int n = input.nextInt();
            if (n>0) {
                System.out.println("The given number " + n + " is positive.");
            } else {
                System.out.println("The given number "+ n + " is negative.");
            }
            System.out.println("Statement outside the if else block");
            input.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
