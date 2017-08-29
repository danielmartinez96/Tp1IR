/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class Provincia {
    private String nombre;
    private Pais pais;

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre +","+ pais;
    }
    
}
