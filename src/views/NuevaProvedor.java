/*
 * Fecha de creacion: 11/04/2023 00:12:31
 * Version: v.0.1
 * Detalles: 
 */
package views;

/**
 *
 * @author Willy Stbn
 */
public class NuevaProvedor extends javax.swing.JPanel {

    public NuevaProvedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_NombreCliente = new javax.swing.JLabel();
        label_TelefonoCliente = new javax.swing.JLabel();
        label_DireccionCliente = new javax.swing.JLabel();
        btn_NuevoProvedor = new javax.swing.JButton();
        btn_ModificarProvedor = new javax.swing.JButton();
        btn_ResgistrarProvedor = new javax.swing.JButton();
        txt_CodigoProvedir = new javax.swing.JTextField();
        txt_DescripcionProveedor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_DireccionProvedor = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        txt_RuccProvedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Provedor = new javax.swing.JTable();
        paginadorProvedor = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 204, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 32767));

        label_NombreCliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_NombreCliente.setForeground(new java.awt.Color(255, 102, 102));
        label_NombreCliente.setText("Nombre");

        label_TelefonoCliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_TelefonoCliente.setForeground(new java.awt.Color(255, 102, 102));
        label_TelefonoCliente.setText("Telefono:");

        label_DireccionCliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_DireccionCliente.setForeground(new java.awt.Color(255, 102, 102));
        label_DireccionCliente.setText("Direccion:");

        btn_NuevoProvedor.setText("Nuevo");

        btn_ModificarProvedor.setText("Modificar");

        btn_ResgistrarProvedor.setText("Registar");

        txt_CodigoProvedir.setForeground(new java.awt.Color(102, 204, 255));
        txt_CodigoProvedir.setText("Ingrese el codigo del producto");

        txt_DescripcionProveedor.setForeground(new java.awt.Color(102, 204, 255));
        txt_DescripcionProveedor.setText("Ingrese el codigo la descripcion");

        txt_DireccionProvedor.setForeground(new java.awt.Color(0, 204, 204));
        txt_DireccionProvedor.setText("Ingrese la direccion");
        jScrollPane2.setViewportView(txt_DireccionProvedor);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("RUCC:");

        txt_RuccProvedor.setForeground(new java.awt.Color(0, 204, 204));
        txt_RuccProvedor.setText("Ingrese el RUCC del provedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_RuccProvedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_NuevoProvedor, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ResgistrarProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_ModificarProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_CodigoProvedir, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DescripcionProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_NombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_TelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_DireccionCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(txt_RuccProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_CodigoProvedir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_DescripcionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NuevoProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResgistrarProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        tabla_Provedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion", "Estatus"
            }
        ));
        jScrollPane1.setViewportView(tabla_Provedor);
        if (tabla_Provedor.getColumnModel().getColumnCount() > 0) {
            tabla_Provedor.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_Provedor.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabla_Provedor.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabla_Provedor.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabla_Provedor.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        paginadorProvedor.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout paginadorProvedorLayout = new javax.swing.GroupLayout(paginadorProvedor);
        paginadorProvedor.setLayout(paginadorProvedorLayout);
        paginadorProvedorLayout.setHorizontalGroup(
            paginadorProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paginadorProvedorLayout.setVerticalGroup(
            paginadorProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addComponent(paginadorProvedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paginadorProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ModificarProvedor;
    private javax.swing.JButton btn_NuevoProvedor;
    private javax.swing.JButton btn_ResgistrarProvedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_DireccionCliente;
    private javax.swing.JLabel label_NombreCliente;
    private javax.swing.JLabel label_TelefonoCliente;
    private javax.swing.JPanel paginadorProvedor;
    private javax.swing.JTable tabla_Provedor;
    private javax.swing.JTextField txt_CodigoProvedir;
    private javax.swing.JTextField txt_DescripcionProveedor;
    private javax.swing.JTextPane txt_DireccionProvedor;
    private javax.swing.JTextField txt_RuccProvedor;
    // End of variables declaration//GEN-END:variables
}
