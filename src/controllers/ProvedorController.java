/*
 * Fecha de creacion: 12/04/2023 10:53:32
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
import models.Proveedor;
import models.ProveedorDao;
import models.Tables;
import views.NuevoProvedor;

/**
 * @author Willy Stbn
 */
public class ProvedorController implements ActionListener, MouseListener, KeyListener {

    private Proveedor prov;
    private ProveedorDao provDao;
    private NuevoProvedor nProv;
    DefaultTableModel modelo = new DefaultTableModel();

    public ProvedorController(Proveedor prov, ProveedorDao provDao, NuevoProvedor nProvd) {
        this.prov = prov;
        this.provDao = provDao;
        this.nProv = nProvd;

        this.nProv.btn_ModificarProvedor.addActionListener(this);
        this.nProv.btn_NuevoProvedor.addActionListener(this);
        this.nProv.btn_ResgistrarProvedor.addActionListener(this);
        this.nProv.opcion_Activo.addActionListener(this);
        this.nProv.opcion_Inactivo.addActionListener(this);

        this.nProv.txt_BuscarProveedor.addMouseListener(this);
        this.nProv.txt_RuccProvedor.addMouseListener(this);
        this.nProv.txt_NombreProvedor.addMouseListener(this);
        this.nProv.txt_TelefonoProvedor.addMouseListener(this);
        this.nProv.txt_DireccionProvedor.addMouseListener(this);
        this.nProv.tabla_Provedor.addMouseListener(this);

        this.nProv.txt_BuscarProveedor.addKeyListener(this);

        ListarLosProvedores();
    }

