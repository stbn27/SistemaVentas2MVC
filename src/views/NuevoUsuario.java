/*
 * Fecha de creacion: 11/04/2023 00:12:31
 * Version: v.0.1
 * Detalles: 
 */
package views;

import controllers.UsuariosControllers;
import models.Usuarios;
import models.UsuariosDao;

/**
 *
 * @author Willy Stbn
 */
public class NuevoUsuario extends javax.swing.JPanel {
    
    Usuarios user = new Usuarios();
    UsuariosDao userDao = new UsuariosDao();
    
    public NuevoUsuario() {
        initComponents();
        
        UsuariosControllers nuevoUsuario = new UsuariosControllers(user, userDao, this);
        
        label_Error.setVisible(false);
        txt_IdNU.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupUsuarios = new javax.swing.JPopupMenu();
        opcion_UserInactivo = new javax.swing.JMenuItem();
        opcion_ReingresarUsuario = new javax.swing.JMenuItem();
        panel_Anadir = new javax.swing.JPanel();
        label_NombreCliente = new javax.swing.JLabel();
        label_TelefonoCliente = new javax.swing.JLabel();
        label_DireccionCliente = new javax.swing.JLabel();
        btn_NuevoNU = new javax.swing.JButton();
        btn_ModificarNU = new javax.swing.JButton();
        btn_RegistrarNU = new javax.swing.JButton();
        txt_NombreNU = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_UserNU = new javax.swing.JTextField();
        label_DireccionCliente1 = new javax.swing.JLabel();
        cmb_CajaNU = new javax.swing.JComboBox<>();
        cmb_RolNU = new javax.swing.JComboBox<>();
        txt_PassNU = new javax.swing.JPasswordField();
        label_Error = new javax.swing.JLabel();
        txt_IdNU = new javax.swing.JTextField();
        label_IcoBuscar = new javax.swing.JLabel();
        txt_BuscarUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Usuarios = new javax.swing.JTable();
        paginadorUsuarios = new javax.swing.JPanel();

        opcion_UserInactivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/advertencia.png"))); // NOI18N
        opcion_UserInactivo.setText("Inactivo");
        popupUsuarios.add(opcion_UserInactivo);

        opcion_ReingresarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        opcion_ReingresarUsuario.setText("Activo");
        popupUsuarios.add(opcion_ReingresarUsuario);

        setBackground(new java.awt.Color(255, 204, 0));

        panel_Anadir.setBackground(new java.awt.Color(204, 204, 204));
        panel_Anadir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        panel_Anadir.setMaximumSize(new java.awt.Dimension(450, 32767));

        label_NombreCliente.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        label_NombreCliente.setForeground(new java.awt.Color(102, 0, 102));
        label_NombreCliente.setText("Nombre");

        label_TelefonoCliente.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        label_TelefonoCliente.setForeground(new java.awt.Color(102, 0, 102));
        label_TelefonoCliente.setText("Contraseña:");

        label_DireccionCliente.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        label_DireccionCliente.setForeground(new java.awt.Color(102, 0, 102));
        label_DireccionCliente.setText("Caja:");

        btn_NuevoNU.setText("Nuevo");

        btn_ModificarNU.setText("Modificar");

        btn_RegistrarNU.setText("Registar");

        txt_NombreNU.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_NombreNU.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreNU.setText("Ingrese el nombre del usuario");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Usuario:");

        txt_UserNU.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_UserNU.setForeground(new java.awt.Color(153, 153, 153));
        txt_UserNU.setText("Ingrese el usuario");

        label_DireccionCliente1.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        label_DireccionCliente1.setForeground(new java.awt.Color(102, 0, 102));
        label_DireccionCliente1.setText("Rol:");

        cmb_CajaNU.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        cmb_CajaNU.setForeground(new java.awt.Color(0, 102, 204));
        cmb_CajaNU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General" }));

        cmb_RolNU.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        cmb_RolNU.setForeground(new java.awt.Color(0, 102, 204));
        cmb_RolNU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor", "Otro" }));

        txt_PassNU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_PassNU.setForeground(new java.awt.Color(153, 153, 153));
        txt_PassNU.setText("12345678@");

        label_Error.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        label_Error.setForeground(new java.awt.Color(153, 0, 0));
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/advertencia.png"))); // NOI18N
        label_Error.setText("¡¡Rellene todos los campos!!");

        txt_IdNU.setFont(new java.awt.Font("Roboto Light", 0, 10)); // NOI18N

        label_IcoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        txt_BuscarUser.setBackground(new java.awt.Color(204, 204, 204));
        txt_BuscarUser.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_BuscarUser.setForeground(new java.awt.Color(0, 153, 204));
        txt_BuscarUser.setText("Ingrese el nombre del usuario");
        txt_BuscarUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_BuscarUser.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txt_BuscarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_BuscarUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_AnadirLayout = new javax.swing.GroupLayout(panel_Anadir);
        panel_Anadir.setLayout(panel_AnadirLayout);
        panel_AnadirLayout.setHorizontalGroup(
            panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AnadirLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_AnadirLayout.createSequentialGroup()
                        .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_AnadirLayout.createSequentialGroup()
                                .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_CajaNU, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_DireccionCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_RolNU, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_AnadirLayout.createSequentialGroup()
                        .addComponent(label_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_AnadirLayout.createSequentialGroup()
                        .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_UserNU, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NombreNU, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_PassNU, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_AnadirLayout.createSequentialGroup()
                                .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_IdNU, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_AnadirLayout.createSequentialGroup()
                                .addComponent(btn_NuevoNU, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_RegistrarNU, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_ModificarNU, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_AnadirLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(label_IcoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_BuscarUser)))
                        .addGap(37, 37, 37))))
        );
        panel_AnadirLayout.setVerticalGroup(
            panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AnadirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_BuscarUser)
                    .addComponent(label_IcoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_UserNU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_NombreNU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_PassNU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_DireccionCliente)
                    .addComponent(label_DireccionCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_CajaNU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_RolNU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NuevoNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_RegistrarNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_AnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_Error)
                    .addGroup(panel_AnadirLayout.createSequentialGroup()
                        .addComponent(txt_IdNU)
                        .addGap(1, 1, 1)))
                .addGap(17, 17, 17))
        );

        tabla_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Rol", "Caja", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Usuarios.setComponentPopupMenu(popupUsuarios);
        jScrollPane1.setViewportView(tabla_Usuarios);
        if (tabla_Usuarios.getColumnModel().getColumnCount() > 0) {
            tabla_Usuarios.getColumnModel().getColumn(0).setPreferredWidth(35);
            tabla_Usuarios.getColumnModel().getColumn(1).setPreferredWidth(90);
            tabla_Usuarios.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla_Usuarios.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabla_Usuarios.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabla_Usuarios.getColumnModel().getColumn(5).setPreferredWidth(90);
        }

        paginadorUsuarios.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout paginadorUsuariosLayout = new javax.swing.GroupLayout(paginadorUsuarios);
        paginadorUsuarios.setLayout(paginadorUsuariosLayout);
        paginadorUsuariosLayout.setHorizontalGroup(
            paginadorUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paginadorUsuariosLayout.setVerticalGroup(
            paginadorUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Anadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addComponent(paginadorUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paginadorUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_Anadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BuscarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BuscarUserMouseClicked
        if(txt_BuscarUser.getText().equals("Ingrese el nombre del usuario")){
            txt_BuscarUser.setText("");
        }
    }//GEN-LAST:event_txt_BuscarUserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ModificarNU;
    public javax.swing.JButton btn_NuevoNU;
    public javax.swing.JButton btn_RegistrarNU;
    public javax.swing.JComboBox<String> cmb_CajaNU;
    public javax.swing.JComboBox<String> cmb_RolNU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_DireccionCliente;
    private javax.swing.JLabel label_DireccionCliente1;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_IcoBuscar;
    private javax.swing.JLabel label_NombreCliente;
    private javax.swing.JLabel label_TelefonoCliente;
    public javax.swing.JMenuItem opcion_ReingresarUsuario;
    public javax.swing.JMenuItem opcion_UserInactivo;
    private javax.swing.JPanel paginadorUsuarios;
    private javax.swing.JPanel panel_Anadir;
    private javax.swing.JPopupMenu popupUsuarios;
    public javax.swing.JTable tabla_Usuarios;
    public javax.swing.JTextField txt_BuscarUser;
    public javax.swing.JTextField txt_IdNU;
    public javax.swing.JTextField txt_NombreNU;
    public javax.swing.JPasswordField txt_PassNU;
    public javax.swing.JTextField txt_UserNU;
    // End of variables declaration//GEN-END:variables
}
