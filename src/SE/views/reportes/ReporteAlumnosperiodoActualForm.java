/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.reportes;

import SE.componentes.Combos;
import SE.componentes.Crud;
import SE.componentes.Tablas;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMatriculas;
import SE.entidades.ma_paralelo;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
public class ReporteAlumnosperiodoActualForm extends javax.swing.JDialog {

    /**
     * Creates new form Mostrar_alumnos_views
     */
    Crud crud = new Crud();
    ArrayList<JoinMatriculas> listar = null;
    JoinMatriculas objeto = null;
    JoinMatriculas je = new JoinMatriculas();
    JoinEmpleados us = null;
    ArrayList<ma_paralelo> paralelo = null;
    ma_paralelo mp = new ma_paralelo();
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    String curso = "";

    public ReporteAlumnosperiodoActualForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario) {
        super(parent, modal = false);
        initComponents();
        setLocationRelativeTo(null);
        us = usuario;
        cbFiltroCurso.setEnabled(false);
        txtBuscar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnImprimir.setVisible(false);
        lbEmpresa.setText(us.getId_empresa().toString());
        lbSucursal.setText(us.getId_sucursal().toString());
        lbIdUsuario.setText(us.getId_usuario().toString());
        tabla();
        comboParalelo();
    }

    public ReporteAlumnosperiodoActualForm(java.awt.Frame parent, boolean modal) {
//        super(parent, modal = false);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void tabla() {
        je.setId_empresa(Long.valueOf(lbEmpresa.getText()));
        je.setId_sucursal(Long.valueOf(lbSucursal.getText()));
        listar = crud.listarAlumnosMatriculasReportes(je);
        Tablas.cargarJoinMatriculasReportes(jtReporte, listar);
    }

    public void comboParalelo() {
        mp.setId_sucursal_pa(Long.valueOf(lbSucursal.getText()));
        paralelo = crud.ReporteCalifcacionComboParalelo(mp);
        cbFiltroCurso.setModel(Combos.listarComboParalelosRegistrar(paralelo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lbIdUsuario = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbFiltroCurso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReporte = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        lbSucursal = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPORTE DE ALUMNOS");

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/cancelar32.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setToolTipText("SALIR");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbIdUsuario.setText("usaurio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIdUsuario)
                .addGap(32, 32, 32)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbIdUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbFiltro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "CEDULA", "APELLIDOS/NOMB", "PARALELO" }));
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarFocusLost(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/buscar32.png"))); // NOI18N
        btnBuscar.setText("   BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton1.setText("INFO!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbFiltroCurso.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cbFiltroCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELIJA PARALELO", "1A", "1B", "2A", "2B", " " }));
        cbFiltroCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroCursoActionPerformed(evt);
            }
        });

        jtReporte.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtReporte.setRowHeight(25);
        jtReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtReporteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtReporte);

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        lbSucursal.setText("sucursal");

        lbEmpresa.setText("empresa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(cbFiltroCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnBuscar)
                                .addGap(41, 41, 41)
                                .addComponent(lbSucursal)
                                .addGap(18, 18, 18)
                                .addComponent(lbEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton1)
                    .addComponent(cbFiltroCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSucursal)
                    .addComponent(lbEmpresa))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        int filtro = cbFiltro.getSelectedIndex();
        if (filtro == 0) {
            cbFiltroCurso.setEnabled(false);
            txtBuscar.setEnabled(false);
            btnBuscar.setEnabled(false);
        }
        if (filtro == 1) {
            txtBuscar.setEnabled(true);
            btnBuscar.setEnabled(true);
            cbFiltroCurso.setEnabled(false);
        }
        if (filtro == 2) {
            txtBuscar.setEnabled(true);
            btnBuscar.setEnabled(true);
            cbFiltroCurso.setEnabled(false);
        }
        if (filtro == 3) {
            cbFiltroCurso.setEnabled(true);
            txtBuscar.setEnabled(false);
            btnBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_cbFiltroActionPerformed
    public void filtro() {
        curso = cbFiltroCurso.getSelectedItem().toString();
        int filtro = cbFiltro.getSelectedIndex();

        if (cbFiltro.getSelectedIndex() == 0 && cbFiltroCurso.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "POR FAVOR SELECCIONE CORRECTAMENTE LOS FILTROS");
            cbFiltro.setSelectedIndex(0);
            cbFiltroCurso.setSelectedIndex(0);
            txtBuscar.setText("");
        }
        if (filtro == 1 && txtBuscar.getText().length() >= 3) {
            je.setId_empresa(Long.valueOf(lbEmpresa.getText()));
            je.setId_sucursal(Long.valueOf(lbSucursal.getText()));
            je.setCedula(txtBuscar.getText());
            listar = crud.listarAlumnosMatriculasReportesCedula(je);
        }
        if (filtro == 2 && txtBuscar.getText().length() >= 3) {
            je.setId_empresa(Long.valueOf(lbEmpresa.getText()));
            je.setId_sucursal(Long.valueOf(lbSucursal.getText()));
            je.setApellidos_nombres(txtBuscar.getText());
            listar = crud.listarAlumnosMatriculasReportesAlumno(je);
        }
        if (filtro == 3 && cbFiltroCurso.getSelectedIndex() != 0) {
            je.setId_empresa(Long.valueOf(lbEmpresa.getText()));
            je.setId_sucursal(Long.valueOf(lbSucursal.getText()));
            je.setParalelo(cbFiltroCurso.getSelectedItem().toString());
            listar = crud.listarAlumnosMatriculasReportesCurso(je);
        }
        Tablas.cargarJoinMatriculasReportes(jtReporte, listar);
        if (jtReporte.getColumnCount() < 1) {
            JOptionPane.showMessageDialog(this, "NO EXISTE REGISTRO");
        }
        txtBuscar.setText("");
        cbFiltro.setSelectedIndex(0);
        cbFiltroCurso.setSelectedIndex(0);
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        filtro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbFiltroCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroCursoActionPerformed
        int curso2 = cbFiltroCurso.getSelectedIndex();
        if (curso2 == 0) {
            txtBuscar.setEnabled(false);
            btnBuscar.setEnabled(false);
//            tabla();
        } else {
            txtBuscar.setEnabled(false);
            btnBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_cbFiltroCursoActionPerformed

    private void txtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusLost
        txtBuscar.setText(txtBuscar.getText().toUpperCase());
    }//GEN-LAST:event_txtBuscarFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        InfoReportesAlumnos ifa = new InfoReportesAlumnos(new javax.swing.JFrame(), true);
//        ifa.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtReporteMousePressed
        try {
            int i = 0;
            if (evt.getClickCount() == 2) {
                i = jtReporte.getSelectedRow();
                objeto = buscarObjeto(jtReporte.getValueAt(i, 0).toString(), listar);
                if (objeto != null) {
                    ReporteAlumnosCalificacionActualForm ac = new ReporteAlumnosCalificacionActualForm(new javax.swing.JFrame(), true, us, objeto);
                    ac.setVisible(true);
                    listar.clear();
                    tabla();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(ReporteAlumnosperiodoActualForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jtReporteMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
//       ArrayList lista = new ArrayList();
//        for(int i=0;i<jtReporte.getRowCount();i++){
//            ClaseReporte tabla = new ClaseReporte(cbFiltro.getSelectedItem().toString(),txtBuscar.getText(),cbFiltroCurso.getSelectedItem().toString(),jtReporte.getValueAt(i,0).toString(),jtReporte.getValueAt(i,1).toString(),jtReporte.getValueAt(i,2).toString(),jtReporte.getValueAt(i,3).toString(),jtReporte.getValueAt(i,4).toString(),jtReporte.getValueAt(i,5).toString());
//            lista.add(tabla);
//        }
//        try {
//            String dir = System.getProperty("user.dir")+"/Reportes/"+"ReporteAlumnos.jasper";
//            JasperReport reporte =(JasperReport)JRLoader.loadObject(dir);
//            JasperPrint jprint = JasperFillManager.fillReport(reporte,null,new JRBeanCollectionDataSource(lista));
//            JDialog frame = new JDialog();
//            JRViewer viewer = new JRViewer(jprint);
//            frame.add(viewer);
//            frame.setSize(new Dimension(ancho/2,alto/2));
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//            viewer.setFitWidthZoomRatio();
//        } catch (JRException ex) {
//            Logger.getLogger(ReporteAlumnosperiodoActualForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnImprimirActionPerformed
    public JoinMatriculas buscarObjeto(String datos, ArrayList<JoinMatriculas> listarobj) {
        JoinMatriculas objeto1 = null;
        for (int i = 0; i < listarobj.size(); i++) {
            if (datos.equals(listarobj.get(i).getId_matricula().toString())) {
                objeto1 = listarobj.get(i);
                break;
            }
        }
        return objeto1;
    }

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
            java.util.logging.Logger.getLogger(ReporteAlumnosperiodoActualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosperiodoActualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosperiodoActualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosperiodoActualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReporteAlumnosperiodoActualForm dialog = new ReporteAlumnosperiodoActualForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbFiltroCurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtReporte;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
