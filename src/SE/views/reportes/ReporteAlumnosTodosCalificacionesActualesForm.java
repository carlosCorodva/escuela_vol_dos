/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.reportes;

import SE.componentes.Crud;
import SE.componentes.FormatoNumeros;
import SE.componentes.Tablas;
import SE.entidades.join.JoinCalificacion;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMatriculas;
import SE.entidades.re_clase_eporte;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author carlos
 */
public class ReporteAlumnosTodosCalificacionesActualesForm extends javax.swing.JDialog {

    /**
     * Creates new form Calificacion_registro
     */
    ArrayList<JoinCalificacion> reporte = null;
    Crud crud = new Crud();
    JoinEmpleados us = null;
    JoinMatriculas mat = null;
    DefaultTableModel md = new DefaultTableModel();
    JoinCalificacion cal = new JoinCalificacion();
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

    public ReporteAlumnosTodosCalificacionesActualesForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario, JoinMatriculas matricula) {
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
        calcularPromedio();
    }

    public ReporteAlumnosTodosCalificacionesActualesForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void formulario() {
        txtPeriodo.setEditable(false);
        txtCurso.setEditable(false);
        txtAlumno.setEditable(false);
        txtcedula.setEditable(false);
        txtPromedio.setEditable(false);

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
        jLabel4 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();

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
        BtnReporteFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReporteFinalActionPerformed(evt);
            }
        });

        btnImprimirSQ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirSQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/calificar 32.png"))); // NOI18N
        btnImprimirSQ.setText("IMPRIMIR");
        btnImprimirSQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirSQ.setFocusable(false);
        btnImprimirSQ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirSQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimirSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirSQActionPerformed(evt);
            }
        });

        btnImprimirPQ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirPQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/calificar 32.png"))); // NOI18N
        btnImprimirPQ.setText("IMPRIMIR");
        btnImprimirPQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirPQ.setFocusable(false);
        btnImprimirPQ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirPQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimirPQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPQActionPerformed(evt);
            }
        });

        lbIdUsuario.setText("usaurio");

        lbSucursal.setText("sucursal");

        lbEmpresa.setText("empresa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PROMEDIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lbIdUsuario)
                                .addGap(156, 156, 156)
                                .addComponent(lbSucursal)
                                .addGap(122, 122, 122)
                                .addComponent(lbEmpresa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAlumno)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImprimirPQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImprimirSQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnReporteFinal))
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
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    String cond = "";

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
            cond = jtSegundoQ.getValueAt(i, 5).toString();
            prod = proDos;
            jtPromedio.setValueAt(prod, i, 2);
            jtPromedio.setValueAt(cond, i, 4);
        }

        Double fila = 0.00;
        Double total = 0.00;

        for (int i = 0; i < jtPromedio.getRowCount(); i++) {
            Double pq = Double.valueOf(jtPromedio.getValueAt(i, 1).toString());
            Double ps = Double.valueOf(jtPromedio.getValueAt(i, 2).toString());
            Double promedio = (pq + ps) / 2;

            jtPromedio.setValueAt(FormatoNumeros.formato_numero(promedio.toString()), i, 3);

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

            jtPromedio.setValueAt(cualitativo, i, 5);

            String estado = "";

            if (promedio >= 7) {
                estado = "APROBADO";
            }
            if (promedio < 7) {
                estado = "REPROBADO";
            }
            jtPromedio.setValueAt(estado, i, 6);

            fila = Double.valueOf(jtPromedio.getValueAt(i, 3).toString());
            total += fila / 10;
        }
        txtPromedio.setText(FormatoNumeros.formato_numero(total.toString()));

        for (int c = 0; c < jtPromedio.getColumnCount(); c++) {
            Class<?> col_class = jtPromedio.getColumnClass(c);
            jtPromedio.setDefaultEditor(col_class, null);
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    public void matricula() {
        int a = Integer.parseInt(txtPromedio.getText());
        String estado = "";
//        for (int i = 0; i < jtPromedio.getRowCount(); i++) {
//            String dato = jtPromedio.getValueAt(i, 5).toString();
//            if ("APROVADO".equals(dato)) {
//                a = a + 1;
//            }
//        }
        System.out.println("a: " + a);
        if (a >= 7) {
            estado = "APROBADO";
        }
        if (a < 7) {
            estado = "REPROBADO";
        }
        ArrayList<String> queryA = new ArrayList<String>();
//        ArrayList<String> queryB = new ArrayList<String>();
        String actA = "";
//        String actB = "";

        actA = "UPDATE `ma_matricula`\n"
                + "SET `id_actualizacion` = '" + lbIdUsuario.getText() + "',\n"
                + "  `f_actualizacion` = NOW(),\n"
                + "  `estado_matricula` = '" + estado + "',\n"
                + "  `promedio_matricula` = '" + txtPromedio.getText() + "'\n"
                + "WHERE `id_matricula` = '" + mat.getId_matricula() + "';";
//            System.out.println("id fin: " + id);
        queryA.add(actA);
        System.out.println("queryA: " + queryA);
        crud.matriculaAnualEstado(queryA);
        queryA.clear();

//        actB = "UPDATE `ma_paralelo`\n"
//                + "SET `id_actualizacion` = '" + lbIdUsuario.getText() + "',\n"
//                + "  `f_actualizacion` = NOW(),\n"
//                + "  `capacidad` = 'S'\n"
//                + "WHERE `capacidad`'N' AND `id_sucursal_pa`='" + lbSucursal.getText() + "';";
////            System.out.println("id fin: " + id);
//        queryB.add(actB);
//        System.out.println("queryB: " + queryB);
//        crud.paraleloCapacidadAnual(queryB);
//        queryB.clear();
    }

    private void btnImprimirPQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPQActionPerformed
        imprimirPq();
    }//GEN-LAST:event_btnImprimirPQActionPerformed

    public void imprimirPq() {
        ArrayList lista = new ArrayList();
        for (int i = 0; i < jtPrimerQ.getRowCount(); i++) {
            re_clase_eporte tabla = new re_clase_eporte(txtAlumno.getText(), txtCurso.getText(), txtPeriodo.getText(), txtPromedio.getText(), jtPrimerQ.getValueAt(i, 0).toString(), jtPrimerQ.getValueAt(i, 1).toString(), jtPrimerQ.getValueAt(i, 2).toString(), jtPrimerQ.getValueAt(i, 3).toString(), jtPrimerQ.getValueAt(i, 4).toString(), jtPrimerQ.getValueAt(i, 6).toString(), jtPrimerQ.getValueAt(i, 7).toString(), jtPrimerQ.getValueAt(i, 8).toString(), jtPrimerQ.getValueAt(i, 5).toString(), jtPrimerQ.getValueAt(i, 9).toString());
            lista.add(tabla);
        }
        try {
            String dir = System.getProperty("user.dir") + "/Reportes/" + "CalificacionReportePq.jasper";
            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
            JDialog frame = new JDialog();
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho / 2, alto / 2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(ReporteAlumnosTodosCalificacionesActualesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void imprimirSq() {
        ArrayList lista = new ArrayList();
        for (int i = 0; i < jtSegundoQ.getRowCount(); i++) {
            re_clase_eporte tabla = new re_clase_eporte(txtAlumno.getText(), txtCurso.getText(), txtPeriodo.getText(), txtPromedio.getText(), jtPrimerQ.getValueAt(i, 0).toString(), jtPrimerQ.getValueAt(i, 1).toString(), jtPrimerQ.getValueAt(i, 2).toString(), jtPrimerQ.getValueAt(i, 3).toString(), jtPrimerQ.getValueAt(i, 4).toString(), jtPrimerQ.getValueAt(i, 6).toString(), jtPrimerQ.getValueAt(i, 7).toString(), jtPrimerQ.getValueAt(i, 8).toString(), jtPrimerQ.getValueAt(i, 5).toString(), jtPrimerQ.getValueAt(i, 9).toString());
            lista.add(tabla);
        }
        try {
            String dir = System.getProperty("user.dir") + "/Reportes/" + "CalificacionReporteSq.jasper";
            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
            JDialog frame = new JDialog(this);
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho / 2, alto / 2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(ReporteAlumnosTodosCalificacionesActualesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void promedio() {
        ArrayList lista = new ArrayList();
        for (int i = 0; i < jtPromedio.getRowCount(); i++) {
            re_clase_eporte tabla = new re_clase_eporte(txtAlumno.getText(), txtCurso.getText(), txtPeriodo.getText(), txtPromedio.getText(), jtPrimerQ.getValueAt(i, 0).toString(), jtPrimerQ.getValueAt(i, 1).toString(), jtPrimerQ.getValueAt(i, 2).toString(), jtPrimerQ.getValueAt(i, 3).toString(), jtPrimerQ.getValueAt(i, 4).toString(), jtPrimerQ.getValueAt(i, 5).toString(), jtPrimerQ.getValueAt(i, 6).toString());
            lista.add(tabla);
        }
        try {
            String dir = System.getProperty("user.dir") + "/Reportes/" + "ReporteAnual.jasper";
            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
            JDialog frame = new JDialog(this);
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho / 2, alto / 2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(ReporteAlumnosTodosCalificacionesActualesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnImprimirSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirSQActionPerformed
//        matricula();
        imprimirSq();
    }//GEN-LAST:event_btnImprimirSQActionPerformed

    private void BtnReporteFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReporteFinalActionPerformed
//        matricula();
        promedio();
    }//GEN-LAST:event_BtnReporteFinalActionPerformed
    public void tablaPQ() {
        cal.setId_matricula(mat.getId_matricula());
        cal.setId_sucursal(Long.valueOf(lbSucursal.getText()));
        reporte = crud.ReportePrimerQuimestre(cal);
        Tablas.tablaReporteCalificacion(reporte, jtPrimerQ);
        for (int c = 0; c < jtPrimerQ.getColumnCount(); c++) {
            Class<?> col_class = jtPrimerQ.getColumnClass(c);
            jtPrimerQ.setDefaultEditor(col_class, null);
        }
    }

    public void tablaSQ() {
        cal.setId_matricula(mat.getId_matricula());
        cal.setId_sucursal(Long.valueOf(lbSucursal.getText()));
        reporte = crud.ReporteSegundoQuimestre(cal);
        Tablas.tablaReporteCalificacion(reporte, jtSegundoQ);
        for (int c = 0; c < jtSegundoQ.getColumnCount(); c++) {
            Class<?> col_class = jtSegundoQ.getColumnClass(c);
            jtSegundoQ.setDefaultEditor(col_class, null);
        }
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
            java.util.logging.Logger.getLogger(ReporteAlumnosTodosCalificacionesActualesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosTodosCalificacionesActualesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosTodosCalificacionesActualesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAlumnosTodosCalificacionesActualesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ReporteAlumnosTodosCalificacionesActualesForm dialog = new ReporteAlumnosTodosCalificacionesActualesForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtcedula;
    // End of variables declaration//GEN-END:variables
}
