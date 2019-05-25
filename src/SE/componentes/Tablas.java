/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import SE.entidades.ca_conducta;
import SE.entidades.ca_materia;
import SE.entidades.em_empresa;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinCalificacion;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMatriculas;
import SE.entidades.ma_paralelo;
import SE.entidades.ma_periodo;
import SE.entidades.us_permiso_curso;
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
    public static void cargarTablaEmpresa(JTable Tabla, ArrayList<em_empresa> lista) {

        int[] a = {8,80,130,80,180,130};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"   ID","        RUC","              EMPRESA","      TELEFONO","                     DIRECCION","        CORREO"};
        String[] Filas = new String[6];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = ""+lista.get(i).getId_empresa();
            Filas[1] = lista.get(i).getRuc_em();
            Filas[2] = lista.get(i).getNombre_comercial_em();
            Filas[3] = lista.get(i).getTelefono_em();
            Filas[4] = lista.get(i).getDireccion_em();
            Filas[5] = lista.get(i).getCorreo_em();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
        }
    }
    public static void cargarTablaSucursal(JTable Tabla, ArrayList<em_sucursal> lista) {

        int[] a = {8,80,130,80,180,130};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"   ID","              EMPRESA","      TELEFONO","                     DIRECCION","        CORREO","ESTADO"};
        String[] Filas = new String[6];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = ""+lista.get(i).getId_sucursal();
            Filas[1] = lista.get(i).getNombre_comercial_su();
            Filas[2] = lista.get(i).getTelefono_su();
            Filas[3] = lista.get(i).getDireccion_su();
            Filas[4] = lista.get(i).getCorreo_su();
            Filas[5] = lista.get(i).getEstado_su();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
        }
    }
    
    public static void cargarJoinUsuarioInactivo(JTable Tabla, ArrayList<JoinEmpleados> lista) {

        int[] a = {10, 30, 150, 72, 70, 30,50};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"        ID","CÉDULA","APELLIDOS NOMBRES","DIRECCIÓN", "TELÉFONO",
            "CARGO","SUCURSAL"};
        String[] Filas = new String[7];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_usuario();
            Filas[2] = lista.get(i).getApellidos_nombres();
            Filas[1] = lista.get(i).getCedula();
            Filas[3] = lista.get(i).getDireccion();
            Filas[4] = lista.get(i).getConvecional();
            Filas[5] = lista.get(i).getRol();
            Filas[6] = lista.get(i).getNombre_comercial_su();
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
        }
    }
    public static void cargarJoinMatriculas(JTable Tabla, ArrayList<JoinMatriculas> lista) {

        int[] a = {10, 30, 150, 72, 20, 70, 30,50,30,30,30,50,40};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"        ID","CÉDULA","APELLIDOS NOMBRES","DIRECCIÓN", "TELÉFONO",
            "CORREO", "CARGO","SUCURSAL","     ESTADO","PARALELO","PERIODO","ESTADO MATRIC.","AÑO LECTIVO"};
        String[] Filas = new String[13];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_matricula();
            Filas[2] = lista.get(i).getApellidos_nombres();
            Filas[1] = lista.get(i).getCedula();
            Filas[3] = lista.get(i).getDireccion();
            Filas[4] = lista.get(i).getConvecional();
            Filas[5] = lista.get(i).getCorreo();
            Filas[6] = lista.get(i).getRol();
            Filas[7] = lista.get(i).getNombre_comercial_su();
            Filas[8] = lista.get(i).getEstado();
            Filas[9] = lista.get(i).getParalelo();
            Filas[10] = lista.get(i).getPeriodo();
            Filas[11] = lista.get(i).getEstado_matricula();
            Filas[12] = lista.get(i).getPeriodo();
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
            Tabla.getColumnModel().getColumn(9).setPreferredWidth(a[9]);
            Tabla.getColumnModel().getColumn(9).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(10).setPreferredWidth(a[10]);
            Tabla.getColumnModel().getColumn(10).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(11).setPreferredWidth(a[11]);
            Tabla.getColumnModel().getColumn(11).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(12).setPreferredWidth(a[12]);
            Tabla.getColumnModel().getColumn(12).setCellRenderer(tcr1);
        }
    }
    public static void tablaConducta(ArrayList<ca_conducta> lista, JTable Tabla) {
        int[] a = {10, 40, 100, 400};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.LEFT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"    ID", "CONDUCTA", "REFERENCIA", "DESCRIPCIÓN"};
        String[] Filas = new String[4];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_conducta();
            Filas[1] = lista.get(i).getConducta();
            Filas[2] = lista.get(i).getReferencia();
            Filas[3] = lista.get(i).getDescripcion();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr1);
        }
    }
    public static void cargarJoinMatriculasCalicficacion(JTable Tabla, ArrayList<JoinMatriculas> lista) {

        int[] a = {10, 30, 200, 50, 40, 60, 40,50};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        model = VaciarTabla(Tabla);
        String[] Co = {"        ID","CÉDULA","APELLIDOS NOMBRES","PARALELO","     ESTADO","ESTADO MATRIC.","AÑO LECTIVO","OBSERVACION"};
        String[] Filas = new String[8];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_matricula();
            Filas[2] = lista.get(i).getApellidos_nombres();
            Filas[1] = lista.get(i).getCedula();
            Filas[3] = lista.get(i).getParalelo();
            Filas[4] = lista.get(i).getEstado();
            Filas[5] = lista.get(i).getEstado_matricula();
            Filas[6] = lista.get(i).getPeriodo();
            Filas[7] = lista.get(i).getObservacion();
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
        }
    }
    
    private static boolean[] editable = {false, false, true};
    
    public static void TablaCursosPermisosEmpleados(JTable Tabla, ArrayList<ma_paralelo> lista) {
        Tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(new String[]{"ID", "CURSO", "PERMISO",}, 0) {

            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class,java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };

        if (lista.size() > 0) {
            for (int i = 0; i < lista.size(); i++) {
                // model.addRow(new Object[]{});
                Object fila[] = new Object[3];
//                vo = lista.get(i);
                fila[0] = ""+lista.get(i).getId_paralelo();
                fila[1] = lista.get(i).getParalelo();
                fila[2] = false;
//                String ac = (String) lista.get(i).getEstado_pa();
//                if ("A".equals(ac)) {
//                    fila[2] = true;
//                } else {
//                    fila[2] = false;
//                }

                dt.addRow(fila);

            }

        }

        Tabla.setModel(dt);
    }
    
    public static void TablaCursosPermisosEmpleadosActualizar(JTable Tabla, ArrayList<us_permiso_curso> lista) {
        Tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(new String[]{"ID", "CURSO", "PERMISO",}, 0) {

            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class,java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };

        if (lista.size() > 0) {
            for (int i = 0; i < lista.size(); i++) {
                // model.addRow(new Object[]{});
                Object fila[] = new Object[3];
//                vo = lista.get(i);
                fila[0] = ""+lista.get(i).getId_curso();
                fila[1] = lista.get(i).getCurso();
                String ac = (String) lista.get(i).getPermiso();
                if ("A".equals(ac)) {
                    fila[2] = true;
                } else {
                    fila[2] = false;
                }

                dt.addRow(fila);

            }

        }

        Tabla.setModel(dt);
    }
