package Day_Two;

public class area_circum {

    public static void main(String[] args) {
        
        
        
        double radius = Double.parseDouble(args[0]);
        
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

