/*
 * Fecha de creacion: 11/04/2023 00:12:31
 * Version: v.0.1
 * Detalles: 
 */
package views;

import controllers.MedidaController;
import models.Medida;
import models.MedidaDao;

/**
 *
 * @author Willy Stbn
 */
public class NuevaMedida extends javax.swing.JPanel {

    Medida medida = new Medida();
    MedidaDao medidaDao = new MedidaDao();
    
    
    public NuevaMedida() {
        initComponents();
        
        MedidaController Inicio = new MedidaController(medida, medidaDao, this);
        
        this.txt_Id_Medida.setVisible(false);
        this.label_Error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_TableMedidas = new javax.swing.JPopupMenu();
        opcion_Inhabilitar = new javax.swing.JMenuItem();
        opcion_Activar = new javax.swing.JMenuItem();
        opcion_Eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btn_NuevaMedida = new javax.swing.JButton();
        btn_ModificarMedida = new javax.swing.JButton();
        btn_ResgistrarMedida = new javax.swing.JButton();
        label_Medida = new javax.swing.JLabel();
        txt_NombreMedida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_NombreCortoMedida = new javax.swing.JTextField();
        label_Error = new javax.swing.JLabel();
        txt_Id_Medida = new javax.swing.JTextField();
        txt_BuscarMedida = new javax.swing.JTextField();
        label_IcoBuscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Medidas = new javax.swing.JTable();
        paginadorMedidas = new javax.swing.JPanel();

        opcion_Inhabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Apagado.png"))); // NOI18N
        opcion_Inhabilitar.setText("Inhabilitar");
        Menu_TableMedidas.add(opcion_Inhabilitar);

        opcion_Activar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Emcemdido.png"))); // NOI18N
        opcion_Activar.setText("Activar");
        Menu_TableMedidas.add(opcion_Activar);

        opcion_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        opcion_Eliminar.setText("Eliminar");
        Menu_TableMedidas.add(opcion_Eliminar);

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Medida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 32767));

        btn_NuevaMedida.setBackground(new java.awt.Color(255, 255, 255));
        btn_NuevaMedida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_NuevaMedida.setForeground(new java.awt.Color(102, 0, 102));
        btn_NuevaMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpiar.png"))); // NOI18N
        btn_NuevaMedida.setText("Nuevo");

        btn_ModificarMedida.setBackground(new java.awt.Color(102, 153, 255));
        btn_ModificarMedida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_ModificarMedida.setForeground(new java.awt.Color(102, 0, 102));
        btn_ModificarMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        btn_ModificarMedida.setText("Modificar");

        btn_ResgistrarMedida.setBackground(new java.awt.Color(255, 153, 153));
        btn_ResgistrarMedida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_ResgistrarMedida.setForeground(new java.awt.Color(0, 0, 0));
        btn_ResgistrarMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        btn_ResgistrarMedida.setText("Registar");

        label_Medida.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        label_Medida.setForeground(new java.awt.Color(0, 153, 0));
        label_Medida.setText("Nombre de la medidad:");

        txt_NombreMedida.setBackground(new java.awt.Color(204, 204, 204));
        txt_NombreMedida.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_NombreMedida.setForeground(new java.awt.Color(102, 102, 102));
        txt_NombreMedida.setText("Ingrese el nombre de la medida");
        txt_NombreMedida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 102)));
        txt_NombreMedida.setCaretColor(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Nombre Corto:");

        txt_NombreCortoMedida.setBackground(new java.awt.Color(204, 204, 204));
        txt_NombreCortoMedida.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_NombreCortoMedida.setForeground(new java.awt.Color(102, 102, 102));
        txt_NombreCortoMedida.setText("Ingrese el nombre corto de la medida");
        txt_NombreCortoMedida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 102)));
        txt_NombreCortoMedida.setCaretColor(new java.awt.Color(0, 51, 153));

        label_Error.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        label_Error.setForeground(new java.awt.Color(153, 0, 0));
        label_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/advertencia.png"))); // NOI18N
        label_Error.setText("¡¡Rellene todos los campos!!");

        txt_Id_Medida.setEditable(false);
        txt_Id_Medida.setBackground(new java.awt.Color(255, 51, 51));

        txt_BuscarMedida.setBackground(new java.awt.Color(204, 204, 204));
        txt_BuscarMedida.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_BuscarMedida.setForeground(new java.awt.Color(0, 0, 102));
        txt_BuscarMedida.setText("Ingrese una medida para buscar");
        txt_BuscarMedida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_BuscarMedida.setCaretColor(new java.awt.Color(204, 51, 0));
        txt_BuscarMedida.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txt_BuscarMedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_BuscarMedidaMouseClicked(evt);
            }
        });

        label_IcoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_NuevaMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ResgistrarMedida)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ModificarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_NombreMedida)
                        .addComponent(label_Medida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_NombreCortoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Id_Medida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_IcoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_BuscarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 38, Short.MAX_VALUE))
            .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_BuscarMedida)
                    .addComponent(label_IcoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_Id_Medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(label_Error)
                .addGap(56, 56, 56)
                .addComponent(label_Medida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NombreMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NombreCortoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NuevaMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResgistrarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        tabla_Medidas.setBackground(new java.awt.Color(204, 204, 204));
        tabla_Medidas.setForeground(new java.awt.Color(51, 51, 51));
        tabla_Medidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Nombre Corto", "Estado"
            }
        ));
        tabla_Medidas.setComponentPopupMenu(Menu_TableMedidas);
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
            .addGap(0, 90, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addComponent(paginadorMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paginadorMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BuscarMedidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BuscarMedidaMouseClicked
        if(txt_BuscarMedida.getText().equals("Ingrese el nombre del usuario")){
            txt_BuscarMedida.setText("");
        }
    }//GEN-LAST:event_txt_BuscarMedidaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Menu_TableMedidas;
    public javax.swing.JButton btn_ModificarMedida;
    public javax.swing.JButton btn_NuevaMedida;
    public javax.swing.JButton btn_ResgistrarMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_IcoBuscar;
    private javax.swing.JLabel label_Medida;
    public javax.swing.JMenuItem opcion_Activar;
    public javax.swing.JMenuItem opcion_Eliminar;
    public javax.swing.JMenuItem opcion_Inhabilitar;
    private javax.swing.JPanel paginadorMedidas;
    public javax.swing.JTable tabla_Medidas;
    public javax.swing.JTextField txt_BuscarMedida;
    public javax.swing.JTextField txt_Id_Medida;
    public javax.swing.JTextField txt_NombreCortoMedida;
    public javax.swing.JTextField txt_NombreMedida;
    // End of variables declaration//GEN-END:variables
}
