/*
 * Fecha de creacion: 10/04/2023 22:07:06
 * Version: v.0.1
 * Detalles: 
 */

package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Usuarios;
import models.UsuariosDao;
import views.InicioLogin;
import views.DashBoard;

/**
 * @author Willy Stbn
 */

public class LoginControllers implements ActionListener{
    
    private Usuarios user;
    private UsuariosDao userDao;
    private InicioLogin init;

    public LoginControllers(Usuarios user, UsuariosDao userDao, InicioLogin init) {
        this.user = user;
        this.userDao = userDao;
        this.init = init;
        this.init.btn_IniciarSesion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == init.btn_IniciarSesion){
            String usuario = init.txt_Usuario.getText().trim();
            String pass = String.valueOf(init.txt_Pass.getPassword());
            
            if(!usuario.equals("Ingrese su nombre de usuario") && !pass.equals("12345678@")){
                
                user = userDao.UsuarioLogin(usuario, pass);
                
                if(user.getNombre() != null){
                    DashBoard admin = new DashBoard();
                    admin.setVisible(true);
                    this.init.dispose();
                    init.label_Error.setVisible(false);
                } else {
                    init.label_Error.setVisible(true);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "¡Rellene todos los campos!!");
            }
        }
    }
    
    
    
}
