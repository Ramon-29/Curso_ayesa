package modulo1.herencia;


public class ClaseC extends ClaseB {
    public String id = "C";
    
    public String toString() {return "ClaseC";}
    
    public void imprimeId() {
        System.out.println("this.id: " + this.id + ", super.id: " + super.id);
    }
    
    
}
