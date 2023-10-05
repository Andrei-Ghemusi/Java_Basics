package OOP;

public class Rectangle {
    // Attributes: length, width, color
    //Constructor for all attributes
    //Methods:
    //● describe()
    //● area()
    //● perimeter()
    //● change_color(new_color) - this method does not return anything.
    //It takes a new color as a parameter and will overwrite the attribute self.color.
    //You can check the color change by calling the describe() method.

    private Integer length;
    private Integer width;
    private String color;

    public Rectangle(Integer length, Integer width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public void describe() {
        System.out.printf("The rectangle has a length of %d, a width %d and is %s%n", this.length, this.width, this.color);
    }

    public int area() {
        return this.width * this.length;
    }

    public int perimeter() {
        return 2*(this.length + this.width);
    }

    public void change_color(String new_color){
        this.color = new_color;
    }


}
