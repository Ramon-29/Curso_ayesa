package modulo1.introduccion;

/**
 *
 * @author Miguel Garcia Torres
 */
public class Ejemplo01 {

    public static void main(String[] args) throws Exception {
        int edad = 27;
        String nombre = "Sara";
        //
        int x = edad - 5;
        if (x < 25) {
            System.out.println("x es menor que 25, " + nombre);
        };
        
        int d = 1;
        System.out.println((++d) + " 1");
    }
}
