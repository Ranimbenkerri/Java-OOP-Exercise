public class Circle extends shape2D {
    // Instance variables
    private double diameter;
    // constructor
    public Circle(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }
    // getArea method
    public double getArea() {
        return Math.PI * (diameter / 2) * (diameter / 2);
    }

   
}