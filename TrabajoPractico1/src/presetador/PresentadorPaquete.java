/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presetador;

import datos.AgenciaTurismo;
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
    private Vista vista;
    
    public enum Vista{
        AGREGAR,
        LISTAR
    }
    
    public PresentadorPaquete(IAgregarPaquete agregarPaquete) {
        this.vistaAgregar= agregarPaquete;
        vistaAgregar.configurar(AgenciaTurismo.getCiudades(),AgenciaTurismo.getServicios());
        vista= Vista.AGREGAR;
    }

      public PresentadorPaquete(IListarPaquetes listarPaquetes) {
          this.vistaListar=listarPaquetes;
          vistaListar.configurar(AgenciaTurismo.getPaquetes());
          vista=Vista.LISTAR;
      }

    
    @Override
    public void actionPerformed(ActionEvent evento) {
     
        
         String comando = evento.getActionCommand();
      // COMANDOS DE VISTA AGREGAR
         if(vista==Vista.AGREGAR){
         switch(comando){
             case "GUARDAR PAQUETE":
             vistaAgregar.guardar();
             break;
             case "AGREGAR DESTINO":
             vistaAgregar.agregarDestino();
             break;    
             case "AGREGAR SERVICIO":
             vistaAgregar.agregarServicio();
             break;  
             case "QUITAR DESTINO":
             vistaAgregar.quitarDestino();
             break;
             case "QUITAR SERVICIO":
             vistaAgregar.quitarServicio();
            }   
         }
         // COMANDOS DE VISTA LISTAR
          if(vista==Vista.LISTAR){
               switch(comando){
                   
                   
                   
                   
               }

          }
         
         
    }
    
    
    
}
