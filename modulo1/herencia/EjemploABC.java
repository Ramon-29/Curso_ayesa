/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.herencia;

/**
 *
 * @author mgarciat
 */
public class EjemploABC {
    public static void main(String[] args) throws Exception {
        ClaseC c = new ClaseC();
        System.out.println("ClaseC id:" + c.id + ", toString: " + c);
        
        ClaseB b = new ClaseC();
        System.out.println("ClaseB id:" + b.id + ", " + ((ClaseC) b).id + ", toString: " + b + ", " + ((ClaseC)b).toString() + ", " + ((ClaseB)b).toString());
        
        ClaseA a = new ClaseC();
        System.out.println("ClaseA id:" + a.id + ", " + ((ClaseB) a).id+ ", " + ((ClaseC) a).id  + ", toString: " + a + ", " + ((ClaseC)a).toString() + ", " + ((ClaseB)a).toString());
        
    }
}
