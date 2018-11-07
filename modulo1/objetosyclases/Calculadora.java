package modulo1.objetosyclases;

/**
 *
 * @author Miguel Garcia Torres
 */
public class Calculadora {

    private static double memoria;

    public static void setMemoria(double n) {
        memoria = n;
    }

    public static double getMemoria() {
        return memoria;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double potencia(double a, int b) {
        double resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = resultado * a;
        }
        return resultado;
    }
    
    public static void main(String[] args) throws Exception {
        //sumar 7.5 y 2.5
        
        //elevar al cubo el resultado de la operacion anterior
        
        //almacenar en memoria el resultado
        
        //restar 6.3 a 11.3
        
        //multiplicar el resultado por 100
        
        //sumar a este ultimo resultado, el valor almacenado en memoria
        
        //Sacar el resultado por pantalla
        
        
    }
}
