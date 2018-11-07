package modulo1.ejercicios01;

public class ExpresionFibonacci {

    public static void main(String[] args) throws Exception {
        int n = 10;
        final int n0 = n;

        long fn = 0;
        //inicio-solucion
        
        System.out.println("Valor fibonacci: " + Fibonacci(n));
        
        //fin-solucion
        // System.out.println("El valor de F(" + n0 + ") es " + fn);
        

    }

    public static long Fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return (Fibonacci(num - 1) + Fibonacci(num - 2));
    }

}
