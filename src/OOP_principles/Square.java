package OOP_principles;


public class Square extends GeometricForm{
    // Inheritance
    // Class Square - inherits GeometricForm
    //  constructor for side
    private Integer side;


    public Square(Integer side){
        this.side = side;
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
        return Math.pow(side,2);
    }

}
