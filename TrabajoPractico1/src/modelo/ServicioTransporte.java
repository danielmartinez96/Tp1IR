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
public class ServicioTransporte extends ServicioSalida{
    private ArrayList<Ciudad> destinos;
    private Ciudad origen;
    private int butaca;

    public int getButaca() {
        return butaca;
    }

    public void setButaca(int butaca) {
        this.butaca = butaca;
    }
    

    public ArrayList<Ciudad> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<Ciudad> destinos) {
        this.destinos = destinos;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }
    
    
}
