public class Pyramide extends shape3D {
   
    private double height;
    shape2D b;
    //constructor
    public Pyramide(String name, double length, double height) {
        super(name);
        this.b = b;
        this.height = height;
    }
    // getVolume method
    public double getVolume() {
        return this.b.getArea() * height / 3;
    }
}
