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
 * @author Carlos
 */
public interface IListarPaquetes {

    void configurar(ArrayList<Paquete> paquetes);
    void modificarPaquete();
    void modificarPaqueteEstado();
    void salir();
}
