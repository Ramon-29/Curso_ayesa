package modulo1.genericos;

import modulo1.herencia.Circulo;
import modulo1.herencia.Figura;
import modulo1.herencia.Rectangulo;

public class EjemploCajas {

    public static void main(String[] args) throws Exception {
        //descomentar
        //CajaGenerico<Circulo> cc = new CajaGenerico<Circulo>(new Circulo(1.));
        //CajaGenerico<Figura> cf = cc;
        
        Caja[] caja = new Caja[3];
        caja[0] = new Caja(new Circulo(1.));
        caja[1] = new Caja(new Rectangulo(1., 2.));
        caja[2] = new Caja(new Rectangulo(2., 2.));
        try {
            Circulo c1 = (Circulo) caja[1].getObjeto();
        } catch (ClassCastException ex) {
            System.out.println("c1: " + ex.getMessage());
        }
        CajaGenerico[] cajag = new CajaGenerico[3];
        cajag[0] = new CajaGenerico(new Circulo(1.));
        cajag[1] = new CajaGenerico(new Rectangulo(1., 2.));
        cajag[2] = new CajaGenerico(new Rectangulo(2., 2.));

        try {
            Circulo c2 = (Circulo) cajag[1].getObjeto();
        } catch (ClassCastException ex) {
            System.out.println("c2: " + ex.getMessage());
        }
        CajaGenerico<Circulo>[] cajac = new CajaGenerico[3];
        cajac[0] = new CajaGenerico<Circulo>(new Circulo(1.));
        //cajag[1] = new CajaGenerico<Circulo>(new Rectangulo(1., 2.));
        //cajag[2] = new CajaGenerico<Circulo>(new Rectangulo(2., 2.));

        Circulo c3 = cajac[0].getObjeto();
    }
}
