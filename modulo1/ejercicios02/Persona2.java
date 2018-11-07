package modulo1.ejercicios02;

import java.util.Objects;

/**
 *
 * @author
 */
public class Persona2 {

    private String _Nombre;
    private String _Apellido1;
    private String _Apellido2;
    private int _Edad;
    private double _Estatura;
    private double Peso;
    private int _Estado;

    Persona2(String nombre, String apellido1, String apellido2, int edad, double estatura, double peso, int estado) {
        this._Nombre = nombre;
        this._Apellido1 = apellido1;
        this._Apellido2 = apellido2;
        this.setEdad(edad);
        this.setEstatura(estatura);
        this.setPeso(peso);
        this.setEstado(estado);
    }

    public String getNombre() {
        return _Nombre;
    }

    public String getApellido1() {
        return _Apellido1;
    }

    public String getApellido2() {
        return _Apellido2;
    }

    public int getEdad() {
        return _Edad;
    }

    public double getEstatura() {
        return _Estatura;
    }

    public double getPeso() {
        return Peso;
    }

    public int getEstado() {
        return _Estado;
    }

    public void setEdad(int _Edad) {
        this._Edad = (_Edad > 0 && _Edad <= 100) ? _Edad : -1;
    }

    public void setEstatura(double _Estatura) {
        this._Estatura = (_Estatura >= 0.5 && _Estatura <= 2.10) ? _Estatura : -1;
    }

    public void setEstatura(int _Estatura) {
        this.setEstatura((double) _Estatura);
    }

    public void setPeso(double Peso) {
        this.Peso = (Peso >= 35 && Peso <= 150) ? Peso : -1;
    }

    public void setPeso(int _Peso) {
        this.setPeso((double) _Peso);
    }

    public void setEstado(int _Estado) {
        this._Estado = (_Estado > 0 && _Estado < 6) ? _Estado : 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this._Nombre)
                + Objects.hashCode(this._Estatura)
                + Objects.hashCode(this._Estado)
                + Objects.hashCode(this._Edad)
                + Objects.hashCode(this._Apellido2)
                + Objects.hashCode(this._Apellido1)
                + Objects.hashCode(this.Peso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona2 other = (Persona2) obj;
        if (this._Edad != other._Edad) {
            return false;
        }
        if (Double.doubleToLongBits(this._Estatura) != Double.doubleToLongBits(other._Estatura)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Peso) != Double.doubleToLongBits(other.Peso)) {
            return false;
        }
        if (this._Estado != other._Estado) {
            return false;
        }
        if (!Objects.equals(this._Nombre, other._Nombre)) {
            return false;
        }
        if (!Objects.equals(this._Apellido1, other._Apellido1)) {
            return false;
        }
        if (!Objects.equals(this._Apellido2, other._Apellido2)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Persona2 x = new Persona2("Ramon", "Palacios", "Rodriguez", 21, 1.74, 63.4, 8);
        Persona2 y = x;
        x.setEstatura(1.3);
        x.setPeso(120);
        System.out.println(x.getEstatura());
        System.out.println(x.getPeso());
        System.out.println(x.getEstado());
    }
}
