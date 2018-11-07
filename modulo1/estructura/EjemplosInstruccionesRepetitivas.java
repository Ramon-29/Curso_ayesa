package modulo1.estructura;

import java.util.Arrays;

/**
 *
 * @author Miguel Garcia Torres
 */
public class EjemplosInstruccionesRepetitivas {
    public static void main(String[] args) throws Exception {
        
        System.out.println("==================== bucle for");
        int[] array = new int[] {1, 3, 5, 7};
        System.out.println(Arrays.toString(array));
        
        System.out.println("==================== bucle for");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]: " + array[i]);
        }
        System.out.println("==================== bucle for");
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                System.out.print("[" + array[i]);
            else
                System.out.print(", " + array[i]);
        }
        System.out.println("]");
        
        System.out.println("==================== bucle while");
        int j = 0;
        while(j < array.length) {
            if (j == 0)
                System.out.print("[" + array[j]);
            else
                System.out.print(", " + array[j]);
            j++;
        }
        System.out.println("]");
        
        System.out.println("==================== bucle do-while");
        int k = 0;
        do { 
            if (k == 0)
                System.out.print("[" + array[k]);
            else
                System.out.print(", " + array[k]);
            k++;
        } while(k < array.length);
        System.out.println("]");
        
        
    }
}
