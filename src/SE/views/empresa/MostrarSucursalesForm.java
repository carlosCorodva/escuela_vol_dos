/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.empresa;

import SE.componentes.Crud;
import SE.componentes.Tablas;
import SE.entidades.em_empresa;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinEmpleados;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class MostrarSucursalesForm extends javax.swing.JDialog {

    /**
     * Creates new form EmpresaForm
     */
    Crud crud = new Crud();
    ArrayList<em_sucursal> listar = null;
    JoinEmpleados us = null;
    em_sucursal objeto = null;

    public MostrarSucursalesForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lbIdUsuario.setText(usuario.getId_usuario().toString());
        lbEmpresa.setText(usuario.getId_empresa().toString());
        us = usuario;
        formulario();
        sucursales();
    }

    public MostrarSucursalesForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void sucursales() {
        em_sucursal su = new em_sucursal();
        su.setId_empresa(Long.valueOf(lbEmpresa.getText()));
        listar = crud.ListarSucursales(su);
        Tablas.cargarTablaSucursal(jtSucursal, listar);
    }

    public void formulario() {
        txtEmpresa.setText("EMPRESA: " + us.getNombre_comercial_em());
        txtRuc.setText("RUC: " + us.getRuc_em());
        txtEmpresa.setEditable(false);
        txtRuc.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSucursal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbIdUsuario = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtEmpresa = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        lbEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtSucursal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtSucursal.setRowHeight(25);
        jtSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtSucursalMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtSucursal);

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUCURSALES");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        btnCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/add32.png"))); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/cancelar32.png"))); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbIdUsuario.setText("usuario");

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/actualiza32.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtRuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbEmpresa.setText("empresa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbEmpresa)
                .addGap(60, 60, 60)
                .addComponent(btnCrear)
                .addGap(119, 119, 119)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(67, 67, 67)
                .addComponent(lbIdUsuario)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(jButton3)
                    .addComponent(lbIdUsuario)
                    .addComponent(btnActualizar)
                    .addComponent(lbEmpresa))
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿DESEA SALIR DEL MODULO EMPRESA?", "", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            setVisible(false);
        } else {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public em_sucursal devuelveObjetoEmpleado(String datos, ArrayList<em_sucursal> listarobj) {
        em_sucursal objeto1 = null;
        for (int i = 0; i < listarobj.size(); i++) {
            if (datos.equals(listarobj.get(i).getId_sucursal().toString())) {
                objeto1 = listarobj.get(i);
                break;
            }
        }
        return objeto1;
    }

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        CrearSucursalesForm ce = new CrearSucursalesForm(new javax.swing.JFrame(), true, us);
        ce.setVisible(true);
        sucursales();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jtSucursalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSucursalMousePressed
        int i = 0;
        try {
            if (evt.getClickCount() == 2) {
                i = jtSucursal.getSelectedRow();
                objeto = devuelveObjetoEmpleado(jtSucursal.getValueAt(i, 0).toString(), listar);
                if (objeto != null) {
                    System.out.println("holaaaaa");
                    ActualizarSucursalesForm acc = new ActualizarSucursalesForm(new javax.swing.JFrame(), true, us, objeto);
                    acc.setVisible(true);
                    listar.clear();
                    sucursales();
                }

            }
        } catch (Exception e) {
            Logger.getLogger(MostrarSucursalesForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jtSucursalMousePressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int i = jtSucursal.getSelectedRow();
        if (jtSucursal.isRowSelected(i) == false) {
            JOptionPane.showMessageDialog(this, "SELECCIONE UN REGISTRO");
        } else {
            try {
                objeto = devuelveObjetoEmpleado(jtSucursal.getValueAt(i, 0).toString(), listar);
                if (objeto != null) {
                    System.out.println("holaaaaa");
                    ActualizarSucursalesForm acc = new ActualizarSucursalesForm(new javax.swing.JFrame(), true, us, objeto);
                    acc.setVisible(true);
                    listar.clear();
                    sucursales();
                }
            } catch (Exception e) {
                Logger.getLogger(MostrarSucursalesForm.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarSucursalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarSucursalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarSucursalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarSucursalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MostrarSucursalesForm dialog = new MostrarSucursalesForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtSucursal;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
