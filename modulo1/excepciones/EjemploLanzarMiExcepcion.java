
package modulo1.excepciones;

public class EjemploLanzarMiExcepcion {
    
    public static void main(String[] args) throws Exception {
        
        EjemploLanzarMiExcepcion le = new EjemploLanzarMiExcepcion();
        int a = le.numero(1);
    }
    
    public int numero(int numero) throws MiException {
        if (numero == 0) {
            return numero;
        } else
            throw new MiException("El parametro de entrada no es ceto.");
    }
}
