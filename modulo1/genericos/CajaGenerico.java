
package modulo1.genericos;

public class CajaGenerico<T> {
    private T objeto = null;
    
    public CajaGenerico(T objeto) {
        this.setObjeto(objeto);
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
