/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.mensualidades;

import SE.componentes.Crud;
//import SE.componentes.FormatoNumeros;
import SE.componentes.Tablas;
import SE.entidades.join.JoinCalificacion;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMatriculas;
import SE.entidades.ma_mensualidad;
//import SE.entidades.re_clase_eporte;
//import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.JDialog;
//import javax.swing.table.DefaultTableModel;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author carlos
 */
public class MensualidadMostrarForm extends javax.swing.JDialog {

    /**
     * Creates new form Calificacion_registro
     */
    ArrayList<JoinCalificacion> reporte = null;
    Crud crud = new Crud();
    JoinEmpleados us = null;
    JoinMatriculas mat = null;
    ma_mensualidad me = new ma_mensualidad();
    ma_mensualidad objeto = null;
//    DefaultTableModel md = new DefaultTableModel();
    JoinCalificacion cal = new JoinCalificacion();
    ArrayList<JoinMatriculas> listar = null;
    ArrayList<ma_mensualidad> listar2 = null;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

    public MensualidadMostrarForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario, JoinMatriculas matricula) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        mat = matricula;
        us = usuario;
        formulario();
        tabla();
    }

    public MensualidadMostrarForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void tabla() {
        me.setId_matricula(mat.getId_matricula());
        me.setId_sucursal_men(Long.valueOf(lbSucursal.getText()));
        listar2 = crud.listarAlumnosMensualidadPorAlumno(me);
        Tablas.cargarJoinMensualidadesPorAlumnos(jtMensualidades, listar2);
        
    }

    public void formulario() {
        txtPeriodo.setEditable(false);
        txtCurso.setEditable(false);
        txtAlumno.setEditable(false);
        txtcedula.setEditable(false);

        lbSucursal.setVisible(false);
        lbEmpresa.setVisible(false);
        lbIdUsuario.setVisible(false);

        lbEmpresa.setText(us.getId_empresa().toString());
        lbSucursal.setText(us.getId_sucursal().toString());
        lbIdUsuario.setText(us.getId_usuario().toString());

        txtCurso.setText(mat.getParalelo());
        txtAlumno.setText(mat.getApellidos_nombres());
        txtPeriodo.setText(mat.getPeriodo());
        txtcedula.setText(mat.getCedula());
        txtValMat.setText(""+mat.getValor_mat());
        txtTotalRec.setText(""+mat.getValor_recaudado());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMensualidades = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtAlumno = new javax.swing.JTextField();
        lbIdUsuario = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        txtValMat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalRec = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENSUALIDADES");

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/cancelar32.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSalir))
                .addGap(12, 12, 12))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ALUMNO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CEDULA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CURSO");

        jtMensualidades.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtMensualidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtMensualidades.setRowHeight(28);
        jtMensualidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtMensualidadesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtMensualidadesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtMensualidades);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("PERIODO");

        lbIdUsuario.setText("usaurio");

        lbSucursal.setText("sucursal");

        lbEmpresa.setText("empresa");

        txtValMat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValMat.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("VALOR DE MATRICULA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL RECAUDADO");

        txtTotalRec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTotalRec.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lbIdUsuario)
                        .addGap(82, 82, 82)
                        .addComponent(lbSucursal)
                        .addGap(46, 46, 46)
                        .addComponent(lbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdUsuario)
                    .addComponent(lbSucursal)
                    .addComponent(lbEmpresa))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void total(){
    tabla();
    try {
        double tot = 0.0;
        double resul = 0.0;
        double total = 0.0;
//        double matricula = Double.valueOf(txtValMat.getText());
        for (int i = 0; i < jtMensualidades.getRowCount(); i++) {
            tot = Double.valueOf(jtMensualidades.getValueAt(i, 3).toString());
            System.out.println("total: "+tot);
            resul = resul +tot ;
        }
        total = resul + Double.valueOf(txtValMat.getText());
        
        System.out.println("result: "+total);
        
        txtTotalRec.setText(""+total);
        
        JoinMatriculas obj = new JoinMatriculas();
        obj.setId_empleado(Long.valueOf(lbIdUsuario.getText()));
        obj.setId_matricula(mat.getId_matricula());
        obj.setValor_recaudado(total);
        
            crud.valorRecaudado(obj);
        
    } catch (Exception e) {
        Logger.getLogger(MensualidadMostrarForm.class.getName()).log(Level.SEVERE, null, e);
    }
}
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    public ma_mensualidad devuelveObjetoEmpleado(String datos, ArrayList<ma_mensualidad> listarobj) {
        ma_mensualidad objeto1 = null;
        for (int i = 0; i < listarobj.size(); i++) {
            if (datos.equals(listarobj.get(i).getMensualidad().toString())) {
                objeto1 = listarobj.get(i);
                break;
            }
        }
        return objeto1;
    }

    private void jtMensualidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMensualidadesMousePressed
        int i = 0;
        try {
            if (evt.getClickCount() == 2) {
                i = jtMensualidades.getSelectedRow();
                if ("PAGADO".equals(jtMensualidades.getValueAt(i, 4).toString())) {
                    JOptionPane.showMessageDialog(this, "ESTA MENSUALIDAD YA ESTA PAGADA");
                } else {
                    i = jtMensualidades.getSelectedRow();
                    objeto = devuelveObjetoEmpleado(jtMensualidades.getValueAt(i, 0).toString(), listar2);
                    if (objeto != null) {
                        System.out.println("holaaaaa");
                        cobroForm acc = new cobroForm(new javax.swing.JFrame(), true, us, mat, objeto);
                        acc.setVisible(true);
                    }
                }
                total();
                tabla();
            }
        } catch (Exception e) {
            Logger.getLogger(MensualidadMostrarForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jtMensualidadesMousePressed

    private void jtMensualidadesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMensualidadesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMensualidadesMouseReleased

//    public void imprimirPq() {
//        ArrayList lista = new ArrayList();
//        for (int i = 0; i < jtPrimerQ.getRowCount(); i++) {
//            re_clase_eporte tabla = new re_clase_eporte(txtAlumno.getText(), txtCurso.getText(), txtPeriodo.getText(), txtPromedio.getText(), jtPrimerQ.getValueAt(i, 0).toString(), jtPrimerQ.getValueAt(i, 1).toString(), jtPrimerQ.getValueAt(i, 2).toString(), jtPrimerQ.getValueAt(i, 3).toString(), jtPrimerQ.getValueAt(i, 4).toString(), jtPrimerQ.getValueAt(i, 6).toString(), jtPrimerQ.getValueAt(i, 7).toString(), jtPrimerQ.getValueAt(i, 8).toString(), jtPrimerQ.getValueAt(i, 5).toString(), jtPrimerQ.getValueAt(i, 9).toString(),us.getNombre_comercial_su());
//            lista.add(tabla);
//        }
//        try {
//            String dir = System.getProperty("user.dir") + "/Reportes/" + "CalificacionReportePq.jasper";
//            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
//            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
//            JDialog frame = new JDialog(this);
//            JRViewer viewer = new JRViewer(jprint);
//            frame.add(viewer);
//            frame.setSize(new Dimension(ancho / 2, alto / 2));
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//            viewer.setFitWidthZoomRatio();
//        } catch (JRException ex) {
//            Logger.getLogger(MensualidadMostrarForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    public void imprimirSq() {
//        ArrayList lista = new ArrayList();
//        for (int i = 0; i < jtSegundoQ.getRowCount(); i++) {
//            re_clase_eporte tabla = new re_clase_eporte(txtAlumno.getText(), txtCurso.getText(), txtPeriodo.getText(), txtPromedio.getText(), jtSegundoQ.getValueAt(i, 0).toString(), jtSegundoQ.getValueAt(i, 1).toString(), jtSegundoQ.getValueAt(i, 2).toString(), jtSegundoQ.getValueAt(i, 3).toString(), jtSegundoQ.getValueAt(i, 4).toString(), jtSegundoQ.getValueAt(i, 6).toString(), jtSegundoQ.getValueAt(i, 7).toString(), jtSegundoQ.getValueAt(i, 8).toString(), jtSegundoQ.getValueAt(i, 5).toString(), jtSegundoQ.getValueAt(i, 9).toString(),us.getNombre_comercial_su());
//            lista.add(tabla);
//        }
//        try {
//            String dir = System.getProperty("user.dir") + "/Reportes/" + "CalificacionReporteSq.jasper";
//            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
//            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
//            JDialog frame = new JDialog(this);
//            JRViewer viewer = new JRViewer(jprint);
//            frame.add(viewer);
//            frame.setSize(new Dimension(ancho / 2, alto / 2));
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//            viewer.setFitWidthZoomRatio();
//        } catch (JRException ex) {
//            Logger.getLogger(MensualidadMostrarForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    public void promedio() {
//        ArrayList lista = new ArrayList();
//        for (int i = 0; i < jtPromedio.getRowCount(); i++) {
//            re_clase_eporte tabla = new re_clase_eporte(txtAlumno.getText(), txtCurso.getText(), txtPeriodo.getText(), txtPromedio.getText(), jtPromedio.getValueAt(i, 0).toString(), jtPromedio.getValueAt(i, 1).toString(), jtPromedio.getValueAt(i, 2).toString(), jtPromedio.getValueAt(i, 3).toString(), jtPromedio.getValueAt(i, 4).toString(), jtPromedio.getValueAt(i, 5).toString(), jtPromedio.getValueAt(i, 6).toString(),us.getNombre_comercial_su());
//            lista.add(tabla);
//        }
//        try {
//            String dir = System.getProperty("user.dir") + "/Reportes/" + "ReporteAnual.jasper";
//            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
//            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
//            JDialog frame = new JDialog(this);
//            JRViewer viewer = new JRViewer(jprint);
//            frame.add(viewer);
//            frame.setSize(new Dimension(ancho / 2, alto / 2));
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//            viewer.setFitWidthZoomRatio();
//        } catch (JRException ex) {
//            Logger.getLogger(MensualidadMostrarForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MensualidadMostrarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensualidadMostrarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensualidadMostrarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensualidadMostrarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MensualidadMostrarForm dialog = new MensualidadMostrarForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMensualidades;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtTotalRec;
    private javax.swing.JTextField txtValMat;
    private javax.swing.JTextField txtcedula;
    // End of variables declaration//GEN-END:variables
}
