/*
 * Fecha de creacion: 11/04/2023 00:12:31
 * Version: v.0.1
 * Detalles: 
 */
package views;

import controllers.CategoriaController;
import models.Categoria;
import models.CategoriaDao;

/**
 *
 * @author Willy Stbn
 */
public class NuevaCategoria extends javax.swing.JPanel {
    
    Categoria categoria = new Categoria();
    CategoriaDao  categoriaDao = new CategoriaDao();

    public NuevaCategoria() {
        initComponents();
        
        CategoriaController inicio = new CategoriaController(categoria, categoriaDao, this);
        
        this.label_Error.setVisible(false);
        this.txt_Id_Categoria.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup_TablaCategoria = new javax.swing.JPopupMenu();
        opcion_Desactivar = new javax.swing.JMenuItem();
        opcion_Activar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btn_NuevoCategoria = new javax.swing.JButton();
        btn_ModificarCategoria = new javax.swing.JButton();
        btn_ResgistrarCategoria = new javax.swing.JButton();
        label_Categoria = new javax.swing.JLabel();
        txt_Id_Categoria = new javax.swing.JTextField();
        txt_Categoria = new javax.swing.JTextField();
        txt_BuscarCategoria = new javax.swing.JTextField();
        label_IcoBuscar = new javax.swing.JLabel();
        label_Error = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Categoria = new javax.swing.JTable();
        paginadorCategoria = new javax.swing.JPanel();

        opcion_Desactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Apagado.png"))); // NOI18N
        opcion_Desactivar.setText("Desactivar");
        popup_TablaCategoria.add(opcion_Desactivar);

        opcion_Activar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Emcemdido.png"))); // NOI18N
        opcion_Activar.setText("Activar");
        popup_TablaCategoria.add(opcion_Activar);

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 1, 13), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 32767));

        btn_NuevoCategoria.setBackground(new java.awt.Color(255, 255, 255));
        btn_NuevoCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_NuevoCategoria.setForeground(new java.awt.Color(102, 0, 102));
        btn_NuevoCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpiar.png"))); // NOI18N
        btn_NuevoCategoria.setText("Limpiar");
        btn_NuevoCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_ModificarCategoria.setBackground(new java.awt.Color(0, 153, 153));
        btn_ModificarCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_ModificarCategoria.setForeground(new java.awt.Color(102, 0, 102));
        btn_ModificarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        btn_ModificarCategoria.setText("Modificar");
        btn_ModificarCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_ResgistrarCategoria.setBackground(new java.awt.Color(51, 0, 204));
        btn_ResgistrarCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_ResgistrarCategoria.setForeground(new java.awt.Color(0, 0, 0));
        btn_ResgistrarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        btn_ResgistrarCategoria.setText("Guardar");
        btn_ResgistrarCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_Categoria.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        label_Categoria.setForeground(new java.awt.Color(102, 0, 102));
        label_Categoria.setText("Categoria:");

        txt_Id_Categoria.setEditable(false);
        txt_Id_Categoria.setBackground(new java.awt.Color(255, 51, 51));

        txt_Categoria.setBackground(new java.awt.Color(204, 204, 204));
        txt_Categoria.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_Categoria.setForeground(new java.awt.Color(0, 153, 0));
        txt_Categoria.setText("Ingrese el nombre de la categoria");
        txt_Categoria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 102)));

        txt_BuscarCategoria.setBackground(new java.awt.Color(204, 204, 204));
        txt_BuscarCategoria.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_BuscarCategoria.setForeground(new java.awt.Color(255, 102, 0));
        txt_BuscarCategoria.setText("Ingrese una categoria para buscar");
        txt_BuscarCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_BuscarCategoria.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txt_BuscarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_BuscarCategoriaMouseClicked(evt);
            }
        });

        label_IcoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N

        label_Error.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        label_Error.setForeground(new java.awt.Color(153, 0, 0));
        label_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/advertencia.png"))); // NOI18N
        label_Error.setText("¡¡Rellene todos los campos!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_NuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ResgistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_Id_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label_IcoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_BuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_BuscarCategoria)
                    .addComponent(label_IcoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txt_Id_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(label_Error)
                .addGap(35, 35, 35)
                .addComponent(label_Categoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ResgistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148))
        );

        tabla_Categoria.setBackground(new java.awt.Color(204, 204, 204));
        tabla_Categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado"
            }
        ));
        tabla_Categoria.setComponentPopupMenu(popup_TablaCategoria);
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

    private void txt_BuscarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BuscarCategoriaMouseClicked
        if(txt_BuscarCategoria.getText().equals("Ingrese el nombre del usuario")){
            txt_BuscarCategoria.setText("");
        }
    }//GEN-LAST:event_txt_BuscarCategoriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ModificarCategoria;
    public javax.swing.JButton btn_NuevoCategoria;
    public javax.swing.JButton btn_ResgistrarCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Categoria;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_IcoBuscar;
    public javax.swing.JMenuItem opcion_Activar;
    public javax.swing.JMenuItem opcion_Desactivar;
    private javax.swing.JPanel paginadorCategoria;
    private javax.swing.JPopupMenu popup_TablaCategoria;
    public javax.swing.JTable tabla_Categoria;
    public javax.swing.JTextField txt_BuscarCategoria;
    public javax.swing.JTextField txt_Categoria;
    public javax.swing.JTextField txt_Id_Categoria;
    // End of variables declaration//GEN-END:variables
}
