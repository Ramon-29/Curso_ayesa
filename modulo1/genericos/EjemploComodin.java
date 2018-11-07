package modulo1.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import modulo1.herencia.Circulo;
import modulo1.herencia.Figura;
import modulo1.herencia.Rectangulo;


public class EjemploComodin {
    public static void main(String[] args) throws Exception {
        //comodin
        Collection<Circulo> c = new ArrayList<Circulo>();
        c.add(new Circulo(1.));
        c.add(new Circulo(2.));
        c.add(new Circulo(3.));
        
        Object[] o = c.toArray();
        System.out.println(Arrays.toString(o));
        Object oo = o;
        System.out.println("2::" + oo);
        //? permite llamar get que aunque no se sabe que es, se sabe que es un objeto
        Collection<?> c2 = c;
        System.out.println(c2);
        
        //no permite llamar add con ? porque no se sabe que tipo de objetos se van a incluir
        //c2.add(new Circulo(4.));
        
        Collection<? extends Figura> c3 = new ArrayList();
        //c3.add(new Circulo(1.));
        
        //cajaGenerico<?> cg1 = new CajaGenerico<Circulo>(new Circulo(1.));
        //Collection<?> c1 = new ArrayList<Circulo>();
        //c1.add(new Circulo(1.));


        //CajaGenerico<Object>[] caja1 = new CajaGenerico[2];
        //caja1[0] = new CajaGenerico<Object>(new Circulo(1.));
        //caja1[1] = new CajaGenerico<Object>(new Rectangulo(1., 2.));
        
        //CajaGenerico<?>[] caja2 = new CajaGenerico[2];
        //caja2[0] = new CajaGenerico<Circulo>(new Circulo(1.));
        //caja2[0] = new CajaGenerico<Rectangulo>(new Rectangulo(1., 2.));

    }
}
