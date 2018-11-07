/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.ejercicios03.enunciado03;

/**
 *
 * @author TIC
 */
public interface IReproductorPortatil {

    enum TipoDeAlmacenamiento {
        CD,
        DVD,
        MemoriaFlash,
        MiniDisk
    }

    enum TipoDePantalla {
        Ninguna,
        texto,
        Monocromo,
        Color
    }

    enum TipoDeBateria {
        Pilas,
        Li_Lon,
    }

    public void setMarca(String marca);

    public String getMarca();

    public void setModelo(String modelo);

    public String getModelo();

    public void setReproduceSonido(boolean reproduce);

    public boolean isReproduceSonido();

    public void setReproduceVideo(boolean reproduce);

    public boolean isReproduceVideo();

    public void setTipoDeAlmacenamiento(TipoDeAlmacenamiento tipoAlmacenamiento);

    public TipoDeAlmacenamiento getTipoDeAlmacenamiento();

    public void setCapacidadDeAlmacenamiento(int capacidad);

    public int getCapacidadDeAlmacenamiento();

    public void setPantalla(TipoDePantalla tipoPantalla);

    public TipoDePantalla getPantalla();

    public void setTipoDeBateria(TipoDeBateria tipoBateria);

    public TipoDeBateria getTipoDeBateria();

    public void setAutonomia(int autonomia);

    public int getAutonomia();

    public void setPeso(double peso);

    public double getPeso();

    public void setAncho(double ancho);

    public double getAncho();

    public void setAlto(double alto);

    public double getAlto();

    public void setGrosor(double grosor);

    public double getGrosor();

}
