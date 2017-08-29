/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class ServicioPaquete extends Servicio{
    private int desde;
    private int hasta;
    private Servicio servicio;

    public ServicioPaquete(Servicio servicio, String descripcion, Tipo tipo) {
        super(descripcion, tipo);
        this.servicio = servicio;
    }

   
   

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getDesde() {
        return desde;
    }

    public void setDesde(int desde) {
        this.desde = desde;
    }

    public int getHasta() {
        return hasta;
    }

    public void setHasta(int hasta) {
        this.hasta = hasta;
    }
}
