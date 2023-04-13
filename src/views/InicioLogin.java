/*
 * Fecha de creacion: 10/04/2023 19:34:48
 * Version: v.0.1
 * Detalles: 
 */
package views;

import controllers.LoginControllers;
import java.awt.Color;
import models.Usuarios;
import models.UsuariosDao;

/**
 *
 * @author Willy Stbn
 */
public class InicioLogin extends javax.swing.JFrame {
    
    Usuarios usuario = new Usuarios();
    UsuariosDao usuarioDao = new UsuariosDao();
    
    public InicioLogin() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setSize(800, 500);
        this.setTitle("Inicio de sesion");
        
        LoginControllers verificacion = new LoginControllers(usuario, usuarioDao, this);
        
        label_Error.setVisible(false);
        txt_Usuario.setText("admin");
        txt_Pass.setText("admin");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_logo1 = new javax.swing.JLabel();
        label_Titulo = new javax.swing.JLabel();
        btn_Cerrar = new javax.swing.JButton();
        label_Fondo1 = new javax.swing.JLabel();
        panel_login = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        label_Pass = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JPasswordField();
        label_logo2 = new javax.swing.JLabel();
        btn_IniciarSesion = new javax.swing.JButton();
        label_Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N
        getContentPane().add(label_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 290, 150));

        label_Titulo.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        label_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Titulo.setText("TITULO DE LA EMPRESA");
        getContentPane().add(label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 290, 50));

        btn_Cerrar.setBackground(new java.awt.Color(255, 51, 0));
        btn_Cerrar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        btn_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cerrar.setText("x");
        btn_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseExited(evt);
            }
        });
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -10, 50, 50));

        label_Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/city.png"))); // NOI18N
        getContentPane().add(label_Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 300, 500));

        panel_login.setBackground(new java.awt.Color(255, 255, 255));

        label_titulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(0, 0, 0));
        label_titulo.setText("INICIAR SESION");

        label_usuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(0, 0, 0));
        label_usuario.setText("USUARIO:");

        txt_Usuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(153, 153, 153));
        txt_Usuario.setText("  Ingrese su nombre de usuario");
        txt_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 153)));
        txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_UsuarioMousePressed(evt);
            }
        });

        label_Pass.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        label_Pass.setForeground(new java.awt.Color(0, 0, 0));
        label_Pass.setText("CONTRASEÑA:");

        txt_Pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_Pass.setForeground(new java.awt.Color(153, 153, 153));
        txt_Pass.setText("12345678@");
        txt_Pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 153)));
        txt_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_PassMousePressed(evt);
            }
        });

        label_logo2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        label_logo2.setForeground(new java.awt.Color(0, 0, 0));
        label_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ico_logo.png"))); // NOI18N
        label_logo2.setText("SISTEMA DE VENTAS");

        btn_IniciarSesion.setBackground(new java.awt.Color(0, 153, 204));
        btn_IniciarSesion.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btn_IniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        btn_IniciarSesion.setText("Iniciar Sesion");
        btn_IniciarSesion.setBorder(null);
        btn_IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_IniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_IniciarSesionMouseExited(evt);
            }
        });

        label_Error.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        label_Error.setForeground(new java.awt.Color(153, 0, 0));
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/advertencia.png"))); // NOI18N
        label_Error.setText("!Nombre de usuario o contraseña incorrecto!");

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(btn_IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_loginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(txt_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(label_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_loginLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label_logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_Error)
                .addGap(33, 33, 33)
                .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseEntered
        btn_Cerrar.setBackground(new Color(48, 0, 27));
    }//GEN-LAST:event_btn_CerrarMouseEntered

    private void btn_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseExited
        btn_Cerrar.setBackground(new Color(255, 51, 0));
    }//GEN-LAST:event_btn_CerrarMouseExited

    private void txt_PassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PassMousePressed
        if (String.valueOf(txt_Pass.getPassword()).equals("12345678@")) {
            txt_Pass.setText("");
            txt_Pass.setForeground(Color.BLACK);
        }
        if (txt_Usuario.getText().isEmpty()) {
            txt_Usuario.setText("  Ingrese su nombre de usuario");
            txt_Usuario.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txt_PassMousePressed

    private void txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_UsuarioMousePressed
        
        label_Error.setVisible(false);
        
        if (txt_Usuario.getText().equals("  Ingrese su nombre de usuario")) {
            txt_Usuario.setText("");
            txt_Usuario.setForeground(Color.BLACK);
        }
        if (String.valueOf(txt_Pass.getPassword()).isEmpty()) {
            txt_Pass.setText("12345678@");
            txt_Pass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_UsuarioMousePressed

    private void btn_IniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IniciarSesionMouseEntered
        btn_IniciarSesion.setForeground(Color.BLACK);
        btn_IniciarSesion.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_btn_IniciarSesionMouseEntered

    private void btn_IniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IniciarSesionMouseExited
        btn_IniciarSesion.setForeground(Color.GRAY);
        btn_IniciarSesion.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_btn_IniciarSesionMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cerrar;
    public javax.swing.JButton btn_IniciarSesion;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_Fondo1;
    private javax.swing.JLabel label_Pass;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_logo1;
    private javax.swing.JLabel label_logo2;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JPanel panel_login;
    public javax.swing.JPasswordField txt_Pass;
    public javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
