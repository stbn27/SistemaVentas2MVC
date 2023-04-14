/*
 * Fecha de creacion: 13/04/2023 00:16:03
 * Version: v.0.1
 * Detalles: Variables de la tabla cateorias BD
 */

package models;

/**
 * @author Willy Stbn
 */

public class Categoria {

    private int id;
    private String nombre;
    private String estado;

    public Categoria() {
        
    }

    public Categoria(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
