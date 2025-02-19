public class Ellipse extends Shape {
    private double majorAxis, minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.majorAxis * this.minorAxis;
    }
}