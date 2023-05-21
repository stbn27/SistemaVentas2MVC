/*
 * Fecha de creacion: 14/04/2023 13:56:54
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
public class ProductosDao {

    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    // Ventana Nuevo Producto
    public boolean RegistrarProducto(Productos producto) {
        String IntruccionSQL = "INSERT INTO productos"
                + "(codigo, descripcion, precio_compra, precio_venta, id_provedor, id_medida, id_categoria)"
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, producto.getCodigo());
            pst.setString(2, producto.getDescripcion());
            pst.setDouble(3, producto.getPrecio_compra());
            pst.setDouble(4, producto.getPrecio_venta());
            pst.setInt(5, producto.getId_proveedor());
            pst.setInt(6, producto.getId_medida());
            pst.setInt(7, producto.getId_categoria());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: ProdutcosDao");
            System.err.println("Error al guardar informacion del producto.\n" + error);
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

    public List ListarProductos(String valor) {

        List<Productos> listaProductos = new ArrayList<>();
        String IntruccionSql = "SELECT * FROM productos ORDER BY CASE estado  WHEN 'Activo' THEN 1 WHEN 'Pausado' THEN 2 END,id";
        String buscarSQL = "SELECT * FROM productos WHERE codigo LIKE '%" + valor + "%' OR descripcion LIKE '%" + valor + "%'";

        try {
            cn = con.getConexion();
            if (valor.equalsIgnoreCase("Ingrese el nombre de un producto para buscar")) {
                pst = cn.prepareStatement(IntruccionSql);
                rs = pst.executeQuery();
            } else {
                pst = cn.prepareStatement(buscarSQL);
                rs = pst.executeQuery();
            }

            while (rs.next()) {
                Productos productos = new Productos();
                productos.setId(rs.getInt("id"));
                productos.setCodigo(rs.getString("codigo"));
                productos.setDescripcion(rs.getString("descripcion"));
                productos.setCantidad(rs.getInt("cantidad"));
                productos.setPrecio_compra(rs.getDouble("precio_compra"));
                productos.setPrecio_venta(rs.getDouble("precio_venta"));
                productos.setId_proveedor(rs.getInt("id_provedor"));
                productos.setId_medida(rs.getInt("id_medida"));
                productos.setId_categoria(rs.getInt("id_categoria"));
                productos.setEstado(rs.getString("estado"));

                listaProductos.add(productos);
            }

        } catch (SQLException e) {
            System.out.println("Clase: ProductosDao");
            System.err.println("Error al consultar informacion de los productos.\n" + e);
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n" + e.toString());
            }
        }
        return listaProductos;

    }

    public boolean ModificarProducto(Productos producto) {
        String IntruccionSQL = "UPDATE produtos SET codigo=?, descripcion=?, precio_compra=?, precio_venta=?, id_provedor=?, id_medida=?, id_categoria=? WHERE id = ?";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(IntruccionSQL);
            pst.setString(1, producto.getCodigo());
            pst.setString(2, producto.getDescripcion());
            pst.setDouble(3, producto.getPrecio_compra());
            pst.setDouble(4, producto.getPrecio_compra());
            pst.setInt(5, producto.getId_proveedor());
            pst.setInt(6, producto.getId_medida());
            pst.setInt(7, producto.getId_categoria());
            pst.setInt(8, producto.getId());

            pst.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Clase: Producto Dao");
            System.err.println("Error al modificar informacion del producto.\n" + error);
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

    public boolean ModificarEstado(String solicitud, int id) {

        String InstruccionSQl = "UPDATE productos SET estado=? WHERE id=?";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(InstruccionSQl);
            pst.setString(1, solicitud);
            pst.setInt(2, id);

            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: ProductoDao - Modificar estado");
            System.err.println("No se pudo actualizar el estado del producto.\n" + e);
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

    public boolean EliminarProducto(int id) {
        String instruccionSQL = "DELETE FROM producto WHERE id=?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: ProductoDao");
            System.err.println("Error al eliminar la producto.\n" + e);
            return false;
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base datos.\n" + e);
            }
        }
    }

    public Productos comparar(int id) {
        String instruccionSQL = "SELECT * FROM productos WHERE id = ?";
        Productos productos = new Productos();
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {

                productos.setId(rs.getInt("id"));
                productos.setCodigo(rs.getString("codigo"));
                productos.setDescripcion(rs.getString("descripcion"));
                productos.setPrecio_compra(rs.getDouble("precio_compra"));
                productos.setPrecio_venta(rs.getDouble("precio_venta"));
                productos.setId_proveedor(rs.getInt("id_provedor"));
                productos.setId_medida(rs.getInt("id_medida"));
                productos.setId_categoria(rs.getInt("id_categoria"));
                productos.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
            System.out.println("Error clase: ProductosDao");
            System.err.println("Error al consultar informacion del producto\n" + e);
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.");
            }
        }
        return productos;
    }

    public Productos BuscarProducto(int id) {
        String InstruccionSQL = "SELECT p.* , pr.id, pr.proveedor, m.id, m.medida, c.id, c.categoria FROM productos p INNER JOIN "
                + "proveedor pr ON p.id_provedor = pr.id INNER JOIN medidas m ON p.id_medida = m.id INNER JOIN "
                + "categoria c ON p.id_categoria = c.id WHERE p.id= ?";
        Productos productos = new Productos();
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(InstruccionSQL);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
                productos.setCodigo(rs.getString("codigo"));
                productos.setDescripcion(rs.getString("descripcion"));
                productos.setPrecio_compra(rs.getDouble("precio_compra"));
                productos.setPrecio_venta(rs.getDouble("precio_venta"));
                productos.setId_medida(rs.getInt("id_medida"));
                productos.setId_proveedor(rs.getInt("id_provedor"));
                productos.setId_categoria(rs.getInt("id_categoria"));
                productos.setProveedor(rs.getString("proveedor"));
                productos.setCategoria(rs.getString("categoria"));
                productos.setMedida(rs.getString("medida"));
                
            }
        } catch (SQLException e) {
            System.out.println("Error clase ProductosDao - Buscar producto.");
            System.err.println("Error al buscar producto en la base de datos.\n" + e);
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexión con  la base de datos.");
            }
        }
        return productos;
    }

    //Ventana Nueva Venta
    public Productos BuscarCodigo(String codigo) {
        String InstruccionSQL = "SELECT * FROM  productos WHERE codigo = ?";
        Productos productos = new Productos();
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(InstruccionSQL);
            pst.setString(1, codigo);
            rs = pst.executeQuery();
            if(rs.next()){
                productos.setId(rs.getInt("id"));
                productos.setDescripcion(rs.getString("descripcion"));
                productos.setPrecio_compra(rs.getDouble("precio_compra"));
                
            }
        } catch (SQLException e) {
            System.out.println("Error clase ProductosDao - Buscar producto.");
            System.err.println("Error al buscar producto en la base de datos.\n" + e);
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexión con  la base de datos.");
            }
        }
        return productos;
    }
}
