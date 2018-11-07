package modulo1.herencia;

public class Rectangulo extends Figura {

    private double base = Double.NaN;

    private double altura = Double.NaN;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return this.base * this.altura;
    }

    public String toString() {
        return "Rectangulo [" + this.base + "," + this.altura + "]";
    }
}
