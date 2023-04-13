public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",height=" + height + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("r1=" + r1);
        System.out.println("r1.width=" + r1.getWidth());
        System.out.println("r1.height=" + r1.getHeight());
        System.out.println("r1.area=" + r1.getArea());
        System.out.println("r1.perimeter=" + r1.getPerimeter());

        Rectangle r2 = new Rectangle(2.0, 3.0);
        System.out.println("r2=" + r2);
        System.out.println("r2.width=" + r2.getWidth());
        System.out.println("r2.height=" + r2.getHeight());
        System.out.println("r2.area=" + r2.getArea());
        System.out.println("r2.perimeter=" + r2.getPerimeter());
    }
}
