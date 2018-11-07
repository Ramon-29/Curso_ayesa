package modulo1.herencia;

public class EjemploAvion {

    public static void main(String[] args) {
        IAeronave a = new Airbus340("XW432", 200);
        IAvion av = new Airbus340("XA123", 225);
        a.despegar();
        a.aterrizar();
        av.abrirTrenDeAterrizaje();
        av.despegar();
        av.aterrizar();
        av.cerrarTrenDeAterrizaje();
    }
}
