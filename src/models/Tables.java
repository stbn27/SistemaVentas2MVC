/*
 * Fecha de creacion: 11/04/2023 22:13:10
 * Version: v.0.1
 * Detalles: Comportamientos de las tablas
 */

package models;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @author Willy Stbn
 */

public class Tables extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        if(table.getValueAt(row, column).toString().equals("Inactivo") || table.getValueAt(row, column).toString().equals("Pausado")){
            setBackground(Color.red);
            setForeground(Color.WHITE);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        return this;
    }
    
}
