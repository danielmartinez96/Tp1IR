/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presetador;

import interfaces.IInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Inicio;

/**
 *
 * @author Carlos
 */
public class Controlador implements ActionListener {

    private IInicio vista;
    
    
    public Controlador(IInicio vista) {
        
        this.vista= vista;
    }

    @Override
    public void actionPerformed() {
       
    }

}
