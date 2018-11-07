package modulo1.herencia;

/**
 *
 */
public class Airbus340 implements IAeronave, IAvion {

    private String id;
    private int altura = 0;
    private boolean trenAbierto = true;
    private int pasajeros;

    public Airbus340(String identificacion, int pasajeros) {
        this.id = identificacion;
        this.pasajeros = pasajeros;
        mensaje("Preparado para recibir plan de vuelo");
    }

    @Override
    public void aumentarAlturaDeVuelo(int aumento) {
        mensaje("Incrementando altura de vuelo en " + aumento + " pies");
        variarAlturaDeVuelo(obtenerAlturaDeVuelo() + aumento);
    }

    @Override
    public void disminuirAlturaDeVuelo(int descenso) {
        mensaje("Disminuyendo la altura de vuelo en " + descenso + " pies");
        variarAlturaDeVuelo(obtenerAlturaDeVuelo() - descenso);
    }

    @Override
    public int obtenerAlturaDeVuelo() {
        return altura;
    }

    @Override
    public void variarAlturaDeVuelo(int altura) {
        this.altura = altura;
        mensaje("Altura de vuelo establecida en " + obtenerAlturaDeVuelo()
                + " pies");
    }

    @Override
    public void despegar() {
        mensaje("Procediendo a realizar la maniobra de despegue");
        aumentarAlturaDeVuelo(150);
        cerrarTrenDeAterrizaje();
        aumentarAlturaDeVuelo(1000);
        mensaje("Maniobra de despegue concluida");
    }

    @Override
    public void aterrizar() {
        mensaje("Procediendo a realizar la maniobra de aterrizaje");
        variarAlturaDeVuelo(200);
        abrirTrenDeAterrizaje();
        disminuirAlturaDeVuelo(200);
        mensaje("Maniobra de aterrizaje concluida");
    }

    @Override
    public String obtenerIdentificacion() {
        return id;
    }

    @Override
    public void establecerIdentificacion(String identificacion) {
        mensaje("Cambio de número de vuelo a" + identificacion);
        id = identificacion;
    }

    private void mensaje(String informacion) {
        System.out.println("Airbus340 - Vuelo "
                + obtenerIdentificacion() + ":" + informacion);
    }

    @Override
    public void abrirTrenDeAterrizaje() {
        trenAbierto = true;
        mensaje("Tren de aterrizaje abierto");
    }

    @Override
    public void cerrarTrenDeAterrizaje() {
        trenAbierto = false;
        mensaje("Tren de aterrizaje cerrado");
    }

    public int capacidad() {
        return 295;
    }

    public int obtenerPlazasOcupadas() {
        return pasajeros;
    }
}
