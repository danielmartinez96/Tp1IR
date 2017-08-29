/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.Ciudad;
import modelo.Servicio;

/**
 *
 * @author Carlos
 */
public interface IAgregarPaquete {
    
    void configurar(ArrayList<Ciudad> ciudades, ArrayList<Servicio> servicios);
    void agregarDestino();
    void guardar();
}
