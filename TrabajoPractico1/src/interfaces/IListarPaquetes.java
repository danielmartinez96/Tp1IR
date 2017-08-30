/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.EstadoPaquete;
import modelo.Paquete;

/**
 *
 * @author Carlos
 */
public interface IListarPaquetes {

    void salir();
    void configurar(ArrayList<Paquete> paquetes);
    void modificarPaquete();
    EstadoPaquete modificarPaqueteEstado();
    String getPaquete();
    
   
}
