package modulo1.objetosyclases;

public class Perro {

    private String nombre = null; //Atributo
    private String raza = null;
    private double edad = -1;

    public Perro() {
        /* Constructor por defecto */ }

    public Perro(String nmbr, String rz, double dd) { //Constructor
        this.nombre = nmbr;
        this.raza = rz;
        this.edad = dd;
    }

    public boolean equals(Object o) {
        boolean eq = true;
        
        if (this == o) {
            return eq;
        }
        
        if (o instanceof Perro) {
            Perro p = (Perro) o;
            if (this.edad != p.edad) {
                eq = false;
            } else {
                if (!this.nombre.equals(p.nombre)) {
                    eq = false;
                }
            }
        } else {
            eq = false;
        }
        
        
        return eq;
    }
    public void ladrar() {
        System.out.println("Ladrido");
    }

    public String toString() {
        String txt = "nombre: " + this.nombre;
        
        return txt;
    }
    public static void main(String[] args) {
        Perro miPerro = new Perro("Luna", "Bobtail", 3.5);//Invocación al constructor
        System.out.println(miPerro.toString());
    }
}
