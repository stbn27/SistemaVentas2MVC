/*
 * Fecha de creacion: 10/04/2023 21:24:22
 * Version: v.0.1
 * Detalles: Realizacion de consultas a la base datos entre usario y MySQL
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
public class UsuariosDao {

    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;

    public Usuarios UsuarioLogin(String usuario, String pass) {

        String instruccionSQL = "SELECT * FROM usuarios WHERE usuario=? AND clave=?";
        Usuarios user = new Usuarios();

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setString(1, usuario);
            pst.setString(2, pass);
            rs = pst.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNombre(rs.getString("nombre"));
                user.setCaja(rs.getString("caja"));
                user.setClave(rs.getString("clave"));
                user.setEstado(rs.getString("estado"));
                user.setRol(rs.getString("rol"));
                user.setUsuario(rs.getString("usuario"));

            }

        } catch (SQLException e) {
            System.out.println("Clase: UsuariosDao");
            System.err.println("Error al conssultar informacion del usuario.\n" + e);

        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.out.println("Clase: Usuarios Dao");
                System.err.println("Error al cerrar conexion con la base de datos.");
            }
        }
        return user;
    }

    public boolean RegistrarUsuario(Usuarios user) {
        String IntruccionSQL = "INSERT INTO usuarios (usuario, nombre, clave, caja, rol) VALUES (?,?,?,?,?)";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, user.getUsuario());
            pst.setString(2, user.getNombre());
            pst.setString(3, user.getClave());
            pst.setString(4, user.getCaja());
            pst.setString(5, user.getRol());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: UsuariosDao");
            System.err.println("Error al guardar informacion de usuario.\n" + error);
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

    public List ListarUsuarios(String valor){
        
        List<Usuarios> listaUsuarios = new ArrayList<>();
        String IntruccionSql = "SELECT * FROM usuarios ORDER BY estado ASC";
        String buscarSQL = "SELECT * FROM usuarios WHERE usuario LIKE '%" + valor + "%' OR NOMBRE LIKE '%" + valor + "%'";
        
        try {
            cn = con.getConexion();
            if(valor.equalsIgnoreCase("Ingrese el nombre del usuario")){
                pst = cn.prepareStatement(IntruccionSql);
                rs = pst.executeQuery();
            } else {
                pst = cn.prepareStatement(buscarSQL);
                rs = pst.executeQuery();
            }
            
            
            while(rs.next()){
                Usuarios us = new Usuarios();
                us.setId(rs.getInt("id"));
                us.setNombre(rs.getString("nombre"));
                us.setUsuario(rs.getString("usuario"));
                us.setClave(rs.getString("clave"));
                us.setCaja(rs.getString("caja"));
                us.setRol(rs.getString("rol"));
                us.setEstado(rs.getString("estado"));
                
                listaUsuarios.add(us);
            }
            
        } catch (SQLException e) {
            System.out.println("Clase: UsuariosDao");
            System.err.println("Error al conectar con la base de datos.\n" + e);
        }finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n" + e.toString());
            }
        }
        return listaUsuarios;
        
    }
    
    public boolean ModificarUsuario(Usuarios user) {
        String IntruccionSQL = "UPDATE usuarios SET usuario=?, nombre=?, caja=?, rol=? WHERE id=?";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, user.getUsuario());
            pst.setString(2, user.getNombre());
            pst.setString(3, user.getCaja());
            pst.setString(4, user.getRol());
            pst.setInt(5, user.getId());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: UsuariosDao");
            System.err.println("Error al modificar informacion del usuario.\n" + error);
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
    
    public boolean AccionTabla(String solicitud, int id){
        
        String InstruccionSQl = "UPDATE usuarios SET estado=? WHERE id=?";
        
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(InstruccionSQl);
            pst.setString(1, solicitud);
            pst.setInt(2, id);
            
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: UsuariosDao");
            System.err.println("No se pudo actualizar el estado del usuario.\n" + e);
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
