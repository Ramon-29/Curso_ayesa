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
public class ReproductorPortatil implements IReproductorPortatil {

    private String _Marca;
    private String _Modelo;
    private boolean _ReproduceSonido;
    private boolean _ReproduceVideo;
    private TipoDeAlmacenamiento _TipoAlmacenamiento;
    private int _CapacidadDeAlmacenamiento;
    private TipoDePantalla _TipoPantalla;
    private TipoDeBateria _TipoBateria;
    private int _Autonomia;
    private double _Peso;
    private double _Alto;
    private double _Ancho;
    private double _Grosor;

    public ReproductorPortatil(String _Marca, String _Modelo, TipoDeAlmacenamiento _TipoAlmacenamiento) {
        this._Marca = _Marca;
        this._Modelo = _Modelo;
        this._TipoAlmacenamiento = _TipoAlmacenamiento;
    }

    @Override
    public void setMarca(String marca) {
        this._Marca = marca;
    }

    @Override
    public String getMarca() {
        return this._Marca;
    }

    @Override
    public void setModelo(String modelo) {
        this._Modelo = modelo;
    }

    @Override
    public String getModelo() {
        return this._Modelo;
    }

    @Override
    public void setReproduceSonido(boolean reproduce) {
        this._ReproduceSonido = reproduce;
    }

    @Override
    public boolean isReproduceSonido() {
        return this._ReproduceSonido;
    }

    @Override
    public void setReproduceVideo(boolean reproduce) {
        this._ReproduceVideo = reproduce;
    }

    @Override
    public boolean isReproduceVideo() {
        return this._ReproduceVideo;
    }

    @Override
    public void setTipoDeAlmacenamiento(TipoDeAlmacenamiento tipoAlmacenamiento) {
        this._TipoAlmacenamiento = tipoAlmacenamiento;
    }

    @Override
    public TipoDeAlmacenamiento getTipoDeAlmacenamiento() {
        return this._TipoAlmacenamiento;
    }

    @Override
    public void setCapacidadDeAlmacenamiento(int capacidad) {
        this._CapacidadDeAlmacenamiento = capacidad;
    }

    @Override
    public int getCapacidadDeAlmacenamiento() {
        return this._CapacidadDeAlmacenamiento;
    }

    @Override
    public void setPantalla(TipoDePantalla tipoPantalla) {
        this._TipoPantalla = tipoPantalla;
    }

    @Override
    public TipoDePantalla getPantalla() {
        return this._TipoPantalla;
    }

    @Override
    public void setTipoDeBateria(TipoDeBateria tipoBateria) {
        this._TipoBateria = tipoBateria;
    }

    @Override
    public TipoDeBateria getTipoDeBateria() {
        return this._TipoBateria;
    }

    @Override
    public void setAutonomia(int autonomia) {
        this._Autonomia = autonomia;
    }

    @Override
    public int getAutonomia() {
        return this._Autonomia;
    }

    @Override
    public double getPeso() {
        return this._Peso;
    }

    @Override
    public void setPeso(double _Peso) {
        this._Peso = _Peso;
    }

    @Override
    public double getAlto() {
        return this._Alto;
    }

    @Override
    public void setAlto(double _Alto) {
        this._Alto = _Alto;
    }

    @Override
    public double getAncho() {
        return this._Ancho;
    }

    @Override
    public void setAncho(double _Ancho) {
        this._Ancho = _Ancho;
    }

    @Override
    public double getGrosor() {
        return this._Grosor;
    }

    @Override
    public void setGrosor(double _Grosor) {
        this._Grosor = _Grosor;
    }

}
