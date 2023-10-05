package OOP;

public class Circle {
    // Class Circle
    //Attributes: radius, color
    //Constructor for both attributes
    //Methods:
    // describe_circle() - will PRINT the color and radius
    // area() - will RETURN the area
    // diameter()
    // circumference()

    private Integer radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void describeCircle() {
        System.out.printf("The circle has a radius of %d and the color %s%n", this.radius, this.color);
    }

    public double area() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public int diameter() {
        return this.radius * 2;
    }

    public double circumference() {
        return this.diameter() * Math.PI;
    }
}