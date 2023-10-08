public class Circle implements GeometricObject{
    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.pow(r, 2.0)*Math.PI;
    }
}
