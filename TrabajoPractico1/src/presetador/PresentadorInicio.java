/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presetador;

import datos.AgenciaTurismo;
import interfaces.IInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Inicio;

/**
 *
 * @author Carlos
 */
public class PresentadorInicio implements ActionListener {

    private IInicio vista;
    
    
    public PresentadorInicio(IInicio vista) {
        
        this.vista= vista;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
       
        String comando = evento.getActionCommand();
        
        switch(comando)
        {
            case "LISTAR PAQUETE":
            vista.MostrarListarPaquete();
            break;
            case "NUEVO PAQUETE":
            vista.MostrarCrearPaquete();
            break;
            case "LISTAR SALIDA":
            vista.MostrarListarSalida();
            break;
            case "NUEVO SALIDA":
            vista.MostrarCrearSalida();
            break;
            default:
            System.out.println("Error");
            break;
        }
        
    }

}
