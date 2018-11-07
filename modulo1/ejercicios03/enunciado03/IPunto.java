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
public interface IPunto {

    public void borrar();

    public void mover(double x, double y);

    public void mover(IPunto p);

    public double distancia(IPunto p);

    public double getX();

    public double getY();

    public void setX(double x) throws Exception;

    public void setY(double y) throws Exception;
}
