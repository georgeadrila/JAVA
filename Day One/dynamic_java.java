import java.util.Scanner;

public class dynamic_java {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sn.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Hello donkey!");
                System.out.println(i + 1);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