    /*¨**************************** Botones ****************/
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nProv.btn_ResgistrarProvedor) {
            if (VerificarCamposProvedor()) {

                nProv.label_Error.setVisible(false);

                String rucc = nProv.txt_RuccProvedor.getText().trim();
                String nombre = nProv.txt_NombreProvedor.getText().trim();
                String telefono = nProv.txt_TelefonoProvedor.getText().trim();
                String direccion = nProv.txt_DireccionProvedor.getText();

                prov.setRucc(rucc);
                prov.setNombre(nombre);
                prov.setTelefono(telefono);
                prov.setDireccion(direccion);

                if (provDao.RegistrarProvedor(prov)) {
                    nProv.label_Error.setVisible(false);
                    LimpiarTabla();
                    LimpiarCamposProvedor();
                    ListarLosProvedores();
                    JOptionPane.showMessageDialog(null, "¡Registro de proveedor exitoso!");
                } else {
                    nProv.label_Error.setText("¡Error al registrar provedor! - 404");
                    nProv.label_Error.setVisible(true);
                }
            }
        } else if (e.getSource() == nProv.btn_ModificarProvedor) {

            String id_Seleccion = nProv.txt_Id_Proveedor.getText().trim();
            if (!id_Seleccion.equals("")) {

                nProv.label_Error.setVisible(false);

                if (VerificarCamposProvedor()) {
                    String rucc = nProv.txt_RuccProvedor.getText().trim();
                    String nombre = nProv.txt_NombreProvedor.getText().trim();
                    String telefono = nProv.txt_TelefonoProvedor.getText().trim();
                    String direccion = nProv.txt_DireccionProvedor.getText();

                    prov.setId(Integer.parseInt(id_Seleccion));
                    prov.setRucc(rucc);
                    prov.setNombre(nombre);
                    prov.setTelefono(telefono);
                    prov.setDireccion(direccion);

                    if (provDao.ModificarProvedor(prov)) {
                        LimpiarCamposProvedor();
                        LimpiarTabla();
                        ListarLosProvedores();
                        nProv.label_Error.setVisible(false);
                        JOptionPane.showMessageDialog(null, "¡Modificacion del provedor exitosamente!");
                    } else {
                        nProv.label_Error.setText("¡Error al modificar provedor!");
                        nProv.label_Error.setVisible(true);
                        LimpiarCamposProvedor();
                    }
                }

            } else {
                nProv.label_Error.setText("Seleccione un proveedor de la tabla.");
                nProv.label_Error.setVisible(true);
            }

        } else if (e.getSource() == nProv.btn_NuevoProvedor) {

            LimpiarCamposProvedor();

        } else if(e.getSource() == nProv.opcion_Activo){
            String id_CLienteText = nProv.txt_Id_Proveedor.getText();

            if (!id_CLienteText.equals("")) {

                nProv.label_Error.setVisible(false);
                int id = Integer.parseInt(id_CLienteText);

                if (provDao.AccionTablaProveedor("Activo", id)) {

                    nProv.label_Error.setVisible(false);
                    LimpiarTabla();
                    LimpiarCamposProvedor();
                    ListarLosProvedores();
                    JOptionPane.showMessageDialog(null, "¡¡Proveedor en estado de Activo exitosamente!!.");
                } else {

                    nProv.label_Error.setText("Error al modificar estado del proveedor.");
                    nProv.label_Error.setVisible(true);
                }

            } else {
                nProv.label_Error.setText("Seleccione una provedor de la tabla.");
                nProv.label_Error.setVisible(true);
            }
        } else if(e.getSource() == nProv.opcion_Inactivo){
            String id_CLienteText = nProv.txt_Id_Proveedor.getText();

            if (!id_CLienteText.equals("")) {

                nProv.label_Error.setVisible(false);
                int id = Integer.parseInt(id_CLienteText);
                int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de inactivar este proveedor.");

                if (opcion == 0) {
                    if (provDao.AccionTablaProveedor("Inactivo", id)) {

                        nProv.label_Error.setVisible(false);
                        LimpiarTabla();
                        LimpiarCamposProvedor();
                        ListarLosProvedores();
                        //JOptionPane.showMessageDialog(null, "¡¡Cliente en estado de inactivo exitosamente!!.");
                    } else {

                        nProv.label_Error.setText("Error al modificar estado del provedor.");
                        nProv.label_Error.setVisible(true);
                        LimpiarTabla();
                        ListarLosProvedores();
                    }
                }
            } else {
                nProv.label_Error.setText("Seleccione una proveedor de la tabla.");
                nProv.label_Error.setVisible(true);
                LimpiarCamposProvedor();
                LimpiarTabla();
                ListarLosProvedores();
            }
        }
    }

    /*¨********************** Mouse **********************/
    @Override
    public void mouseClicked(MouseEvent e) {

        //Click en la tabla
        if (e.getSource() == nProv.tabla_Provedor) {
            int fila = nProv.tabla_Provedor.rowAtPoint(e.getPoint());
            
            nProv.label_Error.setVisible(false);
            
            String id_text = nProv.tabla_Provedor.getValueAt(fila, 0).toString();
            String rucc = nProv.tabla_Provedor.getValueAt(fila, 1).toString();
            String nombre = nProv.tabla_Provedor.getValueAt(fila, 2).toString();
            String telefono = nProv.tabla_Provedor.getValueAt(fila, 3).toString();
            String direccion = nProv.tabla_Provedor.getValueAt(fila, 4).toString();

            nProv.txt_Id_Proveedor.setForeground(Color.BLACK);
            nProv.txt_Id_Proveedor.setText(id_text);
            nProv.txt_RuccProvedor.setForeground(Color.BLACK);
            nProv.txt_RuccProvedor.setText(rucc);
            nProv.txt_NombreProvedor.setForeground(Color.BLACK);
            nProv.txt_NombreProvedor.setText(nombre);
            nProv.txt_TelefonoProvedor.setForeground(Color.BLACK);
            nProv.txt_TelefonoProvedor.setText(telefono);
            nProv.txt_DireccionProvedor.setForeground(Color.BLACK);
            nProv.txt_DireccionProvedor.setText(direccion);

            nProv.btn_ResgistrarProvedor.setEnabled(false);
        } else if (e.getSource() == nProv.txt_BuscarProveedor) {    //Click en txtBuscarProvedor:

            String buscar = nProv.txt_BuscarProveedor.getText();
            String rucc = nProv.txt_RuccProvedor.getText().trim();
            String nombre = nProv.txt_NombreProvedor.getText().trim();
            String telefono = nProv.txt_TelefonoProvedor.getText().trim();
            String direccion = nProv.txt_DireccionProvedor.getText();
            nProv.label_Error.setVisible(false);

            if (buscar.equals("Ingrese un provedor para buscar") || buscar.isEmpty()) {
                nProv.txt_BuscarProveedor.setText("");
            }
            if (rucc.equals("") || rucc.equals("Ingrese el RUCC del provedor") || rucc.equals("Campo obligatorio")) {
                nProv.txt_RuccProvedor.setForeground(Color.GRAY);
                nProv.txt_RuccProvedor.setText("Ingrese el RUCC del provedor");
            } else {
                nProv.txt_RuccProvedor.setForeground(Color.BLACK);
            }
            if (nombre.equals("") || nombre.equals("Campo obligatorio") || nombre.equals("Ingrese el nombre del provedor")) {
                nProv.txt_NombreProvedor.setForeground(Color.GRAY);
                nProv.txt_NombreProvedor.setText("Ingrese el nombre del provedor");
            } else {
                nProv.txt_NombreProvedor.setForeground(Color.BLACK);
            }
            if (telefono.equals("") || telefono.equals("Ingrese el telefono del provedor") || telefono.equals("Campo obligatorio")) {
                nProv.txt_TelefonoProvedor.setForeground(Color.GRAY);
                nProv.txt_TelefonoProvedor.setText("Ingrese el telefono del provedor");
            } else {
                nProv.txt_TelefonoProvedor.setForeground(Color.BLACK);
            }
            if (direccion.equals("") || direccion.equals("Campo obligatorio") || direccion.equals("Ingrese la direccion del proveedor")) {
                nProv.txt_DireccionProvedor.setForeground(Color.GRAY);
                nProv.txt_DireccionProvedor.setText("Ingrese la direccion del proveedor");
            } else {
                nProv.txt_DireccionProvedor.setForeground(Color.BLACK);
            }
        } else if (e.getSource() == nProv.txt_RuccProvedor) {

            String rucc = nProv.txt_RuccProvedor.getText().trim();
            String nombre = nProv.txt_NombreProvedor.getText().trim();
            String telefono = nProv.txt_TelefonoProvedor.getText().trim();
            String direccion = nProv.txt_DireccionProvedor.getText();

            nProv.label_Error.setVisible(false);
            nProv.txt_BuscarProveedor.setText("Ingrese un provedor para buscar");

            if (rucc.equals("Ingrese el RUCC del provedor") || rucc.equals("Campo obligatorio")) {
                nProv.txt_RuccProvedor.setForeground(Color.BLACK);
                nProv.txt_RuccProvedor.setText("");
            } else {
                nProv.txt_RuccProvedor.setForeground(Color.BLACK);
            }
            if (nombre.equals("") || nombre.equals("Campo obligatorio") || nombre.equals("Ingrese el nombre del provedor")) {
                nProv.txt_NombreProvedor.setForeground(Color.GRAY);
                nProv.txt_NombreProvedor.setText("Ingrese el nombre del provedor");
            } else {
                nProv.txt_NombreProvedor.setForeground(Color.BLACK);
            }
            if (direccion.equals("") || direccion.equals("Campo obligatorio") || direccion.equals("Ingrese la direccion del proveedor")) {
                nProv.txt_DireccionProvedor.setForeground(Color.GRAY);
                nProv.txt_DireccionProvedor.setText("Ingrese la direccion del proveedor");
            } else {
                nProv.txt_DireccionProvedor.setForeground(Color.BLACK);
            }
            if (telefono.equals("") || telefono.equals("Campo obligatorio") || telefono.equals("Ingrese el telefono del provedor")) {
                nProv.txt_TelefonoProvedor.setForeground(Color.GRAY);
                nProv.txt_TelefonoProvedor.setText("Ingrese el telefono del provedor");
            } else {
                nProv.txt_TelefonoProvedor.setForeground(Color.BLACK);
            }
        } else if (e.getSource() == nProv.txt_NombreProvedor) {

            String rucc = nProv.txt_RuccProvedor.getText().trim();
            String nombre = nProv.txt_NombreProvedor.getText().trim();
            String telefono = nProv.txt_TelefonoProvedor.getText().trim();
            String direccion = nProv.txt_DireccionProvedor.getText();

            nProv.label_Error.setVisible(false);
            nProv.txt_BuscarProveedor.setText("Ingrese un provedor para buscar");

            if (rucc.equals("") || rucc.equals("Campo obligatorio") || rucc.equals("Ingrese el RUCC del provedor")) {
                nProv.txt_RuccProvedor.setForeground(Color.GRAY);
                nProv.txt_RuccProvedor.setText("Ingrese el RUCC del provedor");
            } else {
                nProv.txt_RuccProvedor.setForeground(Color.BLACK);
            }
            if (nombre.equals("Ingrese el nombre del provedor") || nombre.equals("Campo obligatorio")) {
                nProv.txt_NombreProvedor.setForeground(Color.BLACK);
                nProv.txt_NombreProvedor.setText("");
            } else {
                nProv.txt_NombreProvedor.setForeground(Color.BLACK);
            }
            if (telefono.equals("") || telefono.equals("Ingrese el telefono del provedor") || telefono.equals("Campo obligatorio")) {
                nProv.txt_TelefonoProvedor.setForeground(Color.GRAY);
                nProv.txt_TelefonoProvedor.setText("Ingrese el telefono del provedor");
            } else {
                nProv.txt_TelefonoProvedor.setForeground(Color.BLACK);
            }
            if (direccion.equals("") || direccion.equals("Campo obligatorio") || direccion.equals("Ingrese la direccion del proveedor")) {
                nProv.txt_DireccionProvedor.setForeground(Color.GRAY);
                nProv.txt_DireccionProvedor.setText("Ingrese la direccion del proveedor");
            } else {
                nProv.txt_DireccionProvedor.setForeground(Color.BLACK);
            }
        } else if (e.getSource() == nProv.txt_TelefonoProvedor) {

            String rucc = nProv.txt_RuccProvedor.getText().trim();
            String nombre = nProv.txt_NombreProvedor.getText().trim();
            String telefono = nProv.txt_TelefonoProvedor.getText().trim();
            String direccion = nProv.txt_DireccionProvedor.getText();

            nProv.label_Error.setVisible(false);
            nProv.txt_BuscarProveedor.setText("Ingrese un provedor para buscar");

            if (rucc.equals("") || rucc.equals("Campo obligatorio") || rucc.equals("Ingrese el RUCC del provedor")) {
                nProv.txt_RuccProvedor.setForeground(Color.GRAY);
                nProv.txt_RuccProvedor.setText("Ingrese el RUCC del provedor");
            } else {
                nProv.txt_RuccProvedor.setForeground(Color.BLACK);
            }
            if (nombre.equals("Ingrese el nombre del provedor") || nombre.equals("Campo obligatorio") || nombre.equals("")) {
                nProv.txt_NombreProvedor.setForeground(Color.GRAY);
                nProv.txt_NombreProvedor.setText("Ingrese el nombre del provedor");
            } else {
                nProv.txt_NombreProvedor.setForeground(Color.BLACK);
            }
            if (telefono.equals("Ingrese el telefono del provedor") || telefono.equals("Campo obligatorio")) {
                nProv.txt_TelefonoProvedor.setForeground(Color.BLACK);
                nProv.txt_TelefonoProvedor.setText("");
            } else {
                nProv.txt_TelefonoProvedor.setForeground(Color.BLACK);
            }
            if (direccion.equals("") || direccion.equals("Campo obligatorio") || direccion.equals("Ingrese la direccion del proveedor")) {
                nProv.txt_DireccionProvedor.setForeground(Color.GRAY);
                nProv.txt_DireccionProvedor.setText("Ingrese la direccion del proveedor");
            } else {
                nProv.txt_DireccionProvedor.setForeground(Color.BLACK);
            }
        } else if (e.getSource() == nProv.txt_DireccionProvedor) {

            String rucc = nProv.txt_RuccProvedor.getText().trim();
            String nombre = nProv.txt_NombreProvedor.getText().trim();
            String telefono = nProv.txt_TelefonoProvedor.getText().trim();
            String direccion = nProv.txt_DireccionProvedor.getText();

            nProv.label_Error.setVisible(false);
            nProv.txt_BuscarProveedor.setText("Ingrese un provedor para buscar");

            if (rucc.equals("") || rucc.equals("Campo obligatorio") || rucc.equals("Ingrese el RUCC del provedor")) {
                nProv.txt_RuccProvedor.setForeground(Color.GRAY);
                nProv.txt_RuccProvedor.setText("Ingrese el RUCC del provedor");
            } else {
                nProv.txt_RuccProvedor.setForeground(Color.BLACK);
            }
            if (nombre.equals("Ingrese el nombre del provedor") || nombre.equals("Campo obligatorio") || nombre.equals("")) {
                nProv.txt_NombreProvedor.setForeground(Color.GRAY);
                nProv.txt_NombreProvedor.setText("Ingrese el nombre del provedor");
            } else {
                nProv.txt_NombreProvedor.setForeground(Color.BLACK);
            }
            if (telefono.equals("Ingrese el telefono del provedor") || telefono.equals("Campo obligatorio")||telefono.equals("")) {
                nProv.txt_TelefonoProvedor.setForeground(Color.GRAY);
                nProv.txt_TelefonoProvedor.setText("Ingrese el telefono del provedor");
            } else {
                nProv.txt_TelefonoProvedor.setForeground(Color.BLACK);
            }
            if (direccion.equals("Campo obligatorio") || direccion.equals("Ingrese la direccion del proveedor")) {
                nProv.txt_DireccionProvedor.setForeground(Color.BLACK);
                nProv.txt_DireccionProvedor.setText("");
            } else {
                nProv.txt_DireccionProvedor.setForeground(Color.BLACK);
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

    /*¨********************** Otro **********************/
    public void ListarLosProvedores() {

        Tables color = new Tables();
        nProv.tabla_Provedor.setDefaultRenderer(nProv.tabla_Provedor.getColumnClass(0), color);

        List<Proveedor> listaProveedor = provDao.ListarProvedor(nProv.txt_BuscarProveedor.getText().trim());
        modelo = (DefaultTableModel) nProv.tabla_Provedor.getModel();
        Object[] ob = new Object[6];

        for (int i = 0; i < listaProveedor.size(); i++) {

            ob[0] = listaProveedor.get(i).getId();
            ob[1] = listaProveedor.get(i).getRucc();
            ob[2] = listaProveedor.get(i).getNombre();
            ob[3] = listaProveedor.get(i).getTelefono();
            ob[4] = listaProveedor.get(i).getDireccion();
            ob[5] = listaProveedor.get(i).getEstado();

            modelo.addRow(ob);
        }

        nProv.tabla_Provedor.setModel(modelo);
        JTableHeader header = nProv.tabla_Provedor.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.RED);
        header.setFont(new java.awt.Font("Roboto Medium", 0, 12));

    }

    public void LimpiarTabla() {
        modelo = (DefaultTableModel) nProv.tabla_Provedor.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    private void LimpiarCamposProvedor() {
        nProv.txt_BuscarProveedor.setText("Ingrese un provedor para buscar");
        nProv.txt_RuccProvedor.setText("Ingrese el RUCC del provedor");
        nProv.txt_NombreProvedor.setText("Ingrese el nombre del provedor");
        nProv.txt_Id_Proveedor.setText("");
        nProv.txt_TelefonoProvedor.setText("Ingrese el telefono del provedor");
        nProv.txt_DireccionProvedor.setText("Ingrese la direccion del proveedor");

        nProv.txt_RuccProvedor.setForeground(Color.gray);
        nProv.txt_NombreProvedor.setForeground(Color.gray);
        nProv.txt_TelefonoProvedor.setForeground(Color.gray);
        nProv.txt_DireccionProvedor.setForeground(Color.gray);

        nProv.btn_ResgistrarProvedor.setEnabled(true);
    }

    private boolean VerificarCamposProvedor() {
        String rucc = nProv.txt_RuccProvedor.getText().trim();
        String nombre = nProv.txt_NombreProvedor.getText().trim();
        String telefono = nProv.txt_TelefonoProvedor.getText().trim();
        String direccion = nProv.txt_DireccionProvedor.getText();

        int validacion1 = 0;
        int validacion2 = 0;

        if (rucc.equals("Ingrese el RUCC del provedor") || rucc.isEmpty() || rucc.equals("Campo obligatorio")) {
            nProv.txt_RuccProvedor.setForeground(Color.red);
            nProv.txt_RuccProvedor.setText("Campo obligatorio");
            validacion1++;
        } else {
            nProv.txt_RuccProvedor.setForeground(Color.BLACK);
        }

        if (nombre.equals("Ingrese el nombre del provedor") || nombre.isEmpty() || nombre.equals("Campo obligatorio")) {
            nProv.txt_NombreProvedor.setForeground(Color.red);
            nProv.txt_NombreProvedor.setText("Campo obligatorio");
            validacion1++;
        } else {
            nProv.txt_NombreProvedor.setForeground(Color.BLACK);
        }

        if (telefono.equals("Ingrese el telefono del provedor") || telefono.isEmpty() || telefono.equals("Campo obligatorio")) {
            nProv.txt_TelefonoProvedor.setForeground(Color.red);
            nProv.txt_TelefonoProvedor.setText("Campo obligatorio");
            validacion1++;
        } else {
            nProv.txt_TelefonoProvedor.setForeground(Color.BLACK);
            if (telefono.length() > 12) {
                validacion2++;
            }
        }

        if (direccion.equals("Ingrese la direccion del proveedor") || nombre.isEmpty() || direccion.equals("Campo obligatorio")) {
            nProv.txt_DireccionProvedor.setForeground(Color.red);
            nProv.txt_DireccionProvedor.setText("Campo obligatorio");
            validacion1++;
        } else {
            nProv.txt_DireccionProvedor.setForeground(Color.BLACK);
        }

        if (validacion1 == 0 && validacion2 == 0) {
            nProv.label_Error.setVisible(false);
            return true;
        } else {
            if (validacion1 != 0 && validacion2 != 0) {
                nProv.label_Error.setText("Campos vacios y télefono invalido!!");
                nProv.label_Error.setVisible(true);
            } else if (validacion1 != 0) {
                nProv.label_Error.setText("¡¡Rellene todos los campos!!");
                nProv.label_Error.setVisible(true);
            } else if (validacion2 != 0) {
                nProv.label_Error.setText("¡¡Telefono invalido!!");
                nProv.label_Error.setVisible(true);
            }
            return false;
        }
    }

    /*´****************** Teclado *********************************/
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getSource() == nProv.txt_BuscarProveedor) {
            LimpiarTabla();
            ListarLosProvedores();
        }

    }

}
