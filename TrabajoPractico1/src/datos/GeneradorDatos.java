/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Ciudad;
import modelo.Pais;
import modelo.Provincia;
import modelo.Rubro;
import modelo.Servicio;

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
        Servicio servicio = new Servicio("Tansporte en omnibus", tipo1);
        
        AgenciaTurismo.agregarServicioPaquete(servicio);
        
    }
            
          
    
}
