/*
 * Fecha de creacion: 13/04/2023 22:00:44
 * Version: v.0.1
 * Detalles: 
 */
package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.Medida;
import models.MedidaDao;
import models.Tables;
import views.NuevaMedida;

/**
 * @author Willy Stbn
 */
public class MedidaController implements ActionListener, MouseListener, KeyListener {

    private Medida med;
    private MedidaDao medDao;
    private NuevaMedida nMed;
    DefaultTableModel modelo = new DefaultTableModel();
    Map<Integer, String> DatosActuales = new HashMap<>();

    public MedidaController(Medida med, MedidaDao medDao, NuevaMedida nMed) {
        this.med = med;
        this.medDao = medDao;
        this.nMed = nMed;

        this.nMed.btn_ModificarMedida.addActionListener(this);
        this.nMed.btn_NuevaMedida.addActionListener(this);
        this.nMed.btn_ResgistrarMedida.addActionListener(this);
        this.nMed.opcion_Activar.addActionListener(this);
        this.nMed.opcion_Eliminar.addActionListener(this);
        this.nMed.opcion_Inhabilitar.addActionListener(this);

        this.nMed.txt_BuscarMedida.addMouseListener(this);
        this.nMed.txt_NombreCortoMedida.addMouseListener(this);
        this.nMed.txt_NombreMedida.addMouseListener(this);
        this.nMed.tabla_Medidas.addMouseListener(this);

        this.nMed.txt_BuscarMedida.addKeyListener(this);

        ListarTablaMedidas();
    }

