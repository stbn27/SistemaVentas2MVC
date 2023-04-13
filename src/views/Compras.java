/*
 * Fecha de creacion: 11/04/2023 10:51:11
 * Version: v.0.1
 * Detalles: 
 */
package views;

/**
 *
 * @author Willy Stbn
 */
public class Compras extends javax.swing.JPanel {

    /**
     * Creates new form Ventas
     */
    public Compras() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Compras = new javax.swing.JTable();
        paginadoCompras = new javax.swing.JPanel();

        panel_Container.setBackground(new java.awt.Color(255, 204, 204));

        tabla_Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Provedor", "Total", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tabla_Compras);
        if (tabla_Compras.getColumnModel().getColumnCount() > 0) {
            tabla_Compras.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_Compras.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla_Compras.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_Compras.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        paginadoCompras.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout paginadoComprasLayout = new javax.swing.GroupLayout(paginadoCompras);
        paginadoCompras.setLayout(paginadoComprasLayout);
        paginadoComprasLayout.setHorizontalGroup(
            paginadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paginadoComprasLayout.setVerticalGroup(
            paginadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_ContainerLayout = new javax.swing.GroupLayout(panel_Container);
        panel_Container.setLayout(panel_ContainerLayout);
        panel_ContainerLayout.setHorizontalGroup(
            panel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ContainerLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                    .addComponent(paginadoCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        panel_ContainerLayout.setVerticalGroup(
            panel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ContainerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(paginadoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paginadoCompras;
    private javax.swing.JPanel panel_Container;
    private javax.swing.JTable tabla_Compras;
    // End of variables declaration//GEN-END:variables
}
