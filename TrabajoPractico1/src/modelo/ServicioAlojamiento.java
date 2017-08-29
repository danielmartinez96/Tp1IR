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
public class ServicioAlojamiento extends ServicioSalida{
    private int numEstrella;
    private Ciudad cuidad;

    public int getNumEstrella() {
        return numEstrella;
    }

    public void setNumEstrella(int numEstrella) {
        this.numEstrella = numEstrella;
    }

    public Ciudad getCuidad() {
        return cuidad;
    }

    public void setCuidad(Ciudad cuidad) {
        this.cuidad = cuidad;
    }
}
