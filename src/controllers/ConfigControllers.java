package controllers;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import views.*;

/*
 * Fecha de creacion: 11/04/2023 11:07:36
 * Version: v.0.1
 * Detalles: 
 */

/**
 * @author Willy Stbn
 */

public class ConfigControllers implements MouseListener{
    
    private DashBoard views;

    public ConfigControllers(DashBoard views) {
        this.views = views;
        
        this.views.label_Categoria.addMouseListener(this);
        this.views.label_Cliente.addMouseListener(this);
        this.views.label_Config.addMouseListener(this);
        this.views.label_Medidas.addMouseListener(this);
        this.views.label_NuevaCompra.addMouseListener(this);
        this.views.label_Nuevaventa.addMouseListener(this);
        this.views.label_Producto.addMouseListener(this);
        this.views.label_Provedores.addMouseListener(this);
        this.views.label_Usuarios.addMouseListener(this);
    }
    
    private void AbrirPanel(JPanel panel) {
        
        //Iniciar Ventana nueva venta por defecto:
        views.contenedor_Panel.removeAll();
        views.contenedor_Panel.setLayout(new BorderLayout());
        views.contenedor_Panel.add(panel, BorderLayout.CENTER);

        // Agrega un ComponentListener al contenedor_Panel
        views.contenedor_Panel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent evt) {
                // Obtiene el tamaño del contenedor_Panel
                Dimension size = views.contenedor_Panel.getSize();
                // Ajusta el tamaño del JPanel contenido
                panel.setSize(size);
                panel.revalidate();
                panel.repaint();
            }
        });

        panel.setSize(1080, 555);
        panel.setLocation(0, 0);
        views.contenedor_Panel.revalidate();
        views.contenedor_Panel.repaint();

    }
    
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
        if(e.getSource() == views.label_Categoria){
            views.panel_Categoria.setBackground(new Color(153, 153, 153));
        } else if(e.getSource() == views.label_Cliente){
            views.panel_Clientes.setBackground(new Color(153, 153, 153));
        } else if(e.getSource() == views.label_Config){
            views.panel_Configuracion.setBackground(new Color(153, 153, 153));
        } else if(e.getSource() == views.label_Medidas){
            views.panel_Medidas.setBackground(new Color(153, 153, 153));
        } else if(e.getSource() == views.label_NuevaCompra){
            views.panel_NuevaCompra.setBackground(new Color(153, 153, 153));
        } else if(e.getSource() == views.label_Nuevaventa){
            views.panel_NuevaVenta.setBackground(new Color(153, 153, 153));
        } else if(e.getSource() == views.label_Producto){
            views.panel_Productos.setBackground(new Color(153, 153, 153));
        } else if(e.getSource() == views.label_Provedores){
            views.panel_Provedorees.setBackground(new Color(153, 153, 153));
        } else if(e.getSource() == views.label_Usuarios){
            views.panel_Usuarios.setBackground(new Color(153, 153, 153));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == views.label_Categoria){
            views.panel_Categoria.setBackground(new Color(204, 204, 204));
        } else if(e.getSource() == views.label_Cliente){
            views.panel_Clientes.setBackground(new Color(204, 204, 204));
        } else if(e.getSource() == views.label_Config){
            views.panel_Configuracion.setBackground(new Color(204, 204, 204));
        } else if(e.getSource() == views.label_Medidas){
            views.panel_Medidas.setBackground(new Color(204, 204, 204));
        } else if(e.getSource() == views.label_NuevaCompra){
            views.panel_NuevaCompra.setBackground(new Color(204, 204, 204));
        } else if(e.getSource() == views.label_Nuevaventa){
            views.panel_NuevaVenta.setBackground(new Color(204, 204, 204));
        } else if(e.getSource() == views.label_Producto){
            views.panel_Productos.setBackground(new Color(204, 204, 204));
        } else if(e.getSource() == views.label_Provedores){
            views.panel_Provedorees.setBackground(new Color(204, 204, 204));
        } else if(e.getSource() == views.label_Usuarios){
            views.panel_Usuarios.setBackground(new Color(204, 204, 204));
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.label_Usuarios){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            NuevoUsuario nUser = new NuevoUsuario();
            AbrirPanel(nUser);
        } else if(e.getSource() == views.label_Nuevaventa){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            NuevaVenta nVenta = new NuevaVenta();
            AbrirPanel(nVenta);
        } else if(e.getSource() == views.label_Cliente){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            NuevoCliente nCliente = new NuevoCliente();
            AbrirPanel(nCliente);
        } else if(e.getSource() == views.label_NuevaCompra){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            NuevaCompra nCompra = new NuevaCompra();
            AbrirPanel(nCompra);            
        } else if(e.getSource() == views.label_Producto){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            NuevaProducto nProducto = new NuevaProducto();
            AbrirPanel(nProducto);
        } else if(e.getSource() == views.label_Provedores){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            NuevoProvedor nProveedor = new NuevoProvedor();
            AbrirPanel(nProveedor);
        } else if(e.getSource() == views.label_Medidas){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            NuevaMedida nMedida = new NuevaMedida();
            AbrirPanel(nMedida);
        } else if(e.getSource() == views.label_Categoria){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            NuevaCategoria nCategoria = new NuevaCategoria();
            AbrirPanel(nCategoria);
        } else if(e.getSource() == views.label_Config){
            views.txt_BuscarProducto.setText("Ingrese el nombre del producto");
            DatosEmpresa Config = new DatosEmpresa();
            AbrirPanel(Config);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    
    
    
}
