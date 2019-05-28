/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.reportes;

import SE.componentes.Crud;
import SE.componentes.Tablas;
import SE.entidades.join.JoinCalificacion;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMatriculas;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
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
public class ReporteAlumnosCalificacionActualForm extends javax.swing.JDialog {

    /**
     * Creates new form Calificacion_registro
     */
//    Calificacion_clase obj = null;
    ArrayList<JoinCalificacion> reporte = null;
//    ArrayList<Calificacion_clase_dos> reporteDos = null;
//    ArrayList<Calificacion_clase_tres> reporteTres = null;
//    ArrayList<Tabla_vacia> tabla = null;
    Crud crud = new Crud();
    JoinEmpleados us = null;
    JoinMatriculas mat = null;
    DefaultTableModel md = new DefaultTableModel();
    JoinCalificacion cal = new JoinCalificacion();
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

    public ReporteAlumnosCalificacionActualForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario, JoinMatriculas matricula) {
        super(parent, modal = false);
        initComponents();
        setLocationRelativeTo(null);
        mat = matricula;
        us = usuario;
        lbEmpresa.setText(us.getId_empresa().toString());
        lbSucursal.setText(us.getId_sucursal().toString());
        lbIdUsuario.setText(us.getId_usuario().toString());
        formulario();
        tablaPQ();
        tablaSQ();
//        cabecera();
//        pp();
        calcularPromedio();
    }

    public ReporteAlumnosCalificacionActualForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void cabecera() {
        String[] cabeza = {"MATERIAS", "PRIMER QUIMESTRE", "SEGUNDO QUIMESTRE",
            "PROMEDIO", "NOTA CUALITATIVA", "ESTADO"};
        md.setColumnIdentifiers(cabeza);
        jtPromedio.setModel(md);
    }

    public void formulario() {
        txtPeriodo.setEditable(false);
        txtCurso.setEditable(false);
        txtAlumno.setEditable(false);
        txtcedula.setEditable(false);

        txtCurso.setText(mat.getParalelo());
        txtAlumno.setText(mat.getApellidos_nombres());
        txtPeriodo.setText(mat.getPeriodo());
        txtcedula.setText(mat.getCedula());
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
        jtPrimerQ = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtSegundoQ = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPromedio = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtAlumno = new javax.swing.JTextField();
        BtnReporteFinal = new javax.swing.JButton();
        btnImprimirSQ = new javax.swing.JButton();
        btnImprimirPQ = new javax.swing.JButton();
        lbIdUsuario = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPORTE DE CALIFICACIONES");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
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

        jtPrimerQ.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtPrimerQ.setModel(new javax.swing.table.DefaultTableModel(
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
        jtPrimerQ.setRowHeight(25);
        jScrollPane1.setViewportView(jtPrimerQ);

        jtSegundoQ.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtSegundoQ.setModel(new javax.swing.table.DefaultTableModel(
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
        jtSegundoQ.setRowHeight(25);
        jScrollPane2.setViewportView(jtSegundoQ);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("PRIMER QUIMESTRE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("SEGUNDO QUIMESTRE");

        jtPromedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtPromedio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtPromedio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jtPromedio.setRowHeight(25);
        jScrollPane3.setViewportView(jtPromedio);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("REPORTE ANUAL");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("PERIODO");

        BtnReporteFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnReporteFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/calificar 32.png"))); // NOI18N
        BtnReporteFinal.setText("IMPRIMIR");
        BtnReporteFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnReporteFinal.setFocusable(false);
        BtnReporteFinal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReporteFinal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnImprimirSQ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirSQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/calificar 32.png"))); // NOI18N
        btnImprimirSQ.setText("IMPRIMIR");
        btnImprimirSQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirSQ.setFocusable(false);
        btnImprimirSQ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirSQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnImprimirPQ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirPQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/calificar 32.png"))); // NOI18N
        btnImprimirPQ.setText("IMPRIMIR");
        btnImprimirPQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirPQ.setFocusable(false);
        btnImprimirPQ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirPQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lbIdUsuario.setText("usaurio");

        lbSucursal.setText("sucursal");

        lbEmpresa.setText("empresa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnReporteFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnImprimirSQ))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addGap(7, 7, 7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbIdUsuario)
                                                .addGap(156, 156, 156)
                                                .addComponent(lbSucursal)
                                                .addGap(122, 122, 122)
                                                .addComponent(lbEmpresa))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPeriodo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 5, Short.MAX_VALUE)
                                        .addComponent(btnImprimirPQ)))))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lbIdUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSucursal)
                            .addComponent(lbEmpresa))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimirPQ)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnImprimirSQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnReporteFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String materias = "";
    Double proUno = 0.00;
    Double proDos = 0.00;
    Double prou = 0.00;
    Double prod = 0.00;

    public void calcularPromedio() {
        
        cal.setId_matricula(mat.getId_matricula());
        cal.setId_sucursal(Long.valueOf(lbSucursal.getText()));
        reporte = crud.ReportePrimerQuimestre(cal);
        Tablas.tablaReporteCalificacionPromedio(reporte, jtPromedio);
        
        for (int i = 0; i < jtPrimerQ.getRowCount(); i++) {
            proUno = Double.valueOf(jtPrimerQ.getValueAt(i, 8).toString());
            prou = proUno;
            jtPromedio.setValueAt(prou, i, 1);
        }
        for (int i = 0; i < jtSegundoQ.getRowCount(); i++) {
            proDos = Double.valueOf(jtSegundoQ.getValueAt(i, 8).toString());
            prod = proDos;
            jtPromedio.setValueAt(prod, i, 2);
        }
        for (int i = 0; i < jtPromedio.getRowCount(); i++) {
            Double pq = Double.valueOf(jtPromedio.getValueAt(i, 1).toString());
            Double ps = Double.valueOf(jtPromedio.getValueAt(i, 2).toString());
            Double promedio = (pq + ps) / 2;

            jtPromedio.setValueAt(promedio, i, 3);

            String cualitativo = "";

            if (promedio == 10) {
                cualitativo = "SUPERA LOS APRENDISAJES REQUERIDOS";
            } else if (promedio >= 9 && promedio < 10) {
                cualitativo = "SUPERA LOS APRENDISAJES REQUERIDOS";
            } else if (promedio >= 7 && promedio < 9) {
                cualitativo = "ALCANZA LOS APRENDISAJES REQUERIDOS";
            } else if (promedio >= 5 && promedio < 7) {
                cualitativo = "ESTA PROXIMO A ALCANZAR LOS APRENDISAJES REQUERIDOS";
            } else if (promedio >= 1 && promedio < 5) {
                cualitativo = "NO ALCANZA LOS APRENDISAJES REQUERIDOS";
            } else if (promedio < 1) {
                cualitativo = "RETIRADO";
            }

            jtPromedio.setValueAt(cualitativo, i, 4);

            String estado = "";

            if (promedio > 7) {
                estado = "APROVADO!";
            }
            if (promedio < 7) {
                estado = "REPROVADO!";
            }
            jtPromedio.setValueAt(estado, i, 5);
        }
        
    }

    public void pp() {
        System.out.println("1");
        for (int i = 0; i < jtPrimerQ.getRowCount(); i++) {
            Object fila[] = new Object[jtPrimerQ.getColumnCount()];
            fila[0] = jtPrimerQ.getValueAt(i, 0);
            md.addRow(fila);
        }
        System.out.println("3");
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    public void tablaPQ() {
        cal.setId_matricula(mat.getId_matricula());
        cal.setId_sucursal(Long.valueOf(lbSucursal.getText()));
        reporte = crud.ReportePrimerQuimestre(cal);
        Tablas.tablaReporteCalificacion(reporte, jtPrimerQ);
    }

    public void tablaSQ() {
        cal.setId_matricula(mat.getId_matricula());
        cal.setId_sucursal(Long.valueOf(lbSucursal.getText()));
        reporte = crud.ReporteSegundoQuimestre(cal);
        Tablas.tablaReporteCalificacion(reporte, jtSegundoQ);
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
            java.util.logging.Logger.getLogger(ReporteAlumnosCalificacionActualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosCalificacionActualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosCalificacionActualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosCalificacionActualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ReporteAlumnosCalificacionActualForm dialog = new ReporteAlumnosCalificacionActualForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnReporteFinal;
    private javax.swing.JButton btnImprimirPQ;
    private javax.swing.JButton btnImprimirSQ;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtPrimerQ;
    private javax.swing.JTable jtPromedio;
    private javax.swing.JTable jtSegundoQ;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtcedula;
    // End of variables declaration//GEN-END:variables
}
