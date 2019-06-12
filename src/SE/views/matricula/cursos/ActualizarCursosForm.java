/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.matricula.cursos;

import SE.componentes.Crud;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.ma_paralelo;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class ActualizarCursosForm extends javax.swing.JDialog {

    /**
     * Creates new form ActualizarMaterias
     */
    Crud crud = new Crud();
    ma_paralelo cm = null;
    JoinEmpleados us = null;

    public ActualizarCursosForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario, ma_paralelo paralelo) {
        super(parent, modal);
        initComponents();
        lbSucursal.setVisible(false);
        lbEmpresa.setVisible(false);
        lbIdUsuario.setVisible(false);
        setLocationRelativeTo(null);
        us = usuario;
        cm = paralelo;
        lbIdUsuario.setText(usuario.getId_usuario().toString());
        lbEmpresa.setText(us.getId_empresa().toString());
        lbSucursal.setText(us.getId_sucursal().toString());
        form();
    }

    public ActualizarCursosForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbIdUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObser = new javax.swing.JTextArea();
        lbSucursal = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbNivel = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CURSO");

        txtCurso.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtCurso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCursoFocusLost(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/guardar32.png"))); // NOI18N
        btnActualizar.setText("GUARDAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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

        lbIdUsuario.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ESTADO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("OBSERVACION");

        cbEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));

        txtObser.setColumns(20);
        txtObser.setRows(5);
        txtObser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtObser);

        lbSucursal.setText("sucursal");

        lbEmpresa.setText("empresa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NIVEL");

        cbNivel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIVEL...", "1", "2", "3", "4", "5", "6", "7" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CAPACIDAD");

        txtCapacidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lbIdUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lbSucursal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(lbEmpresa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(lbIdUsuario)
                    .addComponent(lbEmpresa)
                    .addComponent(lbSucursal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void form() {
        String est = cm.getEstado_pa();
        int niv = Integer.parseInt(cm.getNivel().toString());
        txtCurso.setText(cm.getParalelo());
        txtObser.setText(cm.getParalelo_obs());
        txtCapacidad.setText(cm.getN_capacidad().toString());
        if ("ACTIVO".equals(est)) {
            cbEstado.setSelectedIndex(0);
        } else {
            cbEstado.setSelectedIndex(1);
        }

        if (niv == 1) {
            cbNivel.setSelectedIndex(1);
        }
        if (niv == 2) {
            cbNivel.setSelectedIndex(2);
        }
        if (niv == 3) {
            cbNivel.setSelectedIndex(3);
        }
        if (niv == 4) {
            cbNivel.setSelectedIndex(4);
        }
        if (niv == 5) {
            cbNivel.setSelectedIndex(5);
        }
        if (niv == 6) {
            cbNivel.setSelectedIndex(6);
        }
        if (niv == 7) {
            cbNivel.setSelectedIndex(7);
        }
    }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed
    public void actualizar() {
        if (txtCurso.getText().length() >= 4) {
            JOptionPane.showMessageDialog(this, "PROCURE ESCRIBIR MAXIMO 3 CARACTERES ALFANUMERICOS");
        } else if (txtCapacidad.getText().length() >= 3) {
            JOptionPane.showMessageDialog(this, "PROCURE ESCRIBIR MAXIMO 2 CARACTERES NUMERICOS");
        } else if (txtCurso.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "PROCURE ESCRIBIR MAXIMO 3 CARACTERES ALFANUMERICOS");
        } else if (txtCapacidad.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "PROCURE ESCRIBIR MAXIMO 2 CARACTERES NUMERICOS");
        } else {
            String text = txtCurso.getText();
            ma_paralelo mp = new ma_paralelo();
            mp.setParalelo(text);
            mp.setId_actualizacion(Long.valueOf(lbIdUsuario.getText()));
            mp.setId_paralelo(cm.getId_paralelo());
            mp.setParalelo_obs(txtObser.getText());
            mp.setEstado_pa(cbEstado.getSelectedItem().toString());
            mp.setId_empresa_pa(Long.valueOf(lbEmpresa.getText()));
            mp.setId_sucursal_pa(Long.valueOf(lbSucursal.getText()));
            mp.setNivel(Long.valueOf(cbNivel.getSelectedItem().toString()));
            mp.setN_capacidad(Long.valueOf(txtCapacidad.getText()));
            String a = crud.actualizarCursos(mp);
            JOptionPane.showMessageDialog(this, a);
            setVisible(false);
        }
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCursoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCursoFocusLost
        txtCurso.setText(txtCurso.getText().toUpperCase());
    }//GEN-LAST:event_txtCursoFocusLost

    private void txtObserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObserFocusLost
        txtObser.setText(txtObser.getText().toUpperCase());
    }//GEN-LAST:event_txtObserFocusLost

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

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
            java.util.logging.Logger.getLogger(ActualizarCursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarCursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarCursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarCursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ActualizarCursosForm dialog = new ActualizarCursosForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextArea txtObser;
    // End of variables declaration//GEN-END:variables
}
