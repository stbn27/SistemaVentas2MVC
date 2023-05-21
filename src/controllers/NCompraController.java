/*
 * Fecha de creacion: 15/04/2023 20:13:29
 * Version: v.0.1
 * Detalles: 
 */
package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.Productos;
import models.ProductosDao;
import views.NuevaCompra;

/**
 * @author Willy Stbn
 */
public class NCompraController implements ActionListener, MouseListener, KeyListener {
    
    private Productos producto;
    private ProductosDao productosDao;
    private NuevaCompra nCompra;
    
    public NCompraController(Productos productos, ProductosDao productosDao, NuevaCompra nCompra) {
        this.producto = productos;
        this.productosDao = productosDao;
        this.nCompra = nCompra;
        
        this.nCompra.txt_CodigoNC.addMouseListener(this);
        
        this.nCompra.txt_CodigoNC.addKeyListener(this);
        this.nCompra.txt_CantidadNC.addKeyListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == nCompra.txt_CodigoNC){
            String codigo = nCompra.txt_CodigoNC.getText().trim();
            if(codigo.equals("") || codigo.equals("Campo obligatorio")){
                nCompra.txt_CodigoNC.setForeground(Color.BLACK);
                nCompra.txt_CodigoNC.setText("");
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
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == nCompra.txt_CodigoNC) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (nCompra.txt_CodigoNC.getText().trim().equals("")) {
//                    nCompra.label_Error.setText("Ingrese el código del producto.");
//                    nCompra.label_Error.setVisible(true);
                    nCompra.txt_CodigoNC.setForeground(Color.red);
                    nCompra.txt_CodigoNC.setText("Campo obligatorio");
                } else {
                    nCompra.label_Error.setVisible(false);
                    String codigo = nCompra.txt_CodigoNC.getText().trim();
                    producto = productosDao.BuscarCodigo(codigo);
                    nCompra.txt_DescripcionNC.setText(producto.getDescripcion());
                    nCompra.txt_Id_NC.setText("" + producto.getId());
                    nCompra.txt_PrecioNC.setText("" + producto.getPrecio_compra());
                    nCompra.txt_CantidadNC.requestFocus();
                }
            }
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == nCompra.txt_CantidadNC) {
            int cantidad;
            if (nCompra.txt_CantidadNC.getText().trim().equals("")) {
                cantidad = 1;
                nCompra.txt_TotalNC.setText(nCompra.txt_PrecioNC.getText());
            } else {
                cantidad = Integer.parseInt(nCompra.txt_CantidadNC.getText().trim());
                double precio = Double.parseDouble(nCompra.txt_PrecioNC.getText());
                nCompra.txt_TotalNC.setText("" + (cantidad * precio));
            }
        }
    }
    
}
