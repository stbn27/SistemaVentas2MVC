/*
 * Fecha de creacion: 12/04/2023 10:15:01
 * Version: v.0.1
 * Detalles: Variables de los clientes
 */

package models;

/**
 * @author Willy Stbn
 */

public class Clientes {

    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String estado;

    public Clientes() {
        
    }

    public Clientes(int id, String nombre, String telefono, String direccion, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
