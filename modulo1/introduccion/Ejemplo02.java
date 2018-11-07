/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.introduccion;

import java.util.Arrays;

/**
 *
 * @author Miguel Garcia Torres
 */
public class Ejemplo02 {

    public static void main(String[] args) throws Exception {
        
        char c1 = 'R', c2 = 'O', c3 = 'M', c4 = 'A';
        
        
        System.out.println("Palabra 1: " + c1 + c2 + c3 + c4);
        System.out.println("Palabra 2: " + c4 + c3 + c2 + c1);
        System.out.println("Palabra 3: " + c3 + c2 + c1 + c4);
        System.out.println("Palabra 4: " + c1 + c4 + c3 + c2);
        
        int var1 = 0, var2 = 5;
        
        System.out.println("El valor de var1 es " + var1);
        System.out.println("El valor de var2 es " + var2);
        
        var1 = var2 + 1;
        
        System.out.println("El valor de var1 es " + var1);
        System.out.println("El valor de var2 es " + var2);
        System.out.println("==================  incremental ++variable");
        System.out.println("El valor de var1 es " + var1);
        System.out.println("El valor de var1 es " + (++var1));
        System.out.println("El valor de var1 es " + var1);
        --var1;
        System.out.println("==================  incremental variable++");
        System.out.println("El valor de var1 es " + var1);
        System.out.println("El valor de var1 es " + var1++);
        System.out.println("El valor de var1 es " + var1);
        
        System.out.println("==================  aritmetico con asignacion variable+=");
        System.out.println("El valor de var1 es " + var1);
        var1 += 3;
        System.out.println("El valor de var1 es " + var1);
        
        double d = 120;
        double e = 1.2e2;
        double f = 1.2E2;
        System.out.println("==================  valores reales");
        System.out.println("El valor de d es " + d);
        System.out.println("El valor de e es " + e);
        System.out.println("El valor de f es " + f);
        
        System.out.println("==================  valores booleanos");
        boolean h = true;
        System.out.println("El valor de h es " + h);
        System.out.println("El valor de !h es " + !h);
        
        byte b = 127;
        System.out.println("El valor de b es " + b);
        
        int[] array = new int[] {1,3,5,7};
        System.out.println("==================  array de enteros:");
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        
        int[] arrayb = new int[4];
        arrayb[0] = 1;
        arrayb[1] = 3;
        arrayb[2] = 5;
        arrayb[3] = 7;
        System.out.println(arrayb);
        System.out.println(Arrays.toString(arrayb));
        
        System.out.println("==================  matriz de enteros:");
        int[][] array2d = new int[][] {{1,3,5,7}, {2,4}, {6}};
        System.out.println(array2d);
        System.out.println(array2d[0]);
        System.out.println(Arrays.toString(array2d[0]));
        System.out.println(Arrays.toString(array2d[1]));
        System.out.println(Arrays.toString(array2d[2]));
    }
}
