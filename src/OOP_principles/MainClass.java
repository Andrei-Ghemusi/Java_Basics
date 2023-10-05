package OOP_principles;

public class MainClass {


    public static void printArea(GeometricForm form) {
        System.out.println("Area: " + form.area());
    }
    public static void main(String[] args) {

        // runtime POLYMORPHISM
        // the appropriate method is determined at runtime based on the actual type of the object passed
        Circle circle = new Circle(5);
        Square square = new Square(3);

        // Using polymorphism to call the area() method
        printArea(circle);
        printArea(square);

        System.out.printf("Circle radius before update is %s%n", circle.getRadius());
        circle.setRadius(10);
        System.out.printf("Circle radius after update is %s%n", circle.getRadius());

        circle.corners(0);
        square.corners(4);













    }
}
