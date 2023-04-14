/*
 * Fecha de creacion: 13/04/2023 22:01:14
 * Version: v.0.1
 * Detalles: Varibales de la tabla medida BD
 */

package models;

/**
 * @author Willy Stbn
 */

public class Medida {
    
    private int id;
    private String nombre;
    private String nombre_corto;
    private String estado;

    public Medida() {
        
    }

    public Medida(int id, String nombre, String nombre_corto, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.nombre_corto = nombre_corto;
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre_corto(String nombre_corto) {
        this.nombre_corto = nombre_corto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre_corto() {
        return nombre_corto;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
