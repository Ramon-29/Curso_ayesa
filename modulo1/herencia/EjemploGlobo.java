package modulo1.herencia;

public class EjemploGlobo {

    public static void main(String[] args) {
        IAeronave g = new Globo("HGB01");
        Globo g1 = (Globo) g;
        g1.despegar();
        g1.variarAlturaDeVuelo(300);
        g1.disminuirAlturaDeVuelo(100);
        g1.aterrizar();
        g1.calentarAire(10);
    }
}
