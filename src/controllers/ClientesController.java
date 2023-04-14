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
import models.ClienteDao;
import models.Clientes;
import models.Tables;
import views.NuevoCliente;


/**
 * @author Willy Stbn
 */
public class ClientesController implements ActionListener, MouseListener, KeyListener {

    private Clientes clie;
    private ClienteDao clieDao;
    private NuevoCliente nClie;
    DefaultTableModel modelo = new DefaultTableModel();

    public ClientesController(Clientes cli, ClienteDao cliDao, NuevoCliente nClie) {
        this.clie = cli;
        this.clieDao = cliDao;
        this.nClie = nClie;

        this.nClie.btn_ModificarClie.addActionListener(this);
        this.nClie.btn_NuevoClie.addActionListener(this);
        this.nClie.btn_ResgistrarClie.addActionListener(this);
        this.nClie.opcion_Activo.addActionListener(this);
        this.nClie.opcion_Inactivo.addActionListener(this);

        this.nClie.txt_BuscarCliente.addMouseListener(this);
        this.nClie.txt_NombreCliente.addMouseListener(this);
        this.nClie.txt_TelefonoCliente.addMouseListener(this);
        this.nClie.txt_DireccionCliente.addMouseListener(this);
        this.nClie.tabla_Clientes.addMouseListener(this);
        
        this.nClie.txt_BuscarCliente.addKeyListener(this);
                
        ListarLosClientes();
    }

