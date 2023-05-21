/*
 * Fecha de creacion: 14/04/2023 20:17:48
 * Version: v.0.1
 * Detalles: Función logica con lainterfaz de NuevoProducto.
 */
package controllers;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.Categoria;
import models.CategoriaDao;
import models.Combo;
import models.Medida;
import models.MedidaDao;
import models.Productos;
import models.ProductosDao;
import models.Proveedor;
import models.ProveedorDao;
import models.Tables;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import views.NuevaProducto;

/**
 * @author Willy Stbn
 */
public class ProductoController implements ActionListener, MouseListener, KeyListener {

    private Productos producto;
    private ProductosDao productoDao;
    private NuevaProducto nPro;
    ProveedorDao provDao = new ProveedorDao();
    MedidaDao medida = new MedidaDao();
    CategoriaDao categoria = new CategoriaDao();
    DefaultTableModel modelo = new DefaultTableModel();

    public ProductoController(Productos producto, ProductosDao productoDao, NuevaProducto nPro) {
        this.producto = producto;
        this.productoDao = productoDao;
        this.nPro = nPro;

        this.nPro.btn_ModificarPro.addActionListener(this);
        this.nPro.btn_NuevoPro.addActionListener(this);
        this.nPro.btn_RegistrarPro.addActionListener(this);
        this.nPro.opcion_Activar.addActionListener(this);
        this.nPro.opcion_Eliminar.addActionListener(this);
        this.nPro.opcion_inhabilitar.addActionListener(this);

        this.nPro.txt_BuscarProducto.addMouseListener(this);
        this.nPro.txt_CodigoPro.addMouseListener(this);
        this.nPro.txt_DescripcionPro.addMouseListener(this);
        this.nPro.txt_PrecioCompraPro.addMouseListener(this);
        this.nPro.txt_PrecioVentaPro.addMouseListener(this);
        this.nPro.tabla_Productos.addMouseListener(this);
        this.nPro.cmb_ProvedorPro.addMouseListener(this);
        
        this.nPro.txt_BuscarProducto.addKeyListener(this);

        llenarProveedor();
        llenarMedida();
        llenarCategoria();

        AutoCompleteDecorator.decorate(nPro.cmb_MedidaPro);
        AutoCompleteDecorator.decorate(nPro.cmb_ProvedorPro);
        AutoCompleteDecorator.decorate(nPro.cmb_categoriaPro);

        ListarProductos();
    }

