
package modulo1.ejercicios05;

import java.io.Serializable;
import java.util.Objects;


public abstract class Shape<T extends Shape> implements Comparable<T>, Serializable {
    protected String color;
    protected boolean filled;
    protected String calidad;
    
    public Shape() {}
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimenter();
    
    @Override
    public String toString() {
        return "Clase Shape";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.color);
        hash = 53 * hash + (this.filled ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shape other = (Shape) obj;
        double diff = Math.abs(this.getArea() - other.getArea());
        return (diff < 1);
    }
    
    @Override
    public int compareTo(T o) {
        Shape s = (Shape) o;
        double diff = this.getArea() - s.getArea();
        if (diff == 0) {
            diff = this.getPerimenter() - s.getPerimenter();
            return (int) diff;
        } else {
            return (int) diff;
        }
        
        
    }
}
