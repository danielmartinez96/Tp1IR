/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presetador;

import interfaces.IAgregarPaquete;
import interfaces.IListarPaquetes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carlos
 */
public class PresentadorPaquete implements ActionListener {
    private IAgregarPaquete vistaAgregar;
    private IListarPaquetes vistaListar;
    
    public PresentadorPaquete(IAgregarPaquete agregarPaquete) {
        this.vistaAgregar= agregarPaquete;
    }

      public PresentadorPaquete(IListarPaquetes listarPaquetes) {
          this.vistaListar=listarPaquetes;
      }

    
    @Override
    public void actionPerformed(ActionEvent evento) {
     
         String comando = evento.getActionCommand();
         
         switch(comando){
             case "GUARDAR PAQUETE":
             vistaAgregar.guardar();
             break;
             
             
         }
         
    }
    
    
    
}
