package modulo1.estructura;

/**
 *
 * @author Miguel Garcia Torres
 */
public class EjemplosInstruccionesSelectivas {
    public static void main(String[] args) throws Exception {
        int a = 1;
        //sentencia simple
        if (a == 1) {
            System.out.println("a vale 1.");
        }
        //sentencia doble
        if ((a == 0) || (a == 1)) {
            System.out.println("a vale 0 o 1.");
        } else {
            System.out.println("a vale distinto de 0 o 1.");
        }
        //sentencia doble
        if (!((a == 0) || (a == 1))) {
            System.out.println("a vale distinto de 0 o 1.");
        } else {
            System.out.println("a vale 0 o 1.");
        }
        //sentencia multiple
        if (a == 0) {
            System.out.println("a vale 0.");
        } else if (a < 0) {
            System.out.println("a es menor que 0.");
        } else {
            System.out.println("a es mayor que 0.");
        }
        //sentencia multiple switch
        int b = 0;
        
        System.out.println("=============  switch");
        switch(b) {
            case 1:
                System.out.println("El valor b es 1.");
                break;
            case 2:
                System.out.println("El valor b es 2.");
                break;
            default:
                System.out.println("El valor b es cualquier otro valor (" + b + ")");
        }
    }
}
