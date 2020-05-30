/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.views.usuario.empleados;

import SE.componentes.Crud;
import SE.componentes.Tablas;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.ma_paralelo;
import SE.entidades.us_permiso_curso;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class PermisosActualizarCursosForm extends javax.swing.JDialog {

    /**
     * Creates new form MostrarMaterias
     */
    Crud crud = new Crud();
    JoinEmpleados je = new JoinEmpleados();
    ArrayList<us_permiso_curso> listar = null;
    ArrayList<ma_paralelo> listarParal = null;
    JoinEmpleados us = null;
    JoinEmpleados em = null;
    ma_paralelo objeto = null;
    us_permiso_curso mp = new us_permiso_curso();

    public PermisosActualizarCursosForm(java.awt.Frame parent, boolean modal, JoinEmpleados usuario, JoinEmpleados empleado) {
        super(parent, modal);
        initComponents();
        lbSucursal.setVisible(false);
        lbEmpresa.setVisible(false);
        lbIdUsuario.setVisible(false);
        setLocationRelativeTo(null);
        txtnombre.setEditable(false);
        us = usuario;
        em = empleado;
        txtnombre.setText(em.getApellidos_nombres());
        lbEmpresa.setText(us.getId_empresa().toString());
        lbSucursal.setText(us.getId_sucursal().toString());
        lbIdUsuario.setText(us.getId_usuario().toString());
        lbIdEmpleado.setText(em.getId_usuario().toString());
        tabla();
        validar();
    }

    public PermisosActualizarCursosForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void validar() {
        int i = jtCursos.getRowCount();
        if (i <= 0) {
            JOptionPane.showMessageDialog(this, "EL USUARIO NO TIENE PERMISOS USE LA VENTANA DE ASIGNAR PERMISOS");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCursos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lbIdUsuario = new javax.swing.JLabel();
        btnTodo = new javax.swing.JButton();
        lbSucursal = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lbIdEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR PERMISO");
        jLabel1.setOpaque(true);

        jtCursos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtCursos.setRowHeight(25);
        jScrollPane1.setViewportView(jtCursos);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/cancelar32.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/actualiza32.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lbIdUsuario.setText("jLabel2");

        btnTodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/cbx 32.png"))); // NOI18N
        btnTodo.setText("TODO");
        btnTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTodoMouseClicked(evt);
            }
        });

        lbSucursal.setText("sucursal");

        lbEmpresa.setText("empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("USUARIO");

        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbIdEmpleado.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtnombre))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(lbIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnTodo)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lbSucursal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmpresa)
                    .addComponent(lbIdEmpleado)
                    .addComponent(lbIdUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar)
                        .addComponent(btnSalir))
                    .addComponent(btnTodo))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
//    public void guardar() {
//        ArrayList<String> queryA = new ArrayList<String>();
//        String act = "";
//        String valor = "";
//        for (int i = 0; i < jtCursos.getRowCount(); i++) {
//            String dato = jtCursos.getValueAt(i, 2).toString();
//            if ("true".equals(dato)) {
//                valor = "A";
//            } else {
//                valor = "I";
//            }
//            act = "UPDATE `us_permiso_curso`\n"
//                    + "SET `permiso` = '" + valor + "'\n"
//                    + "WHERE `id_usuario` ='" + em.getId_usuario() + "' \n"
//                    + "AND `id_empresa_per`='1' \n"
//                    + "AND `id_sucursal_per`='" + us.getId_sucursal() + "' \n"
//                    + "AND `id_curso` = '" + jtCursos.getValueAt(i, 0) + "';";
//
//            queryA.add(act);
//            crud.GuardarPermisosCursos(queryA);
//            queryA.clear();
//        }
//        JOptionPane.showMessageDialog(this, "PERMISO GUARDADO CORRECTAMENTE");
////        tabla();
//        setVisible(false);
//    }
    
    public void guardar() {
        je.setId_usuario((em.getId_usuario()));
        String a = crud.BorrarPermisosCursos(je);
        if ("S".equals(a)) {
            JOptionPane.showMessageDialog(this, "EL USUARIO YA TIENE PERMISO, USE LA VENTANA DE ACTUALIZAR");
        } else {
            ArrayList<String> queryA = new ArrayList<String>();
            String act = "";
            String valor = "";
            for (int i = 0; i < jtCursos.getRowCount(); i++) {
                String dato = jtCursos.getValueAt(i, 2).toString();
                if ("true".equals(dato)) {
                    valor = "A";
                } else {
                    valor = "I";
                }
                act = "INSERT INTO `us_permiso_curso`(`id_usuario`,`id_curso`,\n"
                        + "`curso`,`permiso`,`id_empresa_per`,`id_sucursal_per`)\n"
                        + "VALUES ('" + em.getId_usuario() + "','" + jtCursos.getValueAt(i, 0) + "','" + jtCursos.getValueAt(i, 1) + "','" + valor + "',\n"
                        + "'1','" + us.getId_sucursal() + "');";

                queryA.add(act);
                crud.GuardarPermisosCursos(queryA);
                queryA.clear();
            }
            JOptionPane.showMessageDialog(this, "PERMISO GUARDADO CORRECTAMENTE");
            tabla();
        }
        setVisible(false);
    }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        guardar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    public void tabla(){
        mp.setId_usuario(Long.valueOf(lbIdEmpleado.getText()));
        mp.setId_sucursal_per(Long.valueOf(lbSucursal.getText()));
        listar = crud.listarCursosPermiso(mp);
        Tablas.TablaCursosPermisosEmpleadosActualizar(jtCursos, listar);
    }
    private void btnTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodoMouseClicked
        int cont = 0;
        cont = evt.getClickCount();
        boolean v = true;
        boolean f = false;
        if (cont == 1) {
            for (int a = 0; a < jtCursos.getRowCount(); a++) {
                jtCursos.setValueAt(v, a, 2);
            }
        } else {
            for (int a = 0; a < jtCursos.getRowCount(); a++) {
                jtCursos.setValueAt(f, a, 2);
            }
        }
    }//GEN-LAST:event_btnTodoMouseClicked

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
            java.util.logging.Logger.getLogger(PermisosActualizarCursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PermisosActualizarCursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PermisosActualizarCursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PermisosActualizarCursosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                PermisosActualizarCursosForm dialog = new PermisosActualizarCursosForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCursos;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdEmpleado;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
