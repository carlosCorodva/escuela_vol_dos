package SE.views.calificacion;

import SE.componentes.Combos;
import SE.componentes.Crud;
import SE.componentes.FormatoNumeros;
import SE.componentes.Tablas;
import SE.entidades.join.JoinCalificacion;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMaterias;
import SE.entidades.join.JoinMatriculas;
import SE.entidades.us_permiso_curso;
import java.awt.event.KeyEvent;
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
public class CalificacionForm extends javax.swing.JDialog {

    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    Crud crud = new Crud();
    ArrayList<JoinMatriculas> listar = null;
    JoinMatriculas je = new JoinMatriculas();
    us_permiso_curso pc = new us_permiso_curso();
    JoinCalificacion jc = new JoinCalificacion();
    JoinMaterias jm = new JoinMaterias();
    JoinEmpleados us = null;
    Long pf1 = null;
    String pf2 = "";
    String pf3 = "";
    ArrayList<JoinMaterias> materia = null;
    ArrayList<JoinCalificacion> listarCursos = null;
    ArrayList<us_permiso_curso> cursos = null;
    ArrayList<String> ids = null;
    String estado_ca = "";
    String id = "";

    public CalificacionForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario) {
        super(parent, modal = false);
        initComponents();
        this.setLocationRelativeTo(null);
        jtIdAlumnos.setVisible(false);
        txtCurso.setEditable(false);
        txtMateria.setEditable(false);
        txtQuimestre.setEditable(false);
        txtUsuario.setEditable(false);
        us = usuario;
        lbEmpresa.setText(us.getId_empresa().toString());
        lbSucursal.setText(us.getId_sucursal().toString());
        lbIdUsuario.setText(us.getId_usuario().toString());
        txtUsuario.setText(us.getUsuario());
        lbPeriodo.setText(crud.MostrarPeriodo(Long.valueOf(lbSucursal.getText())));
        btnGuardar.setEnabled(false);
        btnImprimir.setEnabled(false);
        combos();
    }

    public CalificacionForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal = false);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void conteo() {
        for (int t = 0; t < jtCalificacion.getRowCount(); t++) {
            jtCalificacion.setValueAt(t + 1, t, 0);
            System.out.println("conteo: " + t);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbPeriodo = new javax.swing.JLabel();
        lbIdUsuario = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbFiltroQuimestre = new javax.swing.JComboBox<>();
        cbFiltroMateria = new javax.swing.JComboBox<>();
        cbFiltroCurso = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCalificacion = new javax.swing.JTable();
        txtMateria = new javax.swing.JTextField();
        txtQuimestre = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnConducta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtIdAlumnos = new javax.swing.JTable();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALIFICACION");

        lbPeriodo.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        lbPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lbPeriodo.setText("2018-2019");

        lbIdUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbIdUsuario.setText("usuario");

        lbEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lbEmpresa.setText("jLabel7");

        lbSucursal.setForeground(new java.awt.Color(255, 255, 255));
        lbSucursal.setText("jLabel7");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PERÍODO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(lbIdUsuario)
                .addGap(191, 191, 191)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPeriodo)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmpresa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSucursal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSucursal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbPeriodo)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lbIdUsuario)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        cbFiltroQuimestre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbFiltroQuimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QUIMESTRE...", "PRIMER QUIMESTRE", "SEGUNDO QUIMESTRE" }));

        cbFiltroMateria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbFiltroMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATERIAS...", "LENGUAJE Y COMUNICACION", "CULTURA FÍSICA", "MATEMÁTICA", "INFORMÁTICA", "CIENCIAS NATURALES", "ESTUDIOS SOCIALES", "INGLÉS", "CULTURA ESTETICA" }));

        cbFiltroCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbFiltroCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CURSOS...", "2A", "2B", "3A", "3B", "" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CURSO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("QUIMESTRE:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MATERIA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("USAURIO:");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/disquete guardar 32.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/cancelar32.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setToolTipText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/impresora 32.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jtCalificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtCalificacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtCalificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtCalificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtCalificacion.setRowHeight(30);
        jtCalificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCalificacionMouseClicked(evt);
            }
        });
        jtCalificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCalificacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCalificacionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jtCalificacion);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtMateria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQuimestre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/buscar32.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnConducta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConducta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/infor 32.png"))); // NOI18N
        btnConducta.setText("CONDUCTA");
        btnConducta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConductaActionPerformed(evt);
            }
        });

        jtIdAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtIdAlumnos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cbFiltroQuimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbFiltroMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbFiltroCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConducta))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnImprimir)
                        .addGap(192, 192, 192)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(cbFiltroCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFiltroMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFiltroQuimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConducta))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar)
                    .addComponent(btnImprimir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void combos() {
        pc.setId_usuario(Long.valueOf(lbIdUsuario.getText()));
        pc.setId_sucursal_per(Long.valueOf(lbSucursal.getText()));
        cursos = crud.ComboCursoCalificacion(pc);
        cbFiltroCurso.setModel(Combos.listarComboCursos(cursos));

        jm.setId_usuario(Long.valueOf(lbIdUsuario.getText()));
        materia = crud.ComboMateriaCalificacion(jm);
        cbFiltroMateria.setModel(Combos.listarComboMateria(materia));
    }

    public void cajasTxt() {
        String fc = cbFiltroCurso.getSelectedItem().toString();
        String fm = cbFiltroMateria.getSelectedItem().toString();
        String fq = cbFiltroQuimestre.getSelectedItem().toString();

        if ("ELIJA PARALELO...".equals(fc) || "ELIJA MATERIA...".equals(fm) || "ELIJA QUIMESTRE...".equals(fq)) {
            txtCurso.setText(" ");
            txtQuimestre.setText(" ");
            txtMateria.setText(" ");
        } else {
            txtCurso.setText(fc);
            txtQuimestre.setText(fq);
            txtMateria.setText(fm);
        }
    }

    public void calcularPromedio() {
        try {
            if (jtCalificacion.getColumnCount() >= 6) {

                for (int i = 0; i < jtCalificacion.getRowCount(); i++) {
                    Double formativa = Double.parseDouble(jtCalificacion.getValueAt(i, 2).toString());
                    Double practica = Double.parseDouble(jtCalificacion.getValueAt(i, 3).toString());
                    Double aporte = Double.parseDouble(jtCalificacion.getValueAt(i, 4).toString());

                    Double examen = Double.parseDouble(jtCalificacion.getValueAt(i, 5).toString());

                    Double divisor = Double.valueOf(3);
                    Double mon = 0.80;
                    Double mvn = 0.20;

                    Double suma3 = formativa + (practica) + (aporte);
                    Double dividir3 = suma3 / (divisor);

                    Double ochenta = dividir3 * (mon);
                    Double veinte = examen * (mvn);

                    jtCalificacion.setValueAt(FormatoNumeros.formato_numero(ochenta.toString()), i, 7);
                    jtCalificacion.setValueAt(FormatoNumeros.formato_numero(veinte.toString()), i, 8);
                    Double promedio = ochenta + veinte;
                    if (formativa > 10.00 || practica > 10.00 || aporte > 10.00 || examen > 10.00 || promedio > 10.00) {
                        JOptionPane.showMessageDialog(this, "NO PUEDE CALIFICAR MAYOR A DIEZ 10.00");
                        promedio = 0.00;
                    }

                    jtCalificacion.setValueAt(FormatoNumeros.formato_numero(promedio.toString().replace(",", ".").trim()), i, 9);
                    String cualitativo = "";

                    if (ochenta >= 10.0) {
                        cualitativo = "NO VÁLIDO";
                    }
                    if (veinte >= 10.0) {
                        cualitativo = "NO VÁLIDO";
                    }

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
                        cualitativo = "NO VÁLIDO";
                    }
                    jtCalificacion.setValueAt(cualitativo, i, 10);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(CalificacionForm.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void guardar() {
        ArrayList<String> queryA = new ArrayList<String>();
        String act = "";
        for (int i = 0; i < jtCalificacion.getRowCount(); i++) {

            String ident = jtIdAlumnos.getValueAt(i, 0).toString();
            id = ident;
            
            act = "UPDATE `ca_calificacion`\n"
                    + "SET `nota_practica` = '" + jtCalificacion.getValueAt(i, 3) + "',\n"
                    + "  `nota_formativa` = '" + jtCalificacion.getValueAt(i, 2) + "',\n"
                    + "  `aporte` = '" + jtCalificacion.getValueAt(i, 4) + "', \n"
                    + "  `examen` = '" + jtCalificacion.getValueAt(i, 5) + "', \n"
                    + "  `promedio` = '" + jtCalificacion.getValueAt(i, 9) + "',\n"
                    + "  `id_conducta` = '" + jtCalificacion.getValueAt(i, 6) + "',\n"
                    + "  `calificacion_obs` = '" + jtCalificacion.getValueAt(i, 10) + "', \n"
                    + "  `ochenta_porcentaje` = '" + jtCalificacion.getValueAt(i, 7) + "', \n"
                    + "  `veinte_porcentaje` = '" + jtCalificacion.getValueAt(i, 8) + "', \n"
//                    + "  `estado_ca` = '" + estado_ca + "', \n"
                    + "  `id_actualizacion` = '" + lbIdUsuario.getText() + "', \n"
                    + "  `f_actualizacion` = NOW() \n"
                    + "WHERE `id_calificacion` = '" + id + "';";
//            System.out.println("id fin: " + id);
            queryA.add(act);
//            System.out.println("nombre:" + queryA);
            crud.GuardarNotas(queryA);
            queryA.clear();
        }
        JOptionPane.showMessageDialog(this, "NOTAS GUARDADAS CORRECTAMENTE");
        Tablas.tablaFiltroAlumnos(listarCursos, jtCalificacion);
        filtrosCursos();
        conteo();
    }

    public void filtrosCursos() {
        pf1 = Long.valueOf(cbFiltroQuimestre.getSelectedIndex());
        pf2 = cbFiltroMateria.getSelectedItem().toString();
        pf3 = cbFiltroCurso.getSelectedItem().toString();

        if ("QUIMESTRE...".equals(pf1) || "MATERIAS...".equals(pf2) || "CURSOS...".equals(pf3)) {
            JOptionPane.showMessageDialog(this, "SELECCIONE LOS FILTROS CORRECTAMENTE");
            btnGuardar.setEnabled(false);
            btnImprimir.setEnabled(false);
            txtCurso.setText("");
            txtQuimestre.setText("");
            txtMateria.setText("");
        } else {
            jc.setParcial(pf1);
            jc.setMateria(pf2);
            jc.setParalelo(pf3);
            jc.setPeriodo(lbPeriodo.getText());
            jc.setId_sucursal(Long.valueOf(lbSucursal.getText()));

            listarCursos = crud.listarAlumnosCalificacionPorCurso(jc);
            Tablas.tablaFiltroAlumnos(listarCursos, jtCalificacion);

            Tablas.tablaFiltroAlumnosId(listarCursos, jtIdAlumnos);

            btnGuardar.setEnabled(true);
            btnImprimir.setEnabled(true);
//            JOptionPane.showMessageDialog(this, "BUSQUEDA EXITOSA");
            calcularPromedio();
        }
    }


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿DESEA SALIR DEL MODULO CALIFICACION?", "", JOptionPane.YES_NO_OPTION);

        if (r == JOptionPane.YES_OPTION) {
            setVisible(false);
        } else {
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        calcularPromedio();
        guardar();
//        listarCursos.clear();
//        listarCursos = crud.listarAlumnosCalificacion(cal);
//        Tablas.tablaFiltroAlumnos(listarCursos, jtCalificacion);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtCalificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCalificacionMouseClicked
        if (evt.getClickCount() == 0 || evt.getClickCount() == 1 || evt.getClickCount() == 3) {
            calcularPromedio();
            conteo();
        }

    }//GEN-LAST:event_jtCalificacionMouseClicked

    private void jtCalificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCalificacionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcularPromedio();
            conteo();
        }
    }//GEN-LAST:event_jtCalificacionKeyReleased

    private void jtCalificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCalificacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtCalificacionKeyTyped

    public void imprimir() {
//        ArrayList lista = new ArrayList();
//        for (int i = 0; i < jtCalificacion.getRowCount(); i++) {
////            ClaseReporte tabla = new ClaseReporte(lbMateria.getText(), lbQuimestre.getText(), lbCurso.getText(), jtCalificacion.getValueAt(i, 0).toString(), jtCalificacion.getValueAt(i, 1).toString(), jtCalificacion.getValueAt(i, 2).toString(), jtCalificacion.getValueAt(i, 3).toString());
////            lista.add(tabla);
//        }
//        try {
//            String dir = System.getProperty("user.dir") + "/Reportes/" + "Mostrar_alumnos_views.jasper";
//            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
//            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
//            JDialog frame = new JDialog();
//            JRViewer viewer = new JRViewer(jprint);
//            frame.add(viewer);
//            frame.setSize(new Dimension(ancho / 2, alto / 2));
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//            viewer.setFitWidthZoomRatio();
//        } catch (JRException ex) {
//            Logger.getLogger(CalificacionForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        filtrosCursos();
        cajasTxt();
        conteo();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnConductaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConductaActionPerformed
        ConductaForm cf = new ConductaForm(new javax.swing.JFrame(), true);
        cf.setVisible(true);
    }//GEN-LAST:event_btnConductaActionPerformed

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
            java.util.logging.Logger.getLogger(CalificacionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalificacionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalificacionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalificacionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalificacionForm dialog = new CalificacionForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnConducta;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbFiltroCurso;
    private javax.swing.JComboBox<String> cbFiltroMateria;
    private javax.swing.JComboBox<String> cbFiltroQuimestre;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtCalificacion;
    private javax.swing.JTable jtIdAlumnos;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbPeriodo;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtQuimestre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
