/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.ejercicios03.enunciado03;

/**
 *
 * @author TIC
 */
public class EjemploPuntoPixel {

    public static void main(String[] args) throws Exception {
        /*Punto p = new Punto();
        Punto px = new Pixel();
        Punto px2 = new Pixel(new Punto(1,2),"azul");
        p = px;
        
        Punto p2 = new Punto(1,3);
        Pixel px3 = (Pixel) p2;*/

        Pixel px = new Pixel(new Punto(1, 3), "Azul");
        Punto p = new Punto(-4, 2);

        // px.setX(-2);
        System.out.println(p);
        System.out.println(px);
    }
}
