/*
 * Fecha de creacion: 13/04/2023 22:01:24
 * Version: v.0.1
 * Detalles: Métodos para la base de datos dee la tabla medida
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
public class MedidaDao {

    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;

    public boolean ResgistrarMedida(Medida md) {
        String instruccionSQL = "INSERT INTO medidas (nombre, nombre_corto) VALUES (?,?)";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setString(1, md.getNombre());
            pst.setString(2, md.getNombre_corto());
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: MedidaDao");
            System.err.println("Error al registrar medida: \n" + e);
            return false;
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.");
            }
        }
    }

    public List ListarMedidas(String vBuscar) {
        //String instruccionSQL1 = "SELECT * FROM medidas ORDER BY estado ASC AND id";
        String instruccionSQL1 = "SELECT * FROM medidas ORDER BY CASE estado  WHEN 'Activo' THEN 1 WHEN 'Inactivo' THEN 2 END,id";
        String instruccionSQL2 = "SELECT * FROM medidas WHERE nombre  LIKE '%" + vBuscar + "%' OR nombre_corto LIKE '%" + vBuscar + "%'";
        List<Medida> listaMedidas = new ArrayList<>();
        try {
            cn = con.getConexion();
            if (vBuscar.equalsIgnoreCase("") || vBuscar.equalsIgnoreCase("Ingrese una medida para buscar")) {
                pst = cn.prepareStatement(instruccionSQL1);
                rs = pst.executeQuery();
            } else {
                pst = cn.prepareStatement(instruccionSQL2);
                rs = pst.executeQuery();
            }
            while(rs.next()){
                Medida med = new Medida();
                med.setId(rs.getInt("id"));
                med.setNombre(rs.getString("nombre"));
                med.setNombre_corto(rs.getString("nombre_corto"));
                med.setEstado(rs.getString("estado"));
                listaMedidas.add(med);
            }
        } catch (SQLException e) {
            System.out.println("Error clase: MedidaDao");
            System.err.println("Error al consultar informacion de las medidas.\n" + e);
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n" + e);
            }
        }
        
        return listaMedidas;
    }

    public boolean ModificarMedida(Medida med){
        String instruccionSQL = "UPDATE medidas SET nombre=?, nombre_corto=? WHERE id=?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setString(1, med.getNombre());
            pst.setString(2, med.getNombre_corto());
            pst.setInt(3, med.getId());
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: MedidaDao");
            System.err.println("Error al actualizar informacion del cliente.\n" + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n"  +e);
            }
        }
    }
    
    public boolean EliminarMedida(int id){
        String instruccionSQL = "DELETE FROM medidas WHERE id=?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: MedidasDao");
            System.err.println("Error al eliminar la medida.\n" + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base datos.\n" + e);
            }
        }
    }
    
    public boolean ActualizarEstadoMedida(String estado, int id){
        String instruccionSQL = "UPDATE medidas SET estado = ? WHERE id = ?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setString(1, estado);
            pst.setInt(2, id);
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: MedidaDao");
            System.err.println("Error al actualizar estado de la medida: \n" + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n" + e);
            }
        }
    }
    
}
