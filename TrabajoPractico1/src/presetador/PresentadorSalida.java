/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presetador;

import datos.AgenciaTurismo;
import interfaces.IAgregarSalida;
import interfaces.IListarSalida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DanielM
 */
public class PresentadorSalida implements ActionListener{
    private IAgregarSalida vistaAgregar;
    private IListarSalida vistaListar;
    private Vista vista;
    
    public enum Vista{
        AGREGAR,
        LISTAR
    }
    public PresentadorSalida(IAgregarSalida vistaAgeAgregarSalida)
    {
        this.vistaAgregar= vistaAgeAgregarSalida;
        vistaAgregar.configuracion(AgenciaTurismo.getPaquetes());
        vista= Vista.AGREGAR;
    }
    
       public PresentadorSalida(IListarSalida vistaListarSalida)
    {
        this.vistaListar= vistaListarSalida;
        vistaListar.configuracion(AgenciaTurismo.getSalidas());
        vista= Vista.LISTAR;
    }
    
       
       @Override
    public void actionPerformed(ActionEvent evento) {
        String comando = evento.getActionCommand();
        
        // Comando de VISTA AGREGAR
        if(vista == vista.AGREGAR)
        {
            switch(comando)
            {
                case "GUARDAR":
                    vistaAgregar.guardar();
                    break;
                case "SALIR":
                    vistaAgregar.salir();
                    break;
            }
        }
        
        // Comandos de VISTA LISTAR
        if(vista == vista.LISTAR)
        {
            switch(comando){
                case "SALIR":
                    vistaListar.salir();
                    break;
                case "EDITAR":
                    vistaListar.editar();
                    break;
                case "DESACTIVAR":
                    vistaListar.desactivar();
                    break;
            }
        }
    }
       
}
