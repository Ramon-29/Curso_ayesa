
package modulo1.herencia;

import java.util.Arrays;


public class EjemploVargs {
    
    public void metodo(int...v) {
        System.out.println(Arrays.toString(v));
        
        
    }
    
    public static void main(String[] args) throws Exception {
        EjemploVargs ev = new EjemploVargs();
        
        ev.metodo(1, 2, 4);
    }
}
