/*
 * Fecha de creacion: 10/04/2023 22:44:44
 * Version: v.0.1
 * Detalles: Ventana principal del sistema
 */
package views;

import controllers.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;


/**
 *
 * @author Willy Stbn
 */
public class DashBoard extends javax.swing.JFrame {

    NuevaVenta nVenta = new NuevaVenta();   //Este es un JPanel Form

    public DashBoard() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setSize(1300, 700);
        this.setTitle("Sistema Principal");

        ConfigControllers HoverMouse = new ConfigControllers(this);

        AbrirPanel(nVenta);
    }

    private void AbrirPanel(JPanel panel) {
        
        //Iniciar Ventana nueva venta por defecto:
        
        contenedor_Panel.setLayout(new BorderLayout());
        contenedor_Panel.add(panel, BorderLayout.CENTER);

        // Agrega un ComponentListener al contenedor_Panel
        contenedor_Panel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent evt) {
                // Obtiene el tamaño del contenedor_Panel
                Dimension size = contenedor_Panel.getSize();
                // Ajusta el tamaño del JPanel contenido
                panel.setSize(size);
                panel.revalidate();
                panel.repaint();
            }
        });

        panel.setSize(1080, 555);
        panel.setLocation(0, 0);
        contenedor_Panel.revalidate();
        contenedor_Panel.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Tituo = new javax.swing.JPanel();
        label_Ico = new javax.swing.JLabel();
        panel_Botones = new javax.swing.JPanel();
        panel_NuevaVenta = new javax.swing.JPanel();
        label_Nuevaventa = new javax.swing.JLabel();
        panel_NuevaCompra = new javax.swing.JPanel();
        label_NuevaCompra = new javax.swing.JLabel();
        panel_Productos = new javax.swing.JPanel();
        label_Producto = new javax.swing.JLabel();
        panel_Clientes = new javax.swing.JPanel();
        label_Cliente = new javax.swing.JLabel();
        panel_Provedorees = new javax.swing.JPanel();
        label_Provedores = new javax.swing.JLabel();
        panel_Medidas = new javax.swing.JPanel();
        label_Medidas = new javax.swing.JLabel();
        panel_Categoria = new javax.swing.JPanel();
        label_Categoria = new javax.swing.JLabel();
        panel_Configuracion = new javax.swing.JPanel();
        label_Config = new javax.swing.JLabel();
        panel_Usuarios = new javax.swing.JPanel();
        label_Usuarios = new javax.swing.JLabel();
        panel_Banner = new javax.swing.JPanel();
        txt_BuscarProducto = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        label_IcoConsultas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contenedor_Panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_Tituo.setBackground(new java.awt.Color(0, 102, 204));

        label_Ico.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        label_Ico.setForeground(new java.awt.Color(0, 0, 0));
        label_Ico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo_User.png"))); // NOI18N

        javax.swing.GroupLayout panel_TituoLayout = new javax.swing.GroupLayout(panel_Tituo);
        panel_Tituo.setLayout(panel_TituoLayout);
        panel_TituoLayout.setHorizontalGroup(
            panel_TituoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TituoLayout.createSequentialGroup()
                .addComponent(label_Ico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel_TituoLayout.setVerticalGroup(
            panel_TituoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Ico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_Botones.setBackground(new java.awt.Color(204, 204, 204));

        panel_NuevaVenta.setBackground(new java.awt.Color(204, 204, 204));

        label_Nuevaventa.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_Nuevaventa.setForeground(new java.awt.Color(0, 0, 0));
        label_Nuevaventa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Nuevaventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nventa.png"))); // NOI18N
        label_Nuevaventa.setText("Nueva Venta");
        label_Nuevaventa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_NuevaVentaLayout = new javax.swing.GroupLayout(panel_NuevaVenta);
        panel_NuevaVenta.setLayout(panel_NuevaVentaLayout);
        panel_NuevaVentaLayout.setHorizontalGroup(
            panel_NuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Nuevaventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_NuevaVentaLayout.setVerticalGroup(
            panel_NuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Nuevaventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_NuevaCompra.setBackground(new java.awt.Color(204, 204, 204));

        label_NuevaCompra.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_NuevaCompra.setForeground(new java.awt.Color(0, 0, 0));
        label_NuevaCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carrito-de-compras.png"))); // NOI18N
        label_NuevaCompra.setText("Nueva compra");
        label_NuevaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_NuevaCompraLayout = new javax.swing.GroupLayout(panel_NuevaCompra);
        panel_NuevaCompra.setLayout(panel_NuevaCompraLayout);
        panel_NuevaCompraLayout.setHorizontalGroup(
            panel_NuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_NuevaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_NuevaCompraLayout.setVerticalGroup(
            panel_NuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_NuevaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_Productos.setBackground(new java.awt.Color(204, 204, 204));

        label_Producto.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_Producto.setForeground(new java.awt.Color(0, 0, 0));
        label_Producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        label_Producto.setText("Productos");
        label_Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ProductosLayout = new javax.swing.GroupLayout(panel_Productos);
        panel_Productos.setLayout(panel_ProductosLayout);
        panel_ProductosLayout.setHorizontalGroup(
            panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ProductosLayout.setVerticalGroup(
            panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_Clientes.setBackground(new java.awt.Color(204, 204, 204));

        label_Cliente.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_Cliente.setForeground(new java.awt.Color(0, 0, 0));
        label_Cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Clientes.png"))); // NOI18N
        label_Cliente.setText("Clientes");
        label_Cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ClientesLayout = new javax.swing.GroupLayout(panel_Clientes);
        panel_Clientes.setLayout(panel_ClientesLayout);
        panel_ClientesLayout.setHorizontalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ClientesLayout.setVerticalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_Provedorees.setBackground(new java.awt.Color(204, 204, 204));

        label_Provedores.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_Provedores.setForeground(new java.awt.Color(0, 0, 0));
        label_Provedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Provedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        label_Provedores.setText("Proveedores");
        label_Provedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ProvedoreesLayout = new javax.swing.GroupLayout(panel_Provedorees);
        panel_Provedorees.setLayout(panel_ProvedoreesLayout);
        panel_ProvedoreesLayout.setHorizontalGroup(
            panel_ProvedoreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Provedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ProvedoreesLayout.setVerticalGroup(
            panel_ProvedoreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Provedores, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_Medidas.setBackground(new java.awt.Color(204, 204, 204));

        label_Medidas.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_Medidas.setForeground(new java.awt.Color(0, 0, 0));
        label_Medidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Medidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit.png"))); // NOI18N
        label_Medidas.setText("Medida");
        label_Medidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_MedidasLayout = new javax.swing.GroupLayout(panel_Medidas);
        panel_Medidas.setLayout(panel_MedidasLayout);
        panel_MedidasLayout.setHorizontalGroup(
            panel_MedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Medidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_MedidasLayout.setVerticalGroup(
            panel_MedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Medidas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_Categoria.setBackground(new java.awt.Color(204, 204, 204));

        label_Categoria.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_Categoria.setForeground(new java.awt.Color(0, 0, 0));
        label_Categoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/box.png"))); // NOI18N
        label_Categoria.setText("Categoria");
        label_Categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_CategoriaLayout = new javax.swing.GroupLayout(panel_Categoria);
        panel_Categoria.setLayout(panel_CategoriaLayout);
        panel_CategoriaLayout.setHorizontalGroup(
            panel_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_CategoriaLayout.setVerticalGroup(
            panel_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_Configuracion.setBackground(new java.awt.Color(204, 204, 204));

        label_Config.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_Config.setForeground(new java.awt.Color(0, 0, 0));
        label_Config.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/config.png"))); // NOI18N
        label_Config.setText("Configuracion");
        label_Config.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ConfiguracionLayout = new javax.swing.GroupLayout(panel_Configuracion);
        panel_Configuracion.setLayout(panel_ConfiguracionLayout);
        panel_ConfiguracionLayout.setHorizontalGroup(
            panel_ConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Config, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ConfiguracionLayout.setVerticalGroup(
            panel_ConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Config, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_Usuarios.setBackground(new java.awt.Color(204, 204, 204));

        label_Usuarios.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        label_Usuarios.setForeground(new java.awt.Color(0, 0, 0));
        label_Usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/users.png"))); // NOI18N
        label_Usuarios.setText("Administrar Usuarios");
        label_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_UsuariosLayout = new javax.swing.GroupLayout(panel_Usuarios);
        panel_Usuarios.setLayout(panel_UsuariosLayout);
        panel_UsuariosLayout.setHorizontalGroup(
            panel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        panel_UsuariosLayout.setVerticalGroup(
            panel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_BotonesLayout = new javax.swing.GroupLayout(panel_Botones);
        panel_Botones.setLayout(panel_BotonesLayout);
        panel_BotonesLayout.setHorizontalGroup(
            panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BotonesLayout.createSequentialGroup()
                .addGroup(panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_NuevaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Usuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Configuracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Medidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Provedorees, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Clientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Productos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_NuevaCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        panel_BotonesLayout.setVerticalGroup(
            panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BotonesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel_NuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(panel_NuevaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(panel_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(panel_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(panel_Provedorees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(panel_Medidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(panel_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(panel_Configuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(panel_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        panel_Banner.setBackground(new java.awt.Color(0, 51, 153));

        txt_BuscarProducto.setBackground(new java.awt.Color(0, 51, 153));
        txt_BuscarProducto.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_BuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        txt_BuscarProducto.setText("Ingrese el nombre del producto");
        txt_BuscarProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_BuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_BuscarProducto.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txt_BuscarProducto.setMaximumSize(new java.awt.Dimension(330, 35));
        txt_BuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_BuscarProductoMouseClicked(evt);
            }
        });

        btn_Buscar.setText("Buscar");

        label_IcoConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/consultas.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de Venta");

        javax.swing.GroupLayout panel_BannerLayout = new javax.swing.GroupLayout(panel_Banner);
        panel_Banner.setLayout(panel_BannerLayout);
        panel_BannerLayout.setHorizontalGroup(
            panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BannerLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(83, 83, 83)
                .addComponent(label_IcoConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        panel_BannerLayout.setVerticalGroup(
            panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BannerLayout.createSequentialGroup()
                .addGroup(panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_BannerLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_IcoConsultas)))
                    .addGroup(panel_BannerLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        contenedor_Panel.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout contenedor_PanelLayout = new javax.swing.GroupLayout(contenedor_Panel);
        contenedor_Panel.setLayout(contenedor_PanelLayout);
        contenedor_PanelLayout.setHorizontalGroup(
            contenedor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedor_PanelLayout.setVerticalGroup(
            contenedor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_Tituo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(contenedor_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(panel_Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Tituo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(contenedor_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BuscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BuscarProductoMouseClicked
        if (txt_BuscarProducto.getText().trim().equals("Ingrese el nombre del producto")) {
            txt_BuscarProducto.setText("");
        }
    }//GEN-LAST:event_txt_BuscarProductoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    public javax.swing.JPanel contenedor_Panel;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel label_Categoria;
    public javax.swing.JLabel label_Cliente;
    public javax.swing.JLabel label_Config;
    private javax.swing.JLabel label_Ico;
    private javax.swing.JLabel label_IcoConsultas;
    public javax.swing.JLabel label_Medidas;
    public javax.swing.JLabel label_NuevaCompra;
    public javax.swing.JLabel label_Nuevaventa;
    public javax.swing.JLabel label_Producto;
    public javax.swing.JLabel label_Provedores;
    public javax.swing.JLabel label_Usuarios;
    private javax.swing.JPanel panel_Banner;
    private javax.swing.JPanel panel_Botones;
    public javax.swing.JPanel panel_Categoria;
    public javax.swing.JPanel panel_Clientes;
    public javax.swing.JPanel panel_Configuracion;
    public javax.swing.JPanel panel_Medidas;
    public javax.swing.JPanel panel_NuevaCompra;
    public javax.swing.JPanel panel_NuevaVenta;
    public javax.swing.JPanel panel_Productos;
    public javax.swing.JPanel panel_Provedorees;
    private javax.swing.JPanel panel_Tituo;
    public javax.swing.JPanel panel_Usuarios;
    public javax.swing.JTextField txt_BuscarProducto;
    // End of variables declaration//GEN-END:variables

}
