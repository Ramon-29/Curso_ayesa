
package modulo1.ejercicios05;



public class Rectangle extends Shape  {
    protected double width, length;
    
    public Rectangle() {}
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimenter() {
        return 2 *(this.width + this.length);
    }
    
    public String toString() {
        return super.toString() + "> rectangle: width=" + this.width + ", length: " + this.length;
    }
}
