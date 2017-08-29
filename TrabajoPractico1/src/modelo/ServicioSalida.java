/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ServicioSalida {
    private int cupo;
    private float precio;
    private ServicioPaquete servicioPaquete;
    private ArrayList<ServicioPrestado> servicioPrestado;

    public ServicioPaquete getServicioPaquete() {
        return servicioPaquete;
    }

    public void setServicioPaquete(ServicioPaquete servicioPaquete) {
        this.servicioPaquete = servicioPaquete;
    }

    public ArrayList<ServicioPrestado> getServicioPrestado() {
        return servicioPrestado;
    }

    public void setServicioPrestado(ArrayList<ServicioPrestado> servicioPrestado) {
        this.servicioPrestado = servicioPrestado;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