    /*¨**************************** Botones ***************************/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nPro.btn_NuevoPro) {    //Boton limpiar campos
            LimpiarCampos();
            LimpiarTabla();
            ListarProductos();

        } else if (e.getSource() == nPro.btn_RegistrarPro) {    //Botón añadir nuevo
            if (ValidarCampos()) {
                nPro.label_Error.setVisible(false);
                String codigo = nPro.txt_CodigoPro.getText().trim();
                String descripcion = nPro.txt_DescripcionPro.getText().trim();
                String precioCompra = nPro.txt_PrecioCompraPro.getText().trim();
                String precioVenta = nPro.txt_PrecioVentaPro.getText().trim();

                producto.setCodigo(codigo);
                producto.setDescripcion(descripcion);
                producto.setPrecio_compra(Double.parseDouble(precioCompra));
                producto.setPrecio_venta(Double.parseDouble(precioVenta));

                Combo item1 = (Combo) nPro.cmb_ProvedorPro.getSelectedItem();
                Combo item2 = (Combo) nPro.cmb_MedidaPro.getSelectedItem();
                Combo item3 = (Combo) nPro.cmb_categoriaPro.getSelectedItem();

                producto.setId_proveedor(item1.getId());
                producto.setId_medida(item2.getId());
                producto.setId_categoria(item3.getId());

                if (productoDao.RegistrarProducto(producto)) {
                    nPro.label_Error.setVisible(false);
                    LimpiarTabla();
                    ListarProductos();
                    JOptionPane.showMessageDialog(null, "Producto registrada exitosamente.");
                    LimpiarCampos();
                } else {
                    nPro.label_Error.setText("¡¡Error al resgistrar información!!.");
                    nPro.label_Error.setVisible(true);
                }
            }

        } else if (e.getSource() == nPro.btn_ModificarPro) {     //Botón modificar 
            String id_text = nPro.txt_Id_Producto.getText();
            if (!id_text.equals("")) {
                nPro.label_Error.setVisible(false);

                if (ValidarCampos()) {

                    String codigo = nPro.txt_CodigoPro.getText().trim();
                    String descripcion = nPro.txt_DescripcionPro.getText().trim();
                    String precioCompra = nPro.txt_PrecioCompraPro.getText().trim();
                    String precioVenta = nPro.txt_PrecioVentaPro.getText().trim();

                    producto.setCodigo(codigo);
                    producto.setDescripcion(descripcion);
                    producto.setPrecio_compra(Double.parseDouble(precioCompra));
                    producto.setPrecio_venta(Double.parseDouble(precioVenta));

                    Combo item1 = (Combo) nPro.cmb_ProvedorPro.getSelectedItem();
                    Combo item2 = (Combo) nPro.cmb_MedidaPro.getSelectedItem();
                    Combo item3 = (Combo) nPro.cmb_categoriaPro.getSelectedItem();

                    producto.setId_proveedor(item1.getId());
                    producto.setId_medida(item2.getId());
                    producto.setId_categoria(item3.getId());

                    Productos actual = productoDao.comparar(Integer.parseInt(id_text));

                    boolean modificacion = actual.equals(producto);

                    if (modificacion) {
                        nPro.label_Error.setText("¡No hay campos modificados!.");
                        nPro.label_Error.setVisible(true);
                    } else {
                        nPro.label_Error.setVisible(false);

                        if (productoDao.ModificarProducto(producto)) {
                            nPro.label_Error.setVisible(false);
                            LimpiarTabla();
                            ListarProductos();
                            JOptionPane.showMessageDialog(null, "¡Modificacion de producto exitosa!.");
                            LimpiarCampos();
                        } else {
                            nPro.label_Error.setText("¡Error al realizar modificación!.");
                            nPro.label_Error.setVisible(true);
                        }
                    }

                }

            } else {
                nPro.label_Error.setText("¡Seleccione un producto de la tabla!.");
                nPro.label_Error.setVisible(true);
            }
        } else if (e.getSource() == nPro.opcion_Activar) {
            String id_text = nPro.txt_Id_Producto.getText();
            if (!id_text.equals("")) {
                nPro.label_Error.setVisible(false);
                String estado = "Activo";
                producto = productoDao.comparar(Integer.parseInt(id_text));
                boolean accion = estado.equals(producto.getEstado());
                if (!accion) {
                    if (productoDao.ModificarEstado(estado, Integer.parseInt(id_text))) {
                        nPro.label_Error.setVisible(false);
                        LimpiarTabla();
                        ListarProductos();
                        JOptionPane.showMessageDialog(null, "Estado moficado con exito");
                        LimpiarCampos();
                    } else {
                        nPro.label_Error.setText("Error al modificar el estado actual");
                        nPro.label_Error.setVisible(true);
                    }
                }
            } else {
                nPro.label_Error.setText("Seleccione una producto de la tabla");
                nPro.label_Error.setVisible(true);
            }

        } else if (e.getSource() == nPro.opcion_inhabilitar) {

            String id_text = nPro.txt_Id_Producto.getText();
            if (!id_text.equals("")) {
                nPro.label_Error.setVisible(false);
                String estado = "Pausado";
                producto = productoDao.comparar(Integer.parseInt(id_text));
                boolean accion = estado.equals(producto.getEstado());
                if (!accion) {
                    int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de pausar esta producto.");
                    if (opcion == 0) {
                        if (productoDao.ModificarEstado(estado, Integer.parseInt(id_text))) {
                            nPro.label_Error.setVisible(false);
                            LimpiarTabla();
                            ListarProductos();
                            //JOptionPane.showMessageDialog(null, "Estado moficado con exito");
                            LimpiarCampos();
                        } else {
                            nPro.label_Error.setText("Error al modificar el estado actual");
                            nPro.label_Error.setVisible(true);
                        }
                    }
                }
            } else {
                nPro.label_Error.setText("Seleccione una producto de la tabla");
                nPro.label_Error.setVisible(true);
            }

        } else if (e.getSource() == nPro.opcion_Eliminar) {
            String id_text = nPro.txt_Id_Producto.getText();
            if (!id_text.equals("")) {
                int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar esta producto.");
                if (opcion == 0) {
                    if (productoDao.EliminarProducto(Integer.parseInt(id_text))) {
                        nPro.label_Error.setVisible(false);
                        LimpiarCampos();
                        LimpiarTabla();
                        ListarProductos();
                    } else {
                        nPro.label_Error.setText("Error al eliminar el producto");
                        nPro.label_Error.setVisible(true);
                    }
                }
            } else {
                nPro.label_Error.setText("Seleccione un producto de la tabla");
                nPro.label_Error.setVisible(true);
            }
        }
    }

    /*¨**************************** Mouse ***************************/
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == nPro.tabla_Productos) {    //Click en la tabla
            nPro.label_Error.setVisible(false);
            int fila = nPro.tabla_Productos.rowAtPoint(e.getPoint());

            String id = nPro.tabla_Productos.getValueAt(fila, 0).toString();

            producto = productoDao.BuscarProducto(Integer.parseInt(id));

            Color color = new Color(0, 0, 0);
            Font tipografia = new java.awt.Font("Roboto Medium", 0, 12);

            nPro.txt_CodigoPro.setForeground(color);
            nPro.txt_CodigoPro.setFont(tipografia);
            nPro.txt_DescripcionPro.setForeground(color);
            nPro.txt_DescripcionPro.setFont(tipografia);
            nPro.txt_PrecioVentaPro.setForeground(color);
            nPro.txt_PrecioVentaPro.setFont(tipografia);
            nPro.txt_PrecioCompraPro.setForeground(color);
            nPro.txt_PrecioCompraPro.setFont(tipografia);

            nPro.txt_Id_Producto.setText(id);
            nPro.txt_CodigoPro.setText(producto.getCodigo());
            nPro.txt_DescripcionPro.setText(producto.getDescripcion());
            nPro.txt_PrecioCompraPro.setText("" + producto.getPrecio_compra());
            nPro.txt_PrecioVentaPro.setText("" + producto.getPrecio_venta());
            nPro.cmb_ProvedorPro.setSelectedItem(new Combo(producto.getId_proveedor(), producto.getProveedor()));
            nPro.cmb_MedidaPro.setSelectedItem(new Combo(producto.getId_medida(), producto.getMedida()));
            nPro.cmb_categoriaPro.setSelectedItem(new Combo(producto.getId_categoria(), producto.getCategoria()));

            nPro.btn_RegistrarPro.setEnabled(false);

        } else if (e.getSource() == nPro.txt_BuscarProducto) {    //click en JTxtFild - Buscar Proveedor.
            Map<String, Boolean> estado = EstadoCampo();
            Font tipografia1 = new java.awt.Font("Roboto Medium", 0, 12);
            Font tipografia2 = new java.awt.Font("Roboto Medium", 0, 10);
            
            nPro.label_Error.setVisible(false);
            nPro.txt_BuscarProducto.setFont(tipografia1);
            nPro.txt_BuscarProducto.setText("");
            Color gris = Color.gray;
            Color negro = Color.BLACK;
            
            if(estado.get("codigo")){                
                nPro.txt_CodigoPro.setForeground(gris);
                nPro.txt_CodigoPro.setFont(tipografia2);
                nPro.txt_CodigoPro.setText("Ingrese el codigo del producto");
            } else {
                nPro.txt_CodigoPro.setForeground(negro);
                nPro.txt_CodigoPro.setFont(tipografia1);
            }
            if(estado.get("descripcion")){                
                nPro.txt_DescripcionPro.setForeground(gris);
                nPro.txt_DescripcionPro.setText("Ingrese la descripcion del producto");
                nPro.txt_DescripcionPro.setFont(tipografia2);
            } else {
                nPro.txt_DescripcionPro.setForeground(negro);
                nPro.txt_DescripcionPro.setFont(tipografia1);
            }
            if(estado.get("pCompra")){                
                nPro.txt_PrecioCompraPro.setForeground(gris);
                nPro.txt_PrecioCompraPro.setText("Ingrese el precio de compra");
                nPro.txt_PrecioCompraPro.setFont(tipografia2);
            } else {
                nPro.txt_PrecioCompraPro.setForeground(negro);
                nPro.txt_PrecioCompraPro.setFont(tipografia1);
            }
            if(estado.get("pVenta")){                
                nPro.txt_PrecioVentaPro.setForeground(gris);
                nPro.txt_PrecioVentaPro.setText("Ingrese el precio de venta al publico");
                nPro.txt_PrecioVentaPro.setFont(tipografia2);
            } else {
                nPro.txt_PrecioVentaPro.setForeground(negro);
                nPro.txt_PrecioVentaPro.setFont(tipografia1);
            }
            if(estado.get("proveedor")){                
                nPro.cmb_ProvedorPro.setForeground(gris);
                nPro.cmb_ProvedorPro.setSelectedItem("-");
                nPro.cmb_ProvedorPro.setFont(tipografia2);
            } else {
                nPro.cmb_ProvedorPro.setForeground(negro);
                nPro.cmb_ProvedorPro.setFont(tipografia1);
            }
            if(estado.get("categoria")){                
                nPro.cmb_categoriaPro.setForeground(gris);
                nPro.cmb_categoriaPro.setSelectedItem("-");
                nPro.cmb_categoriaPro.setFont(tipografia2);
            } else {
                nPro.cmb_categoriaPro.setForeground(negro);
                nPro.cmb_categoriaPro.setFont(tipografia1);
            }
            if(estado.get("medida")){                
                nPro.cmb_MedidaPro.setForeground(gris);
                nPro.cmb_MedidaPro.setSelectedItem("-");
                nPro.cmb_MedidaPro.setFont(tipografia2);
            } else {
                nPro.cmb_MedidaPro.setForeground(negro);
                nPro.cmb_MedidaPro.setFont(tipografia1);
            }
        } else if (e.getSource() == nPro.txt_CodigoPro) {    //click en JTxtFild - Codigo Producto
            Map<String, Boolean> estado = EstadoCampo();
            Font letra12 = new java.awt.Font("Roboto Medium", 0, 12);
            Font letra10 = new java.awt.Font("Roboto Medium", 0, 10);
            
            nPro.label_Error.setVisible(false);
            nPro.txt_BuscarProducto.setFont(letra12);
            nPro.txt_BuscarProducto.setText("Ingrese el nombre de un producto para buscar");
            Color gris = Color.gray;
            Color negro = Color.BLACK;
            
            if(estado.get("codigo")){                
                nPro.txt_CodigoPro.setForeground(negro);
                nPro.txt_CodigoPro.setFont(letra12);
                nPro.txt_CodigoPro.setText("");
            }
            if(estado.get("descripcion")){                
                nPro.txt_DescripcionPro.setForeground(gris);
                nPro.txt_DescripcionPro.setText("Ingrese la descripcion del producto");
                nPro.txt_DescripcionPro.setFont(letra10);
            } else {
                nPro.txt_DescripcionPro.setForeground(negro);
                nPro.txt_DescripcionPro.setFont(letra12);
            }
            if(estado.get("pCompra")){                
                nPro.txt_PrecioCompraPro.setForeground(gris);
                nPro.txt_PrecioCompraPro.setText("Ingrese el precio de compra");
                nPro.txt_PrecioCompraPro.setFont(letra10);
            } else {
                nPro.txt_PrecioCompraPro.setForeground(negro);
                nPro.txt_PrecioCompraPro.setFont(letra12);
            }
            if(estado.get("pVenta")){                
                nPro.txt_PrecioVentaPro.setForeground(gris);
                nPro.txt_PrecioVentaPro.setText("Ingrese el precio de venta al publico");
                nPro.txt_PrecioVentaPro.setFont(letra10);
            } else {
                nPro.txt_PrecioVentaPro.setForeground(negro);
                nPro.txt_PrecioVentaPro.setFont(letra12);
            }
            if(estado.get("proveedor")){                
                nPro.cmb_ProvedorPro.setForeground(gris);
                nPro.cmb_ProvedorPro.setSelectedItem("-");
                nPro.cmb_ProvedorPro.setFont(letra10);
            } else {
                nPro.cmb_ProvedorPro.setForeground(negro);
                nPro.cmb_ProvedorPro.setFont(letra12);
            }
            if(estado.get("categoria")){                
                nPro.cmb_categoriaPro.setForeground(gris);
                nPro.cmb_categoriaPro.setSelectedItem("-");
                nPro.cmb_categoriaPro.setFont(letra10);
            } else {
                nPro.cmb_categoriaPro.setForeground(negro);
                nPro.cmb_categoriaPro.setFont(letra12);
            }
            if(estado.get("medida")){                
                nPro.cmb_MedidaPro.setForeground(gris);
                nPro.cmb_MedidaPro.setSelectedItem("-");
                nPro.cmb_MedidaPro.setFont(letra10);
            } else {
                nPro.cmb_MedidaPro.setForeground(negro);
                nPro.cmb_MedidaPro.setFont(letra12);
            }
        } else if (e.getSource() == nPro.txt_DescripcionPro) {    //click en JTxtFild - Descripción producto
            Map<String, Boolean> estado = EstadoCampo();
            Font letra12 = new java.awt.Font("Roboto Medium", 0, 12);
            Font letra10 = new java.awt.Font("Roboto Medium", 0, 10);
            
            nPro.label_Error.setVisible(false);
            nPro.txt_BuscarProducto.setFont(letra12);
            nPro.txt_BuscarProducto.setText("Ingrese el nombre de un producto para buscar");
            Color gris = Color.gray;
            Color negro = Color.BLACK;
            
            if(estado.get("codigo")){                
                nPro.txt_CodigoPro.setForeground(gris);
                nPro.txt_CodigoPro.setFont(letra10);
                nPro.txt_CodigoPro.setText("Ingrese el codigo del producto");
            } else {
                nPro.txt_CodigoPro.setForeground(negro);
                nPro.txt_CodigoPro.setFont(letra12);
            }
            if(estado.get("descripcion")){                
                nPro.txt_DescripcionPro.setForeground(negro);
                nPro.txt_DescripcionPro.setText("");
                nPro.txt_DescripcionPro.setFont(letra12);
            } 
            if(estado.get("pCompra")){                
                nPro.txt_PrecioCompraPro.setForeground(gris);
                nPro.txt_PrecioCompraPro.setText("Ingrese el precio de compra");
                nPro.txt_PrecioCompraPro.setFont(letra10);
            } else {
                nPro.txt_PrecioCompraPro.setForeground(negro);
                nPro.txt_PrecioCompraPro.setFont(letra12);
            }
            if(estado.get("pVenta")){                
                nPro.txt_PrecioVentaPro.setForeground(gris);
                nPro.txt_PrecioVentaPro.setText("Ingrese el precio de venta al publico");
                nPro.txt_PrecioVentaPro.setFont(letra10);
            } else {
                nPro.txt_PrecioVentaPro.setForeground(negro);
                nPro.txt_PrecioVentaPro.setFont(letra12);
            }
            if(estado.get("proveedor")){                
                nPro.cmb_ProvedorPro.setForeground(gris);
                nPro.cmb_ProvedorPro.setSelectedItem("-");
                nPro.cmb_ProvedorPro.setFont(letra10);
            } else {
                nPro.cmb_ProvedorPro.setForeground(negro);
                nPro.cmb_ProvedorPro.setFont(letra12);
            }
            if(estado.get("categoria")){                
                nPro.cmb_categoriaPro.setForeground(gris);
                nPro.cmb_categoriaPro.setSelectedItem("-");
                nPro.cmb_categoriaPro.setFont(letra10);
            } else {
                nPro.cmb_categoriaPro.setForeground(negro);
                nPro.cmb_categoriaPro.setFont(letra12);
            }
            if(estado.get("medida")){                
                nPro.cmb_MedidaPro.setForeground(gris);
                nPro.cmb_MedidaPro.setSelectedItem("-");
                nPro.cmb_MedidaPro.setFont(letra10);
            } else {
                nPro.cmb_MedidaPro.setForeground(negro);
                nPro.cmb_MedidaPro.setFont(letra12);
            }
        } else if (e.getSource() == nPro.txt_PrecioCompraPro) {    //click en JTxtFild - Precio de compra producto
            Map<String, Boolean> estado = EstadoCampo();
            Font letra12 = new java.awt.Font("Roboto Medium", 0, 12);
            Font letra10 = new java.awt.Font("Roboto Medium", 0, 10);
            
            nPro.label_Error.setVisible(false);
            nPro.txt_BuscarProducto.setFont(letra12);
            nPro.txt_BuscarProducto.setText("Ingrese el nombre de un producto para buscar");
            Color gris = Color.gray;
            Color negro = Color.BLACK;
            
            if(estado.get("codigo")){                
                nPro.txt_CodigoPro.setForeground(gris);
                nPro.txt_CodigoPro.setFont(letra10);
                nPro.txt_CodigoPro.setText("Ingrese el codigo del producto");
            } else {
                nPro.txt_CodigoPro.setForeground(negro);
                nPro.txt_CodigoPro.setFont(letra12);
            }
            if(estado.get("descripcion")){                
                nPro.txt_DescripcionPro.setForeground(gris);
                nPro.txt_DescripcionPro.setText("Ingrese la descripcion del producto");
                nPro.txt_DescripcionPro.setFont(letra10);
            } else {
                nPro.txt_DescripcionPro.setForeground(negro);
                nPro.txt_DescripcionPro.setFont(letra12);
            }
            if(estado.get("pCompra")){                
                nPro.txt_PrecioCompraPro.setForeground(negro);
                nPro.txt_PrecioCompraPro.setText("");
                nPro.txt_PrecioCompraPro.setFont(letra12);
            } 
            if(estado.get("pVenta")){                
                nPro.txt_PrecioVentaPro.setForeground(gris);
                nPro.txt_PrecioVentaPro.setText("Ingrese el precio de venta al publico");
                nPro.txt_PrecioVentaPro.setFont(letra10);
            } else {
                nPro.txt_PrecioVentaPro.setForeground(negro);
                nPro.txt_PrecioVentaPro.setFont(letra12);
            }
            if(estado.get("proveedor")){                
                nPro.cmb_ProvedorPro.setForeground(gris);
                nPro.cmb_ProvedorPro.setSelectedItem("-");
                nPro.cmb_ProvedorPro.setFont(letra10);
            } else {
                nPro.cmb_ProvedorPro.setForeground(negro);
                nPro.cmb_ProvedorPro.setFont(letra12);
            }
            if(estado.get("categoria")){                
                nPro.cmb_categoriaPro.setForeground(gris);
                nPro.cmb_categoriaPro.setSelectedItem("-");
                nPro.cmb_categoriaPro.setFont(letra10);
            } else {
                nPro.cmb_categoriaPro.setForeground(negro);
                nPro.cmb_categoriaPro.setFont(letra12);
            }
            if(estado.get("medida")){                
                nPro.cmb_MedidaPro.setForeground(gris);
                nPro.cmb_MedidaPro.setSelectedItem("-");
                nPro.cmb_MedidaPro.setFont(letra10);
            } else {
                nPro.cmb_MedidaPro.setForeground(negro);
                nPro.cmb_MedidaPro.setFont(letra12);
            }
        } else if (e.getSource() == nPro.txt_PrecioVentaPro) {    //click en JTxtFild - Precio venta del producto
            Map<String, Boolean> estado = EstadoCampo();
            Font letra12 = new java.awt.Font("Roboto Medium", 0, 12);
            Font letra10 = new java.awt.Font("Roboto Medium", 0, 10);
            
            nPro.label_Error.setVisible(false);
            nPro.txt_BuscarProducto.setFont(letra12);
            nPro.txt_BuscarProducto.setText("Ingrese el nombre de un producto para buscar");
            Color gris = Color.gray;
            Color negro = Color.BLACK;
            
            if(estado.get("codigo")){                
                nPro.txt_CodigoPro.setForeground(gris);
                nPro.txt_CodigoPro.setFont(letra10);
                nPro.txt_CodigoPro.setText("Ingrese el codigo del producto");
            } else {
                nPro.txt_CodigoPro.setForeground(negro);
                nPro.txt_CodigoPro.setFont(letra12);
            }
            if(estado.get("descripcion")){                
                nPro.txt_DescripcionPro.setForeground(gris);
                nPro.txt_DescripcionPro.setText("Ingrese la descripcion del producto");
                nPro.txt_DescripcionPro.setFont(letra10);
            } else {
                nPro.txt_DescripcionPro.setForeground(negro);
                nPro.txt_DescripcionPro.setFont(letra12);
            }
            if(estado.get("pCompra")){                
                nPro.txt_PrecioCompraPro.setForeground(gris);
                nPro.txt_PrecioCompraPro.setText("Ingrese el precio de compra");
                nPro.txt_PrecioCompraPro.setFont(letra10);
            } else {
                nPro.txt_PrecioCompraPro.setForeground(negro);
                nPro.txt_PrecioCompraPro.setFont(letra12);
            }
            if(estado.get("pVenta")){                
                nPro.txt_PrecioVentaPro.setForeground(negro);
                nPro.txt_PrecioVentaPro.setText("");
                nPro.txt_PrecioVentaPro.setFont(letra12);
            } else {
                nPro.txt_PrecioVentaPro.setForeground(negro);
                nPro.txt_PrecioVentaPro.setFont(letra12);
            }
            if(estado.get("proveedor")){                
                nPro.cmb_ProvedorPro.setForeground(gris);
                nPro.cmb_ProvedorPro.setSelectedItem("-");
                nPro.cmb_ProvedorPro.setFont(letra10);
            } else {
                nPro.cmb_ProvedorPro.setForeground(negro);
                nPro.cmb_ProvedorPro.setFont(letra12);
            }
            if(estado.get("categoria")){                
                nPro.cmb_categoriaPro.setForeground(gris);
                nPro.cmb_categoriaPro.setSelectedItem("-");
                nPro.cmb_categoriaPro.setFont(letra10);
            } else {
                nPro.cmb_categoriaPro.setForeground(negro);
                nPro.cmb_categoriaPro.setFont(letra12);
            }
            if(estado.get("medida")){                
                nPro.cmb_MedidaPro.setForeground(gris);
                nPro.cmb_MedidaPro.setSelectedItem("-");
                nPro.cmb_MedidaPro.setFont(letra10);
            } else {
                nPro.cmb_MedidaPro.setForeground(negro);
                nPro.cmb_MedidaPro.setFont(letra12);
            }
        } else if (e.getSource() == nPro.cmb_ProvedorPro) {    //click en JTxtFild - Combo del proveedor 
            Map<String, Boolean> estado = EstadoCampo();
            Font letra12 = new java.awt.Font("Roboto Medium", 0, 12);
            Font letra10 = new java.awt.Font("Roboto Medium", 0, 10);
            
            nPro.label_Error.setVisible(false);
            nPro.txt_BuscarProducto.setFont(letra12);
            nPro.txt_BuscarProducto.setText("Ingrese el nombre de un producto para buscar");
            Color gris = Color.gray;
            Color negro = Color.BLACK;
            
            if(estado.get("codigo")){                
                nPro.txt_CodigoPro.setForeground(gris);
                nPro.txt_CodigoPro.setFont(letra10);
                nPro.txt_CodigoPro.setText("Ingrese el codigo del producto");
            } else {
                nPro.txt_CodigoPro.setForeground(negro);
                nPro.txt_CodigoPro.setFont(letra12);
            }
            if(estado.get("descripcion")){                
                nPro.txt_DescripcionPro.setForeground(gris);
                nPro.txt_DescripcionPro.setText("Ingrese la descripcion del producto");
                nPro.txt_DescripcionPro.setFont(letra10);
            } else {
                nPro.txt_DescripcionPro.setForeground(negro);
                nPro.txt_DescripcionPro.setFont(letra12);
            }
            if(estado.get("pCompra")){                
                nPro.txt_PrecioCompraPro.setForeground(gris);
                nPro.txt_PrecioCompraPro.setText("Ingrese el precio de compra");
                nPro.txt_PrecioCompraPro.setFont(letra10);
            } else {
                nPro.txt_PrecioCompraPro.setForeground(negro);
                nPro.txt_PrecioCompraPro.setFont(letra12);
            }
            if(estado.get("pVenta")){                
                nPro.txt_PrecioVentaPro.setForeground(gris);
                nPro.txt_PrecioVentaPro.setText("Ingrese el precio de venta al publico");
                nPro.txt_PrecioVentaPro.setFont(letra10);
            } else {
                nPro.txt_PrecioVentaPro.setForeground(negro);
                nPro.txt_PrecioVentaPro.setFont(letra12);
            }
            if(estado.get("proveedor")){                
                nPro.cmb_ProvedorPro.setForeground(negro);
                nPro.cmb_ProvedorPro.setSelectedItem("");
                nPro.cmb_ProvedorPro.setFont(letra12);
            } 
            if(estado.get("categoria")){                
                nPro.cmb_categoriaPro.setForeground(gris);
                nPro.cmb_categoriaPro.setSelectedItem("-");
                nPro.cmb_categoriaPro.setFont(letra10);
            } else {
                nPro.cmb_categoriaPro.setForeground(negro);
                nPro.cmb_categoriaPro.setFont(letra12);
            }
            if(estado.get("medida")){                
                nPro.cmb_MedidaPro.setForeground(gris);
                nPro.cmb_MedidaPro.setSelectedItem("-");
                nPro.cmb_MedidaPro.setFont(letra10);
            } else {
                nPro.cmb_MedidaPro.setForeground(negro);
                nPro.cmb_MedidaPro.setFont(letra12);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /*¨**************************** Teclado ***************************/
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        LimpiarTabla();
        ListarProductos();
    }

    /*¨**************************** Otros ***************************/
    private void llenarProveedor() {
        List<Proveedor> lista = provDao.ListarProvedor("");
        for (int i = 0; i < lista.size(); i++) {

            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            nPro.cmb_ProvedorPro.addItem(new Combo(id, nombre));

        }
    }

    private void llenarMedida() {
        List<Medida> lista = medida.ListarMedidas("");
        for (int i = 0; i < lista.size(); i++) {

            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            nPro.cmb_MedidaPro.addItem(new Combo(id, nombre));

        }
    }

    private void llenarCategoria() {
        List<Categoria> lista = categoria.ListarCategoria("");
        for (int i = 0; i < lista.size(); i++) {

            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            nPro.cmb_categoriaPro.addItem(new Combo(id, nombre));

        }
    }

    private void LimpiarCampos() {
        nPro.txt_BuscarProducto.setText("Ingrese el nombre de un producto para buscar");

        nPro.txt_CodigoPro.setForeground(Color.gray);
        nPro.txt_CodigoPro.setText("Ingrese el codigo del producto");

        nPro.txt_DescripcionPro.setForeground(Color.gray);
        nPro.txt_DescripcionPro.setText("Ingrese la descripcion del producto");
        nPro.txt_PrecioCompraPro.setForeground(Color.gray);
        nPro.txt_PrecioCompraPro.setText("Ingrese el precio de compra");
        nPro.txt_PrecioVentaPro.setForeground(Color.gray);
        nPro.txt_PrecioVentaPro.setText("Ingrese el precio de venta al publico");
        nPro.txt_Id_Producto.setText("");
        nPro.cmb_MedidaPro.setSelectedItem("");
        nPro.cmb_ProvedorPro.setSelectedItem("");
        nPro.cmb_categoriaPro.setSelectedItem("");

        nPro.label_Error.setVisible(false);
        nPro.btn_RegistrarPro.setEnabled(true);
    }

    private void ListarProductos() {
        Tables color = new Tables();
        nPro.tabla_Productos.setDefaultRenderer(nPro.tabla_Productos.getColumnClass(0), color);

        String opcion = nPro.txt_BuscarProducto.getText().trim();
        List<Productos> listaProducto = productoDao.ListarProductos(opcion);
        modelo = (DefaultTableModel) nPro.tabla_Productos.getModel();

        Object[] ob = new Object[6];
        for (int i = 0; i < listaProducto.size(); i++) {

            ob[0] = listaProducto.get(i).getId();
            ob[1] = listaProducto.get(i).getCodigo();
            ob[2] = listaProducto.get(i).getDescripcion();
            ob[3] = listaProducto.get(i).getPrecio_venta();
            ob[4] = listaProducto.get(i).getCantidad();
            ob[5] = listaProducto.get(i).getEstado();

            modelo.addRow(ob);
        }
        nPro.tabla_Productos.setModel(modelo);

        JTableHeader header = nPro.tabla_Productos.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.RED);
        header.setFont(new java.awt.Font("Roboto Medium", 0, 12));
    }

    private void LimpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    private boolean ValidarCampos() {
        String codigo = nPro.txt_CodigoPro.getText().trim();
        String descripcion = nPro.txt_DescripcionPro.getText().trim();
        String precioCompra = nPro.txt_PrecioCompraPro.getText().trim();
        String precioVenta = nPro.txt_PrecioVentaPro.getText().trim();
        String provedor = nPro.cmb_ProvedorPro.getSelectedItem().toString();
        String medida = nPro.cmb_MedidaPro.getSelectedItem().toString();
        String categoria = nPro.cmb_categoriaPro.getSelectedItem().toString();

        int check = 0;
        String campo = "Campo obligatorio";
        //Validaciones
        boolean cod = codigo.equals("Ingrese el codigo del producto") || codigo.equals(campo) || codigo.equals("");
        boolean descr = descripcion.equals("Ingrese la descripcion del producto") || descripcion.equals(campo) || descripcion.equals("");
        boolean pCompra = precioCompra.equals("Ingrese el precio de compra") || precioCompra.equals(campo) || precioCompra.equals("");
        boolean pVenta = precioVenta.equals("Ingrese el precio de venta al publico") || precioVenta.equals(campo) || precioVenta.equals("");
        boolean proo = provedor.equals(campo) || provedor.equals("") || provedor.equals("-");
        boolean med = medida.equals(campo) || medida.equals("") || medida.equals("-");
        boolean cat = categoria.equals(campo) || categoria.equals("") || categoria.equals("-");

        Color color = new Color(224, 83, 255);

        if (cod) {
            nPro.txt_CodigoPro.setForeground(Color.red);
            nPro.txt_CodigoPro.setText(campo);
            check++;
        } else {
            nPro.txt_CodigoPro.setForeground(color);
        }
        if (descr) {
            nPro.txt_DescripcionPro.setForeground(Color.red);
            nPro.txt_DescripcionPro.setText(campo);
            check++;
        } else {
            nPro.txt_DescripcionPro.setForeground(color);
        }
        if (pCompra) {
            nPro.txt_PrecioCompraPro.setForeground(Color.red);
            nPro.txt_PrecioCompraPro.setText(campo);
            check++;
        } else {
            nPro.txt_PrecioCompraPro.setForeground(color);
        }
        if (pVenta) {
            nPro.txt_PrecioVentaPro.setForeground(Color.red);
            nPro.txt_PrecioVentaPro.setText(campo);
            check++;
        } else {
            nPro.txt_PrecioVentaPro.setForeground(color);
        }
        if (proo) {
            nPro.cmb_ProvedorPro.setForeground(Color.red);
            nPro.cmb_ProvedorPro.setSelectedItem(campo);
            check++;
        } else {
            nPro.cmb_ProvedorPro.setForeground(color);
        }
        if (med) {
            nPro.cmb_MedidaPro.setForeground(Color.red);
            nPro.cmb_MedidaPro.setSelectedItem(campo);
            check++;
        } else {
            nPro.cmb_MedidaPro.setForeground(color);
        }
        if (cat) {
            nPro.cmb_categoriaPro.setForeground(Color.red);
            nPro.cmb_categoriaPro.setSelectedItem(campo);
            check++;
        } else {
            nPro.cmb_categoriaPro.setForeground(color);
        }

        if (check == 0) {
            nPro.label_Error.setVisible(false);
            return true;
        } else {
            nPro.label_Error.setText("¡Rellene todos los campos!");
            nPro.label_Error.setVisible(true);
            return false;
        }

    }

    private Map<String, Boolean> EstadoCampo() {
        Map<String, Boolean> estado = new HashMap<>();

        String codigo = nPro.txt_CodigoPro.getText().trim();
        String descripcion = nPro.txt_DescripcionPro.getText().trim();
        String precioCompra = nPro.txt_PrecioCompraPro.getText().trim();
        String precioVenta = nPro.txt_PrecioVentaPro.getText().trim();
        String provedor = nPro.cmb_ProvedorPro.getSelectedItem().toString();
        String medida = nPro.cmb_MedidaPro.getSelectedItem().toString();
        String categoria = nPro.cmb_categoriaPro.getSelectedItem().toString();

        String campo = "Campo obligatorio";
        //Validaciones
        boolean cod = codigo.equals("Ingrese el codigo del producto") || codigo.equals(campo) || codigo.equals("");
        boolean descr = descripcion.equals("Ingrese la descripcion del producto") || descripcion.equals(campo) || descripcion.equals("");
        boolean pCompra = precioCompra.equals("Ingrese el precio de compra") || precioCompra.equals(campo) || precioCompra.equals("");
        boolean pVenta = precioVenta.equals("Ingrese el precio de venta al publico") || precioVenta.equals(campo) || precioVenta.equals("");
        boolean proo = provedor.equals(campo) || provedor.equals("") || provedor.equals("-");
        boolean med = medida.equals(campo) || medida.equals("") || medida.equals("-");
        boolean cat = categoria.equals(campo) || categoria.equals("") || categoria.equals("-");

        // Agregar elementos al mapa
        estado.put("codigo", cod);
        estado.put("descripcion", descr);
        estado.put("pCompra", pCompra);
        estado.put("pVenta", pVenta);
        estado.put("proveedor", proo);
        estado.put("categoria", med);
        estado.put("medida", cat);

        return estado;
    }
}
