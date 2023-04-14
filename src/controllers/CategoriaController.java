/*
 * Fecha de creacion: 13/04/2023 00:27:50
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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.Categoria;
import models.CategoriaDao;
import models.Tables;
import views.NuevaCategoria;

/**
 * @author Willy Stbn
 */
public class CategoriaController implements ActionListener, MouseListener, KeyListener {

    Categoria categoria;
    CategoriaDao categoriaDao;
    NuevaCategoria nCat;
    DefaultTableModel modelo = new DefaultTableModel();

    public CategoriaController(Categoria categoria, CategoriaDao categoriaDao, NuevaCategoria nCat) {
        this.categoria = categoria;
        this.categoriaDao = categoriaDao;
        this.nCat = nCat;

        this.nCat.btn_ModificarCategoria.addActionListener(this);
        this.nCat.btn_ResgistrarCategoria.addActionListener(this);
        this.nCat.btn_NuevoCategoria.addActionListener(this);
        this.nCat.opcion_Activar.addActionListener(this);
        this.nCat.opcion_Desactivar.addActionListener(this);

        this.nCat.txt_BuscarCategoria.addMouseListener(this);
        this.nCat.txt_Categoria.addMouseListener(this);
        this.nCat.tabla_Categoria.addMouseListener(this);

        this.nCat.txt_BuscarCategoria.addKeyListener(this);

        ListarCategorias();
    }

