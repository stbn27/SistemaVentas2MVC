/*
 * Fecha de creacion: 11/04/2023 00:12:31
 * Version: v.0.1
 * Detalles: 
 */
package views;

import controllers.ClientesController;
import models.ClienteDao;
import models.Clientes;

/**
 *
 * @author Willy Stbn
 */
public class NuevoCliente extends javax.swing.JPanel {

    Clientes cliente = new Clientes();
    ClienteDao clienteDao = new ClienteDao();
    
    public NuevoCliente() {
        initComponents();
        
        ClientesController clControllers = new ClientesController(cliente, clienteDao, this);
        this.txt_IdCliente.setVisible(false);
        this.label_Error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupClientes = new javax.swing.JPopupMenu();
        opcion_Activo = new javax.swing.JMenuItem();
        opcion_Inactivo = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        label_NombreCliente = new javax.swing.JLabel();
        label_TelefonoCliente = new javax.swing.JLabel();
        label_DireccionCliente = new javax.swing.JLabel();
        btn_NuevoClie = new javax.swing.JButton();
        btn_ModificarClie = new javax.swing.JButton();
        btn_ResgistrarClie = new javax.swing.JButton();
        txt_NombreCliente = new javax.swing.JTextField();
        txt_TelefonoCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_DireccionCliente = new javax.swing.JTextPane();
        label_Error = new javax.swing.JLabel();
        label_IcoBuscar = new javax.swing.JLabel();
        txt_BuscarCliente = new javax.swing.JTextField();
        txt_IdCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Clientes = new javax.swing.JTable();
        paginadorCliente = new javax.swing.JPanel();

        opcion_Activo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        opcion_Activo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Activo.png"))); // NOI18N
        opcion_Activo.setText("Activo");
        popupClientes.add(opcion_Activo);

        opcion_Inactivo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        opcion_Inactivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/advertencia.png"))); // NOI18N
        opcion_Inactivo.setText("Inacitvo");
        popupClientes.add(opcion_Inactivo);

        setBackground(new java.awt.Color(153, 255, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 32767));

        label_NombreCliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_NombreCliente.setForeground(new java.awt.Color(153, 0, 153));
        label_NombreCliente.setText("Nombre");

        label_TelefonoCliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_TelefonoCliente.setForeground(new java.awt.Color(153, 0, 153));
        label_TelefonoCliente.setText("Telefono:");

        label_DireccionCliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_DireccionCliente.setForeground(new java.awt.Color(153, 0, 153));
        label_DireccionCliente.setText("Direccion:");

        btn_NuevoClie.setBackground(new java.awt.Color(255, 255, 255));
        btn_NuevoClie.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btn_NuevoClie.setForeground(new java.awt.Color(0, 0, 0));
        btn_NuevoClie.setText("Nuevo");

        btn_ModificarClie.setBackground(new java.awt.Color(102, 153, 255));
        btn_ModificarClie.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btn_ModificarClie.setForeground(new java.awt.Color(0, 0, 0));
        btn_ModificarClie.setText("Modificar");

        btn_ResgistrarClie.setBackground(new java.awt.Color(51, 255, 51));
        btn_ResgistrarClie.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btn_ResgistrarClie.setForeground(new java.awt.Color(0, 0, 0));
        btn_ResgistrarClie.setText("Registar");

        txt_NombreCliente.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreCliente.setText("Ingrese el nombre del cliente.");

        txt_TelefonoCliente.setForeground(new java.awt.Color(153, 153, 153));
        txt_TelefonoCliente.setText("Ingrese el telefono del cliente.");

        txt_DireccionCliente.setForeground(new java.awt.Color(153, 153, 153));
        txt_DireccionCliente.setText("Ingrese la direccion del cliente.");
        jScrollPane2.setViewportView(txt_DireccionCliente);

        label_Error.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        label_Error.setForeground(new java.awt.Color(153, 0, 0));
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/advertencia.png"))); // NOI18N
        label_Error.setText("¡¡Rellene todos los campos!!");

        label_IcoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        txt_BuscarCliente.setBackground(new java.awt.Color(204, 204, 204));
        txt_BuscarCliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_BuscarCliente.setForeground(new java.awt.Color(0, 153, 204));
        txt_BuscarCliente.setText("Ingrese un cliente para buscar");
        txt_BuscarCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_BuscarCliente.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txt_BuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_BuscarClienteMouseClicked(evt);
            }
        });

        txt_IdCliente.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_IcoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_NuevoClie, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ResgistrarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_ModificarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_NombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_TelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_NombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_TelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_DireccionCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_BuscarCliente)
                    .addComponent(label_IcoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NuevoClie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResgistrarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Error)
                    .addComponent(txt_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_Clientes);
        if (tabla_Clientes.getColumnModel().getColumnCount() > 0) {
            tabla_Clientes.getColumnModel().getColumn(0).setResizable(false);
            tabla_Clientes.getColumnModel().getColumn(0).setPreferredWidth(35);
            tabla_Clientes.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabla_Clientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_Clientes.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabla_Clientes.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        paginadorCliente.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout paginadorClienteLayout = new javax.swing.GroupLayout(paginadorCliente);
        paginadorCliente.setLayout(paginadorClienteLayout);
        paginadorClienteLayout.setHorizontalGroup(
            paginadorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paginadorClienteLayout.setVerticalGroup(
            paginadorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addComponent(paginadorCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(paginadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BuscarClienteMouseClicked
        if(txt_BuscarCliente.getText().equals("Ingrese el nombre del usuario")){
            txt_BuscarCliente.setText("");
        }
    }//GEN-LAST:event_txt_BuscarClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ModificarClie;
    public javax.swing.JButton btn_NuevoClie;
    public javax.swing.JButton btn_ResgistrarClie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_DireccionCliente;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_IcoBuscar;
    private javax.swing.JLabel label_NombreCliente;
    private javax.swing.JLabel label_TelefonoCliente;
    public javax.swing.JMenuItem opcion_Activo;
    public javax.swing.JMenuItem opcion_Inactivo;
    private javax.swing.JPanel paginadorCliente;
    private javax.swing.JPopupMenu popupClientes;
    public javax.swing.JTable tabla_Clientes;
    public javax.swing.JTextField txt_BuscarCliente;
    public javax.swing.JTextPane txt_DireccionCliente;
    public javax.swing.JTextField txt_IdCliente;
    public javax.swing.JTextField txt_NombreCliente;
    public javax.swing.JTextField txt_TelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
