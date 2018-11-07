package modulo1.excepciones;

public class Hora {

    private int hora, minutos;

    public Hora(int hora, int minutos) throws Exception {
        this.setHora(hora);
        this.setMinutos(minutos);
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinutos() {
        return this.minutos;
    }
    
    public void setHora(int hora) throws Exception {
        if (hora < 0 || hora > 23) {
            throw new Exception("La hora no puede ser menor que 0 ni mayor que 23");
        } else {
            this.hora = hora;
        }
    }
    
    public void setMinutos(int minutos) throws Exception { 
        if (minutos < 0 || minutos > 59) { 
           throw new Exception("Los minutos no pueden ser menores que 0 ni mayores que 59");
        } else { 
            this.minutos = minutos; 
        } 
    }
}
//temporal
// Tempor@1