    /*¨**************************** Botones ****************/
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nClie.btn_ResgistrarClie) {

            //Obtenemos el texto de los de JTextFild:
            String nombre = nClie.txt_NombreCliente.getText().trim();
            String Telefeno = nClie.txt_TelefonoCliente.getText().trim();
            String Direccion = nClie.txt_DireccionCliente.getText();

            int validacion = 0;

            nClie.label_Error.setText("Rellene todos los campos");

            //Validacion de que no haya campos vacios:
            if (nombre.equals("") || nombre.equals("Ingrese el nombre del cliente.") || nombre.equals("Campo obligatorio")) {
                nClie.txt_NombreCliente.setForeground(Color.red);
                nClie.txt_NombreCliente.setText("Campo obligatorio");
                nClie.label_Error.setVisible(true);
                validacion++;
            } else {
                nClie.txt_NombreCliente.setForeground(Color.GREEN);
            }
            if (Telefeno.equals("") || Telefeno.equals("Ingrese el telefono del cliente.") || Telefeno.equals("Campo obligatorio")) {
                nClie.txt_TelefonoCliente.setForeground(Color.red);
                nClie.txt_TelefonoCliente.setText("Campo obligatorio");
                nClie.label_Error.setVisible(true);
                validacion++;
            } else {
                nClie.txt_TelefonoCliente.setForeground(Color.GREEN);
            }
            if (Direccion.equals("") || Direccion.equals("Ingrese la direccion del cliente.") || Direccion.equals("Campo obligatorio")) {
                nClie.txt_DireccionCliente.setForeground(Color.red);
                nClie.txt_DireccionCliente.setText("Campo obligatorio");
                nClie.label_Error.setVisible(true);
                validacion++;
            } else {
                nClie.txt_DireccionCliente.setForeground(Color.GREEN);
            }

            if (validacion == 0) {
                nClie.label_Error.setVisible(false);
                clie.setNombre(nombre);
                clie.setTelefono(Telefeno);
                clie.setDireccion(Direccion);

                if (clieDao.RegistrarCliente(clie)) {
                    LimpiarTabla();
                    ListarLosClientes();
                    JOptionPane.showMessageDialog(null, "¡¡Registro de cliente exitoso!!.");
                    LimpiarCamposCliente();
                } else {
                    nClie.label_Error.setText("No se pudo guardar la informacion.");
                    nClie.label_Error.setVisible(true);
                }
            } else {
                nClie.label_Error.setVisible(true);
            }
        } else if (e.getSource() == nClie.btn_ModificarClie) {      //Boton modificar cliente

            String id_CLienteText = nClie.txt_IdCliente.getText();

            if (!id_CLienteText.equals("")) {
                //Obtenemos el texto de los de JTextFild:
                String nombre = nClie.txt_NombreCliente.getText().trim();
                String Telefeno = nClie.txt_TelefonoCliente.getText().trim();
                String Direccion = nClie.txt_DireccionCliente.getText();

                int validacion = 0;

                nClie.label_Error.setText("Rellene todos los campos");

                //Validacion de que no haya campos vacios:
                if (nombre.equals("") || nombre.equals("Ingrese el nombre del cliente.") || nombre.equals("Campo obligatorio")) {
                    nClie.txt_NombreCliente.setForeground(Color.red);
                    nClie.txt_NombreCliente.setText("Campo obligatorio");
                    nClie.label_Error.setVisible(true);
                    validacion++;
                } else {
                    nClie.txt_NombreCliente.setForeground(Color.GREEN);
                }
                if (Telefeno.equals("") || Telefeno.equals("Ingrese el telefono del cliente.") || Telefeno.equals("Campo obligatorio")) {
                    nClie.txt_TelefonoCliente.setForeground(Color.red);
                    nClie.txt_TelefonoCliente.setText("Campo obligatorio");
                    nClie.label_Error.setVisible(true);
                    validacion++;
                } else {
                    nClie.txt_TelefonoCliente.setForeground(Color.GREEN);
                    if (Telefeno.length() > 12) {
                        nClie.label_Error.setText("Numero de telefono invalido");
                        nClie.label_Error.setVisible(true);
                        validacion++;
                    }
                }
                if (Direccion.equals("") || Direccion.equals("Ingrese la direccion del cliente.") || Direccion.equals("Campo obligatorio")) {
                    nClie.txt_DireccionCliente.setForeground(Color.red);
                    nClie.txt_DireccionCliente.setText("Campo obligatorio");
                    nClie.label_Error.setVisible(true);
                    validacion++;
                } else {
                    nClie.txt_DireccionCliente.setForeground(Color.GREEN);
                }

                if (validacion == 0) {
                    nClie.label_Error.setVisible(false);
                    clie.setNombre(nombre);
                    clie.setTelefono(Telefeno);
                    clie.setDireccion(Direccion);
                    clie.setId(Integer.parseInt(id_CLienteText));

                    if (clieDao.ModificarCliente(clie)) {
                        LimpiarTabla();
                        ListarLosClientes();
                        JOptionPane.showMessageDialog(null, "Cliente modificado con exito");
                        LimpiarCamposCliente();
                    } else {
                        nClie.label_Error.setText("Error al modificar. - 404 -");
                        nClie.label_Error.setVisible(true);
                    }
                } else {
                    nClie.label_Error.setVisible(true);
                }
            } else {
                nClie.label_Error.setText("¡Seleccione una fila de la tabla!");
                nClie.label_Error.setVisible(true);
            }
        } else if (e.getSource() == nClie.btn_NuevoClie) {
            
            LimpiarCamposCliente();
            
        } else if (e.getSource() == nClie.opcion_Activo) {

            String id_CLienteText = nClie.txt_IdCliente.getText();

            if (!id_CLienteText.equals("")) {

                nClie.label_Error.setVisible(false);
                int id = Integer.parseInt(id_CLienteText);

                if (clieDao.AccionTablaCliente("Activo", id)) {

                    nClie.label_Error.setVisible(false);
                    LimpiarTabla();
                    LimpiarCamposCliente();
                    ListarLosClientes();
                    JOptionPane.showMessageDialog(null, "¡¡Cliente en estado de Activo exitosamente!!.");
                } else {

                    nClie.label_Error.setText("Error al modificar estado del cliente.");
                    nClie.label_Error.setVisible(true);
                }

            } else {
                nClie.label_Error.setText("Seleccione una cliente de la tabla.");
                nClie.label_Error.setVisible(true);
            }

        } else if (e.getSource() == nClie.opcion_Inactivo) {

            String id_CLienteText = nClie.txt_IdCliente.getText();

            if (!id_CLienteText.equals("")) {

                nClie.label_Error.setVisible(false);
                int id = Integer.parseInt(id_CLienteText);
                int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de inactivar este cliente.");

                if (opcion == 0) {
                    if (clieDao.AccionTablaCliente("Inactivo", id)) {

                        nClie.label_Error.setVisible(false);
                        LimpiarTabla();
                        LimpiarCamposCliente();
                        ListarLosClientes();
                        //JOptionPane.showMessageDialog(null, "¡¡Cliente en estado de inactivo exitosamente!!.");
                    } else {

                        nClie.label_Error.setText("Error al modificar estado del cliente.");
                        nClie.label_Error.setVisible(true);
                        LimpiarTabla();
                        ListarLosClientes();
                    }
                }
            } else {
                nClie.label_Error.setText("Seleccione una cliente de la tabla.");
                nClie.label_Error.setVisible(true);
                LimpiarCamposCliente();
                LimpiarTabla();
                ListarLosClientes();
            }
        }
    }

    /*¨********************** Mouse **********************/
    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == nClie.txt_NombreCliente) {
            LimpiarTabla();
            ListarLosClientes();
            if (nClie.txt_NombreCliente.getText().equals("Ingrese el nombre del cliente.") || nClie.txt_NombreCliente.getText().equals("Campo obligatorio")) {
                nClie.txt_NombreCliente.setForeground(Color.BLACK);
                nClie.txt_NombreCliente.setText("");
                nClie.label_Error.setVisible(false);              
            } else {
                nClie.txt_NombreCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_TelefonoCliente.getText().equals("") || nClie.txt_TelefonoCliente.getText().equals("Campo obligatorio") || nClie.txt_TelefonoCliente.getText().equals("Ingrese el telefono del cliente.")) {
                nClie.txt_TelefonoCliente.setForeground(Color.gray);
                nClie.txt_TelefonoCliente.setText("Ingrese el telefono del cliente.");
            } else {
                nClie.txt_TelefonoCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_DireccionCliente.getText().equals("Ingrese la direccion del cliente.") || nClie.txt_DireccionCliente.getText().equals("Campo obligatorio")) {
                nClie.txt_DireccionCliente.setForeground(Color.gray);
                nClie.txt_DireccionCliente.setText("Ingrese la direccion del cliente.");
            } else {
                nClie.txt_DireccionCliente.setForeground(Color.BLACK);
            }
            if (!nClie.txt_BuscarCliente.getText().equals("Ingrese un cliente para buscar") || nClie.txt_BuscarCliente.getText().isEmpty()) {
                nClie.txt_BuscarCliente.setText("Ingrese un cliente para buscar");
                nClie.txt_BuscarCliente.setForeground(new Color(0, 153, 204));
            }
        }

        if (e.getSource() == nClie.txt_TelefonoCliente) {
            if (nClie.txt_NombreCliente.getText().equals("") || nClie.txt_NombreCliente.getText().equals("Campo obligatorio") || nClie.txt_NombreCliente.getText().equals("Ingrese el nombre del cliente.")) {
                nClie.txt_NombreCliente.setForeground(Color.gray);
                nClie.txt_NombreCliente.setText("Ingrese el nombre del cliente.");
            } else {
                nClie.txt_NombreCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_TelefonoCliente.getText().equals("Ingrese el telefono del cliente.") || nClie.txt_TelefonoCliente.getText().equals("Campo obligatorio")) {
                nClie.txt_TelefonoCliente.setForeground(Color.BLACK);
                nClie.txt_TelefonoCliente.setText("");
                nClie.label_Error.setVisible(false);
            } else {
                nClie.txt_TelefonoCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_DireccionCliente.getText().equals("Ingrese la direccion del cliente.") || nClie.txt_DireccionCliente.getText().equals("Campo obligatorio") || nClie.txt_DireccionCliente.getText().equals("")) {
                nClie.txt_DireccionCliente.setForeground(Color.gray);
                nClie.txt_DireccionCliente.setText("Ingrese la direccion del cliente.");
            } else {
                nClie.txt_DireccionCliente.setForeground(Color.BLACK);
            }
            if (!nClie.txt_BuscarCliente.getText().equals("Ingrese un cliente para buscar") || nClie.txt_BuscarCliente.getText().isEmpty()) {
                nClie.txt_BuscarCliente.setText("Ingrese un cliente para buscar");
                nClie.txt_BuscarCliente.setForeground(new Color(0, 153, 204));
            }
        }

        if (e.getSource() == nClie.txt_DireccionCliente) {
            if (nClie.txt_NombreCliente.getText().equals("Ingrese el nombre del cliente.") || nClie.txt_NombreCliente.getText().equals("Campo obligatorio") || nClie.txt_DireccionCliente.getText().isEmpty()) {
                nClie.txt_NombreCliente.setForeground(Color.gray);
                nClie.txt_NombreCliente.setText("Ingrese el nombre del cliente.");
            } else {
                nClie.txt_NombreCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_TelefonoCliente.getText().equals("") || nClie.txt_TelefonoCliente.getText().equals("Campo obligatorio")) {
                nClie.txt_TelefonoCliente.setForeground(Color.gray);
                nClie.txt_TelefonoCliente.setText("Ingrese el telefono del cliente.");
            } else {
                nClie.txt_TelefonoCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_DireccionCliente.getText().equals("Ingrese la direccion del cliente.") || nClie.txt_DireccionCliente.getText().equals("Campo obligatorio")) {
                nClie.txt_DireccionCliente.setForeground(Color.BLACK);
                nClie.txt_DireccionCliente.setText("");
                nClie.label_Error.setVisible(false);
            } else {
                nClie.txt_DireccionCliente.setForeground(Color.BLACK);
            }
            if (!nClie.txt_BuscarCliente.getText().equals("Ingrese un cliente para buscar") || nClie.txt_BuscarCliente.getText().isEmpty()) {
                nClie.txt_BuscarCliente.setText("Ingrese un cliente para buscar");
                nClie.txt_BuscarCliente.setForeground(new Color(0, 153, 204));
            }
        }

        if (e.getSource() == nClie.txt_BuscarCliente) {
            if (nClie.txt_NombreCliente.getText().equals("Ingrese el nombre del cliente.") || nClie.txt_NombreCliente.getText().equals("Campo obligatorio") || nClie.txt_NombreCliente.getText().isEmpty()) {
                nClie.txt_NombreCliente.setForeground(Color.gray);
                nClie.txt_NombreCliente.setText("Ingrese el nombre del cliente.");
            } else {
                nClie.txt_NombreCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_TelefonoCliente.getText().equals("") || nClie.txt_TelefonoCliente.getText().equals("Campo obligatorio") || nClie.txt_TelefonoCliente.getText().equals("Ingrese el telefono del cliente.")) {
                nClie.txt_TelefonoCliente.setForeground(Color.gray);
                nClie.txt_TelefonoCliente.setText("Ingrese el telefono del cliente.");
            } else {
                nClie.txt_TelefonoCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_DireccionCliente.getText().equals("") || nClie.txt_DireccionCliente.getText().equals("Campo obligatorio") || nClie.txt_DireccionCliente.getText().equals("Ingrese la direccion del cliente.")) {
                nClie.txt_DireccionCliente.setForeground(Color.gray);
                nClie.txt_DireccionCliente.setText("Ingrese la direccion del cliente.");
            } else {
                nClie.txt_DireccionCliente.setForeground(Color.BLACK);
            }
            if (nClie.txt_BuscarCliente.getText().equals("Ingrese un cliente para buscar") || nClie.txt_BuscarCliente.getText().isEmpty()) {
                nClie.txt_BuscarCliente.setText("");
                nClie.txt_BuscarCliente.setForeground(new Color(0, 153, 204));
                nClie.label_Error.setVisible(false);
            }
        }

        //Click en la tabla
        if (e.getSource() == nClie.tabla_Clientes) {
            int fila = nClie.tabla_Clientes.rowAtPoint(e.getPoint());

            String id1 = nClie.tabla_Clientes.getValueAt(fila, 0).toString();
            String nombre = nClie.tabla_Clientes.getValueAt(fila, 1).toString();
            String telefono = nClie.tabla_Clientes.getValueAt(fila, 2).toString();
            String direccion = nClie.tabla_Clientes.getValueAt(fila, 3).toString();

            nClie.txt_IdCliente.setForeground(Color.BLACK);
            nClie.txt_IdCliente.setText(id1);
            nClie.txt_NombreCliente.setForeground(Color.BLACK);
            nClie.txt_NombreCliente.setText(nombre);
            nClie.txt_TelefonoCliente.setForeground(Color.BLACK);
            nClie.txt_TelefonoCliente.setText(telefono);
            nClie.txt_DireccionCliente.setForeground(Color.BLACK);
            nClie.txt_DireccionCliente.setText(direccion);

            nClie.btn_ResgistrarClie.setEnabled(false);
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
    public void ListarLosClientes() {

        Tables color = new Tables();
        nClie.tabla_Clientes.setDefaultRenderer(nClie.tabla_Clientes.getColumnClass(0), color);

        List<Clientes> listarClientes = clieDao.ListarClientes(nClie.txt_BuscarCliente.getText().trim());
        modelo = (DefaultTableModel) nClie.tabla_Clientes.getModel();
        Object[] ob = new Object[5];

        for (int i = 0; i < listarClientes.size(); i++) {

            ob[0] = listarClientes.get(i).getId();
            ob[1] = listarClientes.get(i).getNombre();
            ob[2] = listarClientes.get(i).getTelefono();
            ob[3] = listarClientes.get(i).getDireccion();
            ob[4] = listarClientes.get(i).getEstado();

            modelo.addRow(ob);
        }

        nClie.tabla_Clientes.setModel(modelo);
        JTableHeader header = nClie.tabla_Clientes.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.RED);
        header.setFont(new java.awt.Font("Roboto Medium", 0, 12));

    }

    public void LimpiarTabla() {
        modelo = (DefaultTableModel) nClie.tabla_Clientes.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    private void LimpiarCamposCliente() {
        nClie.txt_BuscarCliente.setText("Ingrese un cliente para buscar");
        nClie.txt_NombreCliente.setText("Ingrese el nombre del cliente.");
        nClie.txt_IdCliente.setText("");
        nClie.txt_DireccionCliente.setText("Ingrese la direccion del cliente.");
        nClie.txt_TelefonoCliente.setText("Ingrese el telefono del cliente.");

        nClie.txt_NombreCliente.setForeground(Color.gray);
        nClie.txt_DireccionCliente.setForeground(Color.gray);
        nClie.txt_TelefonoCliente.setForeground(Color.gray);

        nClie.btn_ResgistrarClie.setEnabled(true);
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
        
        if(e.getSource() == nClie.txt_BuscarCliente){
            LimpiarTabla();
            ListarLosClientes();
        }
        
    }

}
