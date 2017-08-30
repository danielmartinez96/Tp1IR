/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Calendar;
import java.util.Date;
import modelo.Base;
import modelo.Ciudad;
import modelo.EstadoPaquete;
import modelo.EstadoSalida;
import modelo.Pais;
import modelo.Paquete;
import modelo.PasoFronterizo;
import modelo.Provincia;
import modelo.Rubro;
import modelo.Salida;
import modelo.Servicio;
import modelo.ServicioPaquete;
import modelo.Tarifa;

import modelo.Tipo;

/**
 *
 * @author Carlos
 */
public final class GeneradorDatos {
    
    public static void instaciarDatos(){
        Pais pais1 =new Pais("Argentina");
        Provincia provincia1= new Provincia("Salta", pais1);
        Ciudad ciudad1 = new Ciudad("metan",provincia1);
       
        AgenciaTurismo.agregarCiudad(ciudad1);
        
        Rubro rubro1 = new Rubro("Transporte");
        Tipo tipo1 = new Tipo("Omnibus", rubro1);
        Servicio servicio1 = new Servicio("Tansporte en omnibus", tipo1);
        
        AgenciaTurismo.agregarServicioPaquete(servicio1);
        
        Paquete paquete1 = new Paquete("Paquete 1", "A metan transporte y hotel", "Transporte luego Hotel", "Ni ideas", 2 , 4);
        paquete1.setOrigen(ciudad1);
        paquete1.agregarCiudadDestino(ciudad1);
        ServicioPaquete servicioPaquete1 = new ServicioPaquete(servicio1,1, 2);
        paquete1.agregarServicio(servicioPaquete1);
        
        PasoFronterizo pasoFronterizo1= new PasoFronterizo("Paso Fronterizo de Arq", pais1);
        paquete1.agregarPasoFronterizo(pasoFronterizo1); 
        paquete1.setEstado(EstadoPaquete.Creado);
        
        AgenciaTurismo.agregarPaquete(paquete1);
        
        
        Salida salida = new Salida(paquete1, 10, 5, 10, 2010, new Tarifa(1000, Base.Doble), EstadoSalida.Creada);
        AgenciaTurismo.agregarSalida(salida);
        
        
        
    }
            
          
    
}
