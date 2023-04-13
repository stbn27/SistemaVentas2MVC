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
public class NuevaVenta extends javax.swing.JPanel {

    public NuevaVenta() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_NuevaVenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_CodigoNV = new javax.swing.JTextField();
        txt_DescripcionNV = new javax.swing.JTextField();
        txt_CantidadNV = new javax.swing.JTextField();
        txt_PrecioNV = new javax.swing.JTextField();
        txt_TotalNV = new javax.swing.JTextField();
        txt_StockNV = new javax.swing.JTextField();
        btn_GenerarVenta = new javax.swing.JButton();
        panel_Costo = new javax.swing.JPanel();
        txt_TotalTVN1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_CambioNV1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_CantidaRNV1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cmb_CienteNV1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        Fondo_Panel.setBackground(new java.awt.Color(0, 204, 153));

        tabla_NuevaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(tabla_NuevaVenta);
        if (tabla_NuevaVenta.getColumnModel().getColumnCount() > 0) {
            tabla_NuevaVenta.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_NuevaVenta.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_NuevaVenta.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabla_NuevaVenta.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla_NuevaVenta.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Total:");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Stock");

        txt_CodigoNV.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_CodigoNV.setForeground(new java.awt.Color(0, 204, 255));

        txt_DescripcionNV.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_DescripcionNV.setForeground(new java.awt.Color(0, 204, 255));

        txt_CantidadNV.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_CantidadNV.setForeground(new java.awt.Color(0, 204, 255));

        txt_PrecioNV.setEditable(false);
        txt_PrecioNV.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_PrecioNV.setForeground(new java.awt.Color(0, 204, 255));

        txt_TotalNV.setEditable(false);
        txt_TotalNV.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_TotalNV.setForeground(new java.awt.Color(0, 204, 255));

        txt_StockNV.setEditable(false);
        txt_StockNV.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_StockNV.setForeground(new java.awt.Color(0, 204, 255));

        btn_GenerarVenta.setBackground(new java.awt.Color(255, 255, 255));
        btn_GenerarVenta.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btn_GenerarVenta.setForeground(new java.awt.Color(0, 102, 102));
        btn_GenerarVenta.setText("Generar venta");

        panel_Costo.setBackground(new java.awt.Color(0, 204, 153));

        txt_TotalTVN1.setEditable(false);
        txt_TotalTVN1.setText("$ 0.00");

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Total:");

        txt_CambioNV1.setEditable(false);
        txt_CambioNV1.setText("$ 0.00");

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 0, 153));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Cambio:");

        txt_CantidaRNV1.setText("$ 0.00");

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 153));
        jLabel19.setText("Cantidad Recibida:");

        cmb_CienteNV1.setEditable(true);
        cmb_CienteNV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 102, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Cliente:");

        javax.swing.GroupLayout panel_CostoLayout = new javax.swing.GroupLayout(panel_Costo);
        panel_Costo.setLayout(panel_CostoLayout);
        panel_CostoLayout.setHorizontalGroup(
            panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CostoLayout.createSequentialGroup()
                .addGroup(panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_CostoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CantidaRNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_CostoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(cmb_CienteNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_TotalTVN1)
                    .addComponent(txt_CambioNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_CostoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(887, Short.MAX_VALUE)))
        );
        panel_CostoLayout.setVerticalGroup(
            panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CostoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_CostoLayout.createSequentialGroup()
                        .addGroup(panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TotalTVN1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CostoLayout.createSequentialGroup()
                        .addComponent(cmb_CienteNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CambioNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_CantidaRNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(panel_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_CostoLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(132, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Fondo_PanelLayout = new javax.swing.GroupLayout(Fondo_Panel);
        Fondo_Panel.setLayout(Fondo_PanelLayout);
        Fondo_PanelLayout.setHorizontalGroup(
            Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo_PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_CodigoNV)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DescripcionNV, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo_PanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_CantidadNV, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_PrecioNV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TotalNV, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_StockNV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_GenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo_PanelLayout.createSequentialGroup()
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Fondo_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_Costo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Fondo_PanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1)))
                .addGap(79, 79, 79))
        );
        Fondo_PanelLayout.setVerticalGroup(
            Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo_PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_GenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Fondo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_CodigoNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DescripcionNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_CantidadNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_PrecioNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_TotalNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_StockNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo_Panel;
    private javax.swing.JButton btn_GenerarVenta;
    private javax.swing.JComboBox<String> cmb_CienteNV1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_Costo;
    private javax.swing.JTable tabla_NuevaVenta;
    private javax.swing.JTextField txt_CambioNV1;
    private javax.swing.JTextField txt_CantidaRNV1;
    private javax.swing.JTextField txt_CantidadNV;
    private javax.swing.JTextField txt_CodigoNV;
    private javax.swing.JTextField txt_DescripcionNV;
    private javax.swing.JTextField txt_PrecioNV;
    private javax.swing.JTextField txt_StockNV;
    private javax.swing.JTextField txt_TotalNV;
    private javax.swing.JTextField txt_TotalTVN1;
    // End of variables declaration//GEN-END:variables
}
