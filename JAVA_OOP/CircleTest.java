import java.util.Scanner;

class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            Circle circle = new Circle();
            circle.setRadius(radius);

            double area = circle.calculateArea();
            double circumference = circle.calculateCircumference();

            System.out.println("The area of the circle is " + area);
            System.out.println("The circumference of the circle is " + circumference);
        }
    }
}