public static void tablaFiltroAlumnos(ArrayList<JoinCalificacion> lista, JTable Tabla) {
        int[] a = {6, 200, 20, 20, 20, 20, 20, 20, 20, 20, 70};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.LEFT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"ID", "APELLIDOS/NOMBRES", "NOTA FORMATIVA", "NOTA PRÁCTICA", "APORTE",
            "EXAMEN", "CONDUCTA", "NOTA 80%", "NOTA 20%", "PROMEDIO", "NOTA CUALITATIVA"};
        String[] Filas = new String[11];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_calificacion();
            Filas[1] = lista.get(i).getApellidos_nombres();
            Filas[2] = ""+lista.get(i).getNota_formativa();
            Filas[3] = ""+lista.get(i).getNota_practica();
            Filas[4] = ""+lista.get(i).getAporte();
            Filas[5] = ""+lista.get(i).getExamen();
            Filas[6] = ""+lista.get(i).getId_conducta();
            Filas[7] = ""+lista.get(i).getOchenta_porcentaje();
            Filas[8] = ""+lista.get(i).getVeinte_porcentaje();
            Filas[9] = ""+lista.get(i).getPromedio();
            Filas[10] = lista.get(i).getCalificacion_obs();

            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[6]);
            Tabla.getColumnModel().getColumn(6).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(7).setPreferredWidth(a[7]);
            Tabla.getColumnModel().getColumn(7).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(8).setPreferredWidth(a[8]);
            Tabla.getColumnModel().getColumn(8).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(9).setPreferredWidth(a[9]);
            Tabla.getColumnModel().getColumn(9).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(10).setPreferredWidth(a[10]);
            Tabla.getColumnModel().getColumn(10).setCellRenderer(tcr);

        }
    }    
}
