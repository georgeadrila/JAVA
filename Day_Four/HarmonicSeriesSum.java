package Day_Four;
import java.util.Scanner;

public class HarmonicSeriesSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.printf("The sum of the harmonic series up to %d terms is %.5f\n", n, sum);

        input.close();
    }
}
