package modulo1.ejercicios02;

/**
 *
 * @author
 */
public class Persona {

    private String _Nombre;
    private String _Apellido1;
    private String _Apellido2;
    private int _Edad;
    private double _Estatura;
    private double Peso;
    private int _Estado;
    
    Persona(String nombre, String apellido1, String apellido2, int edad, double estatura, double peso, int estado){
        this._Nombre = nombre;
        this._Apellido1 = apellido1;
        this._Apellido2 = apellido2;
        this._Edad = edad;
        this._Estatura = estatura;
        this.Peso = peso;
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

    public void setNombre(String _Nombre) {
        this._Nombre = _Nombre;
    }

    public void setApellido1(String _Apellido1) {
        this._Apellido1 = _Apellido1;
    }

    public void setApellido2(String _Apellido2) {
        this._Apellido2 = _Apellido2;
    }

    public void setEdad(int _Edad) {
        this._Edad = _Edad;
    }

    public void setEstatura(double _Estatura) {
        this._Estatura = _Estatura;
    }
    
    public void setEstatura(int _Estatura) {
        this._Estatura = (double) _Estatura;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
    public void setPeso(int _Peso){
        this.Peso = (double) _Peso;
    }

    public void setEstado(int _Estado) {
        this._Estado = (_Estado>0 && _Estado <6) ? _Estado : 0;
    }
    public static void main(String[] args) throws Exception {
        Persona x = new Persona("Ramon","Palacios","Rodriguez",21,1.74,63.4,3);
        
        x.setEstatura(5);
        System.out.println(x.getEstatura());
        System.out.println(x.getEstado());
    }

}
