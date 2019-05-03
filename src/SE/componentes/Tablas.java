/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import SE.entidades.join.JoinEmpleados;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public class Tablas {
    static DefaultTableModel model;
    
    public static DefaultTableModel VaciarTabla(JTable tabla) {
        DefaultTableModel lab
                = (DefaultTableModel) tabla.getModel();
        while (lab.getRowCount() > 0) {
            lab.removeRow(0);
        }
        return lab;

    }
    
    public static void cargarJoinUsuario(JTable Tabla, ArrayList<JoinEmpleados> lista) {

        int[] a = {10, 30, 150, 72, 20, 70, 30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"CÓDIGO","CÉDULA","APELLIDOS NOMBRES","DIRECCIÓN", "TELÉFONO",
            "CORREO", "CARGO"};
        String[] Filas = new String[7];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_usuario().toString();
            Filas[2] = lista.get(i).getApellidos_nombres();
            Filas[1] = lista.get(i).getCedula();
            Filas[3] = lista.get(i).getDireccion();
            Filas[4] = lista.get(i).getConvecional();
            Filas[5] = lista.get(i).getCorreo();
            Filas[6] = lista.get(i).getRol();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[6]);
            Tabla.getColumnModel().getColumn(6).setCellRenderer(tcr);
        }
    }
}
