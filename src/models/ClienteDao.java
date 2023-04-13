/*
 * Fecha de creacion: 12/04/2023 10:16:30
 * Version: v.0.1
 * Detalles: 
 */

package models;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Willy Stbn
 */

public class ClienteDao {
    
    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean RegistrarCliente(Clientes clie) {
        String IntruccionSQL = "INSERT INTO clientes (nombre, telefono, direccion) VALUES (?,?,?)";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, clie.getNombre());
            pst.setString(2, clie.getTelefono());
            pst.setString(3, clie.getDireccion());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: UsuariosDao");
            System.err.println("Error al guardar informacion del cliente.\n" + error);
            return false;
        } finally {

            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion con la base datos.");
            }

        }
    }
    
    public List ListarClientes(String valor){
        
        List<Clientes> listaClientes = new ArrayList<>();
        String IntruccionSql = "SELECT * FROM clientes ORDER BY estado ASC";
        String buscarSQL = "SELECT * FROM clientes WHERE nombre LIKE '%" + valor + "%' OR telefono LIKE '%" + valor + "%'";
        
        try {
            cn = con.getConexion();
            //|| valor.equalsIgnoreCase("")
            if(valor.equalsIgnoreCase("Ingrese un cliente para buscar")){
                pst = cn.prepareStatement(IntruccionSql);
                rs = pst.executeQuery();
            } else {
                pst = cn.prepareStatement(buscarSQL);
                rs = pst.executeQuery();
            }
            
            
            while(rs.next()){
                Clientes cliente = new Clientes();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setEstado(rs.getString("estado"));

                
                listaClientes.add(cliente);
            }
            
        } catch (SQLException e) {
            System.out.println("Clase: ClienteDao");
            System.err.println("Error al consultar informacion de los clientes.\n" + e);
        }finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n" + e.toString());
            }
        }
        return listaClientes;
        
    }
    
    public boolean ModificarCliente(Clientes cliente) {
        String IntruccionSQL = "UPDATE clientes SET nombre=?, telefono=?, direccion=? WHERE id=?";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, cliente.getNombre());
            pst.setString(2, cliente.getTelefono());
            pst.setString(3, cliente.getDireccion());
            pst.setInt(4, cliente.getId());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: ClienteDao");
            System.err.println("Error al modificar informacion del Cliente.\n" + error);
            return false;
        } finally {

            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion con la base datos.");
            }

        }
    }
    
    public boolean AccionTablaCliente(String solicitud, int id){
        
        String InstruccionSQl = "UPDATE clientes SET estado=? WHERE id=?";
        
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(InstruccionSQl);
            pst.setString(1, solicitud);
            pst.setInt(2, id);
            
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: ClienteDao");
            System.err.println("No se pudo actualizar el estado del cliente.\n" + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.");
            }
        }
    }
    
}
