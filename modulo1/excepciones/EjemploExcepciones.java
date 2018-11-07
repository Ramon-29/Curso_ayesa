package modulo1.excepciones;

public class EjemploExcepciones {
    
    public static void main(String[] args) throws Exception {
        EjemploExcepciones ejemplo = new EjemploExcepciones();
        ejemplo.metodoCapturaExcepciones(0);
    }

    public void metodoCapturaExcepciones(int numero) {

        int resultado;

        System.out.println("Vamos a intentar la ejecución del método 'metodoPropagaExcepcion' ");

        try {

            resultado = metodoPropagaExcepcion(numero);

            System.out.println("El resultado obtenido es: " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Excepción aritmética: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Se ha producido un error:" + ex.getMessage());
        }

        System.out.println("Fin del intento ");
    }
    
    public int metodoPropagaExcepcion(int numero) throws Exception {
        return 10 /numero;
    }
}
