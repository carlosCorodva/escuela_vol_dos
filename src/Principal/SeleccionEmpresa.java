/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import SE.componentes.Combos;
import SE.componentes.Crud;
import SE.entidades.em_empresa;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinEmpresaSucursal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class SeleccionEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form Empresa
     */
    Crud crud = new Crud();
    ArrayList<JoinEmpleados> empresa = null;
    ArrayList<JoinEmpleados> sucursal = null;
    ArrayList<JoinEmpleados> usuario = null;
//    ArrayList<JoinEmpresaSucursal> empresaSucursal = null;
//    ArrayList<JoinEmpleados> listar = null;
//    em_empresa objeto = null;
    JoinEmpleados objSucursal = null;
    JoinEmpleados objEmpresa = null;
    JoinEmpleados objUsuario = null;
    JoinEmpleados obj = null;
    JoinEmpleados es = new JoinEmpleados();

    public SeleccionEmpresa(JoinEmpleados objeto) {
//        System.out.println("1");
        initComponents();
        obj = objeto;
//        System.out.println("2");
        setLocationRelativeTo(null);
        cbSucursal.setEnabled(false);
//        System.out.println("3");
        es.setUsuario(objeto.getUsuario());
        es.setContrasena(objeto.getContrasena());
        empresa = crud.empresaComboDos(es);
        cbEmpresa.setModel(Combos.listarComboEmpresa(empresa));
        usuario = crud.listarEmpleadosActivosInicio();
        lbEmpresa.setText(obj.getId_empresa().toString());
        lbSucursal.setText(obj.getId_sucursal().toString());
        cbEmpresa.setSelectedIndex(1);
    }

    public SeleccionEmpresa() {
        initComponents();
        setLocationRelativeTo(null);
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
        cbEmpresa = new javax.swing.JComboBox<>();
        cbSucursal = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbEmpresa = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbEmpresa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE EMPRESA..." }));
        cbEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpresaActionPerformed(evt);
            }
        });

        cbSucursal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE SUCURSAL..." }));
        cbSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSucursalActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/database 32.png"))); // NOI18N
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/base-de-datos 32.png"))); // NOI18N
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbEmpresa.setText("empresa");

        lbSucursal.setText("sucursal");

        lbUsuario.setText("usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lbEmpresa)
                        .addGap(70, 70, 70)
                        .addComponent(lbSucursal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbUsuario)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmpresa)
                    .addComponent(lbSucursal)
                    .addComponent(lbUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpresaActionPerformed
        int pos = cbEmpresa.getSelectedIndex();

        if (pos == 0) {
            JOptionPane.showMessageDialog(this, "ELIJA UNA EMPRESA");
            cbSucursal.setEnabled(false);
            cbSucursal.setSelectedIndex(0);
        } else {
            cbSucursal.setEnabled(true);
            es.setUsuario(obj.getUsuario());
            es.setContrasena(obj.getContrasena());
            sucursal = crud.sucursalComboDos(es);
            cbSucursal.setModel(Combos.listarComboSucursal(sucursal));
            cbSucursal.setSelectedIndex(1);
        }
    }//GEN-LAST:event_cbEmpresaActionPerformed

    public JoinEmpleados ObjetoSucursal(String datos, ArrayList<JoinEmpleados> listarobj) {
        JoinEmpleados objeto1 = null;
        for (int i = 0; i < listarobj.size(); i++) {
            if (datos.equals(listarobj.get(i).getNombre_comercial_su())) {
                objeto1 = listarobj.get(i);
//                System.out.println("objeto sucursal:" + listarobj.get(i).getNombre_comercial_su());
                break;
            }
        }
        return objeto1;
    }
    public JoinEmpleados ObjetoUsaurio(String datos, ArrayList<JoinEmpleados> listarobj) {
        JoinEmpleados objeto1 = null;
        for (int i = 0; i < listarobj.size(); i++) {
            if (datos.equals(listarobj.get(i).getId_usuario().toString())) {
                objeto1 = listarobj.get(i);
//                System.out.println("objeto usuario:" + listarobj.get(i).getId_usuario().toString());
                break;
            }
        }
        return objeto1;
    }
    public JoinEmpleados ObjetoEmpresa(String datos, ArrayList<JoinEmpleados> listarobj) {
        JoinEmpleados objeto1 = null;
        for (int i = 0; i < listarobj.size(); i++) {
            if (datos.equals(listarobj.get(i).getNombre_comercial_em())) {
                objeto1 = listarobj.get(i);
//                System.out.println("objeto empresa:" + listarobj.get(i).getNombre_comercial_em());
                break;
            }
        }
        return objeto1;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ingresarSistema();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void ingresarSistema() {
        int po = cbEmpresa.getSelectedIndex();
        int po2 = cbSucursal.getSelectedIndex();
        String cbSuc = cbSucursal.getSelectedItem().toString();
        String cbemp = cbEmpresa.getSelectedItem().toString();
        if (po == 0) {
            JOptionPane.showMessageDialog(this, "ELIJA UNA EMPRESA");
        } else if (po2 == 0) {
            JOptionPane.showMessageDialog(this, "ELIJA UNA SUCURSAL");
        } else {
            System.out.println("holaaaaa");
//            objSucursal = ObjetoSucursal(cbSuc, sucursal);
//            objEmpresa = ObjetoEmpresa(cbemp, empresa);
            objUsuario = ObjetoUsaurio(lbUsuario.getText(), usuario);
//            System.out.println("holaaaaa " + objSucursal.getNombre_comercial_su());
            if (/*objSucursal*/objUsuario != null) {
//                System.out.println("holaaaaa");
//                System.out.println("empresa " + objUsuario.getNombre_comercial_em());
//                System.out.println("sucursal " + objUsuario.getNombre_comercial_su());
//                System.out.println("usuario " + objUsuario.getUsuario());
                FrmPrincipal acc = new FrmPrincipal(/*objSucursal,objEmpresa,*/objUsuario);
//                System.out.println("holaaaaa " + objUsuario.getId_usuario());
                acc.setVisible(true);
                dispose();
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSucursalActionPerformed
        JoinEmpleados is = new JoinEmpleados();
            is.setUsuario(obj.getUsuario());
            is.setContrasena(obj.getContrasena());
            is.setNombre_comercial_su(cbSucursal.getSelectedItem().toString());
            String a = crud.validarUsuario(is);
            if (a==null) {
                System.out.println("null");
            } else {
                lbUsuario.setText(a);
                System.out.println("else"+a);
            }
    }//GEN-LAST:event_cbSucursalActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SeleccionEmpresa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEmpresa;
    private javax.swing.JComboBox<String> cbSucursal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
