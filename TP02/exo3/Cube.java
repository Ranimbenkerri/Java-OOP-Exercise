public class Cube extends shape3D {
    private double length;
    //constructor
    public Cube(String name, double length) {
        super(name);
        this.length = length;
    }
    // getVolume method 
    public double getVolume() {
        return length * length * length;
    }
}