/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.empresa.sucursal;

import SE.componentes.Crud;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinEmpleados;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class ActualizarSucursalesForm extends javax.swing.JDialog {

    /**
     * Creates new form CrearEmpresaForm
     */
    Crud crud = new Crud();
    em_sucursal suc = null;
    ArrayList<em_sucursal> lista = null;
    JoinEmpleados us = null;
    String boton = "";

    public ActualizarSucursalesForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario, em_sucursal sucursal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lbSucursal.setVisible(false);
        lbEmpresa.setVisible(false);
        lbIdUsuario.setVisible(false);
        us = usuario;
        suc = sucursal;
        lbIdUsuario.setText(us.getId_usuario().toString());
        lbEmpresa.setText(us.getId_empresa().toString());
        lbSucursal.setText(suc.getId_sucursal().toString());
        formulario();
    }

    public ActualizarSucursalesForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void formulario() {
        String est = suc.getEstado_su();
        String jor = suc.getJornada();
        String prov = suc.getProvincia_suc();
        txtCorreo.setText(suc.getCorreo_su());
        txtDireccion.setText(suc.getDireccion_su());
        txtEmpresa.setText(suc.getNombre_comercial_su());
        txtelefono.setText(suc.getTelefono_su());
        txtCanton.setText(suc.getCanton_suc());
        txtCircuito.setText(suc.getCircuito());
        txtDistrito.setText(suc.getDistrito());
        txtZona.setText(suc.getZona());
        
        if ("ACTIVO".equals(est)) {
            cbEstado.setSelectedIndex(0);
        } else {
            cbEstado.setSelectedIndex(1);
        }
        
        if ("MATUTINA".equals(jor)) {
            cbJornada.setSelectedIndex(1);
        }else if ("VESPERTINA".equals(jor)) {
            cbJornada.setSelectedIndex(2);
        }else if ("NOCTURNA".equals(jor)) {
            cbJornada.setSelectedIndex(3);
        } else {
            cbJornada.setSelectedIndex(0);
        }

        if ("AZUAY".equals(prov)) {
            cbProvincia.setSelectedIndex(1);
        }else if ("BOLIBAR".equals(prov)) {
            cbProvincia.setSelectedIndex(2);
        }else if ("CAÑAR".equals(prov)) {
            cbProvincia.setSelectedIndex(3);
        }else if ("CARCHI".equals(prov)) {
            cbProvincia.setSelectedIndex(4);
        }else if ("CHIMBORAZO".equals(prov)) {
            cbProvincia.setSelectedIndex(5);
        }else if ("COTOPAXI".equals(prov)) {
            cbProvincia.setSelectedIndex(6);
        }else if ("EL ORO".equals(prov)) {
            cbProvincia.setSelectedIndex(7);
        }else if ("ESMERALDAS".equals(prov)) {
            cbProvincia.setSelectedIndex(8);
        }else if ("GALAPAGOS".equals(prov)) {
            cbProvincia.setSelectedIndex(9);
        }else if ("GUAYAS".equals(prov)) {
            cbProvincia.setSelectedIndex(10);
        }else if ("IMBABURA".equals(prov)) {
            cbProvincia.setSelectedIndex(11);
        }else if ("LOJA".equals(prov)) {
            cbProvincia.setSelectedIndex(12);
        }else if ("LOS RIOS".equals(prov)) {
            cbProvincia.setSelectedIndex(13);
        }else if ("MANABI".equals(prov)) {
            cbProvincia.setSelectedIndex(14);
        }else if ("MORONA SANTIAGO".equals(prov)) {
            cbProvincia.setSelectedIndex(15);
        }else if ("NAPO".equals(prov)) {
            cbProvincia.setSelectedIndex(16);
        }else if ("ORELLANA".equals(prov)) {
            cbProvincia.setSelectedIndex(17);
        }else if ("PASTAZA".equals(prov)) {
            cbProvincia.setSelectedIndex(18);
        }else if ("PICHINCHA".equals(prov)) {
            cbProvincia.setSelectedIndex(19);
        }else if ("SANTA ELENA".equals(prov)) {
            cbProvincia.setSelectedIndex(20);
        }else if ("STO. DOMINGO DE LOS TSACHILAS".equals(prov)) {
            cbProvincia.setSelectedIndex(21);
        }else if ("SUCUMBIOS".equals(prov)) {
            cbProvincia.setSelectedIndex(22);
        }else if ("TUNGURAGUA".equals(prov)) {
            cbProvincia.setSelectedIndex(23);
        }else if ("ZAMORA CHINCHIPE".equals(prov)) {
            cbProvincia.setSelectedIndex(24);
        }else{
            cbProvincia.setSelectedIndex(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbIdUsuario = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCanton = new javax.swing.JTextField();
        cbJornada = new javax.swing.JComboBox<>();
        cbProvincia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCircuito = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("SUCURSAL");

        txtEmpresa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmpresaFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("TELEFONO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DIRECCION");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        txtelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtelefonoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CORREO");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/guardar32.png"))); // NOI18N
        btnGuardar.setText("ACTUALIZAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/cancelar32.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 54, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);

        lbIdUsuario.setText("usuario");

        lbEmpresa.setText("empresa");

        cbEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ESTADO");

        lbSucursal.setText("sucursal");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CANTON");

        cbJornada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JORNADA...", "MATUTINA", "VESPERTINA", "NOCTURNA" }));

        cbProvincia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROVINCIA...", "AZUAY", "BOLIBAR", "CAÑAR", "CARCHI", "CHIMBORAZO", "COTOPAXI", "EL ORO", "ESMERALDAS", "GALAPAGOS", "GUAYAS", "IMBABURA", "LOJA", "LOS RIOS", "MANABI", "MORONA SANTIAGO", "NAPO", "ORELLANA", "PASTAZA", "PICHINCHA", "SANTA ELENA", "STO. DOMINGO DE LOS TSACHILAS", "SUCUMBIOS", "TUNGURAGUA", "ZAMORA CHINCHIPE" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ZONA");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CIRCUITO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("DISTRITO");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel3))
                                            .addGap(27, 27, 27)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel4)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtCircuito))
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(2, 2, 2)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbEstado, javax.swing.GroupLayout.Alignment.TRAILING, 0, 145, Short.MAX_VALUE))
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel11))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDistrito, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                                .addComponent(txtZona)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lbSucursal)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(lbIdUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(lbEmpresa)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)
                    .addComponent(lbSucursal)
                    .addComponent(lbIdUsuario)
                    .addComponent(lbEmpresa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void guardar() {
        if (txtCorreo.getText().length() < 6) {
            JOptionPane.showMessageDialog(this, "INGRESE UN CORREO VALIDO");
        } else if (txtDireccion.getText().length() < 7) {
            JOptionPane.showMessageDialog(this, "INGRESE UNA DIRECCION");
        } else if (txtEmpresa.getText().length() < 5) {
            JOptionPane.showMessageDialog(this, "INGRESE UN NOMBRE VALIDO");
        } else if (txtelefono.getText().length() <= 5) {
            JOptionPane.showMessageDialog(this, "INGRESE UN NUMERO VALIDO");
        } else if (txtelefono.getText().length() >= 13) {
            JOptionPane.showMessageDialog(this, "HA PASADO LA CANTIDAD DE NUMEROS PERMITIDOS ");
        } else if (cbProvincia.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "ESCOJA UN CANTON");
        } else if (txtCanton.getText().length() < 3) {
            JOptionPane.showMessageDialog(this, "ESCRIBA UN CANTON VALIDO");
        } else if (cbJornada.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "ESCOJA UNA JORNADA");
        } else if (txtCircuito.getText().length() < 2) {
            JOptionPane.showMessageDialog(this, "ESCRIBA UN CIRCUITO VALIDO");
        } else if (txtZona.getText().length() < 2) {
            JOptionPane.showMessageDialog(this, "ESCRIBA UNA ZONA VALIDO");
        } else if (txtDistrito.getText().length() < 2) {
            JOptionPane.showMessageDialog(this, "ESCRIBA UN DISTRITO VALIDO");
        } else {
            int r = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO DE " + boton + "?", "", JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.YES_OPTION) {
                if ("ACTUALIZAR".equals(boton)) {
                    em_sucursal mp = new em_sucursal();
                    mp.setCorreo_su(txtCorreo.getText());
                    mp.setUsuario_actualizacion(Long.valueOf(lbIdUsuario.getText()));
                    mp.setDireccion_su(txtDireccion.getText());
                    mp.setNombre_comercial_su(txtEmpresa.getText());
                    mp.setTelefono_su(txtelefono.getText());
                    mp.setId_sucursal(Long.valueOf(lbSucursal.getText()));
                    mp.setEstado_su(cbEstado.getSelectedItem().toString());
                    mp.setCanton_suc(txtCanton.getText());
                    mp.setProvincia_suc(cbProvincia.getSelectedItem().toString());
                    mp.setJornada(cbJornada.getSelectedItem().toString());
                    mp.setDistrito(txtDistrito.getText());
                    mp.setCircuito(txtCircuito.getText());
                    mp.setZona(txtZona.getText());
                    String a = crud.ActualizarSucursal(mp);
                    JOptionPane.showMessageDialog(this, a);
                    setVisible(false);
                } else {
                    em_sucursal es = new em_sucursal();
                    es.setUsuario_actualizacion(Long.valueOf(lbIdUsuario.getText()));
                    es.setId_sucursal(Long.valueOf(lbSucursal.getText()));
                    String b = crud.CerrarSucursal(es);
                    JOptionPane.showMessageDialog(this, b);
                }
            } else {

            }
        }
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtEmpresaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpresaFocusLost
        txtEmpresa.setText(txtEmpresa.getText().toUpperCase());
    }//GEN-LAST:event_txtEmpresaFocusLost

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        txtDireccion.setText(txtDireccion.getText().toUpperCase());
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtelefonoKeyTyped

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        int pos = cbEstado.getSelectedIndex();

        if (pos == 0) {
            boton = "ACTUALIZAR";
        } else {
            boton = "CERRAR LA SUCURSAL";
        }
        btnGuardar.setText(boton);
    }//GEN-LAST:event_cbEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarSucursalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarSucursalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarSucursalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarSucursalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ActualizarSucursalesForm dialog = new ActualizarSucursalesForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbJornada;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtCanton;
    private javax.swing.JTextField txtCircuito;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtZona;
    private javax.swing.JTextField txtelefono;
    // End of variables declaration//GEN-END:variables
}
