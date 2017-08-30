/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.Paquete;

/**
 *
 * @author DanielM
 */
public interface IAgregarSalida {

    void configuracion(ArrayList<Paquete> paquetes);
    void guardar();
    void salir();
}
