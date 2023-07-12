public class Cone extends shape3D {
    private double diameter;
    private double height;
    //constructor
    public Cone(String name, double diameter, double height) {
        super(name);
        this.diameter = diameter;
        this.height = height;
    }
    // getVolume method
    public double getVolume() {
        return Math.PI * diameter * diameter * height / 3;
    }
}
