/*
 * Fecha de creacion: 11/04/2023 13:30:07
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
import models.Tables;
import models.Usuarios;
import models.UsuariosDao;
import views.NuevoUsuario;

/**
 * @author Willy Stbn
 */
public class UsuariosControllers implements ActionListener, MouseListener, KeyListener {

    private Usuarios us;
    private UsuariosDao usDao;
    private NuevoUsuario NuevoUsuario;

    DefaultTableModel modelo = new DefaultTableModel();

    public UsuariosControllers(Usuarios us, UsuariosDao usDao, NuevoUsuario newUser) {
        this.us = us;
        this.usDao = usDao;
        this.NuevoUsuario = newUser;

        this.NuevoUsuario.btn_RegistrarNU.addActionListener(this);
        this.NuevoUsuario.btn_ModificarNU.addActionListener(this);
        this.NuevoUsuario.opcion_UserInactivo.addActionListener(this);
        this.NuevoUsuario.opcion_ReingresarUsuario.addActionListener(this);
        this.NuevoUsuario.btn_NuevoNU.addActionListener(this);
        
        this.NuevoUsuario.tabla_Usuarios.addMouseListener(this);
        this.NuevoUsuario.txt_UserNU.addMouseListener(this);
        this.NuevoUsuario.txt_NombreNU.addMouseListener(this);
        this.NuevoUsuario.txt_PassNU.addMouseListener(this);
        
        this.NuevoUsuario.txt_BuscarUser.addKeyListener(this);

        ListasUsuarios();
    }

