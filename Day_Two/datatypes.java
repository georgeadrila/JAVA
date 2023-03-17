package Day_Two;
import java.util.Scanner;;

public class datatypes {
    public static void main(String[] args) {
        String name = "George";
   
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        if (str.equals(name)) {
            System.out.println("Hello George");
        } else {
            System.out.println("Hello stranger");
        }
    }
    }
}
