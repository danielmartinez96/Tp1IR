/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Ciudad;
import modelo.Paquete;

/**
 *
 * @author Carlos
 */
public final class AgenciaTurismo {
    private static  ArrayList<Paquete> PAQUETES= new ArrayList<>();
    private static ArrayList<Ciudad> CIUDADES= new ArrayList<>();
    
            
            
public static void agregarPaquete()
{
    
}

public static void agregarCiudad(Ciudad ciudad)
{
 CIUDADES.add(ciudad);
}

public static ArrayList<Ciudad> getCiudades()
{
   return CIUDADES;
}



}
