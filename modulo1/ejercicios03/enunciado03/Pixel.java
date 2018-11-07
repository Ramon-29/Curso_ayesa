/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.ejercicios03.enunciado03;

import java.util.Objects;

/**
 *
 * @author TIC
 */
public class Pixel extends Punto implements IPixel {

    private String color;

    Pixel() {
        super();
        this.color = null;
    }

    Pixel(Punto p, String color) throws Exception {
        if (p.getX() < 0 || p.getY() < 0) {
            throw new Exception("No se puede establecer las coordenadas menores que 0");
        } else {
            this.setX(p.getX());
            this.setY(p.getY());
            this.color = color;
        }
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public void setX(double x) throws Exception {
        if (x < 0) {
            throw new Exception("No se puede establecer las coordenadas menores que 0");
        } else {
            this.x = x;
        }
    }

    @Override
    public void setY(double y) throws Exception {
        if (y < 0) {
            throw new Exception("No se puede establecer las coordenadas menores que 0");
        } else {
            this.y = y;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.color);
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
        final Pixel other = (Pixel) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pixel{" + "color=" + color + '}';
    }

}
