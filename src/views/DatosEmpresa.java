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
public class DatosEmpresa extends javax.swing.JPanel {

    public DatosEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_NombreCliente = new javax.swing.JLabel();
        label_TelefonoCliente = new javax.swing.JLabel();
        label_DireccionCliente = new javax.swing.JLabel();
        btn_ModificarClie = new javax.swing.JButton();
        txt_NombreDE = new javax.swing.JTextField();
        txt_DescripcionDE = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_DireccionDE = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        txt_RuccDE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_MensajeDE = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Clientes = new javax.swing.JTable();
        paginadorCliente = new javax.swing.JPanel();

        setBackground(new java.awt.Color(153, 255, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
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

        btn_ModificarClie.setBackground(new java.awt.Color(51, 255, 51));
        btn_ModificarClie.setForeground(new java.awt.Color(0, 0, 0));
        btn_ModificarClie.setText("Modificar");

        txt_NombreDE.setForeground(new java.awt.Color(102, 204, 255));
        txt_NombreDE.setText("Ingrese el codigo del producto");

        txt_DescripcionDE.setForeground(new java.awt.Color(102, 204, 255));
        txt_DescripcionDE.setText("Ingrese el codigo la descripcion");

        txt_DireccionDE.setForeground(new java.awt.Color(0, 204, 204));
        txt_DireccionDE.setText("Ingrese la direccion");
        jScrollPane2.setViewportView(txt_DireccionDE);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Rucc:");

        txt_RuccDE.setForeground(new java.awt.Color(0, 204, 204));
        txt_RuccDE.setText("Ingrese el Rucc de la empresa");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Mensaje:");

        txt_MensajeDE.setForeground(new java.awt.Color(0, 204, 204));
        txt_MensajeDE.setText("Ingrese un mensaje para el cliente");
        jScrollPane3.setViewportView(txt_MensajeDE);

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_RuccDE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DescripcionDE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NombreDE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_NombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_DireccionCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_TelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btn_ModificarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_RuccDE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NombreDE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_DescripcionDE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_ModificarClie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion", "Estatus"
            }
        ));
        jScrollPane1.setViewportView(tabla_Clientes);
        if (tabla_Clientes.getColumnModel().getColumnCount() > 0) {
            tabla_Clientes.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_Clientes.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabla_Clientes.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabla_Clientes.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabla_Clientes.getColumnModel().getColumn(4).setPreferredWidth(50);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addComponent(paginadorCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(paginadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ModificarClie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_DireccionCliente;
    private javax.swing.JLabel label_NombreCliente;
    private javax.swing.JLabel label_TelefonoCliente;
    private javax.swing.JPanel paginadorCliente;
    private javax.swing.JTable tabla_Clientes;
    private javax.swing.JTextField txt_DescripcionDE;
    private javax.swing.JTextPane txt_DireccionDE;
    private javax.swing.JTextPane txt_MensajeDE;
    private javax.swing.JTextField txt_NombreDE;
    private javax.swing.JTextField txt_RuccDE;
    // End of variables declaration//GEN-END:variables
}
