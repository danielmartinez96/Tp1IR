/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Ciudad;
import modelo.Pais;
import modelo.Provincia;

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
        
    }
            
          
    
}
