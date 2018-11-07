/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.streams;

import java.io.Serializable;

/**
 *
 * @author mgarciat
 */
public class MiClase implements Serializable {
    public int a = 1;
    
    public String toString() {
        return " valor: " + this.a + "";
    }
}
