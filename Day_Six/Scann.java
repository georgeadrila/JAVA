package Day_Six;
import java.util.Scanner;


public class Scann {
    public static void main(String[] args){
        
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Enter your name: ");
                String name = input.nextLine();
                System.out.println("Enter your age: ");
                int age = input.nextInt();
                System.out.println(name + " is " + age + " years old");
            }
       
    }
}
