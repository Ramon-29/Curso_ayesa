
package modulo1.genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import modulo1.herencia.Circulo;
import modulo1.herencia.Figura;


public class EjemploComodin2 {
    
    public static void imprimirUpperBound(Collection<? extends Figura> c) {
        System.out.println("Upper bound:");
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            Figura f = (Figura) it.next();
            System.out.println(f);
        }
    }
    
    public static void imprimirLowerBound(Collection<? super Circulo> c) {
        System.out.println("Lower bound:");
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            Figura f = (Figura) it.next();
            System.out.println(f);
        }
    }
    
    
    public static void main(String[] args) throws Exception {
        Collection<Circulo> c = new ArrayList<Circulo>();
        c.add(new Circulo(1.));
        c.add(new Circulo(2.));
        
        EjemploComodin2.imprimirUpperBound(c);
        
        EjemploComodin2.imprimirLowerBound(c);
    }
}
