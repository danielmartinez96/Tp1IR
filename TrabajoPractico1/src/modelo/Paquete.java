/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Paquete {
    private String nombre;
    private String descripcion;
    private String itinerario;
    private String condicionComerciales;
    private int cantDias;
    private int cantNoches;
    private EstadoPaquete estado;
    private Ciudad origen;
    private ArrayList<Ciudad> destinos;
    private ArrayList<ServicioPaquete> paquetes;
    private ArrayList<PasoFronterizo> pasosFronterizos;

    public Paquete()
    {
        this.destinos = new ArrayList<>();
        this.paquetes = new ArrayList<>();
        this.pasosFronterizos = new ArrayList<>();
    }
    
    public ArrayList<PasoFronterizo> getPasosFronterizos() {
        return pasosFronterizos;
    }

    public void setPasosFronterizos(ArrayList<PasoFronterizo> pasosFronterizos) {
        this.pasosFronterizos = pasosFronterizos;
    }

    public EstadoPaquete getEstado() {
        return estado;
    }

    public void setEstado(EstadoPaquete estado) {
        this.estado = estado;
    }
    
    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public ArrayList<Ciudad> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<Ciudad> destinos) {
        this.destinos = destinos;
    }

    public ArrayList<ServicioPaquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<ServicioPaquete> paquetes) {
        this.paquetes = paquetes;
    }

    public Paquete(String nombre, String descripcion, String itinerario, String condicionComerciales, int cantDias, int cantNoches) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.itinerario = itinerario;
        this.condicionComerciales = condicionComerciales;
        this.cantDias = cantDias;
        this.cantNoches = cantNoches;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public String getCondicionComerciales() {
        return condicionComerciales;
    }

    public void setCondicionComerciales(String condicionComerciales) {
        this.condicionComerciales = condicionComerciales;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public int getCantNoches() {
        return cantNoches;
    }

    public void setCantNoches(int cantNoches) {
        this.cantNoches = cantNoches;
    }
}
