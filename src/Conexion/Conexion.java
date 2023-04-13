/*
 * Fecha de creacion: 10/04/2023 21:11:18
 * Version: v.0.1
 * Detalles: Establecer la conexion con la base de datos
 */

package Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * @author Willy Stbn
 */

public class Conexion {
    
    Connection cn;
    
    public Connection getConexion(){
        String user = "root";
        String pass = "";
        String baseDatos = "jdbc:mysql://localhost:3306/sistema_venta2";
        //String mysql = "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
        
        try {
            cn = DriverManager.getConnection(baseDatos, user, pass);
            //return cn;
        } catch (SQLException error) {
            try {
                System.out.println("Clase: Conexion");
                System.err.println("Error al conectar con la base datos.\n" + error);
                //return null;
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Clase: Conexion");
                System.err.println("Error al cerrar la conexion con la base de datos!\n" + ex);
            }
        } 
        
        return cn;
    }
    
}
