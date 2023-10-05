package OOP_principles;

public abstract class GeometricForm {
    // ABSTRACTION
    // Abstract class GeometricForm
    // Contains a field PI=3.14
    // Contains an abstract method area
    // Contains a method describe() - prints ‘Most likely I have corners’

    protected final double PI = 3.14;

    public abstract double area();

    public abstract void corners(Integer nr_corners);


    public void describe() {
        System.out.println("Most likely I have corners");
    }
}
