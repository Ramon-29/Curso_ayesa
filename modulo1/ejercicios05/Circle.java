package modulo1.ejercicios05;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimenter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return super.toString() + "> circle: radius=" + this.radius;
    }
}
