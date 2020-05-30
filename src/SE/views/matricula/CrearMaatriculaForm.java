/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.matricula;

import SE.componentes.Calendario;
import SE.componentes.Combos;
import SE.componentes.Crud;
import SE.componentes.Validaciones;
import SE.componentes.ValidarIdentificacionEc;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMatriculas;
import SE.entidades.ma_paralelo;
import SE.entidades.precios;
import SE.entidades.re_clase_eporte;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author alumno
 */
public class CrearMaatriculaForm extends javax.swing.JDialog {

    Crud crud = new Crud();
    ArrayList<JoinEmpleados> listar = crud.listarEmpleadosActivosInicio();
    ArrayList<JoinMatriculas> lista = null;
    ArrayList<ma_paralelo> paralelo = null;
    ArrayList<precios> precio = null;
    JoinMatriculas je = new JoinMatriculas();
    ma_paralelo mp = new ma_paralelo();
    precios pr = new precios();
    Calendario cal = new Calendario();
    JoinEmpleados us = null;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    String ll = "", m = "", inf = "", cn = "", ing = "", eca = "", ef = "", pe = "", dhi = "", es = "";
    int id;
//    ValidarIdentificacionEc id = null;
//    ValidarIdentificacionEc ruc = null;

    /**
     * Creates new form Registrar
     *
     * @param parent
     * @param modal
     */
    public CrearMaatriculaForm(java.awt.Frame parent, boolean modal, JoinEmpleados usu) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        lbSucursal.setVisible(false);
        lbEmpresa.setVisible(false);
        lbIdUsuario.setVisible(false);
        us = usu;
        lbPeriodo.setVisible(false);
        Habilitar(false);
        lbIdUsuario.setText(usu.getId_usuario().toString());
        lbEmpresa.setText(usu.getId_empresa().toString());
        lbSucursal.setText(usu.getId_sucursal().toString());
        this.setSize(new Dimension(jPanel2.getWidth() + 4, jPanel2.getHeight()));
        je.setId_empresa(Long.valueOf(lbEmpresa.getText()));
        je.setId_sucursal(Long.valueOf(lbSucursal.getText()));
        lista = crud.listarAlumnosMatriculas(je);
        comboParalelo();
        comboValor();
        txtOtro.setEnabled(false);
        txtOtroDos.setEnabled(false);
        txtEscAnt.setEnabled(false);
        cbxDocu.setEnabled(false);
        lbPeriodo.setText(crud.MostrarPeriodo(Long.valueOf(lbSucursal.getText())));
    }

    public CrearMaatriculaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void comboParalelo() {
        mp.setId_empresa_pa(Long.valueOf(lbEmpresa.getText()));
        mp.setId_sucursal_pa(Long.valueOf(lbSucursal.getText()));
        paralelo = crud.ComboParaleloRegistrar(mp);
        cbParalelo.setModel(Combos.listarComboParalelosRegistrar(paralelo));
    }

    public void comboValor() {
        pr.setId_sucursal(Long.valueOf(lbSucursal.getText()));
        precio = crud.ComboValor(pr);
        cbValor.setModel(Combos.listarComboValor(precio));
    }

    public void comboMensualidad() {
        if (cbValor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "ESCOJA UN VALOR DE MATRICULA!");
        } else {
            pr.setId_sucursal(Long.valueOf(lbSucursal.getText()));
            pr.setValor(Double.valueOf(cbValor.getSelectedItem().toString()));
            precio = crud.ComboMensualidad(pr);
            cbMensualidad.setModel(Combos.listarComboMensualidad(precio));
        }

    }

    public boolean validarCedula(String cedula) {
        boolean estado = false;
        try {
            boolean vc = ValidarIdentificacionEc.validarCedula(cedula);

            if (vc == false) {
                JOptionPane.showMessageDialog(this, "IDENTIFICACION NO VALIDA, REVISE IDENTIFICACION");
                estado = false;
            } else {
                estado = true;
            }
            System.out.println(vc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbIdUsuario = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        lbPeriodo = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtAlumno = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dtFecha = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        cbParalelo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        cbxCopiaCedula = new javax.swing.JCheckBox();
        cbxServicoBas = new javax.swing.JCheckBox();
        cbxPartidaNac = new javax.swing.JCheckBox();
        cbxDocu = new javax.swing.JCheckBox();
        cbxEscuela = new javax.swing.JCheckBox();
        txtEscAnt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        cbValor = new javax.swing.JComboBox<>();
        cbMensualidad = new javax.swing.JComboBox<>();
        cbId = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCedUno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cbParUno = new javax.swing.JComboBox<>();
        txtOtro = new javax.swing.JTextField();
        cbParDos = new javax.swing.JComboBox<>();
        txtOtroDos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCordos = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRepDos = new javax.swing.JTextField();
        txtCedDos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/cancelar32.png"))); // NOI18N
        btnSalir.setText("CANCELAR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/live_contacts_32.png"))); // NOI18N
        btnGuardar.setText("MATRICULAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 150, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR MATRICULA");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1040, 60));

        lbIdUsuario.setText("jLabel2");
        jPanel2.add(lbIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        lbSucursal.setText("sucursal");
        jPanel2.add(lbSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, -1, -1));

        lbEmpresa.setText("empresa");
        jPanel2.add(lbEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, -1));

        lbPeriodo.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        lbPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lbPeriodo.setText("2018-2019");
        jPanel2.add(lbPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 50, 20));

        jTabbedPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ALUMNO/A");

        txtAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAlumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAlumnoFocusLost(evt);
            }
        });
        txtAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlumnoActionPerformed(evt);
            }
        });
        txtAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlumnoKeyTyped(evt);
            }
        });

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("FECHA DE NACIMIENTO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("DIRECCION");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });

        cbParalelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbParalelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PARALELO..." }));

        cbxCopiaCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxCopiaCedula.setText("COPIA DE CEDULA");
        cbxCopiaCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxCopiaCedulaKeyPressed(evt);
            }
        });

        cbxServicoBas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxServicoBas.setText("SERVICIO BASICO");
        cbxServicoBas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxServicoBasActionPerformed(evt);
            }
        });
        cbxServicoBas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxServicoBasKeyPressed(evt);
            }
        });

        cbxPartidaNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPartidaNac.setText("PARTIDA DE NACIMIENTO");

        cbxDocu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxDocu.setText("DOCUMENTACION");

        cbxEscuela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxEscuela.setText("ESCUELA ANTERIOR");
        cbxEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEscuelaActionPerformed(evt);
            }
        });

        txtEscAnt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEscAntFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCopiaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPartidaNac))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxEscuela)
                    .addComponent(cbxServicoBas))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(cbxDocu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txtEscAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxDocu)
                        .addGap(20, 20, 20)
                        .addComponent(txtEscAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxServicoBas)
                            .addComponent(cbxCopiaCedula))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxPartidaNac)
                            .addComponent(cbxEscuela))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtObservacion.setColumns(20);
        txtObservacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtObservacion.setRows(5);
        txtObservacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        txtObservacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtObservacion);

        cbValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATRICULA..." }));
        cbValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValorActionPerformed(evt);
            }
        });

        cbMensualidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbMensualidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENSUALIDAD..." }));

        cbId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA", "P. NATURAL", "P. JURIDICA", "PASAPORTE" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(dtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(cbId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(txtAlumno)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(cbParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(txtDireccion))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(cbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbMensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTabbedPane4.addTab("ALUMNO", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("REPRESENTANTE");

        txtRepresentante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepresentanteFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CEDULA");

        txtCedUno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedUnoFocusLost(evt);
            }
        });
        txtCedUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedUnoActionPerformed(evt);
            }
        });
        txtCedUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedUnoKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("TELEFONO ");

        txtTelefono1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono1KeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("CORREO ");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        cbParUno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbParUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PARENTESCO...", "PADRE", "MADRE", "ABUELO/A", "TIO/A", "OTRO" }));
        cbParUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParUnoActionPerformed(evt);
            }
        });

        txtOtro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOtroFocusLost(evt);
            }
        });

        cbParDos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbParDos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PARENTESCO...", "PADRE", "MADRE", "ABUELO/A", "TIO/A", "OTRO" }));
        cbParDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParDosActionPerformed(evt);
            }
        });

        txtOtroDos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOtroDosFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CORREO ");

        txtCordos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCordosKeyTyped(evt);
            }
        });

        txtTelefono2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono2KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("TELEFONO ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("REPRESENTANTE ");

        txtRepDos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepDosFocusLost(evt);
            }
        });

        txtCedDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedDosKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("CEDULA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cbParUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedUno)
                            .addComponent(txtRepresentante, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(txtTelefono1)
                            .addComponent(txtCorreo))))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cbParDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOtroDos))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtCedDos, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTelefono2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCordos)
                            .addComponent(txtRepDos))))
                .addGap(45, 45, 45))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCedUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtCedDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtRepDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCordos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbParUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbParDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOtroDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jTabbedPane4.addTab("REPRESENTANTES", jPanel5);

        jPanel2.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 960, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void validar() {
        try {
            JoinMatriculas ob = new JoinMatriculas();
            ob.setId_sucursal(Long.valueOf(lbSucursal.getText()));
            ob.setId_usuario(Long.valueOf(lbIdUsuario.getText()));
            ob.setParalelo(cbParalelo.getSelectedItem().toString());
            crud.ValidarCursos(ob);
            comboParalelo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public void imprimirMatricula() {
        ArrayList dato = new ArrayList();
        re_clase_eporte datos = new re_clase_eporte(us.getNombre_comercial_su(), txtCedula.getText(), txtAlumno.getText(), us.getZona(), us.getDistrito(), us.getCircuito(), us.getProvincia_suc(), us.getCanton_suc(), lbPeriodo.getText(), cbParalelo.getSelectedItem().toString(), us.getJornada(), txtObservacion.getText());
        dato.add(datos);
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("Reportes/MatriculaReporte.jasper");
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(dato));
            JDialog frame = new JDialog(this);
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho / 2, alto / 2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(CrearMaatriculaForm.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Guardar();
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void cbxServicoBasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxServicoBasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Guardar();
        }
    }//GEN-LAST:event_cbxServicoBasKeyPressed

    private void cbxCopiaCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxCopiaCedulaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Guardar();
        }
    }//GEN-LAST:event_cbxCopiaCedulaKeyPressed

    private void txtObservacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionFocusLost
        txtObservacion.setText(txtObservacion.getText().toUpperCase());
    }//GEN-LAST:event_txtObservacionFocusLost

    private void cbxServicoBasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxServicoBasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxServicoBasActionPerformed

    private void cbParUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParUnoActionPerformed
        int paren = cbParUno.getSelectedIndex();
        if (paren == 5) {
            txtOtro.setEnabled(true);
        } else {
            txtOtro.setEnabled(false);
        }
    }//GEN-LAST:event_cbParUnoActionPerformed

    private void cbParDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParDosActionPerformed
        int parent = cbParDos.getSelectedIndex();
        if (parent == 5) {
            txtOtroDos.setEnabled(true);
        } else {
            txtOtroDos.setEnabled(false);
        }
    }//GEN-LAST:event_cbParDosActionPerformed

    private void cbxEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEscuelaActionPerformed
        if (cbxEscuela.isSelected() == true) {
            cbxDocu.setEnabled(true);
            cbxDocu.setSelected(true);
            txtEscAnt.setEnabled(true);
        } else {
            cbxDocu.setEnabled(false);
            cbxDocu.setSelected(false);
            txtEscAnt.setEnabled(false);
            txtEscAnt.setText("");
        }
    }//GEN-LAST:event_cbxEscuelaActionPerformed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        char c = evt.getKeyChar();
        char mas = '+', por = '*', div = '/', dp = ':', pc = ';', c2 = ',', p1 = '{', p2 = '}';
        char lla1 = '[', el = '^', lla2 = ']', el2 = '¿', co = '?', co2 = '¡', c3 = '!', d = '"', e = '#';
        char col = '$', a = '!', b = '=', e2 = '%', f = '&', g = '=', h = 'º', i = 'ª', j = '(', k = ')', l = '<', m = '>';
        char n = 'ç', o = '´', p = '`', q = '¨', r = 'Ñ', s = '·', t = 'ñ';
        if (Character.isWhitespace(c) || c == mas || c == por || c == div || c == dp
                || c == pc || c == c2 || c == p1 || c == p2 || c == lla1 || c == lla2
                || c == el || c == el2 || c == co || c == co2 || c == c3 || c == d || c == e
                || c == col || c == a || c == b || c == e2 || c == f || c == g || c == h
                || c == i || c == j || c == k || c == l || c == m || c == n || c == o || c == p
                || c == q || c == r || c == s || c == t) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCordosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCordosKeyTyped
        char c = evt.getKeyChar();
        char mas = '+', por = '*', div = '/', dp = ':', pc = ';', c2 = ',', p1 = '{', p2 = '}';
        char lla1 = '[', el = '^', lla2 = ']', el2 = '¿', co = '?', co2 = '¡', c3 = '!', d = '"', e = '#';
        char col = '$', a = '!', b = '=', e2 = '%', f = '&', g = '=', h = 'º', i = 'ª', j = '(', k = ')', l = '<', m = '>';
        char n = 'ç', o = '´', p = '`', q = '¨', r = 'Ñ', s = '·', t = 'ñ';
        if (Character.isWhitespace(c) || c == mas || c == por || c == div || c == dp
                || c == pc || c == c2 || c == p1 || c == p2 || c == lla1 || c == lla2
                || c == el || c == el2 || c == co || c == co2 || c == c3 || c == d || c == e
                || c == col || c == a || c == b || c == e2 || c == f || c == g || c == h
                || c == i || c == j || c == k || c == l || c == m || c == n || c == o || c == p
                || c == q || c == r || c == s || c == t) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCordosKeyTyped

    private void txtCedUnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedUnoFocusLost

    }//GEN-LAST:event_txtCedUnoFocusLost

    private void txtCedUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedUnoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCedUnoKeyTyped

    private void txtTelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefono1KeyTyped

    private void txtCedDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedDosKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCedDosKeyTyped

    private void txtTelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefono2KeyTyped

    private void txtEscAntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEscAntFocusLost
        txtEscAnt.setText(txtEscAnt.getText().toUpperCase());
    }//GEN-LAST:event_txtEscAntFocusLost

    private void txtOtroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOtroFocusLost
        txtOtro.setText(txtOtro.getText().toUpperCase());
    }//GEN-LAST:event_txtOtroFocusLost

    private void txtRepresentanteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepresentanteFocusLost
        txtRepresentante.setText(txtRepresentante.getText().toUpperCase());
    }//GEN-LAST:event_txtRepresentanteFocusLost

    private void txtRepDosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepDosFocusLost
        txtRepDos.setText(txtRepDos.getText().toUpperCase());
    }//GEN-LAST:event_txtRepDosFocusLost

    private void txtOtroDosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOtroDosFocusLost
        txtOtroDos.setText(txtOtroDos.getText().toUpperCase());
    }//GEN-LAST:event_txtOtroDosFocusLost

    private void txtCedUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedUnoActionPerformed

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        txtDireccion.setText(txtDireccion.getText().toUpperCase());
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        if (Validaciones.validarCedulaEmpedos(listar, txtCedula.getText())) {
            Habilitar(true);
        } else {
            Habilitar(false);
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlumnoKeyTyped
        if (id == 3) {

        } else {
            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtAlumnoKeyTyped

    private void txtAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlumnoActionPerformed

    private void txtAlumnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlumnoFocusLost
        txtAlumno.setText(txtAlumno.getText().toUpperCase());
    }//GEN-LAST:event_txtAlumnoFocusLost

    private void cbValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValorActionPerformed
        comboMensualidad();
    }//GEN-LAST:event_cbValorActionPerformed

    public void Habilitar(boolean valor) {
        txtTelefono1.setEnabled(valor);
        txtTelefono2.setEnabled(valor);
        txtCorreo.setEnabled(valor);
        txtDireccion.setEnabled(valor);
        txtObservacion.setEnabled(valor);
        txtAlumno.setEnabled(valor);
        txtCedDos.setEnabled(valor);
        txtCedUno.setEnabled(valor);
        txtRepDos.setEnabled(valor);
        txtRepresentante.setEnabled(valor);
        txtCordos.setEnabled(valor);

        dtFecha.setEnabled(valor);
        btnGuardar.setEnabled(valor);

        cbxCopiaCedula.setEnabled(valor);
        cbxServicoBas.setEnabled(valor);
        cbxPartidaNac.setEnabled(valor);
        cbxEscuela.setEnabled(valor);

        cbParUno.setEnabled(valor);
        cbParDos.setEnabled(valor);
        cbParalelo.setEnabled(valor);
        cbValor.setEnabled(valor);
    }

    public void Guardar() {
        JoinMatriculas obj = new JoinMatriculas();
        String fecha = cal.getFecha(dtFecha);
        String obs, parUno, parDos;
        Long cc, sb, doc, pn;
        String cedula = txtCedula.toString();

//        validarCedula();
        if (cbxCopiaCedula.isSelected()) {
            cc = Long.valueOf(1);
        } else {
            cc = Long.valueOf(0);
        }
        if (cbxServicoBas.isSelected()) {
            sb = Long.valueOf(1);
        } else {
            sb = Long.valueOf(0);
        }
        if (cbxDocu.isSelected()) {
            doc = Long.valueOf(1);
        } else {
            doc = Long.valueOf(0);
        }
        if (cbxPartidaNac.isSelected()) {
            pn = Long.valueOf(1);
        } else {
            pn = Long.valueOf(0);
        }
        if (cbParUno.getSelectedIndex() == 5) {
            parUno = txtOtro.getText();
        } else {
            parUno = cbParUno.getSelectedItem().toString();
        }
        if (cbParDos.getSelectedIndex() == 5) {
            parDos = txtOtroDos.getText();
        } else {
            parDos = cbParDos.getSelectedItem().toString();
        }
        if (txtObservacion.getText().length() < 1) {
            obs = "NUEVA MATRICULA";
        } else {
            obs = txtObservacion.getText();
        }

        if (txtAlumno.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre o apellido válido ");
        } else if (txtTelefono1.getText().length() < 9) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de contacto válido ");
        } else if (txtTelefono1.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "Exede la cantidad de numeros válidos permitidos para celular");
        } else if (txtCorreo.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Ingrese un correo válido ");
        } else if (txtDireccion.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "Ingrese una dirección válida ");
        } else if (fecha == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha");
        } else if (cbParalelo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN PARALELO");
        } else if (txtCedUno.getText().length() <= 9 || txtCedula.getText().length() <= 9) {
            JOptionPane.showMessageDialog(null, "INGRESE UNA CEDULA VALIDA");
        } else if (txtRepresentante.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha");
        } else if (cbParUno.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN PARENTESCO VALIDO");
        } else if (cbValor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN VALOR VALIDO");
        } else if (cbMensualidad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN VALOR VALIDO");
        } else if (this.validarCedula(cedula) == false) {

        } else {

            imprimirMatricula();

            obj.setApellidos_nombres(txtAlumno.getText());
            obj.setCedula(txtCedula.getText());
            obj.setDireccion(txtDireccion.getText());
            obj.setFecha_nacimiento(fecha);
            obj.setParalelo(cbParalelo.getSelectedItem().toString());

            obj.setCedula_uno(txtCedUno.getText());
            obj.setRepresentante(txtRepresentante.getText());
            obj.setCorreo(txtCorreo.getText());
            obj.setConvecional(txtTelefono1.getText());
            obj.setParentesco(parUno);

            obj.setCedula_dos(txtCedDos.getText());
            obj.setRepresentante_dos(txtRepDos.getText());
            obj.setTelefono_dos(txtTelefono2.getText());
            obj.setCorreo_dos(txtCordos.getText());
            obj.setParentesco_dos(parDos);

            obj.setObservacion(obs);
            obj.setCopia_cedula(cc);
            obj.setServicio_basico(sb);
            obj.setPartida_nacimiento(pn);
            obj.setDoc_escuela_ant(doc);
            obj.setAnt_escuela(txtEscAnt.getText());
            obj.setValor_mat(Double.valueOf(cbValor.getSelectedItem().toString()));
            obj.setValor_ref(Double.valueOf(cbMensualidad.getSelectedItem().toString()));

            obj.setId_sucursal(Long.valueOf(lbSucursal.getText()));
            obj.setId_usuario(Long.valueOf(lbIdUsuario.getText()));

            try {
                String a = crud.CrearMatricula(obj);
                JOptionPane.showMessageDialog(this, a);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            txtCedula.setText("");
            txtTelefono2.setText("");
            txtTelefono2.setEnabled(false);
            txtTelefono1.setText("");
            txtTelefono1.setEnabled(false);
            txtCorreo.setText("");
            txtCorreo.setEnabled(false);
            txtCordos.setText("");
            txtCordos.setEnabled(false);
            txtDireccion.setText("");
            txtDireccion.setEnabled(false);
            txtAlumno.setText("");
            txtAlumno.setEnabled(false);
            txtObservacion.setText("");
            txtObservacion.setEnabled(false);
            txtCedDos.setText("");
            txtCedDos.setEnabled(false);
            txtCedUno.setText("");
            txtCedUno.setEnabled(false);
            txtEscAnt.setText("");
            txtEscAnt.setEnabled(false);
            txtOtro.setText("");
            txtOtro.setEnabled(false);
            txtOtroDos.setText("");
            txtOtroDos.setEnabled(false);
            txtRepDos.setText("");
            txtRepDos.setEnabled(false);
            txtRepresentante.setText("");
            txtRepresentante.setEnabled(false);

            cbParDos.setEnabled(false);
            cbParDos.setSelectedIndex(0);
            cbParUno.setEnabled(false);
            cbParUno.setSelectedIndex(0);
            cbParalelo.setEnabled(false);
//            cbParalelo.setSelectedIndex(0);

            cbxCopiaCedula.setSelected(false);
            cbxCopiaCedula.setEnabled(false);
            cbxServicoBas.setSelected(false);
            cbxServicoBas.setEnabled(false);
            cbxDocu.setSelected(false);
            cbxDocu.setEnabled(false);
            cbxEscuela.setSelected(false);
            cbxEscuela.setEnabled(false);
            cbxPartidaNac.setSelected(false);
            cbxPartidaNac.setEnabled(false);

            dtFecha.setDateFormatString("");
            dtFecha.setEnabled(false);
            btnGuardar.setEnabled(false);

            validar();
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
            java.util.logging.Logger.getLogger(CrearMaatriculaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMaatriculaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMaatriculaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMaatriculaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                CrearMaatriculaForm dialog = new CrearMaatriculaForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbId;
    private javax.swing.JComboBox<String> cbMensualidad;
    private javax.swing.JComboBox<String> cbParDos;
    private javax.swing.JComboBox<String> cbParUno;
    private javax.swing.JComboBox<String> cbParalelo;
    private javax.swing.JComboBox<String> cbValor;
    private javax.swing.JCheckBox cbxCopiaCedula;
    private javax.swing.JCheckBox cbxDocu;
    private javax.swing.JCheckBox cbxEscuela;
    private javax.swing.JCheckBox cbxPartidaNac;
    private javax.swing.JCheckBox cbxServicoBas;
    private com.toedter.calendar.JDateChooser dtFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbPeriodo;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtCedDos;
    private javax.swing.JTextField txtCedUno;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCordos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEscAnt;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtOtro;
    private javax.swing.JTextField txtOtroDos;
    private javax.swing.JTextField txtRepDos;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