    /**
     * ************************************** Acciones de botones **************************
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        String ussuario = NuevoUsuario.txt_UserNU.getText().trim();
        String nombre = NuevoUsuario.txt_NombreNU.getText().trim();
        String pass = String.valueOf(NuevoUsuario.txt_PassNU.getPassword()).trim();

        String caja = NuevoUsuario.cmb_CajaNU.getSelectedItem().toString();
        String rol = NuevoUsuario.cmb_RolNU.getSelectedItem().toString();

        if (e.getSource() == NuevoUsuario.btn_RegistrarNU) {    //Boton Registrar Usuario

            NuevoUsuario.label_Error.setText("¡Rellene todos los campos!");
            int check = 0;

            //Validaciones de campos
            if (ussuario.equals("Ingrese el usuario") || ussuario.equals("Campo Obligatorio") || ussuario.equals("")) {
                NuevoUsuario.txt_UserNU.setForeground(Color.red);
                NuevoUsuario.txt_UserNU.setText("Campo Obligatorio");
                check++;
            } else {
                NuevoUsuario.txt_UserNU.setForeground(Color.black);
            }

            if (nombre.equals("Ingrese el nombre del Usuario") || nombre.equals("Campo Obligatorio") || nombre.equals("")) {
                NuevoUsuario.txt_NombreNU.setForeground(Color.red);
                NuevoUsuario.txt_NombreNU.setText("Campo Obligatorio");
                check++;
            } else {
                NuevoUsuario.txt_NombreNU.setForeground(Color.black);
            }

            if (pass.equals("12345678@") || pass.equals("")) {
                NuevoUsuario.txt_PassNU.setForeground(Color.red);
                NuevoUsuario.txt_PassNU.setText("12345678@");
                check++;
            } else {
                NuevoUsuario.txt_PassNU.setForeground(Color.black);
            }

            if (check == 0) {
                us.setUsuario(ussuario);
                us.setNombre(nombre);
                us.setClave(pass);
                us.setCaja(caja);
                us.setRol(rol);

                if (usDao.RegistrarUsuario(us)) {
                    NuevoUsuario.label_Error.setVisible(false);
                    LimpiarTabla();
                    LImpiarCampos();
                    ListasUsuarios();
                    JOptionPane.showMessageDialog(null, "¡¡Usuario registrado con exito!!");
                }

            } else {
                //JOptionPane.showMessageDialog(null, "¡¡Rellene todos los campos!!");
                NuevoUsuario.label_Error.setVisible(true);
            }
        } else if (e.getSource() == NuevoUsuario.btn_ModificarNU) {     //Boton Actualizar Usuario

            int check = 0;
            String id0 = NuevoUsuario.txt_IdNU.getText().trim();

            if (!id0.equals("")) {
                //Validaciones de campos
                if (ussuario.equals("Ingrese el usuario") || ussuario.equals("Campo Obligatorio") || ussuario.equals("")) {
                    NuevoUsuario.txt_UserNU.setForeground(Color.red);
                    NuevoUsuario.txt_UserNU.setText("Campo Obligatorio");
                    check++;
                } else {
                    NuevoUsuario.txt_UserNU.setForeground(Color.black);
                }

                if (nombre.equals("Ingrese el nombre del Usuario") || nombre.equals("Campo Obligatorio") || nombre.equals("")) {
                    NuevoUsuario.txt_NombreNU.setForeground(Color.red);
                    NuevoUsuario.txt_NombreNU.setText("Campo Obligatorio");
                    check++;
                } else {
                    NuevoUsuario.txt_NombreNU.setForeground(Color.black);
                }

                if (pass.equals("12345678@")) {
                    NuevoUsuario.txt_PassNU.setForeground(Color.GREEN);
                } else {
                    NuevoUsuario.txt_PassNU.setForeground(Color.black);
                }
                if (id0.equals("")) {
                    check++;
                }

                if (check == 0) {

                    NuevoUsuario.label_Error.setVisible(false);
                    int id2 = Integer.parseInt(id0);

                    us.setUsuario(ussuario);
                    us.setNombre(nombre);
                    us.setCaja(caja);
                    us.setRol(rol);
                    us.setId(id2);

                    if (usDao.ModificarUsuario(us)) {
                        LimpiarTabla();
                        LImpiarCampos();
                        ListasUsuarios();
                        NuevoUsuario.label_Error.setVisible(false);
                        JOptionPane.showMessageDialog(null, "¡¡Usuario modificado con exito!!");
                    }

                } else {
                    //JOptionPane.showMessageDialog(null, "¡¡Rellene todos los campos!!");
                    NuevoUsuario.label_Error.setVisible(true);
                }
            } else {
                NuevoUsuario.label_Error.setVisible(true);
                NuevoUsuario.label_Error.setText("¡¡Seleccione una fila de la tabla para modificar!!.");
            }
        } else if (e.getSource() == NuevoUsuario.opcion_UserInactivo) {    //Opcion de cambiar el estado de  un usuario
            if (NuevoUsuario.txt_IdNU.getText().equals("")) {
                NuevoUsuario.label_Error.setVisible(true);
                NuevoUsuario.label_Error.setText("¡¡Seleccione un usuario de la tabla.!!.");
            } else {
                NuevoUsuario.label_Error.setVisible(false);
                int id4 = Integer.parseInt(NuevoUsuario.txt_IdNU.getText());
                if (usDao.AccionTabla("Inactivo", id4)) {
                    LimpiarTabla();
                    LImpiarCampos();
                    ListasUsuarios();
                    JOptionPane.showMessageDialog(null, "¡¡Usuario en estado de Inactivo!!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡¡Error al modificar el estado del usuario!!");
                }
            }
        } else if (e.getSource() == NuevoUsuario.opcion_ReingresarUsuario) {    //Opcion de reingresar usuario
            if (NuevoUsuario.txt_IdNU.getText().equals("")) {
                NuevoUsuario.label_Error.setVisible(true);
                NuevoUsuario.label_Error.setText("¡¡Seleccione una fila de la tabla para Reingresar!!.");
            } else {
                NuevoUsuario.label_Error.setVisible(false);
                int id4 = Integer.parseInt(NuevoUsuario.txt_IdNU.getText());
                if (usDao.AccionTabla("Activo", id4)) {
                    LimpiarTabla();
                    LImpiarCampos();
                    ListasUsuarios();
                    JOptionPane.showMessageDialog(null, "¡¡Usuario en estado de Activo!!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡¡Error al modificar el estado  del usuario!!");
                }
            }
        } else if(e.getSource() == NuevoUsuario.btn_NuevoNU){
            LImpiarCampos();
        }

    }

    /**
     * ************************************** Otros *************************************
     */
    public void ListasUsuarios() {
        
        Tables color = new Tables();
        NuevoUsuario.tabla_Usuarios.setDefaultRenderer(NuevoUsuario.tabla_Usuarios.getColumnClass(0), color);
        List<Usuarios> listaUsuarios = usDao.ListarUsuarios(NuevoUsuario.txt_BuscarUser.getText().trim());
        modelo = (DefaultTableModel) NuevoUsuario.tabla_Usuarios.getModel();
        Object[] ob = new Object[6];

        for (int i = 0; i < listaUsuarios.size(); i++) {

            ob[0] = listaUsuarios.get(i).getId();
            ob[1] = listaUsuarios.get(i).getUsuario();
            ob[2] = listaUsuarios.get(i).getNombre();
            ob[3] = listaUsuarios.get(i).getRol();
            ob[4] = listaUsuarios.get(i).getCaja();
            ob[5] = listaUsuarios.get(i).getEstado();

            modelo.addRow(ob);
        }

        NuevoUsuario.tabla_Usuarios.setModel(modelo);
        JTableHeader header = NuevoUsuario.tabla_Usuarios.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.RED);
        header.setFont(new java.awt.Font("Roboto Medium", 0, 12));

    }

    public void LimpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    /**
     * ************************************** Acciones de Mosuse **************************
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        String ussuario = NuevoUsuario.txt_UserNU.getText().trim();
        String nombre = NuevoUsuario.txt_NombreNU.getText().trim();
        String pass = String.valueOf(NuevoUsuario.txt_PassNU.getPassword()).trim();

        //Cajas de texto *******************************************
        //Validacion  si hace click en txtUser:
        if (e.getSource() == NuevoUsuario.txt_UserNU) {
            //Verificacion de usuario:
            if (ussuario.equals("Ingrese el usuario") || ussuario.equals("Campo Obligatorio")) {                
                NuevoUsuario.txt_UserNU.setForeground(Color.BLACK);
                NuevoUsuario.txt_UserNU.setText("");
                NuevoUsuario.label_Error.setVisible(false);
                NuevoUsuario.txt_BuscarUser.setText("Ingrese el nombre del usuario");
            }
            //Verificacion de nombre:
            if (nombre.equals("") || nombre.equals("Ingrese el nombre del usuario") || nombre.equals("Campo Obligatorio")) {
                NuevoUsuario.txt_NombreNU.setForeground(Color.GRAY);
                NuevoUsuario.txt_NombreNU.setText("Ingrese el nombre del usuario");
                NuevoUsuario.label_Error.setVisible(false);
            } else {
                NuevoUsuario.txt_NombreNU.setForeground(Color.BLACK);
            }
            //Verificacion pass.
            if (pass.equals("") || pass.equals("12345678@")) {
                NuevoUsuario.txt_PassNU.setForeground(Color.GRAY);
                NuevoUsuario.txt_PassNU.setText("12345678@");
                NuevoUsuario.label_Error.setVisible(false);
            } else {
                NuevoUsuario.txt_PassNU.setForeground(Color.BLACK);
            }
        }
        //Validacion  si hace click en txtNombre:
        if (e.getSource() == NuevoUsuario.txt_NombreNU) {
            //Verificacion de nombre:
            if (nombre.equals("Ingrese el nombre del usuario") || nombre.equals("Campo Obligatorio")) {
                NuevoUsuario.txt_NombreNU.setForeground(Color.BLACK);
                NuevoUsuario.txt_NombreNU.setText("");
                NuevoUsuario.label_Error.setVisible(false);
            }
            //Verificacion de usuario:
            if (ussuario.isEmpty()) {
                NuevoUsuario.txt_UserNU.setForeground(Color.GRAY);
                NuevoUsuario.txt_UserNU.setText("Ingrese el usuario");
                NuevoUsuario.label_Error.setVisible(false);
            }
            //Verificacion pass.
            if (pass.isEmpty() || pass.equals("12345678@")) {
                NuevoUsuario.txt_PassNU.setForeground(Color.GRAY);
                NuevoUsuario.txt_PassNU.setText("12345678@");
            } else {
                NuevoUsuario.txt_PassNU.setForeground(Color.BLACK);
            }
        }
        //Validacion  si hace click en txtPassword:
        if (e.getSource() == NuevoUsuario.txt_PassNU) {
            //Verificacion pass.
            if (pass.equals("12345678@")) {
                NuevoUsuario.txt_PassNU.setText("");
                NuevoUsuario.txt_PassNU.setForeground(Color.BLACK);
                NuevoUsuario.label_Error.setVisible(false);
            }
            //Verificacion de usuario:
            if (ussuario.isEmpty()) {
                NuevoUsuario.txt_UserNU.setText("Ingrese el usuario");
                NuevoUsuario.txt_UserNU.setForeground(Color.GRAY);
                NuevoUsuario.label_Error.setVisible(false);
            }
            //Verificacion de nombre:
            if (nombre.isEmpty()) {
                NuevoUsuario.txt_NombreNU.setText("Ingrese el nombre del usuario");
                NuevoUsuario.txt_NombreNU.setForeground(Color.GRAY);
                NuevoUsuario.label_Error.setVisible(false);
            }
        }
        //Click en la tabla
        if (e.getSource() == NuevoUsuario.tabla_Usuarios) {
            int fila = NuevoUsuario.tabla_Usuarios.rowAtPoint(e.getPoint());

            String id1 = NuevoUsuario.tabla_Usuarios.getValueAt(fila, 0).toString();
            String user = NuevoUsuario.tabla_Usuarios.getValueAt(fila, 1).toString();
            String name = NuevoUsuario.tabla_Usuarios.getValueAt(fila, 2).toString();
            //String password = NuevoUsuario.tabla_Usuarios.getValueAt(fila, 3).toString();

            String caja1 = NuevoUsuario.tabla_Usuarios.getValueAt(fila, 4).toString();
            String rol1 = NuevoUsuario.tabla_Usuarios.getValueAt(fila, 5).toString();

            NuevoUsuario.txt_IdNU.setForeground(Color.BLACK);
            NuevoUsuario.txt_IdNU.setText(id1);
            NuevoUsuario.txt_UserNU.setForeground(Color.BLACK);
            NuevoUsuario.txt_UserNU.setText(user);
            NuevoUsuario.txt_NombreNU.setForeground(Color.BLACK);
            NuevoUsuario.txt_NombreNU.setText(name);
            //NuevoUsuario.txt_PassNU.setText(password);
            NuevoUsuario.cmb_CajaNU.setSelectedItem(caja1);
            NuevoUsuario.cmb_RolNU.setSelectedItem(rol1);

            NuevoUsuario.txt_PassNU.setEnabled(false);
            NuevoUsuario.btn_RegistrarNU.setEnabled(false);
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
    
    /**
     * ************************************** Acciones al hacer usar el teclado**************************
     */
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == NuevoUsuario.txt_BuscarUser){
            LimpiarTabla();
            ListasUsuarios();
        }
    }
    
    /**************************************** OTROS **************************************/
    private void LImpiarCampos(){
        NuevoUsuario.txt_BuscarUser.setText("Ingrese el nombre del usuario");
        NuevoUsuario.txt_IdNU.setText("");
        NuevoUsuario.txt_NombreNU.setText("Ingrese el nombre del usuario");
        NuevoUsuario.txt_PassNU.setText("12345678@");
        NuevoUsuario.txt_UserNU.setText("Ingrese el usuario");
        NuevoUsuario.cmb_RolNU.setSelectedIndex(0);
        NuevoUsuario.cmb_CajaNU.setSelectedIndex(0);
        NuevoUsuario.label_Error.setText("¡¡Rellene todos los campos!!.");
        NuevoUsuario.label_Error.setVisible(false);
        
        NuevoUsuario.txt_BuscarUser.setForeground(new Color(0,153,204));
        NuevoUsuario.txt_NombreNU.setForeground(Color.GRAY);
        NuevoUsuario.txt_PassNU.setForeground(Color.GRAY);
        NuevoUsuario.txt_UserNU.setForeground(Color.GRAY);
        
        NuevoUsuario.btn_RegistrarNU.setEnabled(true);
    }
    
}
