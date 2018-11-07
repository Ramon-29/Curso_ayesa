/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.ejercicios01;

/**
 *
 * @author
 */
public class ExpresionMatematica {

    public static void main(String[] args) throws Exception {
        int n = 3;
        double a = 4;
        double b = 1;

        double X = 0.;
        //inicio-solucion

        // Sumatorio
        int numerador = 0;
        for (int i = 1; i <= n; i++) {
            numerador += (Math.pow((a - b), i)) - 3 + n;
        }

        // Multiplicador
        int denominador = 1;
        for (int i = 2; i < n; i++) {
            denominador *= 2 + (a * (i - 1));
        }
        if (denominador != 0 && numerador != 0) {
            X = ((double) numerador / denominador);
            System.out.println("El valor de X es " + X);
        } else {
            System.out.println("PROBLEMA: El numerador o denominador es '0'");
        }

        //fin-solucion
    }

}
