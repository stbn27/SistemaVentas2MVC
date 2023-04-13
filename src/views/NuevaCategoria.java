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
public class NuevaCategoria extends javax.swing.JPanel {

    public NuevaCategoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_NuevoCategoria = new javax.swing.JButton();
        btn_ModificarCategoria = new javax.swing.JButton();
        btn_ResgistrarCategoria = new javax.swing.JButton();
        label_Categoria = new javax.swing.JLabel();
        txt_Categoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Categoria = new javax.swing.JTable();
        paginadorCategoria = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 0, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 32767));

        btn_NuevoCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_NuevoCategoria.setForeground(new java.awt.Color(102, 0, 102));
        btn_NuevoCategoria.setText("Nuevo");

        btn_ModificarCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_ModificarCategoria.setForeground(new java.awt.Color(102, 0, 102));
        btn_ModificarCategoria.setText("Modificar");

        btn_ResgistrarCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_ResgistrarCategoria.setForeground(new java.awt.Color(102, 0, 102));
        btn_ResgistrarCategoria.setText("Registar");

        label_Categoria.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_Categoria.setForeground(new java.awt.Color(255, 102, 0));
        label_Categoria.setText("Categoria:");

        txt_Categoria.setForeground(new java.awt.Color(0, 204, 204));
        txt_Categoria.setText("Ingrese el nombre de la categoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Categoria)
                    .addComponent(label_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_NuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ResgistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(label_Categoria)
                .addGap(7, 7, 7)
                .addComponent(txt_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResgistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        tabla_Categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla_Categoria);
        if (tabla_Categoria.getColumnModel().getColumnCount() > 0) {
            tabla_Categoria.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_Categoria.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_Categoria.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        paginadorCategoria.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout paginadorCategoriaLayout = new javax.swing.GroupLayout(paginadorCategoria);
        paginadorCategoria.setLayout(paginadorCategoriaLayout);
        paginadorCategoriaLayout.setHorizontalGroup(
            paginadorCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paginadorCategoriaLayout.setVerticalGroup(
            paginadorCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(paginadorCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(paginadorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ModificarCategoria;
    private javax.swing.JButton btn_NuevoCategoria;
    private javax.swing.JButton btn_ResgistrarCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Categoria;
    private javax.swing.JPanel paginadorCategoria;
    private javax.swing.JTable tabla_Categoria;
    private javax.swing.JTextField txt_Categoria;
    // End of variables declaration//GEN-END:variables
}