    /**
     * ******Áccion de los botones -> btn *****************************
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nCat.btn_NuevoCategoria) {
            LimpiarCampos();
            LimpiarTabla();
            ListarCategorias();
            nCat.txt_BuscarCategoria.setText("Ingrese una categoria para buscar");
        } else if (e.getSource() == nCat.btn_ResgistrarCategoria) {
            String cat = nCat.txt_Categoria.getText().trim();
            nCat.txt_BuscarCategoria.setText("Ingrese una categoria para buscar");
            if (cat.equals("") || cat.equals("Ingrese el nombre de la categoria")) {
                nCat.txt_Categoria.setForeground(Color.red);
                nCat.txt_Categoria.setText("Campo obligatorio");
                nCat.label_Error.setText("Rellene todos los campos");
                nCat.label_Error.setVisible(true);
            } else {
                nCat.label_Error.setVisible(false);
                categoria.setNombre(cat);
                if (categoriaDao.RegistrarCategoria(categoria)) {
                    nCat.label_Error.setVisible(false);
                    nCat.txt_Categoria.setForeground(Color.green);
                    LimpiarTabla();
                    ListarCategorias();
                    JOptionPane.showMessageDialog(null, "Categoria registrada exitosamente");
                    LimpiarCampos();
                } else {
                    nCat.label_Error.setText("Error al guardar categoria");
                    nCat.label_Error.setVisible(true);
                }
            }
        } else if (e.getSource() == nCat.btn_ModificarCategoria) {
            String id = nCat.txt_Id_Categoria.getText().trim();
            nCat.txt_BuscarCategoria.setText("Ingrese una categoria para buscar");
            if (!id.equals("")) {
                String nombre = nCat.txt_Categoria.getText().trim();
                nCat.label_Error.setVisible(false);
                if (!nombre.equals("") || nombre.equals("Campo obligatorio") || nombre.equals("Ingrese el nombre de la categoria")) {
                    nCat.label_Error.setVisible(false);
                    categoria.setId(Integer.parseInt(id));
                    categoria.setNombre(nCat.txt_Categoria.getText().trim());
                    if (categoriaDao.ModificarCategoria(categoria)) {
                        nCat.txt_Categoria.setForeground(Color.green);
                        LimpiarTabla();
                        ListarCategorias();
                        JOptionPane.showMessageDialog(null, "Categoria modificada exitosamente");
                        LimpiarCampos();
                    }
                } else {
                    nCat.label_Error.setText("Campo obligatorio");
                    nCat.label_Error.setVisible(true);
                }
            } else {
                nCat.label_Error.setText("Seleecion una categoria de la tabla");
                nCat.label_Error.setVisible(true);
            }
        } else if (e.getSource() == nCat.opcion_Activar) {
            String id = nCat.txt_Id_Categoria.getText();
            nCat.txt_BuscarCategoria.setText("Ingrese una categoria para buscar");
            if (!id.equals("")) {

                nCat.label_Error.setVisible(false);
                int id1 = Integer.parseInt(id);

                if (categoriaDao.AccionTablaProveedor("Activo", id1)) {

                    nCat.label_Error.setVisible(false);
                    LimpiarTabla();
                    LimpiarCampos();
                    ListarCategorias();
                    JOptionPane.showMessageDialog(null, "¡¡Categoria en estado de Activo exitosamente!!.");
                } else {

                    nCat.label_Error.setText("Error al modificar estado de la categoria.");
                    nCat.label_Error.setVisible(true);
                }

            } else {
                nCat.label_Error.setText("Seleccione una categoria de la tabla.");
                nCat.label_Error.setVisible(true);
            }
        } else if (e.getSource() == nCat.opcion_Desactivar) {
            String idCat = nCat.txt_Id_Categoria.getText();
            nCat.txt_BuscarCategoria.setText("Ingrese una categoria para buscar");
            if (!idCat.equals("")) {

                nCat.label_Error.setVisible(false);
                int id = Integer.parseInt(idCat);
                int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de inactivar esta categoria.");

                if (opcion == 0) {
                    if (categoriaDao.AccionTablaProveedor("Inactivo", id)) {

                        nCat.label_Error.setVisible(false);
                        LimpiarTabla();
                        LimpiarCampos();
                        ListarCategorias();
                        //JOptionPane.showMessageDialog(null, "¡¡Cliente en estado de inactivo exitosamente!!.");
                    } else {

                        nCat.label_Error.setText("Error al modificar estado de la categoria.");
                        nCat.label_Error.setVisible(true);
                        LimpiarTabla();
                        ListarCategorias();
                    }
                }
            } else {
                nCat.label_Error.setText("Seleccione una categoria de la tabla.");
                nCat.label_Error.setVisible(true);
                LimpiarCampos();
                LimpiarTabla();
                ListarCategorias();
            }
        }

    }

    /**
     * ***************Áccion del Mouse -> mouse ********************
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == nCat.txt_BuscarCategoria) {
            nCat.label_Error.setVisible(false);
            String cat = nCat.txt_Categoria.getText().trim();
            String buscar = nCat.txt_BuscarCategoria.getText().trim();
            if (buscar.equals("Ingrese una categoria para buscar")) {
                nCat.label_Error.setVisible(false);
                nCat.txt_BuscarCategoria.setText("");
            }
            if (cat.equals("") || cat.equals("Ingrese el nombre de la categoria") || cat.equals("Campo obligatorio")) {
                nCat.txt_Categoria.setForeground(Color.gray);
                nCat.txt_Categoria.setText("Ingrese el nombre de la categoria");
            } else {
                nCat.txt_Categoria.setForeground(Color.BLACK);
            }
        } else if (e.getSource() == nCat.txt_Categoria) {
            nCat.txt_BuscarCategoria.setText("Ingrese una categoria para buscar");
            String cat = nCat.txt_Categoria.getText().trim();
            nCat.label_Error.setVisible(false);
            LimpiarTabla();
            ListarCategorias();
            if (cat.equals("Campo obligatorio") || cat.equals("") || cat.equals("Ingrese el nombre de la categoria")) {
                nCat.txt_Categoria.setForeground(Color.BLACK);
                nCat.txt_Categoria.setText("");
            }
        } else if (e.getSource() == nCat.tabla_Categoria) {
            nCat.label_Error.setVisible(false);

            int fila = nCat.tabla_Categoria.rowAtPoint(e.getPoint());

            String id = nCat.tabla_Categoria.getValueAt(fila, 0).toString();
            String nombre = nCat.tabla_Categoria.getValueAt(fila, 1).toString();

            nCat.txt_Id_Categoria.setText(id);
            nCat.txt_Categoria.setForeground(Color.BLACK);
            nCat.txt_Categoria.setText(nombre);
            nCat.btn_ResgistrarCategoria.setEnabled(false);

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

    /*¨******************** Accion del teclado *******************/
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        LimpiarTabla();
        ListarCategorias();
    }


    /*¨******************** Otros*******************/
    private void ListarCategorias() {
        Tables color = new Tables();
        nCat.tabla_Categoria.setDefaultRenderer(nCat.tabla_Categoria.getColumnClass(0), color);

        List<Categoria> listarClientes = categoriaDao.ListarCategoria(nCat.txt_BuscarCategoria.getText().trim());
        modelo = (DefaultTableModel) nCat.tabla_Categoria.getModel();
        Object[] ob = new Object[3];

        for (int i = 0; i < listarClientes.size(); i++) {

            ob[0] = listarClientes.get(i).getId();
            ob[1] = listarClientes.get(i).getNombre();
            ob[2] = listarClientes.get(i).getEstado();

            modelo.addRow(ob);
        }

        nCat.tabla_Categoria.setModel(modelo);
        JTableHeader header = nCat.tabla_Categoria.getTableHeader();
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

    private void LimpiarCampos() {
        nCat.txt_BuscarCategoria.setText("Ingrese una categoria para buscar");
        nCat.txt_Id_Categoria.setText("");
        nCat.txt_Categoria.setForeground(Color.gray);
        nCat.txt_Categoria.setText("Ingrese el nombre de la categoria");
        nCat.btn_ResgistrarCategoria.setEnabled(true);
        nCat.label_Error.setVisible(false);
    }
}
