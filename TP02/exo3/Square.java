public class Square extends shape2D {
    private double length;
    //constructor
    public Square(String name, double length) {
        super(name);
        this.length = length;
    }
    // getArea method
    public double getArea() {
        return length * length;
    }
    
}
