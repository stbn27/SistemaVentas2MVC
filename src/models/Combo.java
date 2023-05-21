/*
 * Fecha de creacion: 14/04/2023 20:37:59
 * Version: v.0.1
 * Detalles: 
 */

package models;

/**
 * @author Willy Stbn
 */

public class Combo {
    
    private int id;
    private String nombre;

    public Combo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    
    
}
