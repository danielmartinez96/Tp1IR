/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico1;

import datos.GeneradorDatos;
import presetador.PresentadorInicio;
import vista.Inicio;

/**
 *
 * @author Carlos
 */
public class TrabajoPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeneradorDatos.instaciarDatos();
        Inicio vista = new Inicio();
       
       
    }
    
}
