/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.Base;
import modelo.Paquete;

/**
 *
 * @author DanielM
 */
public interface IAgregarSalida {

    void configuracion(ArrayList<Paquete> paquetes);
    void guardar();
    int getDia();
    int getMes();
    int getAño();
    int getCupo();
    Paquete getPaquete();
    Base getBase();
    float getTarifa();
    void salir();
}
