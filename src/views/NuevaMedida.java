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
public class NuevaMedida extends javax.swing.JPanel {

    public NuevaMedida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_NuevaMedida = new javax.swing.JButton();
        btn_ModificarMedida = new javax.swing.JButton();
        btn_ResgistrarMedida = new javax.swing.JButton();
        label_Medida = new javax.swing.JLabel();
        txt_Medidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_NombreCortoMedida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Medidas = new javax.swing.JTable();
        paginadorMedidas = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Medida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 32767));

        btn_NuevaMedida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_NuevaMedida.setForeground(new java.awt.Color(102, 0, 102));
        btn_NuevaMedida.setText("Nuevo");

        btn_ModificarMedida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_ModificarMedida.setForeground(new java.awt.Color(102, 0, 102));
        btn_ModificarMedida.setText("Modificar");

        btn_ResgistrarMedida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_ResgistrarMedida.setForeground(new java.awt.Color(102, 0, 102));
        btn_ResgistrarMedida.setText("Registar");

        label_Medida.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_Medida.setForeground(new java.awt.Color(255, 102, 0));
        label_Medida.setText("Nombre de la medidad:");

        txt_Medidad.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_Medidad.setForeground(new java.awt.Color(0, 204, 204));
        txt_Medidad.setText("Ingrese la medida");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Nombre Corto:");

        txt_NombreCortoMedida.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_NombreCortoMedida.setForeground(new java.awt.Color(0, 204, 204));
        txt_NombreCortoMedida.setText("Ingrese el nombre corto de la medida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Medidad)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_NuevaMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ResgistrarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ModificarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Medida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NombreCortoMedida))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(label_Medida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txt_Medidad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NombreCortoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NuevaMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResgistrarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        tabla_Medidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Nombre Corto", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla_Medidas);
        if (tabla_Medidas.getColumnModel().getColumnCount() > 0) {
            tabla_Medidas.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_Medidas.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_Medidas.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabla_Medidas.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        paginadorMedidas.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout paginadorMedidasLayout = new javax.swing.GroupLayout(paginadorMedidas);
        paginadorMedidas.setLayout(paginadorMedidasLayout);
        paginadorMedidasLayout.setHorizontalGroup(
            paginadorMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paginadorMedidasLayout.setVerticalGroup(
            paginadorMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(paginadorMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(paginadorMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ModificarMedida;
    private javax.swing.JButton btn_NuevaMedida;
    private javax.swing.JButton btn_ResgistrarMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Medida;
    private javax.swing.JPanel paginadorMedidas;
    private javax.swing.JTable tabla_Medidas;
    private javax.swing.JTextField txt_Medidad;
    private javax.swing.JTextField txt_NombreCortoMedida;
    // End of variables declaration//GEN-END:variables
}
