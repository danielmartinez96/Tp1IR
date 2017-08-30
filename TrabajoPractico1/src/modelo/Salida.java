/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Carlos
 */
public class Salida {
    private Paquete paquete;
    private int cupoSalida;
    private int numero;
    private Date fecha;
    private Tarifa tarifa;
    private EstadoSalida estado;

    public Salida(Paquete paquete, int cupoSalida, int d,int m, int a, Tarifa tarifa, EstadoSalida estado) {
        this.paquete = paquete;
        this.cupoSalida = cupoSalida;
        this.fecha= new Date(d, m, a);
        this.tarifa = tarifa;
        this.estado = estado;
    }
    

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

    public String getFecha() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        return sdf.format(fecha);
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    private void agregarFecha(int d,int m,int a) {
    
        
    }
}
