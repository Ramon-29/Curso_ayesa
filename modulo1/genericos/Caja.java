/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.genericos;

/**
 *
 * @author mgarciat
 */
public class Caja {
    private Object objeto = null;
    
    public Caja(Object objeto) {
        this.setObjeto(objeto);
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
    
    
}
