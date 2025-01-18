public class Circle {

    private double radius;

    // default constructor
    public Circle() {
        this(1.0);
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // Default radius
        Circle circle1 = new Circle();
        System.out.println("Default Circle -> Radius: " + circle1.getRadius());
        // User-provided radius
        Circle circle2 = new Circle(5.0);
        System.out.println("Custom Circle -> Radius: " + circle2.getRadius());
    }
}