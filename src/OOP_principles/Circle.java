package OOP_principles;

public class Circle extends GeometricForm {
    // ENCAPSULATION
    // Class Circle - inherits GeometricForm
    // side is private property
    // Implement getter, setter for side
    // Implement the required interface method
    // constructor for radius
    // radius is private property
    // Implement getter, setter for radius
    // Implement the required interface method - use the PI field inherited from the parent class in the calculation

    private Integer side;
    private Integer radius;

    public Circle(Integer radius){
        this.radius = radius;
    }

    // Getter for side
    public double getSide() {
        return side;
    }

    // setter for side
    public void setSide(int side) {
        this.side = side;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void corners(Integer nr_corners){
        if (nr_corners<=0){
            System.out.println("I do not have corners");
        } else {
            this.describe();
        }
    }

    @Override
    public double area() {
        return 0;
    }

}