    /*¨*********** Botones *******************************/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nMed.btn_NuevaMedida) {    //Boton limpiar campos
            LimpiarCampos();
            LimpiarTable();
            ListarTablaMedidas();

        } else if (e.getSource() == nMed.btn_ResgistrarMedida) {    //Botón añadir nuevo
            if (ValidarCampos()) {
                nMed.label_Error.setVisible(false);
                String nombre = nMed.txt_NombreMedida.getText().trim();
                String nombre_corto = nMed.txt_NombreCortoMedida.getText().trim();

                med.setNombre(nombre);
                med.setNombre_corto(nombre_corto);
                if (medDao.ResgistrarMedida(med)) {
                    nMed.label_Error.setVisible(false);
                    LimpiarTable();
                    ListarTablaMedidas();
                    JOptionPane.showMessageDialog(null, "Medida resgistrada exitosamente.");
                    LimpiarCampos();
                } else {
                    nMed.label_Error.setText("¡¡Error al resgistrar información!!.");
                    nMed.label_Error.setVisible(true);
                }
            } else {
                nMed.label_Error.setText("¡¡Rellene todos los campos!!.");
                nMed.label_Error.setVisible(true);
            }

        } else if (e.getSource() == nMed.btn_ModificarMedida) {     //Botón modificar 
            String id_text = nMed.txt_Id_Medida.getText();
            if (!id_text.equals("")) {
                nMed.label_Error.setVisible(false);

                if (ValidarCampos()) {
                    String nom = nMed.txt_NombreMedida.getText().trim();
                    String nom_corto = nMed.txt_NombreCortoMedida.getText().trim();

                    if (nom.equals(DatosActuales.get(2)) && nom_corto.equals(DatosActuales.get(3))) {
                        nMed.label_Error.setText("¡No hay campos modificados!.");
                        nMed.label_Error.setVisible(true);
                    } else {
                        nMed.label_Error.setVisible(false);
                        med.setId(Integer.parseInt(id_text));
                        med.setNombre(nom);
                        med.setNombre_corto(nom_corto);
                        if (medDao.ModificarMedida(med)) {
                            nMed.label_Error.setVisible(false);
                            LimpiarTable();
                            ListarTablaMedidas();
                            JOptionPane.showMessageDialog(null, "¡Modificacion de medida exitosa!.");
                            LimpiarCampos();
                        } else {
                            nMed.label_Error.setText("¡Error al realizar modificación!.");
                            nMed.label_Error.setVisible(true);
                        }
                    }

                } else {
                    nMed.label_Error.setText("¡¡Rellene todos los campos!!.");
                    nMed.label_Error.setVisible(true);
                }

            } else {
                nMed.label_Error.setText("¡Seleccione una medida de la tabla!.");
                nMed.label_Error.setVisible(true);
            }
        } else if (e.getSource() == nMed.opcion_Activar) {
            String id_text = nMed.txt_Id_Medida.getText();
            if (!id_text.equals("")) {
                nMed.label_Error.setVisible(false);
                String estado = "Activo";
                boolean accion = estado.equals(DatosActuales.get(4));
                if (!accion) {
                    if (medDao.ActualizarEstadoMedida(estado, Integer.parseInt(id_text))) {
                        nMed.label_Error.setVisible(false);
                        LimpiarTable();
                        ListarTablaMedidas();
                        JOptionPane.showMessageDialog(null, "Estado moficado con exito");
                        LimpiarCampos();
                    } else {
                        nMed.label_Error.setText("Error al modificar el estado actual");
                        nMed.label_Error.setVisible(true);
                    }
                }
            } else {
                nMed.label_Error.setText("Seleeccion una medida de la tabla");
                nMed.label_Error.setVisible(true);
            }

        } else if (e.getSource() == nMed.opcion_Inhabilitar) {

            String id_text = nMed.txt_Id_Medida.getText();
            if (!id_text.equals("")) {
                nMed.label_Error.setVisible(false);
                String estado = "Inactivo";
                boolean accion = estado.equals(DatosActuales.get(4));
                if (!accion) {
                    int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de inhabilitar esta medida.");
                    if (opcion == 0) {
                        if (medDao.ActualizarEstadoMedida(estado, Integer.parseInt(id_text))) {
                            nMed.label_Error.setVisible(false);
                            LimpiarTable();
                            ListarTablaMedidas();
                            //JOptionPane.showMessageDialog(null, "Estado moficado con exito");
                            LimpiarCampos();
                        } else {
                            nMed.label_Error.setText("Error al modificar el estado actual");
                            nMed.label_Error.setVisible(true);
                        }
                    }
                }
            } else {
                nMed.label_Error.setText("Seleccione una medida de la tabla");
                nMed.label_Error.setVisible(true);
            }

        } else if (e.getSource() == nMed.opcion_Eliminar) {
            String id_text = nMed.txt_Id_Medida.getText();
            if (!id_text.equals("")) {
                int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de elminar esta medida.");
                if (opcion == 0) {
                    if (medDao.EliminarMedida(Integer.parseInt(id_text))) {
                        nMed.label_Error.setVisible(false);
                        LimpiarCampos();
                        LimpiarTable();
                        ListarTablaMedidas();
                    } else {
                        nMed.label_Error.setText("Error al eliminar la medida");
                        nMed.label_Error.setVisible(true);
                    }
                }
            } else {
                nMed.label_Error.setText("Seleccione una medida de la tabla");
                nMed.label_Error.setVisible(true);
            }
        }
    }

    /*¨*********** Mouse *******************************/
    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == nMed.tabla_Medidas) {
            int fila = nMed.tabla_Medidas.rowAtPoint(e.getPoint());

            String id = nMed.tabla_Medidas.getValueAt(fila, 0).toString();
            String nom = nMed.tabla_Medidas.getValueAt(fila, 1).toString();
            String nom_corto = nMed.tabla_Medidas.getValueAt(fila, 2).toString();

            nMed.txt_NombreMedida.setForeground(Color.BLACK);
            nMed.txt_NombreMedida.setText(nom);
            nMed.txt_NombreCortoMedida.setForeground(Color.BLACK);
            nMed.txt_NombreCortoMedida.setText(nom_corto);
            nMed.txt_Id_Medida.setText(id);

            nMed.btn_ResgistrarMedida.setEnabled(false);

            DatosActuales.put(1, id);
            DatosActuales.put(2, nom);
            DatosActuales.put(3, nom_corto);
            DatosActuales.put(4, nMed.tabla_Medidas.getValueAt(fila, 3).toString());
        } else if (e.getSource() == nMed.txt_BuscarMedida) {
            nMed.label_Error.setVisible(false);
            nMed.txt_BuscarMedida.setText("");
            String nom = nMed.txt_NombreMedida.getText().trim();
            String nomCorto = nMed.txt_NombreCortoMedida.getText().trim();
            if (nomCorto.equals("") || nomCorto.equals("Campo obligatorio") || nomCorto.equals("Ingrese el nombre corto de la medida")) {
                nMed.txt_NombreCortoMedida.setForeground(Color.gray);
                nMed.txt_NombreCortoMedida.setText("Ingrese el nombre corto de la medida");
            } else {
                nMed.txt_NombreCortoMedida.setForeground(new Color(51, 0, 51));
            }
            if (nom.equals("") || nom.equals("Campo obligatorio") || nom.equals("Ingrese el nombre de la medida")) {
                nMed.txt_NombreMedida.setForeground(Color.gray);
                nMed.txt_NombreMedida.setText("Ingrese el nombre de la medida");
            } else {
                nMed.txt_NombreMedida.setForeground(new Color(51, 0, 51));
            }
        } else if (e.getSource() == nMed.txt_NombreMedida) {
            nMed.label_Error.setVisible(false);
            nMed.txt_BuscarMedida.setText("Ingrese una medida para buscar");
            String nom = nMed.txt_NombreMedida.getText().trim();
            String nomCorto = nMed.txt_NombreCortoMedida.getText().trim();
            if (nom.equals("") || nom.equals("Campo obligatorio") || nom.equals("Ingrese el nombre de la medida")) {
                nMed.txt_NombreMedida.setForeground(new Color(51, 0, 51));
                nMed.txt_NombreMedida.setText("");
            } else {
                nMed.txt_NombreMedida.setForeground(new Color(51, 0, 51));
            }
            if (nomCorto.equals("") || nomCorto.equals("Campo obligatorio") || nomCorto.equals("Ingrese el nombre corto de la medida")) {
                nMed.txt_NombreCortoMedida.setForeground(Color.gray);
                nMed.txt_NombreCortoMedida.setText("Ingrese el nombre corto de la medida");
            } else {
                nMed.txt_NombreCortoMedida.setForeground(new Color(51, 0, 51));
            }
        } else if (e.getSource() == nMed.txt_NombreCortoMedida) {
            nMed.label_Error.setVisible(false);
            nMed.txt_BuscarMedida.setText("Ingrese una medida para buscar");
            String nom = nMed.txt_NombreMedida.getText().trim();
            String nomCorto = nMed.txt_NombreCortoMedida.getText().trim();
            if (nomCorto.equals("") || nomCorto.equals("Campo obligatorio") || nomCorto.equals("Ingrese el nombre corto de la medida")) {
                nMed.txt_NombreCortoMedida.setForeground(new Color(51, 0, 51));
                nMed.txt_NombreCortoMedida.setText("");
            } else {
                nMed.txt_NombreCortoMedida.setForeground(new Color(51, 0, 51));
            }
            if (nom.equals("") || nom.equals("Campo obligatorio") || nom.equals("Ingrese el nombre de la medida")) {
                nMed.txt_NombreMedida.setForeground(Color.gray);
                nMed.txt_NombreMedida.setText("Ingrese el nombre de la medida");
            } else {
                nMed.txt_NombreMedida.setForeground(new Color(51, 0, 51));
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /*¨*********** Teclado *******************************/
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        LimpiarTable();
        ListarTablaMedidas();
    }

    /*¨*********** Otros *******************************/
    private void LimpiarCampos() {
        nMed.txt_BuscarMedida.setText("Ingrese una medida para buscar");
        nMed.txt_NombreMedida.setForeground(Color.gray);
        nMed.txt_NombreMedida.setText("Ingrese el nombre de la medida");
        nMed.txt_NombreCortoMedida.setForeground(Color.gray);
        nMed.txt_NombreCortoMedida.setText("Ingrese el nombre corto de la medida");
        nMed.txt_Id_Medida.setText("");

        nMed.label_Error.setVisible(false);
        nMed.btn_ResgistrarMedida.setEnabled(true);
    }

    private void ListarTablaMedidas() {
        Tables color = new Tables();
        nMed.tabla_Medidas.setDefaultRenderer(nMed.tabla_Medidas.getColumnClass(0), color);

        String opcion = nMed.txt_BuscarMedida.getText().trim();
        List<Medida> listaMedida = medDao.ListarMedidas(opcion);
        modelo = (DefaultTableModel) nMed.tabla_Medidas.getModel();

        Object[] ob = new Object[4];
        for (int i = 0; i < listaMedida.size(); i++) {

            ob[0] = listaMedida.get(i).getId();
            ob[1] = listaMedida.get(i).getNombre();
            ob[2] = listaMedida.get(i).getNombre_corto();
            ob[3] = listaMedida.get(i).getEstado();

            modelo.addRow(ob);
        }
        nMed.tabla_Medidas.setModel(modelo);

        JTableHeader header = nMed.tabla_Medidas.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.RED);
        header.setFont(new java.awt.Font("Roboto Medium", 0, 12));
    }

    private void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    private boolean ValidarCampos() {
        String nombre_corto = nMed.txt_NombreCortoMedida.getText().trim();
        String nombre = nMed.txt_NombreMedida.getText().trim();

        int check = 0;

        if (!nombre.equals("") && !nombre.equals("Ingrese el nombre de la medida") && !nombre.equals("Campo obligatorio")) {
            nMed.txt_NombreMedida.setForeground(Color.GREEN);
        } else {
            nMed.txt_NombreMedida.setForeground(Color.RED);
            nMed.txt_NombreMedida.setText("Campo obligatorio");
            check++;
        }
        if (!nombre_corto.equals("") && !nombre_corto.equals("Ingrese el nombre corto de la medida") && !nombre_corto.equals("Campo obligatorio")) {
            nMed.txt_NombreCortoMedida.setForeground(Color.GREEN);
        } else {
            nMed.txt_NombreCortoMedida.setForeground(Color.RED);
            nMed.txt_NombreCortoMedida.setText("Campo obligatorio");
            check++;
        }
        if (check == 0) {
            nMed.label_Error.setVisible(false);
            return true;
        } else {
            nMed.label_Error.setText("¡¡Rellene todos los campos!!.");
            nMed.label_Error.setVisible(true);
            return false;
        }
    }

}
