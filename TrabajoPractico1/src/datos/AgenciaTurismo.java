/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Ciudad;
import modelo.EstadoPaquete;
import modelo.Paquete;
import modelo.Salida;
import modelo.Servicio;


/**
 *
 * @author Carlos
 */
public final class AgenciaTurismo {
    private static  ArrayList<Paquete> PAQUETES= new ArrayList<>();
    private static ArrayList<Ciudad> CIUDADES= new ArrayList<>();
    private static ArrayList<Servicio> SERVICIOS = new ArrayList<>();
    private static ArrayList<Salida> SALIDAS= new ArrayList<>();
            
            
public static void agregarPaquete(Paquete paquete)
{
    PAQUETES.add(paquete);
}

public static ArrayList<Paquete> getPaquetes()
{
    return PAQUETES;
}


public static void agregarCiudad(Ciudad ciudad)
{
 CIUDADES.add(ciudad);
}

public static ArrayList<Ciudad> getCiudades()
{
   return CIUDADES;
}

public static void agregarServicioPaquete(Servicio servicio)
{
    SERVICIOS.add(servicio);
}

public static ArrayList<Servicio> getServicios()
{
    return SERVICIOS;
}

public static void agregarSalida(Salida salida)
{
    SALIDAS.add(salida);
}

public static ArrayList<Salida> getSalidas()
{
    return SALIDAS;
}

public static Ciudad buscarCiudad(String nombre)
{
    for (Ciudad ciudad : CIUDADES) {
        
        if(ciudad.getNombre()== nombre)
           return ciudad; 
    }
    
    return null;
}

public static void actualizarEstadoPaquete(String nombre, EstadoPaquete estado)
{
    Paquete p ;
    for (Paquete paquete : PAQUETES) {
        
        if(paquete.getNombre()== nombre)
        {
           p= paquete;
           int index = PAQUETES.indexOf(p);
           PAQUETES.remove(index);
           p.setEstado(estado);
           PAQUETES.add(index, p);
           break;
        }
    }
   
    
    
}

}
