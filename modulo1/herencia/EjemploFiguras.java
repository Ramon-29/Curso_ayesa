
package modulo1.herencia;

public class EjemploFiguras {
    public static void main(String[] args) throws Exception {
        Circulo c = new Circulo(3.2);
        Figura f = c;
        
        Figura f2 = new Circulo(3.2);
        Circulo c2 = (Circulo) f2;
        
        Circulo c3 = new Circulo(3.2);
        //Rectangulo r = c3;
        
        
        System.out.println(c);
        System.out.println(f);
    }
    
}
