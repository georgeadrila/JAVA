package Assignments;
import java.util.Scanner;
public class pius_kaleega {
    public static void main(String[] args) {
        // print out a sentence for a given times
        try (Scanner sn = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sn.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Kaleega Pius!");
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
