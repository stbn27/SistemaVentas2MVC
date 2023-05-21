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

public class ProveedorDao {
    
    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean RegistrarProvedor(Proveedor prov) {
        String IntruccionSQL = "INSERT INTO proveedor (rucc, proveedor, telefono, direccion) VALUES (?,?,?,?)";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, prov.getRucc());
            pst.setString(2, prov.getNombre());
            pst.setString(3, prov.getTelefono());
            pst.setString(4, prov.getDireccion());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: ProveedorDao");
            System.err.println("Error al guardar informacion del proveedor.\n" + error);
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
    
    public List ListarProvedor(String valor){
        
        List<Proveedor> listaProveedor = new ArrayList<>();
        String IntruccionSql = "SELECT * FROM proveedor ORDER BY estado ASC";
        String buscarSQL = "SELECT * FROM proveedor WHERE proveedor LIKE '%" + valor + "%' OR rucc LIKE '%" + valor + "%'";
        
        try {
            cn = con.getConexion();
            if(valor.equalsIgnoreCase("Ingrese un provedor para buscar") || valor.equalsIgnoreCase("")){
                pst = cn.prepareStatement(IntruccionSql);
                rs = pst.executeQuery();
            } else {
                pst = cn.prepareStatement(buscarSQL);
                rs = pst.executeQuery();
            }

            while(rs.next()){
                Proveedor prov = new Proveedor();
                prov.setId(rs.getInt("id"));
                prov.setRucc(rs.getString("rucc"));
                prov.setNombre(rs.getString("proveedor"));
                prov.setTelefono(rs.getString("telefono"));
                prov.setDireccion(rs.getString("direccion"));
                prov.setEstado(rs.getString("estado"));

                listaProveedor.add(prov);
            }
            
        } catch (SQLException e) {
            System.out.println("Clase: ProveedorDao");
            System.err.println("Error al consultar informacion de los proveedores.\n" + e);
        }finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n" + e.toString());
            }
        }
        return listaProveedor;
        
    }
    
    public boolean ModificarProvedor(Proveedor provd) {
        String IntruccionSQL = "UPDATE proveedor SET rucc=?, proveedor=?, telefono=?, direccion=? WHERE id=?";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, provd.getRucc());
            pst.setString(2, provd.getNombre());
            pst.setString(3, provd.getTelefono());
            pst.setString(4, provd.getDireccion());
            pst.setInt(5, provd.getId());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: Proveedor Dao");
            System.err.println("Error al modificar informacion del provedor.\n" + error);
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
    
    public boolean AccionTablaProveedor(String solicitud, int id){
        
        String InstruccionSQl = "UPDATE proveedor SET estado=? WHERE id=?";
        
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(InstruccionSQl);
            pst.setString(1, solicitud);
            pst.setInt(2, id);
            
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: ProvedorDao");
            System.err.println("No se pudo actualizar el estado del proveedor.\n" + e);
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
