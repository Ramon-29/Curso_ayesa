
package modulo1.excepciones;

public class EjemploLanzarExcepcion {
    
    public static void main(String[] args) throws Exception {
        
        EjemploLanzarExcepcion le = new EjemploLanzarExcepcion();
        int a = le.numero(1);
    }
    
    public int numero(int numero) throws Exception {
        if (numero == 0) {
            return numero;
        } else
            throw new Exception("El parametro de entrada no es ceto.");
    }
}
