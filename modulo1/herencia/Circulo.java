package modulo1.herencia;

public class Circulo extends Figura {

    private double radio = Double.NaN;

    public Circulo(double r) {
        this.radio = r;
    }

    @Override
    public double area() {
        return Math.PI * this.radio * this.radio;
    }

    public String toString() {
        return "Circulo [" + this.radio + "]";
    }
}
