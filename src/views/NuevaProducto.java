/*
 * Fecha de creacion: 11/04/2023 00:12:31
 * Version: v.0.1
 * Detalles: 
 */
package views;

import controllers.ProductoController;
import models.Productos;
import models.ProductosDao;

/**
 * @author Willy Stbn
 */
public class NuevaProducto extends javax.swing.JPanel {
    
    Productos producto = new Productos();
    ProductosDao productosDao = new ProductosDao();
    
    public NuevaProducto() {
        initComponents();
        
        ProductoController logica = new ProductoController(producto, productosDao, this);
        
        this.txt_Id_Producto.setVisible(false);
        this.label_Error.setVisible(false);
        cmb_MedidaPro.setSelectedItem("");
        cmb_ProvedorPro.setSelectedItem("");
        cmb_categoriaPro.setSelectedItem("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones_TablaProducto = new javax.swing.JPopupMenu();
        opcion_inhabilitar = new javax.swing.JMenuItem();
        opcion_Activar = new javax.swing.JMenuItem();
        opcion_Eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_NuevoPro = new javax.swing.JButton();
        btn_ModificarPro = new javax.swing.JButton();
        btn_RegistrarPro = new javax.swing.JButton();
        txt_CodigoPro = new javax.swing.JTextField();
        txt_DescripcionPro = new javax.swing.JTextField();
        txt_PrecioCompraPro = new javax.swing.JTextField();
        txt_PrecioVentaPro = new javax.swing.JTextField();
        cmb_ProvedorPro = new javax.swing.JComboBox<>();
        cmb_MedidaPro = new javax.swing.JComboBox<>();
        cmb_categoriaPro = new javax.swing.JComboBox<>();
        label_Error = new javax.swing.JLabel();
        txt_Id_Producto = new javax.swing.JTextField();
        txt_BuscarProducto = new javax.swing.JTextField();
        label_IcoBuscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Productos = new javax.swing.JTable();
        paginadorProducto = new javax.swing.JPanel();

        opcion_inhabilitar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        opcion_inhabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Apagado.png"))); // NOI18N
        opcion_inhabilitar.setText("Inhabilitar");
        opciones_TablaProducto.add(opcion_inhabilitar);

        opcion_Activar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        opcion_Activar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Emcemdido.png"))); // NOI18N
        opcion_Activar.setText("Activar");
        opciones_TablaProducto.add(opcion_Activar);

        opcion_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        opcion_Eliminar.setText("Eliminar");
        opciones_TablaProducto.add(opcion_Eliminar);

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 12), new java.awt.Color(102, 0, 102))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 32767));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Precio de compra:");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Precio de venta:");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Provedor:");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Medida:");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Categoria:");

        btn_NuevoPro.setBackground(new java.awt.Color(255, 255, 255));
        btn_NuevoPro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btn_NuevoPro.setForeground(new java.awt.Color(0, 0, 0));
        btn_NuevoPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpiar.png"))); // NOI18N
        btn_NuevoPro.setText("Limpiar");

        btn_ModificarPro.setBackground(new java.awt.Color(255, 153, 204));
        btn_ModificarPro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btn_ModificarPro.setForeground(new java.awt.Color(0, 0, 0));
        btn_ModificarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        btn_ModificarPro.setText("Modificar");

        btn_RegistrarPro.setBackground(new java.awt.Color(51, 204, 0));
        btn_RegistrarPro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btn_RegistrarPro.setForeground(new java.awt.Color(0, 0, 0));
        btn_RegistrarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        btn_RegistrarPro.setText("Registar");

        txt_CodigoPro.setBackground(new java.awt.Color(204, 204, 204));
        txt_CodigoPro.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        txt_CodigoPro.setForeground(new java.awt.Color(153, 153, 153));
        txt_CodigoPro.setText("Ingrese el codigo del producto");
        txt_CodigoPro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        txt_CodigoPro.setCaretColor(new java.awt.Color(153, 51, 0));

        txt_DescripcionPro.setBackground(new java.awt.Color(204, 204, 204));
        txt_DescripcionPro.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        txt_DescripcionPro.setForeground(new java.awt.Color(153, 153, 153));
        txt_DescripcionPro.setText("Ingrese la descripcion del producto");
        txt_DescripcionPro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        txt_DescripcionPro.setCaretColor(new java.awt.Color(153, 51, 0));

        txt_PrecioCompraPro.setBackground(new java.awt.Color(204, 204, 204));
        txt_PrecioCompraPro.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        txt_PrecioCompraPro.setForeground(new java.awt.Color(153, 153, 153));
        txt_PrecioCompraPro.setText("Ingrese el precio de compra");
        txt_PrecioCompraPro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        txt_PrecioCompraPro.setCaretColor(new java.awt.Color(153, 51, 0));

        txt_PrecioVentaPro.setBackground(new java.awt.Color(204, 204, 204));
        txt_PrecioVentaPro.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        txt_PrecioVentaPro.setForeground(new java.awt.Color(153, 153, 153));
        txt_PrecioVentaPro.setText("Ingrese el precio de venta al publico");
        txt_PrecioVentaPro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        txt_PrecioVentaPro.setCaretColor(new java.awt.Color(153, 51, 0));

        cmb_ProvedorPro.setBackground(new java.awt.Color(204, 204, 204));
        cmb_ProvedorPro.setEditable(true);
        cmb_ProvedorPro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cmb_ProvedorPro.setForeground(new java.awt.Color(0, 102, 204));

        cmb_MedidaPro.setBackground(new java.awt.Color(204, 204, 204));
        cmb_MedidaPro.setEditable(true);
        cmb_MedidaPro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cmb_MedidaPro.setForeground(new java.awt.Color(0, 102, 204));

        cmb_categoriaPro.setBackground(new java.awt.Color(204, 204, 204));
        cmb_categoriaPro.setEditable(true);
        cmb_categoriaPro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cmb_categoriaPro.setForeground(new java.awt.Color(0, 102, 204));

        label_Error.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_Error.setForeground(new java.awt.Color(153, 0, 0));
        label_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/advertencia.png"))); // NOI18N
        label_Error.setText("¡¡Rellene todos los campos!!");

        txt_Id_Producto.setEditable(false);
        txt_Id_Producto.setBackground(new java.awt.Color(255, 51, 51));

        txt_BuscarProducto.setBackground(new java.awt.Color(204, 204, 204));
        txt_BuscarProducto.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        txt_BuscarProducto.setForeground(new java.awt.Color(255, 102, 0));
        txt_BuscarProducto.setText("Ingrese el nombre de un producto para buscar");
        txt_BuscarProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_BuscarProducto.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txt_BuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_BuscarProductoMouseClicked(evt);
            }
        });

        label_IcoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_NuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_RegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ModificarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmb_MedidaPro, 0, 208, Short.MAX_VALUE)
                                        .addComponent(cmb_ProvedorPro, 0, 208, Short.MAX_VALUE)
                                        .addComponent(cmb_categoriaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_PrecioVentaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_CodigoPro)))
                                    .addGap(20, 20, 20)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_DescripcionPro))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_PrecioCompraPro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_IcoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Id_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Id_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_BuscarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_IcoBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(label_Error)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_CodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DescripcionPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_PrecioCompraPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PrecioVentaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_ProvedorPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_MedidaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_categoriaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_RegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        tabla_Productos.setBackground(new java.awt.Color(204, 204, 204));
        tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Descripcion", "Precio", "Stock", "Estatus"
            }
        ));
        tabla_Productos.setComponentPopupMenu(opciones_TablaProducto);
        jScrollPane1.setViewportView(tabla_Productos);
        if (tabla_Productos.getColumnModel().getColumnCount() > 0) {
            tabla_Productos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_Productos.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabla_Productos.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla_Productos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabla_Productos.getColumnModel().getColumn(4).setPreferredWidth(50);
            tabla_Productos.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        paginadorProducto.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout paginadorProductoLayout = new javax.swing.GroupLayout(paginadorProducto);
        paginadorProducto.setLayout(paginadorProductoLayout);
        paginadorProductoLayout.setHorizontalGroup(
            paginadorProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paginadorProductoLayout.setVerticalGroup(
            paginadorProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(paginadorProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paginadorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BuscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BuscarProductoMouseClicked
        if (txt_BuscarProducto.getText().equals("Ingrese el nombre del usuario")) {
            txt_BuscarProducto.setText("");
        }
    }//GEN-LAST:event_txt_BuscarProductoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ModificarPro;
    public javax.swing.JButton btn_NuevoPro;
    public javax.swing.JButton btn_RegistrarPro;
    public javax.swing.JComboBox<Object> cmb_MedidaPro;
    public javax.swing.JComboBox<Object> cmb_ProvedorPro;
    public javax.swing.JComboBox<Object> cmb_categoriaPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_IcoBuscar;
    public javax.swing.JMenuItem opcion_Activar;
    public javax.swing.JMenuItem opcion_Eliminar;
    public javax.swing.JMenuItem opcion_inhabilitar;
    private javax.swing.JPopupMenu opciones_TablaProducto;
    private javax.swing.JPanel paginadorProducto;
    public javax.swing.JTable tabla_Productos;
    public javax.swing.JTextField txt_BuscarProducto;
    public javax.swing.JTextField txt_CodigoPro;
    public javax.swing.JTextField txt_DescripcionPro;
    public javax.swing.JTextField txt_Id_Producto;
    public javax.swing.JTextField txt_PrecioCompraPro;
    public javax.swing.JTextField txt_PrecioVentaPro;
    // End of variables declaration//GEN-END:variables

}
