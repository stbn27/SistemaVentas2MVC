/*
 * Fecha de creacion: 13/04/2023 00:17:18
 * Version: v.0.1
 * Detalles: Conexion con la base datos en la tabla categoria
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

public class CategoriaDao {
    
    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean RegistrarCategoria(Categoria cat) {
        String IntruccionSQL = "INSERT INTO categoria (categoria) VALUES (?)";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, cat.getNombre());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: CategoriaDao");
            System.err.println("Error al guardar nombre de la categoria.\n" + error);
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
    
    public List ListarCategoria(String valor){
        
        List<Categoria> listaCategoria = new ArrayList<>();
        String IntruccionSql = "SELECT * FROM categoria";
        String buscarSQL = "SELECT * FROM categoria WHERE categoria LIKE '%" + valor + "%'";
        
        try {
            cn = con.getConexion();
            if(valor.equalsIgnoreCase("Ingrese una categoria para buscar") || valor.equalsIgnoreCase("")){
                pst = cn.prepareStatement(IntruccionSql);
                rs = pst.executeQuery();
            } else {
                pst = cn.prepareStatement(buscarSQL);
                rs = pst.executeQuery();
            }

            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("categoria"));
                categoria.setEstado(rs.getString("estado"));

                listaCategoria.add(categoria);
            }
            
        } catch (SQLException e) {
            System.out.println("Clase: CategoriaDao");
            System.err.println("Error al consultar informacion de las categorias.\n" + e);
        }finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n" + e.toString());
            }
        }
        return listaCategoria;
        
    }
    
    public boolean ModificarCategoria(Categoria categoria) {
        String IntruccionSQL = "UPDATE categoria SET categoria=? WHERE id=?";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, categoria.getNombre());
            pst.setInt(2, categoria.getId());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: Categoria Dao");
            System.err.println("Error al modificar informacion de la categoria.\n" + error);
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
        
        String InstruccionSQl = "UPDATE categoria SET estado=? WHERE id=?";
        
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(InstruccionSQl);
            pst.setString(1, solicitud);
            pst.setInt(2, id);
            
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: Categoria Dao");
            System.err.println("No se pudo actualizar el estado de la categoria.\n" + e);
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
