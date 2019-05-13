/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import SE.entidades.ca_materia;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.ma_paralelo;
import SE.entidades.ma_periodo;
import SE.entidades.us_permiso_empleado;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

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
    
    public static void filtro(String valor, JTable Tabla) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + valor));
    }
    
    public static void cargarJoinUsuario(JTable Tabla, ArrayList<JoinEmpleados> lista) {

        int[] a = {10, 30, 150, 72, 20, 70, 30,50,30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"        ID","CÉDULA","APELLIDOS NOMBRES","DIRECCIÓN", "TELÉFONO",
            "CORREO", "CARGO","SUCURSAL","     ESTADO"};
        String[] Filas = new String[9];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_usuario();
            Filas[2] = lista.get(i).getApellidos_nombres();
            Filas[1] = lista.get(i).getCedula();
            Filas[3] = lista.get(i).getDireccion();
            Filas[4] = lista.get(i).getConvecional();
            Filas[5] = lista.get(i).getCorreo();
            Filas[6] = lista.get(i).getRol();
            Filas[7] = lista.get(i).getNombre_comercial_su();
            Filas[8] = lista.get(i).getEstado();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr1);
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
            Tabla.getColumnModel().getColumn(7).setPreferredWidth(a[7]);
            Tabla.getColumnModel().getColumn(7).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(8).setPreferredWidth(a[8]);
            Tabla.getColumnModel().getColumn(8).setCellRenderer(tcr1);
        }
    }
    
    public static void cargarTablaEstadoChbx(JTable Tabla, ArrayList<us_permiso_empleado> lista) {

        int[] a = {15};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"ESTADO"};
        String[] Filas = new String[1];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = ""+lista.get(i).getEstado_pe();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
        }
    }
    public static void cargarTablaMateria(JTable Tabla, ArrayList<ca_materia> lista) {

        int[] a = {5,250};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"        ID","MATERIAS"};
        String[] Filas = new String[2];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = ""+lista.get(i).getId_materia();
            Filas[1] = lista.get(i).getMateria();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
        }
    }
    public static void cargarTablacurso(JTable Tabla, ArrayList<ma_paralelo> lista) {

        int[] a = {8,28,40};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"           ID","       CURSOS","      ESTADO"};
        String[] Filas = new String[3];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = ""+lista.get(i).getId_paralelo();
            Filas[1] = lista.get(i).getParalelo();
//            Filas[2] = lista.get(i).getParalelo_obs();
            Filas[2] = lista.get(i).getEstado_pa();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr1);
//            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
//            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr1);
        }
    }
    public static void cargarTablaPeriodo(JTable Tabla, ArrayList<ma_periodo> lista) {

        int[] a = {8,28,30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"           ID","       PERIODO","      ESTADO"};
        String[] Filas = new String[3];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = ""+lista.get(i).getId_periodo();
            Filas[1] = lista.get(i).getPeriodo();
            Filas[2] = lista.get(i).getEstado_pe();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr1);
        }
    }
}
