public class Rectangle extends shape2D{
    private double length;
    private double width;
    //constructor
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    // getArea method
    public double getArea() {
        return length * width;
    }

}
