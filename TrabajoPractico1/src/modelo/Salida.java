/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author Carlos
 */
public class Salida {
    private Paquete paquete;
    private int cupoSalida;
    private int numero;
    private Calendar fecha;
    private Tarifa tarifa;
    private EstadoSalida estado;

    public EstadoSalida getEstado() {
        return estado;
    }

    public void setEstado(EstadoSalida estado) {
        this.estado = estado;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public int getCupoSalida() {
        return cupoSalida;
    }

    public void setCupoSalida(int cupoSalida) {
        this.cupoSalida = cupoSalida;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
}
