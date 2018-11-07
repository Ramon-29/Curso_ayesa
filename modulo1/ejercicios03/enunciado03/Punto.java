/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.ejercicios03.enunciado03;

/**
 *
 * @author TIC
 */
public class Punto implements IPunto {

    protected double x;
    protected double y;

    Punto() {
        this.x = 0;
        this.y = 0;
    }

    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void borrar() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void mover(IPunto p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    // Distancia Euclídea
    @Override
    public double distancia(IPunto p) {
        double cateto1 = x - p.getX();
        double cateto2 = y - p.getY();
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setX(double x) throws Exception {
        this.x = x;
    }

    @Override
    public void setY(double y) throws Exception{
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
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
        final Punto other = (Punto) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return true;
    }
    
    
}
